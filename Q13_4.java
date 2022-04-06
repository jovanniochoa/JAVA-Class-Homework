//this program gets the date from the user
//and makes a calendar for it
import java.util.*;

public class Q13_4 {

	 private static List<Integer> daysPositions = new LinkedList<Integer>();

	    static {
	        daysPositions.add( Calendar.SUNDAY );
	        daysPositions.add( Calendar.MONDAY );
	        daysPositions.add( Calendar.TUESDAY );
	        daysPositions.add( Calendar.WEDNESDAY );
	        daysPositions.add( Calendar.THURSDAY );
	        daysPositions.add( Calendar.FRIDAY );
	        daysPositions.add( Calendar.SATURDAY );
	    }

	    public static void viewCalendar( Date date ) {
	    	Scanner in = new Scanner(System.in);
	    	
	    	int userMonth = in.nextInt();
	    	int userYear = in.nextInt();
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date);
	        calendar.set(Calendar.MONTH, userMonth); 
	        calendar.set(Calendar.YEAR, userYear); 

	        calendar.set( Calendar.DAY_OF_MONTH, 1 );
	        //
	        int firstDateOfMonthDay = calendar.get( Calendar.DAY_OF_WEEK );
	        int weekOfFirstDate = calendar.get( Calendar.WEEK_OF_YEAR );

	        int lastDateOfMonth = calendar.getActualMaximum( Calendar.DAY_OF_MONTH );
	        calendar.set( Calendar.DAY_OF_MONTH, lastDateOfMonth );
	        // day of week for last date of month
	        int weekOfLastDate = calendar.get( Calendar.WEEK_OF_YEAR );

	        calendar.roll( Calendar.MONTH, false );
	        int lastDateOfPrevMonth = calendar.getActualMaximum( Calendar.DAY_OF_MONTH );

	        int weeksToDisplay = weekOfLastDate - weekOfFirstDate + 1;
	        int[] days = new int[weeksToDisplay * 7];

	        int firstDayPosition = daysPositions.indexOf( firstDateOfMonthDay );

	        //get previous month
	        int x = lastDateOfPrevMonth;
	        for ( int i = firstDayPosition - 1; i >= 0; i-- ) {
	            days[i] = 0;
	        }

	        // fill current month
	        for ( int i = 1; i < lastDateOfMonth + 1; i++ ) {
	            days[firstDayPosition - 1 + i] = i;
	        }

	        //get next month
	        int j = 1;
	        for ( int i = lastDateOfMonth + firstDayPosition; i < days.length; i++ ) {
	            days[i] = 0;
	        }

	        // display calendar
	        // ( here you may extract data into your structure )
	        for ( int i = 0; i < days.length; i++ ) {
	            if ( i % 7 == 0 ) {
	                System.out.println();
	            }
	            System.out.print( days[i] + "\t" );
	        }
	    }

	    public static void main( String[] args ) {
	        viewCalendar(new Date());
	    }

}
