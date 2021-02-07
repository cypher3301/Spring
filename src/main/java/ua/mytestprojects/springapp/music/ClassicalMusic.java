package ua.mytestprojects.springapp.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<String> getListSing(){
        return new ArrayList<>(Arrays.asList("Shopen","Chaikovstyi", "Some"));
    }
}
