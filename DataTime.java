
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DataTime {
    public DataTime(String surName, Date birthDate) {
        long mills = Long.MAX_VALUE;
        Date result = null;
        ArrayList<Date> dateArrayList = new ArrayList<>();
        Date date0 = new Date(2200, 8, 1);
        Date date1 = new Date(2000, 7, 15);
        Date date2 = new Date(2212, 11, 16);
        dateArrayList.add(date0);
        dateArrayList.add(date1);
        dateArrayList.add(date2);

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
        public void ageCalculate(String surName,Date birthDate){

            Date ourDays = new Date(2023,4,4);
            int ageDeltaY = Math.abs(ourDays.getYear() - birthDate.getYear());
            int ageDeltaM = Math.abs(ourDays.getMonth() - birthDate.getMonth());
            if (ageDeltaM > ourDays.getMonth()) {ageDeltaY = ageDeltaY-1 ;}
            System.out.println(surName+" age is : " + ageDeltaY+" years");
        }
    }

