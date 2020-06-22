package com.naznjari.domain.problem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProblemsRepository extends JpaRepository<Problems, Long> {

    @Query("SELECT p FROM Problems p ORDER BY p.id ASC")
    List<Problems> findAllDesc();
}
