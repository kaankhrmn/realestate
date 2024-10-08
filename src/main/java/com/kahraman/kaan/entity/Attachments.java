package com.kahraman.kaan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Attachments")

public class Attachments implements Serializable {
    @Id
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
