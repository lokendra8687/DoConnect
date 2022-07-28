package com.Ambuj.Wipro.DoConnect.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Ambuj.Wipro.DoConnect.data.UserDetails;



@Repository
public interface UserRegistrationRepo extends JpaRepository<UserDetails,Integer> {
	@Query("SELECT u FROM UserDetails u WHERE u.email = ?1 ")
    public UserDetails findByEmail(String email);
}

