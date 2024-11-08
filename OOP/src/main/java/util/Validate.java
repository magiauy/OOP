package util;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validate {
     public static boolean checkQuantity (int quantity) {
          if (quantity <= 0)
               return false;
          return true;
     }

     // return null when input from user have any error or not in option table
     public static int parseChooseHandler (String userChoose,  int totalOptions) {
          try {
               int parseChoose =  Integer.parseInt(userChoose);
               if ((parseChoose > 0) && (parseChoose <= totalOptions))
                    return parseChoose;
               else {
                    System.out.print("\033\143");
                    System.out.println("your option is not in options table!");
                    return -1;
               }
                    
          } catch (Exception err) {
               System.out.print("\033\143");
               System.out.println("error input please try again: " + "\n" + err);
               return -1;
          }
     }

     // converted format for input date from user
     public static LocalDate formatInputDate (String inputDate) {
          DateTimeFormatter checkFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          try {
              return LocalDate.parse(inputDate, checkFormat);
          } catch (Exception e) {
               System.out.print("\033\1443");
               System.out.println("your date input is wrong!");
               return null;
          }
     }

     public static Integer isNumber (String inputNumber) {
          try {
              return Integer.parseInt(inputNumber);
          } catch (Exception err) {
               System.out.println("your input is wrong format! please try again!");
               return -1;
          }
     }

     public static boolean validatePrice (Object inputPrice) {
          if (inputPrice instanceof BigDecimal)
               return true;
          else {
               System.out.println("your input is not a price! please try again!");
               return false;
          }
     }

     public static boolean validateId (String inputId) {
          return true;
     }

     public static boolean validateTypeOfBook (String inputType) {
          
          return true;
     }

     public static boolean validateName (String inputName) {
          String regex = "/^[\\p{Letter}\\s\\-.']+$/g";
          if (!inputName.matches(regex))
               return false;
          return true;
     }
}
