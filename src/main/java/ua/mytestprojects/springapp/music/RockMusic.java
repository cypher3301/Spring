package ua.mytestprojects.springapp.music;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Sonne";
    }
}
