package com.example.JenkinsCICDPipeline.repository;


import com.example.JenkinsCICDPipeline.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
