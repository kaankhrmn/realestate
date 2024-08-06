package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.w3c.dom.Text;

import java.io.Serializable;

@Entity
@Data
@Table(name = "Property")

public class Property implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_property" , initialValue = 1 , allocationSize = 1)
    @GeneratedValue(generator = "seq_property",strategy = GenerationType.SEQUENCE) //id nin ilk değerini random değil de sequenceden alsın diye yaptık.

    @Column(name = "Id")
    private Long id;

    @Column(name ="PropertyType")
    private String propertyType;

    @Column(name ="PropertyName")
    private String propertyName;

    @Column(name ="Description")
    private String description; //açıklama

    @Column(name ="Adress")
    private String adress;

    @Column(name ="Country")
    private String country; //ülke

    @Column(name ="City")
    private String city;  //şehir

    @Column(name ="County")
    private String county; //ilçe

    @Column(name ="District")
    private String district;  //semt

    @Column(name ="DistrictId")
    private Long districtId; //mahalleİd

    @Column(name ="InternalCode")
    private Long internalCode; //kapıNumarası

    @Column(name ="Status")
    private Boolean status; //durum

    @Column(name ="TitleDeedId")
    private String titleDeedId; //tapuId

    @Column(name ="OwnerName")
    private String ownerName; //mülkSahibi

    @Column(name ="M2")
    private String m2; // metrekaresi

    @Column(name ="Hastax")
    private Long hasTax; //VergiBorcu


    @OneToOne
    @JoinColumn(name = "PropertyTitleDeed")
    private TitleDeed titleDeed;

}
