package com.schedule.demo.repository;

import com.schedule.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from User where userEmail = :email", nativeQuery = true)
    User findByUserEmail(@Param("email") String email);

}
