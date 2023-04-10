/*
Варіант 8. Клас «Записна книжка»
Створити функцію-член, яка через аргумент отримує дату, шукає найблищу до неї
дату по полю дата народження в динамічному масиві структур і повертає відповідний
обєкт типу «Запис».
Створити функцію, яка в масиві структур обчислює і повертає вік людини,
прізвище якої передано через параметр.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String surName = "Олексій";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy,MM,dd");
        String birth = "2004,9,10";
        Date birthDate = formatter.parse(birth);
        DataTime dt = new DataTime(surName,birthDate);
        dt.ageCalculate(surName,birthDate);

    }
}