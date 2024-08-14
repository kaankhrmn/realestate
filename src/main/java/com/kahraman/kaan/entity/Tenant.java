package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "Tenant")

public class Tenant implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_tenant",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "seq_tenant",strategy = GenerationType.SEQUENCE)

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
