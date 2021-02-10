package ua.mytestprojects.springapp.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetalMusic {
    public List<String> getListSing(){
        return new ArrayList<>(Arrays.asList("Resenrote","One dech", "Deamon"));
    }

}
