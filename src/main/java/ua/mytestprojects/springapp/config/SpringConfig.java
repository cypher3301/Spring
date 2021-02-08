package ua.mytestprojects.springapp.config;

import org.springframework.context.annotation.*;
import ua.mytestprojects.springapp.music.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ua.mytestprojects.springapp.music")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    //    @Bean
//    @Scope("prototype")
//    public ClassicalMusic classicalMusic(){
//        return new ClassicalMusic();
//    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MetalMusic metalMusic() {
        return new MetalMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(
                rockMusic(),
                jazzMusic(),
//                classicalMusic(),
                ClassicalMusic.getClassicalMusic(),
                jazzMusic()
        );
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }


//    @Bean
//    public MusicPlayer musicPlayer(){
//        return new MusicPlayer(rockMusic(),classicalMusic());
//    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }


}
