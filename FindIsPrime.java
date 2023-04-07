public class FindIsPrime {
    private int number;

    public FindIsPrime(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrime(){
        if(number < 2) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        for(int i=3; (i*i)<=number; i+=2){
            if(number % i == 0 ) return false;
        }
        return true;
    }
}
