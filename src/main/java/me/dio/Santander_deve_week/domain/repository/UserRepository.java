package me.dio.Santander_deve_week.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.Santander_deve_week.domain.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
