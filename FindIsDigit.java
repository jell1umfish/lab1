import static java.lang.Character.isDigit;

public class FindIsDigit {
    public boolean isItDigit(char[] a){
         for(int i = 0; i< a.length; i++){
             if(!isDigit(a[i])){
                 return false;
             }

         }
         return true;
    }
}
