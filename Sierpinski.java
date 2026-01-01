/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		//// Replace this comment with your code
		double x1 = 0;
        double x2 = 1;
        double x3 = 0.5;
        double y1 = 0;
        double y2 = 0;
        double y3 = Math.sqrt(3) / 2;
		sierpinski(n,x1,x2,x3,y1,y2,y3);


	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		
		
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x3, y3, x2, y2);
		StdDraw.line(x1, y1, x3, y3);
		if(n ==0 )
		{
		
		return ;
		}
		if(n == 1)
		{
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x3, y3, x2, y2);
		StdDraw.line(x1, y1, x3, y3);
		}
		double midx12= (x1+x2)/2;
		double midx23= (x2+x3)/2;
		double midx13= (x1+x3)/2;
		double midy12= (y1+y2)/2;
		double midy23= (y2+y3)/2;
		double midy31= (y3+y1)/2;
		if(n>1)
		{
		sierpinski(n - 1, x1, midx12, midx13, y1, midy12, midy31);
		sierpinski(n - 1, midx12, x2, midx23, midy12, y2, midy23);
		sierpinski(n - 1, midx13, midx23, x3, midy31, midy23, y3);

		}
		
											
	}
}
