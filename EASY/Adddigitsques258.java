public class Adddigitsques258{
    public static int adddig(int num){
        while(num>=10){
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
    public static void main(String args[]){
        System.out.println(adddig(38));
        System.out.println(adddig(0));
    }
}