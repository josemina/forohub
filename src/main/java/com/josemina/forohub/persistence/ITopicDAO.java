package com.josemina.forohub.persistence;

import com.josemina.forohub.entities.Topic;

import java.util.List;
import java.util.Optional;

public interface ITopicDAO {
    List<Topic> findAll();
    Optional<Topic> findById(Long id);

    void save(Topic topic);
    void deleteById(Long id);
}
