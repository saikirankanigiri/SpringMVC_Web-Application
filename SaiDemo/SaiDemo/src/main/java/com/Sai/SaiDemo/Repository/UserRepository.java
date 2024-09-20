package com.Sai.SaiDemo.Repository;

import com.Sai.SaiDemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{
}
