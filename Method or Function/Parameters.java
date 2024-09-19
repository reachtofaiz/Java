public class Parameters{
    public static void main(String[] args) {
        fname("Faiz", 22);
        fname("Shahil", 25);
        fname("Ibhrahim", 14);
    }

    static void fname(String name, int age){
        System.out.println(name + " full name is " + "Mohammad " + name );
        System.out.println("Mohammad " + name +" age is " + age);
        System.out.println();
    }
}