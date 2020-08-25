package pack;

public class ColorPrinter extends Printer {
    void print(String value){
        System.out.println((char) 27 + "[32m" + value);
    }
}
