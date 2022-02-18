package ru.netology.poster_manager;

public class Manager {
    private int lastIndex = 10;
    private BillboardFilm[] items = new BillboardFilm[0];

    public Manager() {

    }

    public Manager(int lastIndex) {
        this.lastIndex = lastIndex;
    }


    public void save(BillboardFilm item) {
        int length = items.length + 1;
        BillboardFilm[] tmp = new BillboardFilm[length];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        // System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public BillboardFilm[] findAll() {
        //  int[] film = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //  for (int i = film.length - 1; i <= 0; i--) {
        //   }
        return items;
    }

    public BillboardFilm[] findLast() {
        int resultLength = items.length;
        //  int lastIndex = resultLength;
        if (resultLength > lastIndex) {
            resultLength = lastIndex;
        } else {
            resultLength = items.length;
        }

        BillboardFilm[] result = new BillboardFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
}
