public class Factory {
    public Tank makeTank(int newTankType) {

        if(newTankType == 1){
            return new USA();
        }else
        if(newTankType == 2){
            return new Germany();
        }else
        if(newTankType == 3){
            return new Russia();
        }else
        if(newTankType == 4){
            return new Japan();
        }else
        if(newTankType == 5){
            return new Britain();
        }else return null;
        
    }
}
