package com.example.spring.springwithboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FooRepository extends JpaRepository<Foo, UUID> {
}
