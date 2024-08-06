package com.kahraman.kaan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Property_Owners")

public class PropertyOwners implements Serializable {

    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "ContractID")
    private String contractId;

    @Column(name = "PropertyId")
    private String propertyId;

    @Column(name = "TitleDeedId")
    private String titleDeedId;

    @Column(name = "BankName")
    private String bankName;

    @Column(name = "AccountNumber")
    private String accountNumber;

    @Column(name = "PriceUnit")
    private String priceUnit;

    @Column(name = "CardHolder")
    private String cardHolder;

    @Column(name = "Iban")
    private String iban;

    @Column(name = "TotalMoney")
    private String totalMoney;

}
