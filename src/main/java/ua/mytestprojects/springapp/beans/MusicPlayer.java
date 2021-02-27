package ua.mytestprojects.springapp.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


//@Component
public class MusicPlayer {
//    @Value("${musicPlayer.name}")
    private String name;

//    @Value("${musicPlayer.value}")
    private int value;

    private List<Music> musicList;

    private Music music1;
    private Music music2;

    //    @Autowired
//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

//        @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//        System.out.println("Playing: " + rockMusic.getSong());
    }

    public String playMusicRandom(Genre genre) {
        String str = "Playing: ";
        Random random = new Random();
        int rand;
        if (genre.equals(Genre.ROCK)) {
            rand = random.nextInt(3);
            str += music1.getListSing().get(rand) + ", " + rand;
        } else if (genre.equals(Genre.CLASSICAL)) {
            rand = random.nextInt(3);
            str += music2.getListSing().get(rand) + ", " + rand;
        }
        return str;
    }

    public String playMusicGenre() {
        Random random = new Random();
        int randGenre = random.nextInt(musicList.size());
        int randSing = random.nextInt(musicList.get(randGenre).getListSing().size());
        String genre = Genre.getGenre(musicList.get(randGenre));
        return "Playing: " +
                musicList.get(
                        randGenre).getListSing().get(
                                randSing)+", "+genre;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
