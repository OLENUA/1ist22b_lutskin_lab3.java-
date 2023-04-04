import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String surName = "lutskin";
        Date birthDate = new Date(2004,9,10);
        DataTime dt = new DataTime(surName,birthDate);
        dt.ageCalculate("Alex",birthDate);

    }
}