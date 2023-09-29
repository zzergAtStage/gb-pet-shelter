package com.zergatstage.labs.crud.repository;

import com.zergatstage.labs.crud.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
