package com.trg.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.trg.boot.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	List<Employee> findByName(String name); //no need to give query as it is implicitly defined [look for spring boot data jpa documentation]

	
	@Query("from Employee e where e.salary > :sal")
	List<Employee> findBySalGT(@Param("sal") float sal);

	
	@Query("from Employee e where e.salary between :minSal and :maxSal")
	List<Employee> findOnSalBetween(@Param("minSal") float minSal,@Param("maxSal") float maxSal);
	
	List<Employee> findBySalaryBetween(float minSal,float maxSal); //implicitly defined
}
