import java.util.*;
import java.math.*;
import static java.lang.Math.*;
//Теорема пифагора, синусы, геометрия, число пи

/**
 * The solution to this problem may be the shortest a TopCoder problem has ever seen. However, there is some basic geometry to be done before the return statement can be written.
 *
 * Taking the perimeter of a n-sided regular polygon (n * d, d: sidelength) inscribed into a circle as an approximation for the perimeter of that circle ( 2 * Pi * r ) we get n * d = 2 * appr_Pi * r   <=>   appr_Pi = n * d / (2 * r).
 *
 * To calculate the length of a side from the polygon, take a look at the image on the left: For the little right triangle we get sin alpha = (d/2) / r with alpha = 2 * Pi / (2 * n) = Pi / n (in radian). Inserting d = 2 * r * sin (Pi / n) into the approximation we get appr_Pi = n * 2 * r * sin (Pi / n) / (2 * r)   <=>   appr_Pi = n * sin (Pi / n).
 */
public class Archimedes {

	public double approximatePi(int numSides) {
		return numSides * Math.sin(Math.PI / numSides);
	}
}
