package ua.mytestprojects.springapp.beans;

public enum Genre {
    CLASSICAL, ROCK, METAL, JAZZ;

    public static String getGenre(Music genre) {
        String genreString = null;
        if (genre instanceof JazzMusic) {
            genreString = "JAZZ";
        } else if (genre instanceof ClassicalMusic) {
            genreString = "CLASSICAL";
        } else if (genre instanceof MetalMusic) {
            genreString = "METAL";
        } else if (genre instanceof RockMusic) {
            genreString = "ROCK";
        }
        return genreString;
    }
}
