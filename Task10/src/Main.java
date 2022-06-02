import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[]args){
        FileInputStream fis;
        int bajt;
    }
    try{
        fis=new FileInputStream("Murad Aliyev.txt");
        do {
            bajt = fis.read();
            if (bajt != -1) {
                System.out.print((char) bajt);
            }
        }while (bajt != -1);

        }catch (FileNotFoundException e){
        System.out.println("File does not exist");
    }finally{
        try{
            fis.close();
        }catch(IOException e){
            System.out.println("Error closing");
        }
    }
}
