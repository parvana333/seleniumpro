package course_1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    private Rectangle rectangle;
    private Rectangle rectangle2;

    @BeforeEach
    public void setup() throws RectangleException {
     rectangle=new Rectangle(4.0,5.0);
    }

    @Test
    public void testGetArea(){
        assertEquals(20.0,rectangle.getArea());
        assertThrows(RectangleException.class,()->new Rectangle(-3,8).getArea());
        assertThrows(RectangleException.class,()->new Rectangle(4,-10).getArea());
        assertThrows(RectangleException.class,()->new Rectangle(0,8).getArea());
        assertThrows(RectangleException.class,()->new Rectangle(4,0).getArea());
    }
    @Test
    public void testgetPerimetr(){
        assertEquals(18.0,rectangle.getPerimeter());
        assertThrows(RectangleException.class,()->new Rectangle(-4,5).getPerimeter());
        assertThrows(RectangleException.class,()->new Rectangle(4,-5).getPerimeter());
        assertThrows(RectangleException.class,()->new Rectangle(0,8).getPerimeter());
        assertThrows(RectangleException.class,()->new Rectangle(4,0).getPerimeter());
    }
    @Test
    public void testisSquare() throws RectangleException {
        assertEquals(false,rectangle.isSquare());
        assertEquals(true,new Rectangle(4,4).isSquare());
        assertThrows(RectangleException.class,()->new Rectangle(-4,5).isSquare());
        assertThrows(RectangleException.class,()->new Rectangle(4,-5).isSquare());
        assertThrows(RectangleException.class,()->new Rectangle(0,5).isSquare());
        assertThrows(RectangleException.class,()->new Rectangle(4,0).isSquare());
    }
    @Test
    public void testException(){
        assertThrows(RectangleException.class, () ->{
           new Rectangle(-4.0,5.0);
        },"a parameter has to be positive, got: -4.0" );

    }
    @Test
    public void testException2(){
        assertThrows(RectangleException.class, () ->{
            new Rectangle(4,-5);
        } );
        assertThrows(RectangleException.class, () ->{
            new Rectangle(0,-5);
        } );
        assertThrows(RectangleException.class, () ->{
            new Rectangle(4,0);
        } );
    }
    @Test
    public void testGetA() throws RectangleException {
        assertEquals(5.0,new Rectangle(5.0,6.0).getA());
        assertThrows(RectangleException.class,()->new Rectangle(-4,5).getA());
        assertThrows(RectangleException.class,()->new Rectangle(4,-5).getA());
    }
    @Test
    public void testGetB() throws RectangleException {
        assertEquals(6.0,new Rectangle(5.0,6.0).getB());
        assertThrows(RectangleException.class,()->new Rectangle(4,-5).getB());
    }
    @Test
    public void testSetA(){
        rectangle.setA(12.0);
        assertEquals(12.0,rectangle.a);
    }
    @Test
    public void testSetB(){
        rectangle.setB(13.0);
        assertEquals(13.0,rectangle.b);
    }
}
