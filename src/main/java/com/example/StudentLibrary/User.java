package com.example.StudentLibrary;


import jakarta.persistence.*;

@Entity
@Table(name = "user_db")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)   //for each of the table seperate count of primary key
    private int id;
    private String name;
    private String email;
    private int age;

    public User(){

    }
    public User(int id, String name, String email, int age){

        this.name=name;
        this.email=email;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
