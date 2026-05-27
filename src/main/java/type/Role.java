package main.java.type;

public class Role {
    private String roleName;

    public Role() {
        this("");
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void roleTalk() {
        System.out.println("I am a " + roleName);
    }
}
