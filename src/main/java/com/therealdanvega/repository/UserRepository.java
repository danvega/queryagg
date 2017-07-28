package com.therealdanvega.repository;

import com.therealdanvega.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT AVG(u.age) from User u")
    int getAverageAge();

    @Query(value = "SELECT max(age) from User where first_name <> ?1", nativeQuery = true)
    int getMaxAgeMinus(String name);

}
