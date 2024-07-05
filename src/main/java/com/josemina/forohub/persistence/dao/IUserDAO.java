package com.josemina.forohub.persistence.dao;

import com.josemina.forohub.persistence.entities.Topic;
import com.josemina.forohub.persistence.entities.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {
    List<UserEntity> findAll();
    Optional<UserEntity> findById(Long id);
}
