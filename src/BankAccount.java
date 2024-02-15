public class BankAccount {
     private double amount;
    public double getAmount(){
        return amount;
    }
    public  void  depozit(double sum){
      amount =  amount + sum;
    }
    public void withDraw(int sum) throws LimitException{
        if( sum > amount){
            throw  new LimitException("Ne hvataet na chetu dengi.Your balance =",amount);
        } else {
            amount =  amount - sum;

        }
    }

}
