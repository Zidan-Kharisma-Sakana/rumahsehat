package com.TugasAkhirAPI.springapi.repository;

import com.TugasAkhirAPI.springapi.model.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentDB extends JpaRepository<AppointmentModel, String> {
}