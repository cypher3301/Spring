package ua.mytestprojects.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mytestprojects.springapp.music.Music;
import ua.mytestprojects.springapp.music.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("musicBean", Music.class);
        System.out.println(music.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(music);


        musicPlayer.playMusic();
        context.close();
    }
}
