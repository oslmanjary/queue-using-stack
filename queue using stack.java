/*Program for queue using the stack*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<Integer>();
        //Stack<Integer> stack2 = new Stack<Integer>();
		ArrayList<Integer> print = new ArrayList<Integer>();
        int totalqueries = sc.nextInt();
        for(int i=0;i<totalqueries;i++){
            int type = sc.nextInt();
            if(type == 1){
                int data = sc.nextInt();
                stack1.push(data);
            }
            else if(type==2){
                stack1.remove(0);
            }
            else{
                print.add(stack1.firstElement());
            }
        }
		/* code for testing the output
		for(int i:print){
			System.out.println(i);
		}
		*/
    }
}
