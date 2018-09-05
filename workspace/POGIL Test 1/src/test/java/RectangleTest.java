import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest
{
    @Test
    void testRectangleArea() {
        Rectangle r1 = new Rectangle(2, 3);
        int area = r1.getArea();
        assertEquals(6, area);
    }

}
