package com.example.kursachik.entity.dto;

import com.example.kursachik.entity.domain.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;
import java.sql.Date;

@Transactional
@AllArgsConstructor
@Data
public class RealEstateToBuyDto {

    private Long id;

    private String nameofestate;
    private String city;
    private String adress;
    private Date date;
    private String owner;
    private byte[] preview;
    private float price;
    private int countroom;
    private float square;
}
