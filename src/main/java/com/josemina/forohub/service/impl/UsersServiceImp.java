package com.josemina.forohub.service.impl;

import com.josemina.forohub.persistence.dao.ITopicDAO;
import com.josemina.forohub.persistence.dao.IUserDAO;
import com.josemina.forohub.persistence.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImp implements IUserDAO {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public List<UserEntity> findAll() {
        return userDAO.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userDAO.findById(id);
    }
}
