import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;


public class Junkebox1 {

    //se almacenan las canciones en un ArrayList
    static ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Junkebox1().go();

        //el metodo sort ordena un objeto de tipo comparable
        //Song es un objeto Comparable
        Collections.sort(songList);
        System.out.println("ordenadas");
        System.out.println(songList.toString());

        //por que puede ser aplicado en cualquier objeto Comparable
        System.out.println("la mayor es: " + Max.max(songList.get(1),songList.get(2),songList.get(3)));
    }

    //metodo que carga el archivo e imprime el contenido del arrayList
    public void go(){
        getSongs();
        System.out.println("sin ordenar");
        System.out.println(songList);
    }


    void getSongs(){
        try{
            File file = new File("/Users/gray/Documents/desarrollo/java/simple-generics/src/main/resources/SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        songList.add(new Song(tokens[0],tokens[1],tokens[2],tokens[3]));
    }

}
