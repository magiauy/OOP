import Manager.Menu;
import DTO.*;
import BUS.*;
public class App {
    public static void main(String[] args) {
        TypesBUS temp = new TypesBUS();
        BookTypes test = new BookTypes("12311wsx", "hello world");
        BookTypes test1 = new BookTypes("12311w", "hello");
        temp.add(test);
        temp.add(test1);
        temp.showList();
    }
}
