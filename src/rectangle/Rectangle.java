/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle;
/**
 * Rectangle class.
 */
public class Rectangle {
	private double length, width;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Rectangle object created. length and width intialized to 1.
	 */
	public Rectangle() {
		length = 1;			//default length
		width = 1;			//default width
	}
	

	/**
	 * constructor
	 * pre: none
	 * post: A Rectangle object created with length l and width w.
	 */
	public Rectangle(double l, double w) {
		length = l;			
		width = w;			
	}


	/** 
	 * Changes the length of the rectangle.
	 * pre: none
	 * post: length has been changed.
	 */
	public void setLength(double newLength) {
	 	length = newLength;
	}


	/** 
	 * Changes the width of the rectangle.
	 * pre: none
	 * post: width has been changed.
	 */
	public void setWidth(double newWidth) {
	 	width = newWidth;
	}


	/** 
	 * Calcuates the area of the rectangle.
	 * pre: none
	 * post: The area of the rectangle has been returned.
	 */
	public double area() {
	 	double rectArea;
	 	
	 	rectArea = length * width;
	 	return(rectArea);
	}

	
	/** 
	 * Calcuates the perimeter of the rectangle.
	 * pre: none
	 * post: The perimeter of the rectangle has been returned.
	 */
	public double perimeter() {
	 	double rectPerimeter;
	 	
	 	rectPerimeter = (2 * length) + (2 * width);
	 	return(rectPerimeter);
	}


	/** 
	 * Returns the legnth of the rectangle.
	 * pre: none
	 * post: The length of the rectangle has been returned.
	 */
	public double getLength() {
	 	return(length);
	}


	/** 
	 * Returns the width of the rectangle.
	 * pre: none
	 * post: The width of the rectangle has been returned.
	 */
	public double getWidth() {
	 	return(width);
	}
}
