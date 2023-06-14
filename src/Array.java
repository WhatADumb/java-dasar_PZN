public class Array {
    public static void main(String[] args) {
        //Two Ways of declaration in Array
        String[] names;
        names = new String[2];

        String[] names2 = new String[2];

        //Two Ways of assignment in Array
        int[] number = new int[]{1,2,3,4,5,6};

        int[] number2 = {1,2,3,4,5,6};

        //Insert value or Change value of Array
        names[0] = "Rangga";
        names[1] = "Firmansyah";

        names[0] = "Fadhil";

        System.out.println(names[0]);
        System.out.println(names[1]);

        //Get the length of Array
        System.out.println(number2.length);

        //Assignment Array Associate
        String[][] students = {
            {"Dhavid", "Stephen", "Hillenburg"},
            {"Howard", "Peter", "Jackson"},
            {"Asep", "Slender", "Optimus"}
        };

        System.out.println(students[1][2]);
        System.out.println(students[0][0]);
    }
}
