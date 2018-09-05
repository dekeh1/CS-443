/**
 * Represents a geometric rectangle.
 *
 * @author Karl R. Wurst
 * @version CS 443 Fall 2018
 */
public class Rectangle {
    private int height;
    private int width;

    /**
     * Create a rectangle given height and width.
     * @param height height of the rectangle
     * @param width width of the rectangle
     */
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Get the area of the rectangle.
     * @return area of the rectangle
     */
    public int getArea() {
        return height * width;
    }

    /**
     * Determine if the rectangle is a square.
     * @return true if the rectangle is a square
     */
    public boolean isSquare() {
        return height == width;
    }
}
