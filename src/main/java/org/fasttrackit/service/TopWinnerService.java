package org.fasttrackit.service;

import org.fasttrackit.domain.TopWinner;
import org.fasttrackit.persitence.TopWinnerRepository;

import java.io.IOException;
import java.sql.SQLException;

public class TopWinnerService {
    private TopWinnerRepository topWinnerRepository =
            new TopWinnerRepository();

    public TopWinnerService() throws SQLException, IOException, ClassNotFoundException {
    }

    public void  createTopWinner(TopWinner topWinner) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating top winner entry: " + topWinner);
        topWinnerRepository.createTopWinner(topWinner);


    }
}
