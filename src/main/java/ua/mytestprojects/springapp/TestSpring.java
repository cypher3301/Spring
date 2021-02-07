package ua.mytestprojects.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mytestprojects.springapp.music.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(musicPlayer.playMusic(Genre.ROCK));
//            System.out.println(musicPlayer.playMusic(Genre.CLASSICAL));
//            System.out.println();
//        }

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getValue());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic1==classicalMusic2);
        context.close();
    }
}
