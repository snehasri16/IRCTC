package org.ticket.booking.services;

import java.io.File;

public class UserBookingService {

    private User user;
    private static final String USERS_PATH="../localStorage/users.json";
    public UserBookingService(User user1){
        this.user=user1;
        File userFile= new File(USERS_PATH);
        
    }
}
