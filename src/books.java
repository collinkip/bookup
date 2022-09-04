import javax.swing.*;
import java.util.ArrayList;
import java.util.UUID;

public class books {
    ArrayList<String> books=new ArrayList<String>();
    ArrayList<String> bookdetails=new ArrayList<String>();
    void registerBook(){

        String borrowId= UUID.randomUUID().toString();

        for (int i = 0; i < 3; i++) {
            String bookname=JOptionPane.showInputDialog("Enter bookName");
            String Student=JOptionPane.showInputDialog("Enter student information");
            bookdetails.add(bookname);
            bookdetails.add(Student);
            books.add(String.valueOf(bookdetails));
        }
    }
    void displayBooks(){
        int i;
        String message = "";
        for (i=0;i<books.size();i++){
            message= books.get(i);
            JOptionPane.showMessageDialog(null,message);
        }
    }
}
