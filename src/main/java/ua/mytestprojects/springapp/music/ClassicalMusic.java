package ua.mytestprojects.springapp.music;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music{
//    private ClassicalMusic() {
//    }
//
//    public void doMyInit(){
//        System.out.println("Doing my initialization");
//    }
//    public void doMyDestroy(){
//        System.out.println("Doing my destruction");
//    }

    //pattern: factory method
//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }
    //pattern: factory method

    @Override
    public String getSong() {
        return "Hanz Cimer";
    }
}
