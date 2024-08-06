import java.util.Random;

/**
 * 一日のトレーニングを行うクラス
 * 
 * レビュー：木原パオロ隼登
 */
public class Main {

     public static void main(String[] args) {

          
          Random r = new Random();

          /**
           * 腕、腹、脚の現在の筋力を表す
           */
          int armMuscle = 20;
          int abdominalMuscle = 20;
          int legMuscle = 20;
          
          /**
           * 現在の体力を表す
           */
          int health = 100;

          TrainingPlank p = new TrainingPlank();
          TrainingLegraise l = new TrainingLegraise();

          /**
           * 体力がなくなるまで繰り返す
           */
          while (health > 0) {

               /**
                * ０か１の乱数を取得
                */
               int num = r.nextInt(2);


               switch (num) {
                    case 0:

                         p.peform();

                         health -= p.consumedEnegy();
                         System.out.println("残り体力は" + health + "です。");
                         armMuscle           += p.plusedArmmuscle;
                         abdominalMuscle     += p.plusedAbdominalMuscle;
                         legMuscle           += p.plusedLegMuscle;
                         break;

                    case 1:

                         l.peform();

                         health -= l.consumedEnegy();
                         System.out.println("残り体力は" + health + "です。");
                         armMuscle           += p.plusedArmmuscle;
                         abdominalMuscle     += p.plusedAbdominalMuscle;
                         legMuscle           += p.plusedLegMuscle;
                         break;
               }
          }
          System.out.println("今日のトレーニングで、腕が" + armMuscle + "、腹が" + 
                              abdominalMuscle + "、脚が" + legMuscle + "になりました。");

     }
}