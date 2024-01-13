package com.goit.tests.feature.security.user;

import lombok.Data;

import javax.persistence.*;

@Table(name = "users")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String username;
    private String password;
    private String role;
    private short enabled;
}
