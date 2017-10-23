/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle;

/**
 *
 * @author rkaune
 */
/**
 * The Rectangle class is tested.
 */
 public class TestRectangle {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(1, 1);
                Rectangle box1 = new Rectangle();
                //box.setLength(6);
                System.out.println(box1.equals(box));
		System.out.println(box);		
		System.out.println("Rectangle has length " + box.getLength() + " and width " + box.getWidth());
		System.out.println("Rectangle area: " + box.area());
                System.out.println("Rectangle1 area: " + box1.area());
		System.out.println("Rectangle perimeter: " + box.perimeter());
                System.out.println("Rectangle1 length " + box1.getLength());
                
	}
}
