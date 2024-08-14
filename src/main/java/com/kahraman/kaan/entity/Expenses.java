package com.kahraman.kaan.entity;

import com.kahraman.kaan.repository.AttachmentsRepository;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "Expenses")

public class Expenses implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_expenses",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "seq_expenses",strategy = GenerationType.SEQUENCE)
    @Column(name = "Id")
    private Long id;

    @Column(name = "PropertyId")
    private Long propertyId;

    @Column(name = "PropertyOwners")
    private String propertyOwners;

    @Column(name = "Invoiced")
    private Long invoiced;

    @Column(name = "PaymentDate")
    private Date paymentDate;

    @Column(name = "Description")
    private String description;

    @Column(name = "Amount")
    private String amount;

    @Column(name = "FileName")
    private String fileName;

    @OneToOne
    @JoinColumn(name = "Users_Property")
    private Property property;

    @OneToOne
    @JoinColumn(name = "Users_PropOwners")
    private PropertyOwners propertyOwnerss;
}
