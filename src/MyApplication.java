import models.Point;
import models.Shape;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\abzal\\IdeaProjects\\Assinment1 Abzal\\source");
        Scanner scan = new Scanner(file);
        Shape shape = new Shape();
        while (scan.hasNextLine()) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongestSide());
    }
}
