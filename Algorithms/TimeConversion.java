import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, ParseException {
        //Read in time
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String timeString = br.readLine();
        //Set date format
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ssa");
        //Create date object
        Date date = format.parse(timeString);
		String hours = date.getHours() < 10 ? "0" + date.getHours() : "" + date.getHours();
		String mins = date.getMinutes() < 10 ? "0" + date.getMinutes() : "" + date.getMinutes();
		String seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : "" + date.getSeconds();
		System.out.println(hours + ":" + mins + ":" + seconds);
	}

}