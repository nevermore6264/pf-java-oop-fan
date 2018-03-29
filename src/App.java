public class App {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        System.out.println("Infomation :" + fan1.toString());

        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
        System.out.println("Infomation :" + fan2.toString());
    }
}
