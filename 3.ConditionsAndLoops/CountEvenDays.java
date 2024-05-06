import java.time.LocalDate;
import java.time.Month;

public class CountEvenDays{
    public static void main(String[] args){
        int year = LocalDate.now().getYear();
        LocalDate startDate = LocalDate.of(year,Month.AUGUST,1);
        LocalDate endDate = LocalDate.of(year,Month.AUGUST,startDate.lengthOfMonth());
        int count = CountEvenDays(startDate,endDate);
        System.out.println("Number of days Kunal can go out in August: " + count);
    }
    public static int CountEvenDays(LocalDate startDate,LocalDate endDate){
        int count = 0;
        LocalDate date = startDate;
        while(!date.isAfter(endDate)){
            if(data.getDayOfMonth() % 2 == 0){
                count ++;
            }
            date = date.plusDays(1);
        }
        return count;
    }
}