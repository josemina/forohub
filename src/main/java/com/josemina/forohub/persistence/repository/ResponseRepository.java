package com.josemina.forohub.persistence.repository;

import com.josemina.forohub.persistence.entities.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResponseRepository extends CrudRepository<Response, Long> {
    Optional<Response> findByMessage(String message);
}
