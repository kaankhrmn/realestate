package com.kahraman.kaan.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "Contract")
public class Contract  implements Serializable {
    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "MainContractId")
    private String mainContractId;

    @Column(name = "TenantId")
    private String tenantId;

    @Column(name = "AttendantId")
    private String attendantId;

    @Column(name = "StartDate")
    private Date startDate;

    @Column(name = "ExpiraDate")
    private Date expiraDate;

    @Column(name = "Period")
    private String period;

    @Column(name = "RentMoney")
    private Long rentMoney;

    @Column(name = "Status")
    private Long status;

    @Column(name = "Balance")
    private Long balance;

    @Column(name = "Notes")
    private String notes;

    @Column(name = "Invoice")
    private String invoice;

    @OneToOne
    @JoinColumn(name = "Tenant_Contract")
    private Tenant tenant;







}
