import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("【数あてゲーム】");

        int ans,i,num;
        ans = random.nextInt(9);

        for(i = 0; i < 5; i++){

            System.out.println("０～９の数字を入力してください");
            num = scan.nextInt();

            if(ans == num){

                System.out.println("アタリ！");
                break;

            }else{

                System.out.println("違います");

            }

        }

        System.out.println("ゲームを終了します");

    }
    
}