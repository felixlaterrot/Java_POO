import java.io.IOException;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase :");
        String str = sc.nextLine();
        int nb = str.split(" ").length;
        System.out.println("Vous avez saisi : " + nb + " mots");
    }
}
