public class PrimeNum {
    public static void main(String[] args) {
        
      for(int j=1;j<=50;j++){
        boolean flag = true;
        for(int i=2;i<j;i++){
            if(j % i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(j);
        }
      }     
    }
}
