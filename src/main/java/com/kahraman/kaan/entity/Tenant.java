package com.kahraman.kaan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Tenant")

public class Tenant implements Serializable {
    @Id

    @Column(name = "Id")
    private Long id;

    @Column(name = "InternalCode")
    private String internalCode;

    @Column(name = "TenantName")
    private String tenantName;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "Adress")
    private String adress;

    @Column(name = "ContactName")
    private String contactName;
}
