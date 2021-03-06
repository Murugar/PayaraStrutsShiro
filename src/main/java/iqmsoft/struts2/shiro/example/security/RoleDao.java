package iqmsoft.struts2.shiro.example.security;

import java.util.List;
import java.util.Map;

import iqmsoft.struts2.shiro.example.model.Role;

public interface RoleDao {
    Map<String, Role> getAllRoles();
    Role getRole(String roleName);
    List<String> lookupAllPermissionsForRole(String roleName);
}
