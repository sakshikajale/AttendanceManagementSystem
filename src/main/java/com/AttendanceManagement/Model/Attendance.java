package com.AttendanceManagement.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalDateTime getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(LocalDateTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
 
    
}