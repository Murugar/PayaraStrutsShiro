package iqmsoft.struts2.shiro.example.security;

import java.util.List;

import iqmsoft.struts2.shiro.example.model.Role;
import iqmsoft.struts2.shiro.example.model.User;


// Service for security users and roles.
public interface SecurityService
{
    public User getUser(String username);
    public boolean isUserValid(String username, String password);
    public List<Role> lookupRolesForUser(String username);
}
