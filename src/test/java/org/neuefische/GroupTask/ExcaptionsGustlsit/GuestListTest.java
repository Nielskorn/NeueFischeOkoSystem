package org.neuefische.GroupTask.ExcaptionsGustlsit;


import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.neuefische.GroupTask.ExcaptionsGustlsit.guestPath.GUEST_PATH;

class GuestListTest {
@Test
   void ShoudBeEmptyInit(){
    GuestList g = new GuestList();
        List<String>guests = new ArrayList();
        g.setGuests(guests);
        List<String>gueststhatAre= g.getGuests();
        Assertions.assertTrue(g.getGuests().isEmpty());

}
@Test
    void ShoudReadSameGuest(){
    List<String> guests = new ArrayList();
    guests.add("Karl");
    guests.add("Ute");
    GuestList g = new GuestList();
    g.setGuests(guests);
    Assertions.assertTrue(g.getGuests().equals(guests));
}
//@Test
//    void shoudWriteFromFileSystem(){
//    List<String> guests = new ArrayList();
//    guests.add("Theodor");
//    guests.add("Annete");
//    GuestList g = new GuestList();
//    g.setGuests(guests);
//    try{
//        Files.exists(Path.of(String.valueOf(GUEST_PATH)));
//    }catch (Exception e){
//        Assertions.fail();
//    }
//    try {
//        Files.lines(Path.of(String.valueOf(GUEST_PATH).lines().anyMatch(e-> e.matches("Theodor")));
//    }catch (Exception e){
//
//    }
//}
}