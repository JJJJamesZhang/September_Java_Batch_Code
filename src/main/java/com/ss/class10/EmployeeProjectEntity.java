package com.ss.class10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeProject")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeProjectEntity {

    @EmbeddedId
    EmployeeProjectKey employeeProjectKey;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn( name = "employeeId")
    EmployeeEntity employeeEntity;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn( name = "projectId")
    ProjectEntity projectEntity;
}
