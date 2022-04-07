package ru.netology.domain;

import ru.netology.domain.Film;

public class Manager {
    private Film[] films = new Film[0];
    private int filmLimit = 10;

    public Manager(Film[] films, int filmLimit) {
        this.films = films;
        this.filmLimit = filmLimit;
    }

    public Manager() {
    }

    public Manager(int filmLimit) {
        this.filmLimit = filmLimit;
    }

    public Film[] findAll() {
        //return this.films;
        return films;
    }

    public void add(Film film) {
        Film[] tmp = new Film[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        //this.films = tmp;
        films = tmp;
    }

    public Film[] findLast() {
        int resultLength;
        if (films.length < filmLimit) {
            resultLength = films.length;
        } else {
            resultLength = filmLimit;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}

