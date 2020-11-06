public class Circle extends Shape
{
   private double radius; // name inherited

   public Circle(String n, double r)
   {
      super(n); // use Shape constructor; effect is name=s;
      radius = r;
   }

   double area()
   {
      double area = Math.PI * (radius * radius);
      return area;
   }
}
