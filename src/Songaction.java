import java.util.Scanner;

public class Songaction {
    public Songs inputSong(Scanner scanner)  {
        System.out.println("Mời b nhập ID: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập ca sĩ: ");
        String singer = scanner.nextLine();
        Songs songs = new Songs(id, name, singer);
        return songs;
    }
}
