package ru.isands.test.estore.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="store_shop")
public class Shop implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id_", unique = true, nullable = false)
    Long Id;

    @Column(name="name", nullable = false, length = 250)
    String name;

    @Column(name="adress", columnDefinition = "TEXT not null")
    String address;
}
