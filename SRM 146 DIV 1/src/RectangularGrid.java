import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RectangularGrid {
	
	public long countRectangles(int width, int height) {
		long total = 0;
		for(int x=width; x>0; x--) {
			for (int y = height; y > 0 ; y--) {
				if(x==y) continue;
				total+=getRectCount(width,height,x,y);
			}
		}
		return total;
	}

	public long getRectCount(int width, int height, int rectA, int rectB)
	{
		long a = width-rectA+1;
		long b = height-rectB+1;
		return a*b;
	}
}
