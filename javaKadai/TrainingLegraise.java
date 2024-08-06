/**
 * トレーニングのレッグレイズを行うクラス
 * 
 * レビュー：木原パオロ隼登
 */
public class TrainingLegraise extends Training{

    /**
     * 　トレーニングの名前
     */
    String name = "レッグレイズ";

    /**
     * 　トレーニングによって筋力を上昇させる
     */
    protected void training(){
        plusedAbdominalMuscle   = 5;
        plusedLegMuscle         = 5;
    }

    /**
     * レッグレイズによって消費した体力を返す
     * 
     * @return　レッグレイズによって消費した体力
     */
    protected int getConsumedEnegy(){
        return 6;
    }

    /**
     * トレーニングの名前を返す
     * 
     * @return　レッグレイズ
     */
    protected String getTrainingName(){
        return name;
    }
}
