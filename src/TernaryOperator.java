public class TernaryOperator {
    public static void main(String[] args) {
        byte grade = 80;
        String result;

        //Without ternary
        if(grade >= 75){
            result = "Selamat anda lulus";
        }else{
            result = "Maaf, anda tidak lulus";
        }
        System.out.println(result);

        //With ternary
        result = grade >= 75 ? "Selamat anda lulus" : "Maaf, anda tidak lulus";
        System.out.println(result);
    }
}
