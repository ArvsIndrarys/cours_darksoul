import java.util.Scanner;

class TestPoint {
    static public void main(String[] args) {

        // 2 - METHODE 1
        //int x = Integer.parseInt(args[0]);
        //int y = Integer.parseInt(args[1]);

        // 2 - METHODE 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();

        Point p1 = new Point(x, y);
        System.out.println(p1);
    }
}