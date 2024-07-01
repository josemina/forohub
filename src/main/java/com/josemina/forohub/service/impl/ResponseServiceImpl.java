package com.josemina.forohub.service.impl;

import com.josemina.forohub.persistence.entities.Response;
import com.josemina.forohub.persistence.dao.IResponseDAO;
import com.josemina.forohub.service.IResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseServiceImpl implements IResponseService {

    @Autowired
    private IResponseDAO responseDAO;


    @Override
    public List<Response> findAll() {
        return responseDAO.findAll();
    }

    @Override
    public Optional<Response> findById(Long id) {
        return responseDAO.findById(id);
    }

    @Override
    public void save(Response response) {
        responseDAO.save(response);

    }

    @Override
    public void deleteById(Long id) {
        responseDAO.deleteById(id);
    }
}
