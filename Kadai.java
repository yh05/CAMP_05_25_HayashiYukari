import java.util.Scanner;

public class Kadai {


    public static void main(String[] args) {



        String[] question = new String[5];
        question[0] = "早起きが苦手";

        question[1] = "甘い食べ物が好き";
        question[2] = "動物園や動物カフェが好き";
        question[3] = "のんびりしている";
        question[4] = "出かけることがすき";


        String[] choices = new String[5];
        choices[0] = "1.あてはまらない";
        choices[1] = "2.あまりあてはまらない";
        choices[2] = "3.まぁまぁあてはまる";
        choices[3] = "4.あてはまる";


        for (int i = 0; i < 4.; i++) {
            System.out.println(question[i]);

            for (int j = 0; j < 4.; j++) {
                System.out.print(choices[j]);

        }
            System.out.println();
               Scanner sc = new Scanner(System.in);
               String str = sc.next();

                int x = 0;
                 x = x + str;





//                str = sc.next();



        System.out.println(x);

        }

//        System.out.print("合計は" + x + "です");
    }
}