package com.ahmedazooz.loginapp.model;

public class user {
    private String email;
    private String password;

    public user(String Email, String Password) {
        email = Email;
        password = Password;
    }
    public void setEmail(String Email){
        this.email=Email;
    }
    public void setPassword(String Password){
        this.password=Password;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
}
