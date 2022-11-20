import java.util.Scanner;

public class FollowersAction {
    public Followers inputFollowers(Scanner scanner)  {
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập ID: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Mời b nhập số like: ");
        Integer numOfLike = Integer.parseInt(scanner.nextLine());
        Followers followers = new Followers(name, id, email, numOfLike);
        return followers;
    }
}
