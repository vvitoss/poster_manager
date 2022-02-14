package ru.netology.poster_manager;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PosterManager {
    public int length;
    private int id;
    private String filmName;
    private String filmGenre;
    private int ticketPrice;
}
