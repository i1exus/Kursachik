package com.example.kursachik.repository;

import com.example.kursachik.entity.domain.RealEstateForRent;
import com.example.kursachik.entity.domain.RealEstateToBuy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface RealEstateForRentRepository extends JpaRepository<RealEstateForRent, Long> {
    List<RealEstateForRent> findRealEstateForRentsByCity(String city);
    List<RealEstateForRent> findRealEstateForRentsByAdress(String adress);
    List<RealEstateForRent> findRealEstateForRentsByDate(Date date);
    List<RealEstateForRent> findRealEstateForRentsByOwner(String owner);
    List<RealEstateForRent> findRealEstateForRentsByPrice(Float price);
    List<RealEstateForRent> findRealEstateForRentsByCountroom(int countroom);
    List<RealEstateForRent> findRealEstateForRentsBySquare(Float square);
}
