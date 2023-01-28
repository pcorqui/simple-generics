
//song implementa la interfaz comparable con su metodo compareTo
//por lo tanto es un Comparable
public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    //compareTo retorna un positivo si el elemento es mas grande que el argumento
    //retorna un 0 si son iguales
    //retorna un negativo si el elemento es mas pequeño que el argumento
    public int compareTo(Song s){

        //compara dos string lexicograficamente
        return title.compareTo(s.getTitle());
    }

    Song(String t, String a, String r, String b){
           title = t;
           artist = a;
           rating = r;
           bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
              /*  ", artist='" + artist + '\'' +
                ", rating='" + rating + '\'' +
                ", bpm='" + bpm + '\'' +*/
                '}';
    }
}
