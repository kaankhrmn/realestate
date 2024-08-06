package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.w3c.dom.Text;

import java.io.Serializable;

@Entity
@Data
@Table(name = "TitleDeed")

public class TitleDeed implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_titleDead",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "seq_titleDead",strategy = GenerationType.SEQUENCE)
    @Column(name = "Id")
    private Long id;

    @Column(name = "RegistrationId")
    private String registrationId; //tapu_numaramız

    @Column(name = "OwnerName")
    private String ownerName; //sahipAd

    @Column(name = "OtherPartners")
    private String otherPartners; //diğer ortaklar

    @Column(name = "Description")
    private String description; //açıklama

    @Column(name = "Adress")
    private String adress;

    @Column(name = "Country")
    private String country; //ülke

    @Column(name = "City")
    private String city;  //şehir

    @Column(name = "County")
    private String county; //ilçe

    @Column(name = "District")
    private String district;  //semt

    @Column(name = "DistrictId")
    private Long districtId; //mahalleİd

    @Column(name = "InternalCode")
    private Long internalCode; //kapıNumarası

    @Column(name = "Status")
    private Boolean status; //durum

    @Column(name = "M2")
    private String m2; // metrekaresi

    @OneToOne
    @JoinColumn(name = "PropertyTitleDeed")
    private Property property;

}
