package com.TugasAkhir.spring.model.User;

import com.TugasAkhir.spring.model.AppointmentModel;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="doctor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorModel extends BaseUser{
    @Id
    private String uuid;

    @NotNull
    private Long fee;

    @OneToMany(mappedBy = "doctor")
    private List<AppointmentModel> listAppointment;
}