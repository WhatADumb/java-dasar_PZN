public class SwitchStatment {
    public static void main(String[] args) {
        String result;
        var nilai = "A";

        //Casual Switch
        switch(nilai){
            case "A":
                System.out.println("Selamat anda lulus dengan nilai sempurna");
                break;
            case "B":
            case "C":
                System.out.println("Selamat, anda lulus");
                break;
            case "D":
                System.out.println("Maaf, anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
                break;
        }

        //Switch Lambda
        switch(nilai){
            case "A" -> System.out.println("Wow, nilai yang memuaskan");
            case "B", "C" -> System.out.println("Nilai yang bagus");
            case "D" -> {
                System.out.println("Nilai yang kurang");
                System.out.println("Belajar lebih giat");
            }
            default -> System.out.println("Semangat");
        }

        //Switch with return value without yield
        switch(nilai){
            case "A" -> result = "Nilai anda A";
            case "B" -> result = "Nilai anda B";
            case "C" -> result = "Nilai anda C";
            case "D" -> result = "Nilai anda D";
            default -> result = "Bagaimana ya untuk menjelaskan";
        }
        System.out.println(result);

        //Switch with return value with yield
        result = switch(nilai){
            case "A":
                yield "Selamat anda lulus dengan baik";
            case "B", "C":
                yield "Selamat anda lulus";
            case "D":
                yield "Anda tidak lulus hehe";
            default:
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(result);
    }
}
