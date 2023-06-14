public class RecursiveLoop {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        loop(1000);
    }

    //Without Recursive
    public static int factorialLoop(int nilai){
        int total = 1;

        for(int i = 1; i <= nilai; i++){
            total *= i;
        }

        return total;
    }

    //With Recursive
    public static int factorialRecursive(int nilai){
        if(nilai == 1){
            return 1;
        }else{
            return nilai * factorialRecursive(nilai - 1);
        }
    }

    //StackOverflow Memory
    public static void loop(int nilai){
        if(nilai == 0){
            System.out.println("Selesai");
        }else{
            System.out.println("Loop-" + nilai);
            loop(nilai - 1);
        }
    }
}
