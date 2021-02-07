package ua.mytestprojects.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mytestprojects.springapp.config.SpringConfig;
import ua.mytestprojects.springapp.music.*;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getValue());
        musicPlayer.playMusic();

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1==classicalMusic2);
        context.close();
    }
}
