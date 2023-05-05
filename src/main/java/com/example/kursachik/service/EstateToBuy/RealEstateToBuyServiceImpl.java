package com.example.kursachik.service.EstateToBuy;

import com.example.kursachik.entity.domain.Authority;
import com.example.kursachik.entity.domain.RealEstateToBuy;
import com.example.kursachik.entity.dto.RealEstateToBuyDto;
import com.example.kursachik.entity.enums.Role;
import com.example.kursachik.repository.RealEstateToBuyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
@AllArgsConstructor
public class RealEstateToBuyServiceImpl implements RealEstateToBuyService{
    private RealEstateToBuyRepository realEstateToBuyRepository;

    @Override
    public List<RealEstateToBuy> findAllRealEstateToBuy() {
        return realEstateToBuyRepository.findAll();
    }

    @Override
    public List<RealEstateToBuy> findRealEstateToBuyByCity(String city) {
        return realEstateToBuyRepository.findRealEstateToBuysByCity(city);
    }

    @Override
    public List<RealEstateToBuy> findRealEstateToBuyByAdress(String adress) {
        return realEstateToBuyRepository.findRealEstateToBuysByAdress(adress);
    }

    @Override
    public List<RealEstateToBuy> findRealEstateToBuyByDate(Date date) {
        return realEstateToBuyRepository.findRealEstateToBuysByDate(date);
    }

    @Override
    public List<RealEstateToBuy> findRealEstateToBuyByOwner(String owner) {
        return realEstateToBuyRepository.findRealEstateToBuysByOwner(owner);
    }

    @Override
    public List<RealEstateToBuy> findRealEstateToBuyByPrice(Float price) {
        return realEstateToBuyRepository.findRealEstateToBuysByPrice(price);
    }

    @Override
    public List<RealEstateToBuy> findRealEstateToBuyBySquare(Float square) {
        return realEstateToBuyRepository.findRealEstateToBuysBySquare(square);
    }

    @Override
    public List<RealEstateToBuy> findRealEstateToBuyByCountroom(int countroom) {
        return realEstateToBuyRepository.findRealEstateToBuysByCountroom(countroom);
    }

    @Override
    public RealEstateToBuy saveRealEstateToBuyData(RealEstateToBuy realEstateToBuy) {
        return realEstateToBuyRepository.save(realEstateToBuy);
    }


}
