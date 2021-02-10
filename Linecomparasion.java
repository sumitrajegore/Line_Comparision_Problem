class geometry
{
       static int x1=2;
       static int y1=2;
       static int x2=5;
       static int y2=5;
       void line()
       {
       double dist;
       dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
       System.out.println("Length_of_line_is : " + "("+x1+","+y1+"), " + "("+x2+","+y2+")"+ " = " +dist);
       }
       void equal()
       {
        System.out.println(x1 == y1);
        System.out.println(x2 == y2);
        System.out.println(x2 == y1);
        System.out.println(x1 == y2);
       }
       void compare()
       {
        System.out.println(Integer.compare(x1, y1));
        System.out.println(Integer.compare(x2, y2));
        System.out.println(Integer.compare(x2, y1));
        System.out.println(Integer.compare(y2, x1));
       }
}
public class Linecomparasion
{
	public static void main(String[] args)
       {
        System.out.println("--welcome to line comparasion problem--");
        geometry obj = new geometry();
        obj.line();
        obj.equal();
        obj.compare();
       }
}

