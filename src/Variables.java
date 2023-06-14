public class Variables {
    public static void main(String[] args) {
        //Variables Type, It can be change
        String name;
        //Declaration
        name = "Marzuki";
        //Change value name
        name = "Fadhil Firmansyah";
        int age = 19;
        String location = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(location);

        //Instead using data type before name a variable
        //Use "var" for the data type, Java will auto detect the value data type
        var status = true;
        var fullName = "Fadhil Firmansyah";
        //var type can't be declaration, use directly at assignment

        // var data;
        // data = "OK"; Its error
        
        System.out.println(status);
        System.out.println(fullName);

        //Constant Type, it can't be change
        final String username;
        username = "Fadhil";
        //username = "Stephen"; Error because username already have value
        final var job = "Colleage Student";
        
        System.out.println(username);
        System.out.println(job);
    }
}
