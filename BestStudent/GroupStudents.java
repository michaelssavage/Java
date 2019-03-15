public class GroupStudents
{
   public static void main(String [] args)
   {
      Student [] group = {
               new Student("John", 50),
               new Student("Abby", 40),
               new Student("Dylan", 20),
               new Student("Carl", 70),
               new Student("Maeve", 70),
               new Student("Chris", 46),
               new Student("James", 55),
               new Student("Anne", 63),
            };

      Student best = Test.getBestStudent(group);
      System.out.println("The best student was " + best.getName() + " with a mark of " + best.getMark());
   }
}
