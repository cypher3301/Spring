package ua.mytestprojects.springapp.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "I Got a Woman";
    }

    public List<String> getListSing(){
        return new ArrayList<>(Arrays.asList("Hit the road Jeck","road vald", "popa"));
    }

}
