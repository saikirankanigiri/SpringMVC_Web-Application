package com.Sai.SaiDemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    private String emp_name;
    private String emp_email;
    private Long emp_num;

    public void setName(String emp_name){
        this.emp_name = emp_name;
    }

    public String getName(){
        return emp_name;
    }

    public void setEmail(String emp_email){
        this.emp_email = emp_email;
    }

    public String getEmail(){
        return emp_email;
    }
}