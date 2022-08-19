//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double x1Double = x1;
		double x2Double = x2;
		double y1Double = y1;
		double y2Double = y2;
		return (y2Double - y1Double)/(x2Double - x1Double);
	}

}