package com.upc.pre.peaceapp.repositories;

import com.upc.pre.peaceapp.models.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserProfile, Long> {
    @Query("SELECT u FROM UserProfile u WHERE u.email = ?1")
    UserProfile findByEmail(String email);
}