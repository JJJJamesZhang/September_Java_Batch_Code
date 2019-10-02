package com.ss.class10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "User")
public class UserEntity {
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String username;
    @Column
    String password;

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
