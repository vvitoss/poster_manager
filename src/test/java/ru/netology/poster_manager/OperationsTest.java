package ru.netology.poster_manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void save() {
        PosterManager first = new PosterManager(1, 1, "Bloodshot", "action movie", 500);
        PosterManager second = new PosterManager(2, 2, "Forward", "cartoon", 350);
        PosterManager third = new PosterManager(3, 3, "Hotel Belgrade", "comedy", 50);
        PosterManager fourth = new PosterManager(4, 4, "Gentlemen", "action movie", 500);
        PosterManager fifth = new PosterManager(5, 5, "Invisible Man", "horror", 10);
        PosterManager sixth = new PosterManager(6, 6, "Trolls. World tour", "cartoon", 800);
        PosterManager seventh = new PosterManager(7, 7, "Number one", "comedy", 1500);
        PosterManager eighth = new PosterManager(8, 8, "lion king", "cartoon", 50);
        PosterManager ninth = new PosterManager(9, 9, "Hannibal Lecter", "horror", 500);
        PosterManager tenth = new PosterManager(10, 10, "The hills have eyes", "horror", 70);
        PosterManager eleventh = new PosterManager(11, 11, "The hills have eyes", "horror", 70);

        Operations managers = new Operations();
        managers.save(first);
        managers.save(second);
        managers.save(third);
        managers.save(fourth);
        managers.save(fifth);
        managers.save(sixth);
        managers.save(seventh);
        managers.save(eighth);
        managers.save(ninth);
        managers.save(tenth);

        managers.save(eleventh);


        PosterManager[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        PosterManager[] actual = managers.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        PosterManager first = new PosterManager(1, 1, "Bloodshot", "action movie", 500);
        PosterManager second = new PosterManager(2, 2, "Forward", "cartoon", 350);
        PosterManager third = new PosterManager(3, 3, "Hotel Belgrade", "comedy", 50);
        PosterManager fourth = new PosterManager(4, 4, "Gentlemen", "action movie", 500);
        PosterManager fifth = new PosterManager(5, 5, "Invisible Man", "horror", 10);
        PosterManager sixth = new PosterManager(6, 6, "Trolls. World tour", "cartoon", 800);
        PosterManager seventh = new PosterManager(7, 7, "Number one", "comedy", 1500);
        PosterManager eighth = new PosterManager(8, 8, "lion king", "cartoon", 50);
        PosterManager ninth = new PosterManager(9, 9, "Hannibal Lecter", "horror", 500);
        PosterManager tenth = new PosterManager(10, 10, "The hills have eyes", "horror", 70);

        Operations managers = new Operations();

        PosterManager[] expected = {};
        PosterManager[] actual = managers.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast1() {
        PosterManager first = new PosterManager(1, 1, "Bloodshot", "action movie", 500);
        PosterManager second = new PosterManager(2, 2, "Forward", "cartoon", 350);
        PosterManager third = new PosterManager(3, 3, "Hotel Belgrade", "comedy", 50);
        PosterManager fourth = new PosterManager(4, 4, "Gentlemen", "action movie", 500);
        PosterManager fifth = new PosterManager(5, 5, "Invisible Man", "horror", 10);
        PosterManager sixth = new PosterManager(6, 6, "Trolls. World tour", "cartoon", 800);
        PosterManager seventh = new PosterManager(7, 7, "Number one", "comedy", 1500);
        PosterManager eighth = new PosterManager(8, 8, "lion king", "cartoon", 50);
        PosterManager ninth = new PosterManager(9, 9, "Hannibal Lecter", "horror", 500);
        PosterManager tenth = new PosterManager(10, 10, "The hills have eyes", "horror", 70);

        Operations managers = new Operations();
        managers.save(sixth);
        managers.save(seventh);
        managers.save(eighth);
        managers.save(ninth);
        managers.save(tenth);

        PosterManager[] expected = {tenth, ninth, eighth, seventh, sixth};
        PosterManager[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast2() {
        PosterManager first = new PosterManager(1, 1, "Bloodshot", "action movie", 500);
        PosterManager second = new PosterManager(2, 2, "Forward", "cartoon", 350);
        PosterManager third = new PosterManager(3, 3, "Hotel Belgrade", "comedy", 50);
        PosterManager fourth = new PosterManager(4, 4, "Gentlemen", "action movie", 500);
        PosterManager fifth = new PosterManager(5, 5, "Invisible Man", "horror", 10);
        PosterManager sixth = new PosterManager(6, 6, "Trolls. World tour", "cartoon", 800);
        PosterManager seventh = new PosterManager(7, 7, "Number one", "comedy", 1500);
        PosterManager eighth = new PosterManager(8, 8, "lion king", "cartoon", 50);
        PosterManager ninth = new PosterManager(9, 9, "Hannibal Lecter", "horror", 500);
        PosterManager tenth = new PosterManager(10, 10, "The hills have eyes", "horror", 70);

        Operations managers = new Operations();
        managers.save(first);
        managers.save(second);
        managers.save(third);
        managers.save(fourth);

        PosterManager[] expected = { fourth, third, second, first};
        PosterManager[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }
}