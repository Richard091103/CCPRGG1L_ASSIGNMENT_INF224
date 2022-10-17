import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Act 1 - Print FIRST NAME 3 times using while loop

        int count = 0;
        
        while (count != 3) {
            System.out.println("RICHARD JEFFERSON");
            count++;
        }

        // Act 2 - Print MIDDLE NAME 4 times using Do-While loop
        
        do {
            System.out.println("VALERIANO");
            count++;
        } while (count != 4);

        // Act 3 - Print SURNAME 5 times using for loop
        
        for (count = 0; count < 5; count++) {
            System.out.println("MENESES");
        }

        // Act 4 - Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)

        char[] initial = {'R','I','C','H','A','R','D',' ','J','E','F','F','E','R','S','O','N'};

        for (char x: initial){
            System.out.print(x);
        }

        //or 

        for (int x = 0; x < initial.length; x++) {
            System.out.print(initial[x]);
        }

        // Act 5 - char array REVERSE First Name
        
        char[] ini = {'R','I','C','H','A','R','D',' ','J','E','F','F','E','R','S','O','N'};

        for (int x = ini.length - 1; x >= 0; x--) {
            System.out.print(ini[x]);
        }
        
        // Close Scanner
        scan.close();
    }
}
