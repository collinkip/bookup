import javax.swing.*;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String username,password;
        for (int i=0;i<3;i++){
            String borrowId= UUID.randomUUID().toString();
            username= JOptionPane.showInputDialog("Enter your username :");
            password= JOptionPane.showInputDialog("Enter your password :");


            if (username.equals("colo")  && password.equals("1234")) {
                books book=new books();
                book.registerBook();
                book.displayBooks();
                break;

            }
            else {
                JOptionPane.showMessageDialog(null,"Incorrect password or username");
            }

        }

    }
}