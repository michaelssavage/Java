public class Average
{

	public static double averageArea(Shape[] shapes)
	{
		double area = 0;
		for(Shape shape:shapes)
			area += shape.area();

		return area / shapes.length;
	}
}
