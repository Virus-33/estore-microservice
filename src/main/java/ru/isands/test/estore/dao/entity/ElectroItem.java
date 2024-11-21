package ru.isands.test.estore.dao.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="store_items")
public class ElectroItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id_", nullable = false, unique = true)
    Long id;

    @Column(name="name", nullable = false, length = 150)
    String name;

    @OneToMany
    @JoinColumn(name="eitem_id", nullable = false)
    List<ElectroType> etypeId;

    @Column(name="price", nullable = false)
    Long price;

    @Column(name="count", nullable = false)
    int count;

    @Column(name="archive", nullable = false)
    boolean archive;

    @Column(name="description", nullable = false)
    String description;
}
