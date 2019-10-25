
public class Equestria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int x1= 0;
		int y1=5;
		int x2=0;
		int y2=0;
		distance();
        System.out.println("Distance from Baltimare (" + x1 + "," + y2 + ") to Manehattan (" + x2+ "," + y2+")="+ d);
        int x1= 0;
		int y1=5;
		int x2=0;
		int y2=0;
        distance();
        System.out.println("Distance from Los Pegasus(" + x1 + "," + y2 + ") to Neighagra Falls (" + x2 + "," + y2 +")="+ d);
        int x1= 0;
		int y1=5;
		int x2=0;
		int y2=0;
        distance();
        System.out.println("Distance from  Badlands (" + x1 + "," + y2 + ") to Ponyville (" + x2 + "," + y2 +")="+ d);
	}	
		public static double distance(double x1, double y1, double x2, double y2) {
		double x3 = x2-x1 ;                    /* (x2-x1)   */
		double x = Math.pow(x3,2);             /*(x2-x1)*(x2-x1) */
		double y3 = y2-y1 ;                  /* (y2-y1)   */
		double y = Math.pow(y3,2);           /* (y2-y1)*(y2-y1)  */
		double b = x + y;                  /* (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) */
		double d = Math.sqrt(b) ;         /* distance */
        return d;
		
		}
		
		
		
	}


