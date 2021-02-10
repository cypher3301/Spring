package ua.mytestprojects.springapp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.mytestprojects.springapp.config.SpringConfig;
import ua.mytestprojects.springapp.beans.*;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusicGenre());
        context.close();
    }
}
