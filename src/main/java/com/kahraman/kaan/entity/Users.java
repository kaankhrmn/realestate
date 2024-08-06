package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Users")
public class Users implements Serializable {

    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "PropertyOwners")
    private String propertyOwners;

    @Column(name = "PropertyId")
    private Long propertyId;

    @OneToOne
    @JoinColumn(name = "Users_Property")
    private Property property;

    @OneToOne
    @JoinColumn(name = "Users_PropOwners")
    private PropertyOwners propertyOwnerss;


}
