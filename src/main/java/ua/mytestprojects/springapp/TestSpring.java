package ua.mytestprojects.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mytestprojects.springapp.music.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        for (int i = 0; i < 10; i++) {
            System.out.println(musicPlayer.playMusic(Genre.ROCK));
            System.out.println(musicPlayer.playMusic(Genre.CLASSICAL));
            System.out.println();
        }

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        context.close();
    }
}
