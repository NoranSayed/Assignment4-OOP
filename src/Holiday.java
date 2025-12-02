public class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name,int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static boolean inSameMonth(Holiday holiday1, Holiday holiday2) {
        if(holiday1.month==holiday2.month)
            return true;
        return false;
    }

    public double  avgDate(Holiday[] arr)
    {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }

       double avarage;
        int count=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].day;
            count++;
        }
        avarage= (double) sum /count;
        return avarage;
    }

}
