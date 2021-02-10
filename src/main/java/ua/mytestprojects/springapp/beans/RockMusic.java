package ua.mytestprojects.springapp.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Component
public class RockMusic implements Music{



    @Override
    public String getSong() {
        return "Sonne";
    }

    public List<String> getListSing(){
        return new ArrayList<>(Arrays.asList("Sonne","Old town road", "polka"));
    }
}
