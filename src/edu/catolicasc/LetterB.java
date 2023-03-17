package edu.catolicasc;

public class LetterB implements Letter {
    @Override
    public char[][] getLetter() {
        char[][] arr = {
                {'B', 'B', 'B', ' ', ' '},
                {'B', ' ', ' ', 'B', ' '},
                {'B', 'B', 'B', ' ', ' '},
                {'B', ' ', ' ', 'B', ' '},
                {'B', 'B', 'B', ' ', ' '}
        };
        return arr;
    }
}