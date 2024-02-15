import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.depozit(15000);
        System.out.println("Your balance -->  " + bankAccount.getAmount());
       while (true){
           try{
               bankAccount.withDraw(6000);
               System.out.println("Snyata 6000 ");
           }catch (LimitException error){
               try{
                   bankAccount.withDraw((int) error.getRemainingAmount());
               }catch (LimitException e){
                   e.printStackTrace();
               }

           }
           System.out.println(bankAccount.getAmount());
           if( bankAccount.getAmount() == 0){
               break;
           }
       }

//        User user = new User();
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (true){
//            System.out.println("BBedite basha imya --> ");
//            String name =  scanner.next();
//            try {
//                user.setName(name);
//                System.out.println("Uspeshno basha imya" + user.getName());
//
//            }catch (IllegalNameException e){
//                System.out.println(e.getMessage());
//            }
//
//
//            System.out.println(" uspesho  basha vozraat -->");
//            Integer age = scanner.nextInt();
//            try{
//                user.setAge(age);
//                System.out.println("Uspeshno bash bozrast " + user.getAge());
//
//            }catch (IllegalAgeException e){
//                System.out.println(e.getMessage());
//            }
//        }
        }


        /*private  static  Integer getAreaValue(Integer a, Integer b){
        if(a <= 0 || b <= 0){
            throw new IllegalArgumentException(" Oshibka znachenie  a  i b ne doljny " +
                    "byt nije 0. Bashi a = " + a + " i b = " + b);
        }return  a * b;

        }*/
    }