public class Followers {
    private String name;
    private int id;
    private String email;
    private int numberOfLike;

    public Followers(String name, int id, String email, int numberOfLike) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Followers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
