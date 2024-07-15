package java_ss1.Homework6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Number2 {
    public static void main(String[] args) throws ParseException {
        //câu a chuyển string date sang định dạng java.util.Date "MM/dd/yyyy"
        String dateStr = "02/08/2023";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse(dateStr);
        System.out.println("Java.util.Date" + date);
        // câu b java.util.Date sang string với định dạng "MM/dd/yyyy"
        Date currentDate = new Date();
        SimpleDateFormat dateb = new SimpleDateFormat("dd/MM/yyyy");
        String formatteDate = dateb.format(currentDate);
        System.out.println("Ngày đã định dạng " + formatteDate);
        // câu c Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
        //String dateStr = "02/08/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(dateStr,formatter);
        System.out.println("LocalDate" + localDate);
        // câu d chuyển ngày hiện tại localDate sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
        LocalDate currentDateNow = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatterDate = currentDateNow.format(formatter1);
        System.out.println("Ngày hiện tại định dạng : " + formatterDate);
        // câu e Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
        LocalDateTime currentDateNowOnTime = LocalDateTime.now();
        int day = currentDateNowOnTime.getDayOfMonth();
        int month = currentDateNowOnTime.getMonthValue();
        int year = currentDateNowOnTime.getYear();
        int hour = currentDateNowOnTime.getHour();
        int minute = currentDateNowOnTime.getMinute();
        int second = currentDateNowOnTime.getSecond();
        System.out.println("thời gian lúc in ra là: ");
        System.out.println("Ngày" + day + " tháng " + month + " năm " + year + " giờ " + hour +" phút " + minute +" giây " + second);
        // câu f
        LocalDate oneMonthAfter = currentDateNow.plusMonths(1);
        System.out.println("Một tháng sau sẽ rơi vào thứ: " + oneMonthAfter.getDayOfWeek());
        // tính ngày chênh lệch giữa ngày hiện tại và ngày này 1 tháng sau
        long dayUntilOneMonthAfter = currentDateNow.until(oneMonthAfter, ChronoUnit.DAYS);
        //ChronoUnit.DAYS để tính ngày chênh lệch giữa 2 thời điểm
        System.out.println("Một tháng sau: " + oneMonthAfter);
        System.out.println("số ngày đến tháng sau: " + dayUntilOneMonthAfter);

    }
}
