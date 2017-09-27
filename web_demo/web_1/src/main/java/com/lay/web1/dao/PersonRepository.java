package com.lay.web1.dao;

import com.lay.web1.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author yalei.chen
 * @Date 2017/9/22
 * @Since JDK 1.8
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByAddress(String name);

//    List<Person> findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name = :name and p.address= :address")
    List<Person> findByNameAndAddress(@Param("name") String name, @Param("address") String address);
}
