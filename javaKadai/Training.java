/**
 * トレーニングをするクラス
 * 
 * レビュー：木原パオロ隼登
 */
public abstract class Training extends Object{
    
    /**
     * 筋力の上昇値を表す数値
     */
    int plusedArmmuscle,plusedAbdominalMuscle,plusedLegMuscle;

    /**
     * トレーニングを行うメソッド
     */
    public void  peform(){

        this.training();

        System.out.println(getTrainingName() + "をして、" + 
        "armが" + plusedArmmuscle + "、abdominalが" + 
        plusedAbdominalMuscle + "、legが" + 
        plusedLegMuscle + "鍛えられました。");
    }
    /**
     * 消費された体力を返す
     * 
     * @return 　消費した体力
     */
    public int consumedEnegy(){
        return getConsumedEnegy();
    }

    /**
     * 腕の筋力の上昇値を返す
     * 
     * @return　腕の筋力の上昇値
     */
    protected int getArmResult(){
        return this.plusedArmmuscle;
    }

    /**
     * 腹の筋力の上昇値を返す
     * 
     * @return　腹の筋力の上昇値
     */
    protected int getAbdominalResult(){
        return this.plusedAbdominalMuscle;
    }

    /**
     * 脚の筋力の上昇値を返す
     * 
     * @return　脚の筋力の上昇値
     */
    protected int getLegResult(){
        return this.plusedLegMuscle;
    }
    

    protected abstract void training();
    protected abstract int getConsumedEnegy();
    protected abstract String getTrainingName();
}
