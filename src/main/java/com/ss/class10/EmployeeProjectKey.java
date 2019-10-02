package com.ss.class10;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class EmployeeProjectKey implements Serializable {
    @Column(name = "employeeId")
    Integer employeeId;
    @Column(name = "projectId")
    Integer projectId;
}
