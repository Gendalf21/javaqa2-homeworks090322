package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import ru.netology.domain.Manager;
import ru.netology.domain.Film;
import org.junit.jupiter.api.Test;

class ManagerTest {

    private Film first = new Film(1, "Блэдшот", 2000);
    private Film second = new Film(2, "Вперед", 2005);
    private Film third = new Film(3, "Отель Белград", 2010);
    private Film fourth = new Film(4, "Джентельмены", 2018);
    private Film fifth = new Film(5, "Человек-невидимка", 2015);
    private Film sixth = new Film(6, "Тролли", 2021);
    private Film seventh = new Film(7, "Номер один", 2017);
    private Film eighth = new Film(8, "Послезавтра", 2012);
    private Film ninth = new Film(9, "Гарри Поттер и Узник Азкабана", 2015);
    private Film tenth = new Film(10, "12", 2012);

    @Test
    public void findLast() {

        Manager manager = new Manager(9);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Film[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {

        Manager manager = new Manager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}