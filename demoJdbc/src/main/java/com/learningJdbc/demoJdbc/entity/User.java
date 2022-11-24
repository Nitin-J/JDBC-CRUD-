package com.learningJdbc.demoJdbc.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
