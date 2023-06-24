
import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class FindClosestPointPair {

    Point2D.Double[] points; // Points set: SmallerSet.input, test_100.input, test_1000.input, test_10000.input
    private Point2D.Double point_1, point_2; // closest point pair
    
    /**
     * Default Constructor
     */
    public FindClosestPointPair() {
        //Write your codes here
    }
    
    /**
     * Main method for calculate and return closest point pair
     */
    public void calculateClosestPointPair() {
        if (points == null || points.length < 2) {
            // Handle the case when there are not enough points
            return;
        }
    
        // Initialize the closest distance to a large value
        double closestDistance = Double.POSITIVE_INFINITY;
    
        // Iterate over all pairs of points and find the closest pair
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Point2D.Double p1 = points[i];
                Point2D.Double p2 = points[j];
                double distance = getDistance(p1, p2);
                if (distance < closestDistance) {
                    // Update the closest pair and distance
                    closestDistance = distance;
                    point_1 = p1;
                    point_2 = p2;
                }
            }
        }
    }
    
    /**
     *
     * @param filePath --> file absolute path
     * @return --> array containing the information of points read from the file
     * @throws Exception
     */
    public void readFile(String filePath) throws FileNotFoundException {
        //Write your codes here
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        scanner.useLocale(Locale.US);
        int numPoints = scanner.nextInt();
        points = new Point2D.Double[numPoints];
        for (int i = 0; i < numPoints; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i] = new Point2D.Double(x, y);
        }
        scanner.close();
    }
    
    /**
     * Get point_1
     */
    public Point2D.Double getPoint_1(){ return point_1;}
    
    /**
     * Get point_2
     */
    public Point2D.Double getPoint_2(){ return point_2;}
    
    /**
     * Get Point Pair distance
     */
    public double getDistance(Point2D.Double p1, Point2D.Double p2) {
        //Write your codes here
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    /** Returns a printable representation of this pair and the distance */
    public String toString() {
        if (this.point_1.x > this.point_2.x || (this.point_1.x == this.point_2.x && this.point_1.y > this.point_2.y)) {
            Point2D.Double temp = this.point_1;
            this.point_1 = this.point_2;
            this.point_2 = temp;
        }
        return "(" + this.point_1.x + ", " + this.point_1.y + ")-(" + this.point_2.x + ", " + this.point_2.y + ")= " + getDistance(this.point_1, this.point_2);
    }
    

}