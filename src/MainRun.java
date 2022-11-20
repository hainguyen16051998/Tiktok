import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IdolAction action = new IdolAction();
        Songaction action2 = new Songaction();

        ArrayList<Idol> idols = new ArrayList<>();
        Idol idol = action.inputIdol(scanner);
        idols.add(idol);

        ArrayList<Songs> songs = new ArrayList<>();
        Songs song = action2.inputSong(scanner);
        songs.add(song);
        TikTok tikTok = new TikTok(idols, songs);


        System.out.println(tikTok.toString());

    }
}
