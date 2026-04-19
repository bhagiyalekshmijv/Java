

class Day {
    private String name;
    private String version;
    private String description;

    Day (){
        this.name = "dayName";
        this.version = "1.20";
        this.description = "The Day";
    }


    void DayName(int no) {
        switch (no){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not in the list");
        }
    }

   public void getName () {
    System.out.println(this.name);
   }
   public void getVersion() {
    System.out.println(this.version);
   }
   public void getDescription() {
    System.out.println(this.description);
   }
}

public class FindDay {
    public static void main(String[] args) {
        
        Day d = new Day();

        d.DayName(5);

        d.getName();
        d.getVersion();
        d.getDescription();
    }
}
