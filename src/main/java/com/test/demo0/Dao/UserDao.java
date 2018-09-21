package com.test.demo0.Dao;


import com.test.demo0.EntityBeans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  extends JpaRepository<User,Integer> {
    User findUserByName(String name);
}
