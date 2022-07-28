package com.Ambuj.Wipro.DoConnect.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Ambuj.Wipro.DoConnect.data.AdminDetails;




@Repository
public interface AdminRepo extends JpaRepository<AdminDetails,Integer> {
	@Query("SELECT u FROM AdminDetails u WHERE u.email = ?1 ")
    public AdminDetails findByEmail(String email);
}