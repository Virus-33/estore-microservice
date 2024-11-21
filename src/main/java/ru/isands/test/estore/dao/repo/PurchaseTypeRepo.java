package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.isands.test.estore.dao.entity.PurchaseType;

import java.util.List;

public interface PurchaseTypeRepo extends JpaRepository<PurchaseType, Long> {
    @Query("select p from PurchaseType p where p.name = ?1")
    public List<PurchaseType> findByName(String name);
}
