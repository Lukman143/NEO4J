package com.sk.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.sk.entity.Department;

@Repository
public interface DepartmentRepository extends Neo4jRepository<Department, Long> {

}
