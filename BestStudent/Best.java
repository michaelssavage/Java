public class Best
{
    public static int numberPasses(Student [] student)
    {
        int count = 0;
        for(int i = 0; i < student.length; i++)
            if(student[i].getMark() >= 40)
            {
                count++;
            }
        return count;
    }

    public static Student getBestStudent(Student [] student)
    {
        int mark = 0;
        for(int i =1; i < student.length; i++)
        {
            if(student[i].getMark() > student[mark].getMark())
                mark = i;
        }
    return student[mark];
    }
}
