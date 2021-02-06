package ua.mytestprojects.springapp.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;

//    @Autowired
    private MusicPlayer musicPlayer;

//    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Autowired
    public void setComputer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id=2;
    }

    @Override
    public String toString() {
        return "Computer:" + id +
                ", " + musicPlayer.playMusic();
    }
}
