package ua.mytestprojects.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mytestprojects.springapp.music.ClassicalMusic;
import ua.mytestprojects.springapp.music.Computer;
import ua.mytestprojects.springapp.music.Music;
import ua.mytestprojects.springapp.music.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        System.out.println(computer.toString());
        context.close();
    }
}
