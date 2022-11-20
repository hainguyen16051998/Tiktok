import java.util.ArrayList;
import java.util.Scanner;

public class IdolAction {
    public Idol inputIdol(Scanner scanner)  {
        FollowersAction action = new FollowersAction();
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập ID: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập email: ");
        String email = scanner.nextLine();
        ArrayList<Followers> people = new ArrayList<>();
        Followers followers = action.inputFollowers(scanner);
        people.add(followers);
        System.out.println("Mời b nhập nhóm: ");
        String group = scanner.nextLine();
        Idol idol= new Idol(name, id, email,people, group);
        return idol;
    }
}
