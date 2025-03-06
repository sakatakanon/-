package com.example.samuraitravel.form;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReservationInputForm {
    @NotBlank(message = "チェックイン日とチェックアウト日を選択してください。")
    private String fromCheckinDateToCheckoutDate;

    @NotNull(message = "宿泊人数を入力してください。")
    @Min(value = 1, message = "宿泊人数は１人以上に設定してください。")
    private Integer numberOfPeople;

    // チェックイン日を取得する
    public LocalDate getCheckinDate() {
        if (fromCheckinDateToCheckoutDate == null || fromCheckinDateToCheckoutDate.isBlank()) {
            throw new IllegalArgumentException("チェックイン日とチェックアウト日が設定されていません。");
        }

        // 前後の不要なスペースを削除し "から" で分割
        String[] dates = fromCheckinDateToCheckoutDate.trim().split("から");

        // 配列の長さをチェック（2つの要素があるか）
        if (dates.length != 2) {
            throw new IllegalArgumentException("日付の形式が正しくありません: " + fromCheckinDateToCheckoutDate);
        }

        return LocalDate.parse(dates[0].trim()); // ✅ trim() で不要なスペース削除
    }

    // チェックアウト日を取得する
    public LocalDate getCheckoutDate() {
        if (fromCheckinDateToCheckoutDate == null || fromCheckinDateToCheckoutDate.isBlank()) {
            throw new IllegalArgumentException("チェックイン日とチェックアウト日が設定されていません。");
        }

        // 前後の不要なスペースを削除し "から" で分割
        String[] dates = fromCheckinDateToCheckoutDate.trim().split("から");

        // 配列の長さをチェック（2つの要素があるか）
        if (dates.length != 2) {
            throw new IllegalArgumentException("日付の形式が正しくありません: " + fromCheckinDateToCheckoutDate);
        }

        return LocalDate.parse(dates[1].trim()); // ✅ trim() で不要なスペース削除
    }
}
