package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {


    private Track[] tracks = new Track[10];
    private List<Vehicle> competitors = new ArrayList<>();



    public void start() {
        addCompetitors(3);
        displayCompetitors();
        addTracks();
        displayAvailableTracks();
    }
    private void addCompetitors(int competitorCount){
        for (int i = 0; i < competitorCount; i++){
            Vehicle vehicle = new Vehicle();
//            vehicle proprietes will be populated when we learn to get user's imput
            competitors.add(vehicle);
        }
    }

    private void displayCompetitors(){
        System.out.println("Welcome! Today's competitors are:");
        for (int i = 0 ; i < competitors.size(); i++) {
            System.out.println(competitors.get(i).getName());
        }
    }

    private void addTracks() {
        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);
        tracks[0] = track1;
        tracks[1] = track2;
    }

    private void displayAvailableTracks() {
        System.out.println("Available tracks:");

//        class for loop
//        for (int i = 0; i < tracks.length; i++) {
////            if object is different than null
//            if (tracks[i] != null) {
//                System.out.println(tracks[i].getName());
//            }
//        }
//        enhanced for / "for-each"
        for (Track track : tracks) {

            if (track != null) {
                System.out.println(track.getName());
            }
        }
    }


}
