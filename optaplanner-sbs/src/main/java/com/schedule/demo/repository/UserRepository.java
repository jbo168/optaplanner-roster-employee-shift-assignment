package com.schedule.demo.repository;

import com.schedule.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

//    @Query(value = "select * from User where userEmail = :email", nativeQuery = true)
//    User findByEmail(@Param("email") String email);

    User findByUserEmail(String email);
}
