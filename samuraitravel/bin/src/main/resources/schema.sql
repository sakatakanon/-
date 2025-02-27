CREATE TABLE IF NOT EXISTS houses (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
image_name VARCHAR(255),
description VARCHAR(255) NOT NULL,
price INT NOT NULL,
capacity INT NOT NULL,
postal_code VARCHAR(50) NOT NULL,
address VARCHAR(255) NOT NULL,
phone_number VARCHAR(50) NOT NULL,
created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
