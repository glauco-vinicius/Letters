package edu.catolicasc;

public class LetterC implements Letter {
    @Override
    public char[][] getLetter() {
        char[][] arr = {
                {' ', 'C', 'C', 'C'},
                {'C', ' ', ' ', ' '},
                {'C', ' ', ' ', ' '},
                {'C', ' ', ' ', ' '},
                {' ', 'C', 'C', 'C'}
        };
        return arr;

    }
}