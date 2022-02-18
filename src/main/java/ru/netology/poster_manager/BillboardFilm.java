package ru.netology.poster_manager;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BillboardFilm {
    public int id;
    private int productId;
    private String filmName;
    private String filmGenre;
    private int ticketPrice;

    // public int getId() {
    //    return id;
    //  }

    //  public void setId(int id) {
    //     this.id = id;
    // }

    // public int getProductId() {
    //     return productId;
    //  }

    //  public void setProductId(int productId) {
    //     this.productId = productId;
    // }

    // public String getFilmName() {
    //   return filmName;
    // }

    //  public void setFilmName(String filmName) {
    //     this.filmName = filmName;
    //  }

    //  public String getFilmGenre() {
    //     return filmGenre;
    //  }

    //  public void setFilmGenre(String filmGenre) {
    //     this.filmGenre = filmGenre;
    //  }

    //   public int getTicketPrice() {
    //    return ticketPrice;
    //   }

    // public void setTicketPrice(int ticketPrice) {
    //     this.ticketPrice = ticketPrice;
    // }

  //  public PosterManager(int id, int productId, String filmName, String filmGenre, int ticketPrice) {
     //   this.id = id;
     //   this.productId = productId;
     //   this.filmName = filmName;
     //   this.filmGenre = filmGenre;
     //   this.ticketPrice = ticketPrice;
   // }
}

