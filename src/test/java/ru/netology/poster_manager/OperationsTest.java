package ru.netology.poster_manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void save() {
        BillboardFilm first = new BillboardFilm(1, 1, "Bloodshot", "action movie", 500);
        BillboardFilm second = new BillboardFilm(2, 2, "Forward", "cartoon", 350);
        BillboardFilm third = new BillboardFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        BillboardFilm fourth = new BillboardFilm(4, 4, "Gentlemen", "action movie", 500);
        BillboardFilm fifth = new BillboardFilm(5, 5, "Invisible Man", "horror", 10);
        BillboardFilm sixth = new BillboardFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        BillboardFilm seventh = new BillboardFilm(7, 7, "Number one", "comedy", 1500);
        BillboardFilm eighth = new BillboardFilm(8, 8, "lion king", "cartoon", 50);
        BillboardFilm ninth = new BillboardFilm(9, 9, "Hannibal Lecter", "horror", 500);
        BillboardFilm tenth = new BillboardFilm(10, 10, "The hills have eyes", "horror", 70);
        BillboardFilm eleventh = new BillboardFilm(11, 11, "The hills have eyes", "horror", 70);

        Manager managers = new Manager();
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


        BillboardFilm[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        BillboardFilm[] actual = managers.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        BillboardFilm first = new BillboardFilm(1, 1, "Bloodshot", "action movie", 500);
        BillboardFilm second = new BillboardFilm(2, 2, "Forward", "cartoon", 350);
        BillboardFilm third = new BillboardFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        BillboardFilm fourth = new BillboardFilm(4, 4, "Gentlemen", "action movie", 500);
        BillboardFilm fifth = new BillboardFilm(5, 5, "Invisible Man", "horror", 10);
        BillboardFilm sixth = new BillboardFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        BillboardFilm seventh = new BillboardFilm(7, 7, "Number one", "comedy", 1500);
        BillboardFilm eighth = new BillboardFilm(8, 8, "lion king", "cartoon", 50);
        BillboardFilm ninth = new BillboardFilm(9, 9, "Hannibal Lecter", "horror", 500);
        BillboardFilm tenth = new BillboardFilm(10, 10, "The hills have eyes", "horror", 70);

        Manager managers = new Manager();

        BillboardFilm[] expected = {};
        BillboardFilm[] actual = managers.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast1() {
        BillboardFilm first = new BillboardFilm(1, 1, "Bloodshot", "action movie", 500);
        BillboardFilm second = new BillboardFilm(2, 2, "Forward", "cartoon", 350);
        BillboardFilm third = new BillboardFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        BillboardFilm fourth = new BillboardFilm(4, 4, "Gentlemen", "action movie", 500);
        BillboardFilm fifth = new BillboardFilm(5, 5, "Invisible Man", "horror", 10);
        BillboardFilm sixth = new BillboardFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        BillboardFilm seventh = new BillboardFilm(7, 7, "Number one", "comedy", 1500);
        BillboardFilm eighth = new BillboardFilm(8, 8, "lion king", "cartoon", 50);
        BillboardFilm ninth = new BillboardFilm(9, 9, "Hannibal Lecter", "horror", 500);
        BillboardFilm tenth = new BillboardFilm(10, 10, "The hills have eyes", "horror", 70);

        Manager managers = new Manager();
        managers.save(sixth);
        managers.save(seventh);
        managers.save(eighth);
        managers.save(ninth);
        managers.save(tenth);

        BillboardFilm[] expected = {tenth, ninth, eighth, seventh, sixth};
        BillboardFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast2() {
        BillboardFilm first = new BillboardFilm(1, 1, "Bloodshot", "action movie", 500);
        BillboardFilm second = new BillboardFilm(2, 2, "Forward", "cartoon", 350);
        BillboardFilm third = new BillboardFilm(3, 3, "Hotel Belgrade", "comedy", 50);
        BillboardFilm fourth = new BillboardFilm(4, 4, "Gentlemen", "action movie", 500);
        BillboardFilm fifth = new BillboardFilm(5, 5, "Invisible Man", "horror", 10);
        BillboardFilm sixth = new BillboardFilm(6, 6, "Trolls. World tour", "cartoon", 800);
        BillboardFilm seventh = new BillboardFilm(7, 7, "Number one", "comedy", 1500);
        BillboardFilm eighth = new BillboardFilm(8, 8, "lion king", "cartoon", 50);
        BillboardFilm ninth = new BillboardFilm(9, 9, "Hannibal Lecter", "horror", 500);
        BillboardFilm tenth = new BillboardFilm(10, 10, "The hills have eyes", "horror", 70);

        Manager managers = new Manager();
        managers.save(first);
        managers.save(second);
        managers.save(third);
        managers.save(fourth);

        BillboardFilm[] expected = { fourth, third, second, first};
        BillboardFilm[] actual = managers.findLast();

        assertArrayEquals(expected, actual);
    }
}