
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DataTime {
    public DataTime(String surName, Date birthDate) throws ParseException {

        long mills = Long.MAX_VALUE;
        Date result = null;


        ArrayList<Date> dateArrayList = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy,MM,dd");
        String dateInString0 = "2004,2,10";
        Date date0 = formatter.parse(dateInString0);
        dateArrayList.add(date0);

        String dateInString1 = "2021,2,11";
        Date date1 = formatter.parse(dateInString1);
        dateArrayList.add(date1);

        String dateInString2 = "2012,4,30";
        Date date2 = formatter.parse(dateInString2);
        dateArrayList.add(date2);

        String dateInString3 = "2000,1,1";
        Date date3 = formatter.parse(dateInString3);
        dateArrayList.add(date3);

        for (int i = 0; i < dateArrayList.size(); i++) {
            long delta = Math.abs(birthDate.getTime() - dateArrayList.get(i).getTime());
            if (delta < mills) {
                result = dateArrayList.get(i);
                mills = delta;
            }
        }
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy,MM,dd");
        String dante = DATE_FORMAT.format(result);
        System.out.println(dante);

        }
        public void ageCalculate(String surName,Date birthDate) throws ParseException {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy,MM,dd");
            String dateInString0 = "2023,4,5";
            Date ourDays = formatter.parse(dateInString0);
            int ageDeltaY = Math.abs(ourDays.getYear() - birthDate.getYear());
            int ageDeltaM = Math.abs(ourDays.getMonth() - birthDate.getMonth());
            if (ageDeltaM > ourDays.getMonth()) {ageDeltaY = ageDeltaY-1 ;}
            System.out.println(surName+" age is : " + ageDeltaY+" years");
        }
    }

