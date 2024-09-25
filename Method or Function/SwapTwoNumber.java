public class SwapTwoNumber{
    public static void main(String[] args) {
        Swap(10,20);
        Swap(5,10);
    }

    static void Swap(int x, int y){
        int temp; 

        temp = x;
        x = y;
        y = temp;

        System.out.println( x + " " + y);
    }
}