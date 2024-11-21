package ru.isands.test.estore.dao.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="store_etype")
public class ElectroType {

    @Id
    @Column(name="id_", nullable = false, unique = true)
    Long id;

    @Column(name="name", nullable = false, length = 150)
    String name;
}
