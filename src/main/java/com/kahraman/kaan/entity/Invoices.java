package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "Invoices")

public class Invoices implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_invoices",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "seq_invoices",strategy = GenerationType.SEQUENCE)
    @Column(name = "Id")
    private Long id;

    @Column(name = "ContractId")
    private Long contractId;

    @Column(name = "PropertyOwnersId")
    private Long propertyOwnersId;


    @Column(name = "Invoiceid")
    private Long invoiceid;


    @Column(name = "InvoiceDate")
    private Date incoiceDate;


    @Column(name = "Amount")
    private Long amount;


    @Column(name = "Description")
    private Long description;


    @Column(name = "AccountId")
    private Long accountId;


    @OneToOne
    @JoinColumn(name = "Users_PropOwners")
    private PropertyOwners propertyOwnerss;
}
