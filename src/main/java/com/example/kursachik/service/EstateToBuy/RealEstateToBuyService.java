package com.example.kursachik.service.EstateToBuy;


import com.example.kursachik.entity.domain.RealEstateToBuy;
import com.example.kursachik.entity.dto.RealEstateToBuyDto;

import java.sql.Date;
import java.util.List;

public interface RealEstateToBuyService {

    List<RealEstateToBuy> findAllRealEstateToBuy();
    List<RealEstateToBuy> findRealEstateToBuyByCity(String city);
    List<RealEstateToBuy> findRealEstateToBuyByAdress(String adress);
    List<RealEstateToBuy> findRealEstateToBuyByDate(Date date);
    List<RealEstateToBuy> findRealEstateToBuyByOwner(String owner);
    List<RealEstateToBuy> findRealEstateToBuyByPrice(Float price);
    List<RealEstateToBuy> findRealEstateToBuyBySquare(Float square);
    List<RealEstateToBuy> findRealEstateToBuyByCountroom(int countroom);
    RealEstateToBuy saveRealEstateToBuyData(RealEstateToBuy realEstateToBuy);
}
