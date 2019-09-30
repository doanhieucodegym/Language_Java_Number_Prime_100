public class Number_prime_100 {

   public static boolean isPrime(int n){
            boolean check = true;
            if(n <2){
                check =false;
            }else{
                for (int i =2 ; i<Math.sqrt(n);i++){
                    if(n %i ==0){
                        check =false;

                    }
                }
            }
        return check;
     }

     public static void print(){
       int count  =1;
       int N =2 ;
       while(count <100){
            if(isPrime(N)) System.out.println(N + " ");
            N++;
            count++;
            }
     }
    public static void main(String[] args) {
        print();

    }

}
