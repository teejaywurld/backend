package com.teejaywurld.backend.repository;

import com.teejaywurld.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
