public class BreakContinue {
    public static void main(String[] args) {
        //Break
        int i = 1;
        while(true){
            System.out.println("Counter-" + i);
            i++;

            if(i >= 10){
                break;
            }
        }
        System.out.println("Perulangan berhenti");

        //Continue
        for(int y = 1; y <= 100; y++){
            if(y % 2 == 1){
                continue;
            }        
            System.out.println("Counter-" + y);
        }
    }
}
