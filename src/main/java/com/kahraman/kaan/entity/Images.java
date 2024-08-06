package com.kahraman.kaan.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Images")

public class Images implements Serializable {

    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "PropertyId")
    private Long porpertyId;

    @Column(name = "ImagePath")
    private String imagePath;

}
