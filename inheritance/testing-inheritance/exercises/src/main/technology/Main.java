package technology;

public class Main {
    public static void main(String[] args) {
        Smartphone apple = new Smartphone(0, 100, "Blue", "B");
        System.out.println(apple.getComputerName());
        apple.changeName();
        System.out.println(apple.getComputerName());
    }
}
