package com.example.samuraitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samuraitravel.entity.House;

@Repository 
public interface HouseRepository extends JpaRepository<House,Integer>{

}
