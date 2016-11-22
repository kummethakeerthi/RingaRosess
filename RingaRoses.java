import java.util.Scanner;
class RingaRoses {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Integer n = Integer.valueOf(input[0]);
        Integer m = Integer.valueOf(input[1]);
        
//        ArrayList<Integer> al = new ArrayList<Integer>();
        int[] array = new int[n+1];
        for(int i = 1; i <= n; i++) {
            array[i] = i;
        }
//        for(int i = 1; i <= n ;i++) {
//            System.out.print(array[i] + " ");
//        }
        System.out.println();
        
        int d = 1;
        int k = 1;
        while(n > 1) {
            for(int i = k; i <= n; i++) {
                if(d == m) {
                    k = i;
                    System.out.println(array[i]);
                    for(int j = i; j < n; j++) {
                        array[j] = array[j+1];
                        // System.out.println(array[j]);
                    }
                    n--;
//                    display(n,array);
                    d = 1;
                }
                if(k >= n ){
                    k = 1;
                }
                else 
                k++;
                d++;
            }
        }
        
            
        System.out.println("remaining elsement is :"+array[1]);
        

}
}