public class MethodParameterArgument {
    public static void main(String[] args) {
        int[] grades = {50, 85, 80, 90, 95};
        sayCongrats("Fadhil", grades);

        sayArgCongrats("Firmansyah", 70, 80, 90, 95, 100);
    }

    //without argument
    public static void sayCongrats(String name, int[] values){
        int sumUp = 0;
        for(int value : values){
            sumUp += value;
        }

        int finalScore = sumUp / values.length;

        if(finalScore >= 75){
            System.out.println("Selamat " + name + ", anda lulus");
        }else{
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }

    //With argument

    /**
     * hehehe
     * @param name
     * @param values
     */
    public static void sayArgCongrats(String name, int... values){
        int total = 0;
        for(int value : values){
            total += value;
        }

        int finalPoint = total / values.length;

        if(finalPoint >= 75){
            System.out.println("Selamat " + name + ", anda lulus");
        }else{
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }
}
