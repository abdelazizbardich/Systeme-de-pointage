package JDBC101.model;

import java.util.ArrayList;

public class Role {

    private Role role;
    private long id_role;
    private String name;
    private String privileges;

    public Role(long id_role, String name, String privileges) {
        this.id_role = id_role;
        this.name = name;
        //this.privileges = privileges;
    }
    public  Role(){

    }

    public long getId_role() {
        return id_role;
    }

    public void setId_role(long id_role) {
        this.id_role = id_role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public Role createRole(){
        return role;
    }

    public Role getRole(){
        return role;
    }
    public Role updateRole(){
        return role;
    }
    public Role deleteRole(){
        return role;
    }



    @Override
    public String toString() {
        return "Role{" +
                "id_role=" + id_role +
                ", name='" + name + '\'' +
                ", privileges=" + privileges +
                '}';
    }
}
