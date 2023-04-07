public class FindReverseOrder {

    public void reverseOrder(int a, int[] b){
        if(a==0){
            return;
        }
        else{
            System.out.print(b[a-1]);
            System.out.print(" ");
            reverseOrder(a-1,b);
        }
    }

}
