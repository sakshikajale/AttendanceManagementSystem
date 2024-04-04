package com.AttendanceManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AttendanceManagement.Model.Employee;

@Repository
public interface RegistrationRepository extends JpaRepository<Employee, Long> {

	static Optional<Employee> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
