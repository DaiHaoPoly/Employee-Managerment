package com.daihao.DTO;

public class UserDTO
{
    private String username;
    private String fullname;

    public UserDTO() {
    }

    public UserDTO(String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
