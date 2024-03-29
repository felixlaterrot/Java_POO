import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //try {
        //
        //    // Recevoir le fichier
        //    //File f = new File("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\Essaie.txt");
        //    FileOutputStream fos = new FileOutputStream("C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\Essaie.txt");
        //    //f.setWritable(str);
        //    fos.write(str.getBytes());
        //}
        //catch (Exception e) {
        //    System.err.println(e);
        //}


        //"C:\\Users\\felix\\Documents\\IPI\\JAVA_POO\\Essaie.txt"
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisissez le chemin du fichier :");
            String str = sc.nextLine();

            // Le fichier d'entrée
            File file = new File(str);
            if(file.exists()){
                // Créer l'objet File Reader
                FileReader fr = new FileReader(file);
                // Créer l'objet BufferedReader
                BufferedReader br = new BufferedReader(fr);
                StringBuffer sb = new StringBuffer();
                String line;
                while((line = br.readLine()) != null)
                {
                    // ajoute la ligne au buffer
                    sb.append(line);
                    sb.append("\n");
                }
                fr.close();
                System.out.println("Contenu du fichier: ");
                System.out.println(sb.toString());

                Scanner scanner = new Scanner(String.valueOf(sb));
                String string = scanner.nextLine();
                int nbFile = string.split(" ").length;
                System.out.println("Il y a : " + nbFile + " mots dans ce fichier");
            } else{
                System.out.println("Le fichier n'existe pas");
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}