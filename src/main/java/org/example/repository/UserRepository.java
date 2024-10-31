package org.example.repository;

//import org.example.publictransport.model.User;

import org.example.publictransport.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}