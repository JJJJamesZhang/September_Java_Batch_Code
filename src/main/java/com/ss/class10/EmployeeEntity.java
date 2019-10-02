package com.ss.class10;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@Table(name = "Employee")
//@NoArgsConstructor
public class EmployeeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private Integer id;

    @Column(name = "empName")
    private String name;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "departmentId")
//    private DepartmentEntity departmentId;
    @Column
    private Integer departmentId;

    @Column
    private Integer age;


//    @OneToMany(mappedBy = "employeeEntity")
//    private Set<EmployeeProjectEntity> employeeProjectEntities;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name = "EmployeeProject", joinColumns = {@JoinColumn( name = "employeeId")}, inverseJoinColumns = {@JoinColumn( name = "projectId")})
    private Set<ProjectEntity> projectEntities;

    public EmployeeEntity() {
        projectEntities = new HashSet<>();
    }
}
