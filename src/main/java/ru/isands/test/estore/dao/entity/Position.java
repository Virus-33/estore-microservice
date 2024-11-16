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
@Table(name="store_positionType")
public class Position implements Serializable {

    @Id
    @Column(name="id_", nullable = false, unique = true)
    Long id;

    @Column(name="name", nullable = false, length = 150)
    String name;

}
