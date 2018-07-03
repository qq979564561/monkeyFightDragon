import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean key; //操作结果的判断标志
        Role monkey = new Role();
        Dragon nemo = new Dragon();
        nemo.level = 3;
        monkey.level =1;

//        System.out.println(monkey.level);
        String str1 = " ";
        /*战斗时间，不同的副本战斗的次数、时间不同*/
        int[] fightTime = new int[5];
        fightTime[0] = 3;
        for(int i = 1; i < 3; i++ ) {
            fightTime[i] = fightTime[i - 1] + 2;
        }


        for(int i = 1; ; i++){
            Operation.finalFight(nemo, monkey);
            System.out.println("选择进入副本：1. 卓拉领地(*) 2. 迷雾之森(**) 3. 海拉尔城堡(***) ");
            if(scanner.hasNext()){
                str1 = scanner.nextLine();
            }
            if(str1.equals("1")){
                Operation.practise(monkey,fightTime[0]);
            }
            if(str1.equals("2")){
                Operation.practise(monkey,5);
            }
            if(str1.equals("3")){
                Operation.practise(monkey,fightTime[2]);
            }

        }



    }

}
