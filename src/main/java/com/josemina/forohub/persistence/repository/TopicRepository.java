package com.josemina.forohub.persistence.repository;

import com.josemina.forohub.persistence.entities.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {

    Optional<Topic> findByMessage(String message);
}
