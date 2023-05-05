package com.example.kursachik.repository;

import com.example.kursachik.entity.domain.RealEstateForRent;
import com.example.kursachik.entity.domain.RealEstateToBuy;
import com.example.kursachik.entity.dto.RealEstateToBuyDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface RealEstateToBuyRepository extends JpaRepository<RealEstateToBuy, Long> {

    List<RealEstateToBuy> findRealEstateToBuysByCity(String city);
    List<RealEstateToBuy> findRealEstateToBuysByAdress(String adress);
    List<RealEstateToBuy> findRealEstateToBuysByDate(Date date);
    List<RealEstateToBuy> findRealEstateToBuysByOwner(String owner);
    List<RealEstateToBuy> findRealEstateToBuysByPrice(Float price);
    List<RealEstateToBuy> findRealEstateToBuysByCountroom(int countroom);
    List<RealEstateToBuy> findRealEstateToBuysBySquare(Float square);
   }
