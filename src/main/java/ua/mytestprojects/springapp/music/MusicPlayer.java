package ua.mytestprojects.springapp.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
//    @Autowired
//    private Music music;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void setMusicPlayer(Music music) {
//        this.music = music;
//    }

    public String playMusic(){
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: " + rockMusic.getSong());
    }
}
