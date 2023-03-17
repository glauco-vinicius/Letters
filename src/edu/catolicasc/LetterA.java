package edu.catolicasc;

public class LetterA implements Letter {
    @Override
    public char[][] getLetter() {
        char[][] arr = {
                 {'A', 'A', 'A', 'A'},
                 {'A', ' ', ' ', 'A'},
                 {'A', 'A', 'A', 'A'},
                 {'A', ' ', ' ', 'A'},
                 {'A', ' ', ' ', 'A'}
        };
        return arr;
    }
}

