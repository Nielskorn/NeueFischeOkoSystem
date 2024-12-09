package org.neuefische.GroupTask.ExcaptionsGustlsit;

import java.util.List;

public class GuestList {
    List<String>guests;
    public GuestList() {}
    public GuestList(List<String> guests) {
        this.guests = guests;
    }
    public void setGuests(List<String> guests)
    {
        this.guests = guests;
    }

    public List<String> getGuests() {
        return guests;
    }
}
