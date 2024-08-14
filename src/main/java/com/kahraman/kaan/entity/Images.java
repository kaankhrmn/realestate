package com.kahraman.kaan.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Images")

public class Images implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_images",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "seq_images",strategy = GenerationType.SEQUENCE)
    @Column(name = "Id")
    private Long id;

    @Column(name = "PropertyId")
    private Long porpertyId;

    @Column(name = "ImagePath")
    private String imagePath;

}
