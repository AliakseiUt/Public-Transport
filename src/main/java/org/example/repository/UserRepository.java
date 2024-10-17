package org.example.repository;

//import org.example.publictransport.model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SecurityProperties.User, Integer> {


}