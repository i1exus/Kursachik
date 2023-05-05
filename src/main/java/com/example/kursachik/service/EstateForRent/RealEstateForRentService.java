package com.example.kursachik.service.EstateForRent;

import com.example.kursachik.entity.domain.RealEstateForRent;
import com.example.kursachik.entity.domain.RealEstateToBuy;

import java.sql.Date;
import java.util.List;

public interface RealEstateForRentService {

    List<RealEstateForRent> findAllRealEstateForRent();
    List<RealEstateForRent> findRealEstateForRentByCity(String city);
    List<RealEstateForRent> findRealEstateForRentByAdress(String adress);
    List<RealEstateForRent> findRealEstateForRentByDate(Date date);
    List<RealEstateForRent> findRealEstateForRentByOwner(String owner);
    List<RealEstateForRent> findRealEstateForRentByPrice(Float price);
    List<RealEstateForRent> findRealEstateForRentBySquare(Float square);
    List<RealEstateForRent> findRealEstateForRentByCountroom(int countroom);
    RealEstateForRent saveRealEstateForRentData(RealEstateForRent RealEstateForRent);
    
}
