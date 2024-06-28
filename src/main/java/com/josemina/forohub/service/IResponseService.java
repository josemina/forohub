package com.josemina.forohub.service;

import com.josemina.forohub.entities.Response;

import java.util.List;
import java.util.Optional;

public interface IResponseService {


    List<Response> findAll();

    Optional<Response> findById(Long id);

    void save(Response response);

    void deleteById(Long id);

}
