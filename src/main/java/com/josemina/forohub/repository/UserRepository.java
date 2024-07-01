package com.josemina.forohub.repository;

import com.josemina.forohub.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findUserEntityByEmail(String username);

    @Query("SELECT u FROM UserEntity u WHERE u.username = :username")
    Optional<UserEntity> findUser(String username);
}
