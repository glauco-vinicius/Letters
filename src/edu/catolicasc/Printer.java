package edu.catolicasc;

public class Printer {
    public void print(Letter letra) {
        char[][] arr = letra.getLetter();
        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    public void print(Letter[] letters)  {
        for (int i = 0; i < letters.length ; i++) {
            this.print(letters[i]);
            this.separator();
        }
    }

    public void separator() {
        System.out.println();
        System.out.println();
    }
}
