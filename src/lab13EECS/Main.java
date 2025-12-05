package lab13EECS;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		boolean[] chptList = new boolean[16];
	      int includeChpt;
	      int i, j;
	      
	      for (i = 1; i <= 15; ++i) {
	         includeChpt = scnr.nextInt(); 
	         if (includeChpt==1) {
	            chptList[i] = true;
	         }
	         else {
	            chptList[i] = false;
	         }
	      }
	      
	      boolean anySelected = false;

	      for (i = 1; i <= 15; i++) {
	        if (!chptList[i]) {
	            continue;
	        }
	        anySelected = true;

	        if (i <= 13 && chptList[i] && chptList[i+1] && chptList[i+2]) {
	           int start = i;
	           int end = i + 2;

	           j = end + 1;
	           while (j <= 15 && chptList[j]) {
	            end = j;
	            j++;
	           }

	           System.out.print(start + "-" + end + " ");
	           i = end;
	        }
	        else {
	           System.out.print(i + " ");
	        }
	      }

	      if (!anySelected) {
	        System.out.print("None ");
	      }
	      System.out.println();

	}

}
