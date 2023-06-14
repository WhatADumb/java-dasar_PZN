public class MethodReturnParameter {
    public static void main(String[] args) {
        int result = sum(100, 45);
        System.out.println(result);

        int total = math(10, "*", 10);
        System.out.println(total);
    }

    public static int sum(int nilaiA, int nilaiB){
        int total = nilaiA + nilaiB;
        return total;
    }

    public static int math(int nilaiA, String opr, int nilaiB){
        switch(opr){
            case "+":
                return nilaiA + nilaiB;
            case "-":
                return nilaiA - nilaiB;
            case "*":
                return nilaiA * nilaiB;
            case "/":
                return nilaiA / nilaiB;
            default:
                return 0;
        }
    }
}
