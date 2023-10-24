public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temparature) {
        if(!summer&&(temparature<25 || temparature>35)) {
            return false;
        }else if(summer){
            if(temparature>=25 && temparature<=45){
                return true;
            }return false;
        }return true;
    }
}
