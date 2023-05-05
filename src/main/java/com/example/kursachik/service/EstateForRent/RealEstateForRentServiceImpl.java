package com.example.kursachik.service.EstateForRent;

import com.example.kursachik.entity.domain.RealEstateForRent;
import com.example.kursachik.entity.domain.RealEstateForRent;
import com.example.kursachik.repository.RealEstateForRentRepository;
import com.example.kursachik.repository.RealEstateForRentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RealEstateForRentServiceImpl implements RealEstateForRentService{
    private RealEstateForRentRepository realEstateForRentRepository;

    @Override
    public List<RealEstateForRent> findAllRealEstateForRent() {
        return realEstateForRentRepository.findAll();
    }

    @Override
    public List<RealEstateForRent> findRealEstateForRentByCity(String city) {
        return realEstateForRentRepository.findRealEstateForRentsByCity(city);
    }

    @Override
    public List<RealEstateForRent> findRealEstateForRentByAdress(String adress) {
        return realEstateForRentRepository.findRealEstateForRentsByAdress(adress);
    }

    @Override
    public List<RealEstateForRent> findRealEstateForRentByDate(Date date) {
        return realEstateForRentRepository.findRealEstateForRentsByDate(date);
    }

    @Override
    public List<RealEstateForRent> findRealEstateForRentByOwner(String owner) {
        return realEstateForRentRepository.findRealEstateForRentsByOwner(owner);
    }

    @Override
    public List<RealEstateForRent> findRealEstateForRentByPrice(Float price) {
        return realEstateForRentRepository.findRealEstateForRentsByPrice(price);
    }

    @Override
    public List<RealEstateForRent> findRealEstateForRentBySquare(Float square) {
        return realEstateForRentRepository.findRealEstateForRentsBySquare(square);
    }

    @Override
    public List<RealEstateForRent> findRealEstateForRentByCountroom(int countroom) {
        return realEstateForRentRepository.findRealEstateForRentsByCountroom(countroom);
    }

    @Override
    public RealEstateForRent saveRealEstateForRentData(RealEstateForRent RealEstateForRent) {
        return realEstateForRentRepository.save(RealEstateForRent);
    }
}
