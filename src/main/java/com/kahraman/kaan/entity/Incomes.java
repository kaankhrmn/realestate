package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "Incomes")

public class Incomes implements Serializable {
    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "PropertyOwners")
    private String propertyOwners;

    @Column(name = "IncomesType")
    private Long incomesType;

    @Column(name = "PaymentSource")
    private String paymentSource;

    @Column(name = "PaymentDate")
    private Date paymentDate;

    @Column(name = "Description")
    private String description;

    @Column(name = "Amount")
    private String amount;

    @Column(name = "SessionId")
    private Long sessionId;


    @OneToOne
    @JoinColumn(name = "Users_PropOwners")
    private PropertyOwners propertyOwnerss;

}
