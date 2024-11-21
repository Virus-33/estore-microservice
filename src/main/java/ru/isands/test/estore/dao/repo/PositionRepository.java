package ru.isands.test.estore.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.isands.test.estore.dao.entity.Position;

import java.util.List;

public interface PositionRepository extends JpaRepository<Position, Long> {

    @Query("select p from Position p where p.name = ?1")
    public List<Position> findByName(String name);
}
