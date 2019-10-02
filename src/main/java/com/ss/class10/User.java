package com.ss.class10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    String username;
    String password;
    Integer id;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
