package com.wipro.topcrowd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.topcrowd.model.User;

@Repository
public interface Urepository extends JpaRepository<User, Long> {
}
