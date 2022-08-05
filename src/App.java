import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' } };
        printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scan.nextInt();

        System.out.println(pos);

        scan.close();
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
