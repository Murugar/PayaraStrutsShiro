package iqmsoft.struts2.shiro.example.security;

import java.util.List;

import iqmsoft.struts2.shiro.example.model.Role;
import iqmsoft.struts2.shiro.example.model.User;

public interface UserDao
{
    User getUser(String username);   
    boolean isUserValid(String username, String password);
    List<Role> lookupAllRolesForUser(String username);
}
