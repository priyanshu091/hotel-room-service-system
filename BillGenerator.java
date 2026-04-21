public class BillGenerator {


    public static int calculateTotal(RoomService[] roomServices,boolean[] selected,String roomType){

        int total=0;


        for (int i = 0; i <roomServices.length; i++) {

            if(selected[i]){
                total+=roomServices[i].getPrice();
            }
        }

if (roomType.equals("Suite")){
        return total=(int) (total*0.9); //after 10 percent discount... return 90 percent of total bill amt
    }
    else{
        return total;
    }
}}
