public class Math {
    public static void main(String[] args) {
        //Basic Math
        int a = 10;
        int b = 100;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(b % a);

        //Augmented Assignment
        int c = 100;

        c += 10;        //Equals into "c = c + 10"
        System.out.println(c);

        c -= 10;        //Equals into "c = c - 10"
        System.out.println(c);

        c *= 10;        //Equals into "c = c * 10"
        System.out.println(c);

        c /= 10;        //Equals into "c = c / 10"
        System.out.println(c);

        c %= 10;        //Equals into "c = c % 10"
        System.out.println(c);

        //Unary Operation
        int d = +100; //To make a positive value
        int e = -100; //To make a negative value

        System.out.println(d);
        System.out.println(e);

        //Postfix (It will calculate first and ready the result)
        d++; //Equal into d = d + 1
        System.out.println(d);

        e--; //Equal into e = e - 1
        System.out.println(e);

        //Prefix (It will calculate and ready the result at the same time)
        System.out.println(++d);
        System.out.println(--e);

        //Not
        System.out.println(!true);
    }
}
