package AP2;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;


public class GetData {
    Scanner dataInput = new Scanner(System.in);

    public String getStrings(){
        String text;

        System.out.println("Write Something: ");
        text = dataInput.nextLine();
        System.out.println("Written Data: " + text);
        return text;
    }

    public String getStringsParams(String message){
        String text;

        System.out.println(message);
        text = dataInput.nextLine();
        return text;
    }

    //--------------- FLOAT ---------------//

    public Float getFloats(){
        System.out.println("Enter a float number:");
        boolean f = false;

        while(f == false){
            try{
                String text = dataInput.next();
                Float number = Float.parseFloat(text);
                System.out.println(number);
                f = true;
                return number;
            } catch (Exception e){
                System.out.println("It is not a valid data, type again:");
            }
        }
        return Float.valueOf(2);
    }

    public Float getFloatParams(Float message){
        System.out.println(message);
        Boolean f = false;

        while(f ==false){
            try {
                String text = dataInput.next();
                Float number = Float.parseFloat(text);
                System.out.println(number);
                f = true;
                return number;
            }catch (Exception e){
                System.out.println("It is not a valid data, type again: ");
            }
        }
        return Float.valueOf(2);
    }

    //--------------- DOUBLE ---------------//

    public Double getDouble(){
        System.out.println("Enter a double number: ");
        Boolean f = false;

        while (f == false){
            try{
                String text = dataInput.next();
                Double numero = Double.parseDouble(text);
                System.out.println(numero);
                f= true;
                return  numero;
            } catch (Exception e) {
                System.out.println("It is not a valid data, type again: ");
            }
        }
        return Double.valueOf(2);
    }

    public Double getDoubleParams(Double message){
        System.out.println(message);
        Boolean f = false;

        while(f == false){
            try{
                String text = dataInput.next();
                Double number = Double.parseDouble(text);
                System.out.println(number);
                f = true;
                return number;
            } catch (Exception e){
                System.out.println("It is not a valid data, type again: ");
            }
        }
        return Double.valueOf(2);
    }

    //--------------- INTEGER ---------------//

    public Integer getInt(){
        System.out.println("Enter a int number: ");
        Boolean f = false;

        while(f == false) {
            try{
                String text = dataInput.next();
                Integer number = Integer.parseInt(text);
                System.out.println(number);
                f = true;
                return number;
            } catch (Exception e){
                System.out.println("It is not a valid data, type again: ");
            }
        }
        return Integer.valueOf(0);
    }

    public Integer getIntParams(Integer message){
        System.out.println(message);
        boolean f = false;

        while(f==false){
            try{
                String text = dataInput.next();
                Integer number = Integer.parseInt(text);
                System.out.println(number);
                f = true;
                return number;
            } catch (Exception e){
                System.out.println("It is not a valid data, type again: ");
            }
        }
        return Integer.valueOf(0);
    }

    //--------------- CHAR ---------------//

    public String getChar(){
        System.out.println("Enter a Char: ");
        String text = "";
        char character;
        boolean f = false;

        while(f == false){
            text = dataInput.next();
            if(text.length() != 1){
                System.out.println("Type again, char is just a single letter!!");
            } else{
                character = text.charAt(0);
                System.out.println(character);
                f = true;
            }
        }
        return text;
    }

    public String getCharParams(String text){
        char character;
        boolean f = false;

        while(f == false){
            text = dataInput.next();
            if (text.length() != 1){
                System.out.println("Type again, char is just a single letter!!");
            }else{
                character = text.charAt(0);
                System.out.println(character);
                f = true;
            }
        }
        return text;
    }

    //--------------- PHONE ---------------//

    public void getPhone(){
        boolean f = false;
        while(f==false) {
            System.out.println("Enter a Phone Number: ");
            String phoneNumber = dataInput.nextLine();
            if (phoneNumber.length() == 9 || phoneNumber.length() == 11) {
                System.out.println("Phone Number: " + phoneNumber);
                f = true;
            } else {
                System.out.println("Error!! enter a valid phone number. Between 9 and 11 digit");
            }

        }
    }
    //--------------- EMAIL ---------------//

    public void getEmail() {
        String eMail;
        System.out.println("Enter a email:");
        boolean k = false;

        while (k == false){
            eMail = dataInput.next();
            if ((eMail.indexOf("@") != -1 && eMail.indexOf(".") != -1)){
                System.out.println(eMail);
                k = true;
            }else {
                System.out.println("Please enter a valid email, the typed is invalid!!");
            }
        }
    }

    //--------------- EMAIL ---------------//

    public void getDate(){
        try{
            System.out.println("Please, insert a date: ");
            String dateRead = dataInput.nextLine();
            DateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
            Date dateInformed = dateForm.parse(dateRead);
            System.out.println("Date with hours: " + dateInformed);
            System.out.println("Only date: " + dateForm.format(dateInformed.getTime()));
        }
        catch (Exception erro){
            System.out.println("Please, insert a date in the following format: DD/MM/YYYY"+erro);
        }
    }

    public void getInvertedDate(){
        System.out.println("Please, insert a date:");
        String dataBR = dataInput.nextLine();

        DateFormat brData = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat euaData = new SimpleDateFormat("yyyy/MM/dd");

        Date data = null;
        try {
            data = brData.parse(dataBR);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Inverted Date:" +euaData.format(data));
    }

    public void isItNumber(){
        System.out.println("String of numbers: ");
        String numbers = dataInput.nextLine();
        boolean n = true;

        for (int x = 0; x < numbers.length(); x++){
            if (!Character.isDigit(numbers.charAt(x))){
                n = false;
            }
        }
        System.out.println(n + "the value you entered is a number!");
    }
}