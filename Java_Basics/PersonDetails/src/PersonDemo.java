import java.io.*;

class person
{

    String name;
    int age;
    String gender;

}
class employee extends person
{
    int code;
    void set_e()throws IOException
    {
     DataInputStream d =new DataInputStream(System.in);

        String s1,s2;
        System.out.println("\nENTER NAME ");
        name=d.readLine();
        System.out.println("ENTER AGE ");
        s1=d.readLine();
        age=Integer.parseInt(s1);
	    System.out.println("ENTER GENDER ");
        gender=d.readLine();
        System.out.println("ENTER CODE ");
        s2=d.readLine();
        code=Integer.parseInt(s2);
    }
  void disp_e()throws IOException
    {
        System.out.println("NAME :"+this.name);
        System.out.println("AGE :"+this.age);
        System.out.println("GENDER :"+this.gender);
        System.out.println("CODE "+this.code);
    }

}
class spec extends employee
{
void set_s()throws IOException
    {
    DataInputStream d =new DataInputStream(System.in);

        String s1,s2;
        System.out.println("\nENTER NAME ");
        name=d.readLine();

        System.out.println("ENTER AGE ");
        s1=d.readLine();
        age=Integer.parseInt(s1);

	    System.out.println("ENTER GENDER ");
        gender=d.readLine();

        System.out.println("ENTER CODE ");
        s2=d.readLine();
        code=Integer.parseInt(s2);
    }

  void disp_s()throws IOException
    {
        System.out.println("NAME :"+this.name);
        System.out.println("AGE :"+this.age);
        System.out.println("GENDER :"+this.gender);
        System.out.println("CODE "+this.code);
    }


}
class PersonDemo
{
    public static void main(String args[])throws IOException
    {
    int i;

        employee e[] = new employee[3];
        spec s[] = new spec[3];

        for(i=0;i<3;i++)
        {
        e[i]= new employee();
        System.out.println("ENTER EMPLOYEE DETAILS\n");
        e[i].set_e();
        }

        for(i=0;i<3;i++)
        {
        s[i]= new spec();
        System.out.println("ENTER SPECIALIST DETAILS\n");
        s[i].set_s();
        }
        for(i=0;i<3;i++)
        {
        System.out.println("");
        System.out.println("\n EMPLOYEE "+(i+1)+" DETAILSA\n");
        e[i].disp_e();
        }
        for(i=0;i<3;i++)
        {
        System.out.println("");
        System.out.println("SPECIALIST "+(i+1)+" DETAILS\n");
        s[i].disp_s();
        }

    }
}
