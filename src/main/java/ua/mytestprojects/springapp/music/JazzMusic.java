package ua.mytestprojects.springapp.music;

import java.util.List;

public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "I Got a Woman";
    }

    @Override
    public List<String> getListSing() {
        return null;
    }
}
