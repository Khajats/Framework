package demoqa;

public class Sample {
    public static void main(String[] args) {
        String str="naresh raipalle";
        String[] split = str.split("");
        StringBuilder bf=new StringBuilder();



        String rev="";
        int count=0;
        char[] charArray = str.toCharArray();
        for (int i = str.length()-1; i >=0; i--) {
            rev=rev+charArray[i];
            if (charArray[i]=='e'){
                count++;
            }

        }

        System.out.println(rev);
        System.out.println(count);
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 1; i <=3; i++) {
            for (int j = 3; j >=i ; j--) {
                System.out.print("%");


            }
            System.out.println();

        }


    }
}
