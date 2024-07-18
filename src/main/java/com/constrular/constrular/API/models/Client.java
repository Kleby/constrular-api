package com.constrular.constrular.API.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Embedded
    private Address address;

    @Column
    private String phone;

    @Enumerated
    private Status statusEnum;

    @Column
    private String createdDate;

    @Column
    private String updatedDate;

}
