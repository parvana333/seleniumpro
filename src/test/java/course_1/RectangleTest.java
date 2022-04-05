package course_1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    private Rectangle rectangle;
    private Rectangle rectangle2;

    @BeforeEach
    public void setup() throws RectangleException {
     rectangle=new Rectangle(4,5);
    }

    @Test
    public void testGetArea(){
        assertEquals(20,rectangle.getArea());
    }
    @Test
    public void testgetPerimetr(){
        assertEquals(18,rectangle.getPerimeter());
    }
    @Test
    public void testisSquare(){
        assertEquals(false,rectangle.isSquare());
    }
    @Test
    public void testException(){
        assertThrows(RectangleException.class, () ->{
           new Rectangle(-4,5);
        },"a parameter has to be positive, got: -4.0" );
    }
    @Test
    public void testException2(){
        assertThrows(RectangleException.class, () ->{
            new Rectangle(4,-5);
        } );
    }
}
