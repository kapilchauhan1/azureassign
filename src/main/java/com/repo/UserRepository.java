package com.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Users;
public interface UserRepository extends JpaRepository<Users,String>{

}
