import java.util.Scanner;

public class Operation{
    static boolean fight(int level_a, int level_b){
        if(level_a > level_b){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean chargeMoney(){
        /*充钱操作*/
        return true;
    }

 /*   static boolean practise(){
        *//*爆肝练级*//*
        return true;
    }
*/
    static void finalFight(Dragon nemo, Role monkey){
        /*猴子和恶龙的决战*/
        String str1 = " ";
        System.out.println("是否开启决战？(输入汉字是/否)");
        if(Main.scanner.hasNext()){
            str1 = Main.scanner.nextLine();
        }
        if(str1.equals("是")){
            boolean key = fight(nemo.level, monkey.level);
            if (key) {
                System.out.println("The Dragon Nemo Win!");
                System.out.println("You Dead!");
                System.out.println("————Game Over————");
                System.exit(0);
            }
            else {
                System.out.println("The Monkey Win!");
                System.out.println("Mission Completed");
                System.out.println("————End————");
                System.exit(0);
            }
        }

    }

    static void practise(Role character,int fightTime){
        /*刷怪*/
        String str1 = "";
        String[] monster = new String[5];
        monster[0] = "二狗";
        monster[1] = "比利";
        monster[2] = "雪饼";
        for(int i = 0 ; i < fightTime; i++){
            if(fightTime == 3) {
                System.out.printf("路遇 %s，是否安排：",monster[0]);
            }
            if(fightTime == 5){
                System.out.printf("路遇 %s，是否安排：",monster[1]);
            }
            if (fightTime == 7){
                System.out.printf("路遇 %s，是否安排：",monster[2]);
            }
            //        Scanner scan = new Scanner(System.in);
            //  键盘接收数据

            //  next方式接收字符串
            if(Main.scanner.hasNext()){
                str1 = Main.scanner.nextLine();
                // System.out.println("输入的数据为: " + str1);
            }
            //  scan.close();

            if(str1.equals("是")){
                character.level ++;
                System.out.println("——Level up! 现在等级：" + character.level +"\n");
            }
            else{
                System.out.println("逃跑成功！");
            }
        }



    }

}