package ru.netology.poster_manager;

public class Operations {
    private int lastIndex = 10;
    private PosterManager[] items = new PosterManager[0];

    public Operations() {

    }

    public Operations(int lastIndex) {
        this.lastIndex = lastIndex;
    }


    public void  save(PosterManager item) {
        int length = items.length + 1;
        PosterManager[] tmp = new PosterManager[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        // System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PosterManager[] findAll() {
        //  int[] film = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //  for (int i = film.length - 1; i <= 0; i--) {
        //   }
        return items;
    }

    public PosterManager[] findLast() {
        int resultLength = items.length;
        //  int lastIndex = resultLength;
        if (resultLength > lastIndex) {
            resultLength = lastIndex;
        } else {
         resultLength = items.length;
       }

        PosterManager[] result = new PosterManager[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
}
