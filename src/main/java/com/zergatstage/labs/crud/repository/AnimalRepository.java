package com.zergatstage.labs.crud.repository;

import com.zergatstage.labs.crud.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
