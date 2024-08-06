/**
 * トレーニングのプランクを行うクラス
 * 
 * レビュー：木原パオロ隼登
 */
public class TrainingPlank extends Training{

    /**
     * 　トレーニングの名前
     */
    String name = "プランク";

    /**
     * 　トレーニングによって筋力を上昇させる
     */
    protected void training(){
        plusedArmmuscle         = 3;
        plusedAbdominalMuscle   = 7;
    }

    /**
     * プランクによって消費した体力を返す
     * 
     * @return　プランクによって消費した体力
     */
    protected int getConsumedEnegy(){
        return 4;
    }

    /**
     * トレーニングの名前を返す
     * 
     * @return　プランク
     */
    protected String getTrainingName(){
        return name;
    }
}
