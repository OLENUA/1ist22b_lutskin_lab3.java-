import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String surName = "lutskin";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy,MM,dd");
        String birth = "2004,9,10";
        Date birthDate = formatter.parse(birth);
        DataTime dt = new DataTime(surName,birthDate);
        dt.ageCalculate("Alex",birthDate);

    }
}