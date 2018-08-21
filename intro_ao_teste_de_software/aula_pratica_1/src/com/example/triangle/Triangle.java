package com.example.triangle;

import static com.example.triangle.TriangleType.*;

public class Triangle {
	private int side1, side2, side3; 
	private TriangleType type; 

	public Triangle(int s1, int s2, int s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		type = determineType(); 
	}

	public TriangleType getType() {
		return type; 
	}

	private TriangleType determineType() {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) 
			return INVALID; 
		if (side1 == side2 && side2 == side3) 
			return EQUILATERAL;
		if (side1 >= side2 + side3 || side3 >= side2 + side1 || side2 >= side1 + side3) 
			return INVALID;
		if (side2 == side3 || side1 == side2 || side3 == side1) 
			return ISOSCELES;
		return SCALENE;
	}
}
/* "Beware of bugs in the above code; 
 * I have only proved it correct, not tried it." 
 * -- Donald Knuth
 */

