package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Attachments")

public class Attachments implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_attachments",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "seq_attachments",strategy = GenerationType.SEQUENCE)
    @Column(name = "Id")
    private Long id;

    @Column(name = "ContractId")
    private Long contractId;

    @Column(name = "PropertyId")
    private Long propertyId;

    @Column(name = "Description")
    private String description;

    @Column(name = "Attachments")
    private String attachments;

    @Column(name = "Sessionid")
    private Long sessionid;

}
