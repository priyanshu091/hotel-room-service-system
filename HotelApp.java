import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Sunshine Hotel");

        System.out.println("Enter Guest Name:");
        String custName = input.nextLine();

        System.out.println("Enter Room Number:");
        int roomNum = input.nextInt();
        input.nextLine(); // clears leftover newline character after nextInt()

        System.out.println("Enter Room Type: (Standard, Deluxe, Suite)");
        String roomType = input.nextLine();

        Guest guest = new Guest(custName,roomNum,roomType);

        RoomService[] roomServices = {
            new RoomService(1,"Breakfast",250),
            new RoomService(2,"Lunch",400),
            new RoomService(3,"Dinner",500),
            new RoomService(4,"Laundry",150),
            new RoomService(5,"Spa Session",800)

        };

        boolean[] selected = new boolean[roomServices.length];

        while(true){
            System.out.println("\nAvailable Services:");

            for(RoomService r : roomServices){
                if(!selected[r.getId()-1]){
                    System.out.println(r.getId()+". "+r.getName()+" - ₹"+r.getPrice());
                }
            }
            System.out.println("0. Generate Bill");
            System.out.println("Select Service ID:");
            int choice = input.nextInt();

            switch(choice){
                case 0:
                   int total=BillGenerator.calculateTotal(roomServices,selected,guest.getRoomType());
                    System.out.println("Guest Name: " + guest.getCustName());
                    System.out.println("Room Number: " + guest.getRoomNum());
                    System.out.println("Room Type: " + guest.getRoomType());

                    System.out.println("\nServices Availed:");
                    for (int i = 0; i <selected.length; i++) {

                        if (selected[i]){
                            System.out.println(roomServices[i].getName()+": ₹"+roomServices[i].getPrice());
                        }
                    }
                    System.out.println("--------------------------");

                    if(guest.getRoomType().equals("Suite")){
                        System.out.println("Discount Applied: 10%");
                    }
                    System.out.println("Total Amount: ₹" + total);
                    System.out.println("Thank You! Visit Again!");
                    return;


                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    selected[choice-1]= true;
                    System.out.println("Service Added: "+roomServices[choice-1].getName());
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }



        }
    }
}
