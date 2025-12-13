package org.ticket.booking;

import java.util.Date;
import java.util.List;

public class Train {

private String trainId;
private String trainNo;
private Date departTime;
private Date arrivalTime;
private List<List<Integer>> seats;
  private Map<String, String> stationTimes;

    private List<String> stations;

    public Train(){}

    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> stations){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

}
