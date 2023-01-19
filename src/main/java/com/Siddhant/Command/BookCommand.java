package com.Siddhant;

import com.Siddhant.service.HotelService;



public class BookCommand extends CommandExecutor{
    HotelService hotelService = new HotelService();

    public static String COMMAND = "Book";

    public BookCommand(HotelService hotelService) {
        super(hotelService);
    }

    Boolean isApplicable(String token){
        if(token==COMMAND) {
            System.out.println("correct");
            return true;
        }
        return false;
    }

     public void execute(String Command){
        System.out.println("Lets go");
     }


}
