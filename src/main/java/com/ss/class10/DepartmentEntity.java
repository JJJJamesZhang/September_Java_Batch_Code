package com.ss.class10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Department")
public class DepartmentEntity {

    @Id
    Integer departmentId;

    @Column
    String departmentName;

    @OneToMany
    @JoinColumn(name = "departmentId")
    Set<EmployeeEntity> employeeEntities;

}
