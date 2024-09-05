public class Counting_occurances{
    public static void main(String[] args) {
        int n =525515355;
        int rem = 0;
        int count =0;
        while(n>0){
            rem = n%10;
            if (rem == 5) { // here the problem is I have to change the number that occured most and then I have to compare with n
                count++;
            } 
            n= n/10;
        }
            System.out.println(count);
    }
}