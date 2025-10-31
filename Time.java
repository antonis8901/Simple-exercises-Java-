public class Time {
    public static String getDurationString(int seconds){
        if (seconds >=0){
            int minutes =seconds / 60;
            int remainingSeconds=seconds % 60;
            return getDurationString(minutes,remainingSeconds);
        }
        else {
            System.out.println("Incorrect values,cannot proceed");
        }
        return "";
    }
    public static String getDurationString(int minutes,int seconds){
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)){
            int hours=minutes / 60;
            int leftoverMinutes=minutes % 60;
            int leftoverSeconds=seconds % 60;
            return hours+"h "+leftoverMinutes+"m "+leftoverSeconds+"s";
        }
        else {
            System.out.print("Incorrect values,cannot proceed");
        }
        return "";
    }

    static void main(String[] args) {
    System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));


    }
}
