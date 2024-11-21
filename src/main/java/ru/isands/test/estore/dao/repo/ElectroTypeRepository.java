package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.isands.test.estore.dao.entity.ElectroType;

import java.util.List;

public interface ElectroTypeRepository extends JpaRepository<ElectroType, Long> {

    @Query("select e from ElectroType e where e.name = ?1")
    public List<ElectroType> findByName(String name);
}
