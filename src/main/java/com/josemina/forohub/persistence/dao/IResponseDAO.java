package com.josemina.forohub.persistence.dao;

import com.josemina.forohub.persistence.entities.Response;

import java.util.List;
import java.util.Optional;


public interface IResponseDAO {
    List<Response> findAll();

    Optional<Response> findById(Long id);

    void save(Response response);

    void deleteById(Long id);
}
