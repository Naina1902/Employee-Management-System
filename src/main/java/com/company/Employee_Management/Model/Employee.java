package com.company.Employee_Management.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fname;
    private String city;
    private String address;
    private String mobile;
    private String email;
    private String dob;
    private String nationality;
}
