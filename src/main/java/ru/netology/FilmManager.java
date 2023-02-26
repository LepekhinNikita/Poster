package ru.netology;

public class FilmManager {
    private String[] films = new String[0];
    private int resultLength;

    public FilmManager() {
        this.resultLength = 10;
    }

    public FilmManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void addNewFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int limit;
        if (films.length < resultLength) {
            limit = films.length;
        } else {
            limit = resultLength;
        }
        String[] tmp = new String[limit];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }
}




