package com.zergatstage.labs.crud.repository;

import com.zergatstage.labs.crud.model.PetAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetAnimalsRepository extends JpaRepository<PetAnimal, Long> {
}
