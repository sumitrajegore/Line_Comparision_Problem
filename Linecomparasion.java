public class Linecomparasion{

	public static void main(String[] args){

		System.out.println("Welcom to Line Comparison and Computation");
       int x1=0;
       int y1=0;
       int x2=4;
       int y2=3;
       double dist;
       dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
       System.out.println("distance between" + "("+x1+","+y1+"), " + "("+x2+","+y2+")"+"     "+dist);

	}
}
