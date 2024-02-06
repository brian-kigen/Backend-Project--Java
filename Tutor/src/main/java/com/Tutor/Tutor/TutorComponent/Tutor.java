package com.Tutor.Tutor.TutorComponent;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutor {
    private Long id;
    private String username;
    private String email;
    private String phone_number;
    private String password;
}