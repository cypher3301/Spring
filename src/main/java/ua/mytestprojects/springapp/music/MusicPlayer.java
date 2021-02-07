package ua.mytestprojects.springapp.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;


//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.value}")
    private int value;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//        System.out.println("Playing: " + rockMusic.getSong());
    }

    public String playMusic(Genre genre) {
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

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
