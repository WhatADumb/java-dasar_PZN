public class ForEachLoop {
    public static void main(String[] args) {
        //Iteration for Array
        String[] dummys = {"Belajar", "bahasa", "pemrograman", "java", "dasar"};

        //Using with for
        for(int i = 0; i < dummys.length; i++){
            System.out.println(dummys[i]);
        }

        System.out.println("\n");

        //Using with foreach
        for(String dummy : dummys){
            System.out.println(dummy);
        }
    }
}
