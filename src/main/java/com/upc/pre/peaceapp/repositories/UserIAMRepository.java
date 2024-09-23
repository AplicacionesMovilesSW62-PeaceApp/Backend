package com.upc.pre.peaceapp.repositories;

import com.upc.pre.peaceapp.models.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserIAMRepository extends JpaRepository<UserAuth, Long> {
    Optional<UserAuth> findByEmail(String email);
    boolean existsByEmail(String email);
}
