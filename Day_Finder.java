import java.util.*;

public class Day_Finder{

    public static void main(String args[]){
        System.out.println();
        System.out.println("Note : This day calculator is valid only for the years 16th centuary onwards!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date : ");
        int date = sc.nextInt();
        System.out.print("Enter the month : ");
        String month = sc.next();
        System.out.print("Enter the Year in centuary : ");
        int centuraty_year = sc.nextInt();

        cal_result(date, month, centuraty_year);
    }

    public static int code_of_month(String month){
        String Month = month.toLowerCase();
        switch(Month){
            case "january" : return 0;
            case "february" : return 3;
            case "march" : return 3;
            case "april" : return 6;
            case "may" : return 1;
            case "june" : return 4;
            case "july" : return 6;
            case "august" : return 2;
            case "september" : return 5;
            case "october" : return 0;
            case "november" : return 3;
            case "december" : return 5;
        }
        return -1;
    }

    public static int code_of_centuary(int centuraty_year){
        int cYear = centuraty_year/100;
        switch(cYear){
            case 16: return 6;
            case 17: return 4;
            case 18: return 2;
            case 19: return 0;
            case 20: return 6;
        }
        return -1;
    }

    public static void print_day(int result){
        int quotient = result / 7;
        int remender = result % 7;
        switch(remender){
            case 0:{
                System.out.println("Sunday");
                break;
            }
            
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
        }
    }

    public static void cal_result(int date, String month, int centuraty_year){
        int mCode = code_of_month(month);
        int cCode = code_of_centuary(centuraty_year);
        int year = centuraty_year % 100;
        int qout = year/4;
        
        int result = (mCode + cCode + year + qout + date);
        System.out.println(result);
        print_day(result);
    }

}