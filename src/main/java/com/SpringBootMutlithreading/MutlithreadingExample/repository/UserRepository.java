package com.SpringBootMutlithreading.MutlithreadingExample.repository;


import com.SpringBootMutlithreading.MutlithreadingExample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}