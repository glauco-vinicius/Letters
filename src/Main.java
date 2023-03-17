import edu.catolicasc.*;

public class Main {
    public static void main(String[] args) {
        Letter[] letters = {new LetterA(),
                new LetterB(),
                new LetterC()
        };
        Printer print = new Printer();
        print.print(letters);
    }
}