package ru.netology.poster_manager;

public class Operations {
    private PosterManager[] items = new PosterManager[0];


    public void save(PosterManager item) {
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
        int lastIndex = 10;
        if (resultLength > lastIndex) {
            resultLength = lastIndex;
        }
        //else {
          //  resultLength = items.length;
        //}

        PosterManager[] result = new PosterManager[items.length];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
}
