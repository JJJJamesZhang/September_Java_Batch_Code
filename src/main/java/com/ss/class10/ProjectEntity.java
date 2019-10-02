package com.ss.class10;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Project")
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEntity implements Serializable {



    @Id
    @Column(name = "projectId")
    private Integer id;

    @Column(name = "projectName")
    private String name;

//    @OneToMany(mappedBy = "projectEntity")
//    private Set<EmployeeProjectEntity> employeeProjectEntities;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<EmployeeEntity> employeeEntities;

}
