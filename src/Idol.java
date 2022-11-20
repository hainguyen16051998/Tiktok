

import java.util.ArrayList;

public class Idol {
    private String name;
    private int id;
    private  String email;
    private ArrayList<Followers> followers;
    private String group;

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }

    public Idol(String name, int id, String email, ArrayList<Followers> followers, String group) {

        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

}
