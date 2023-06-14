public class OperatorComparison {
    public static void main(String[] args) {
        var absen = 80;
        var nilai = 100;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilai >= 80;

        //&& (Have to be true of all value to make it "true")
        //|| (Either one of the value to make it "true")
        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
