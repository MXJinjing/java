public class fortest{
    public static void main(String[] args) throws Exception {
        int s = 1, n = 5;
        // for(int i = 1; i <= n; i++){
        //     s = s*i;
        // }
        // System.out.println("n!=" + s);
        
        int i = 1;
        while(i <= n){
            s = s*i++;
        }
        System.out.println("n!=" + s);
    }
}