package com.zergatstage.labs.crud.repository;

import com.zergatstage.labs.crud.model.PackAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackAnimalsRepository extends JpaRepository<PackAnimal, Long> {
}
