package com.jobs.auth.common.repository;

import com.jobs.auth.common.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getByUserId(Long userId);

}
