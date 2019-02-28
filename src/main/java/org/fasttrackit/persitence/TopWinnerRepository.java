package org.fasttrackit.persitence;

import org.fasttrackit.domain.TopWinner;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TopWinnerRepository {

    public TopWinnerRepository() throws SQLException, IOException, ClassNotFoundException {
    }

    public void createTopWinner(TopWinner topWinner) throws SQLException, IOException, ClassNotFoundException {
        try (Connection connection = DatabaseConfigurations.getConnection()) {

            String insertSql = "INSERT INTO top_winners (`name`, wonRaces) VALUES (?,?)" +
                    "ON DUPLICATE KEY UPDATE wonRaces = wonRaces + 1;";

            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, topWinner.getName());
            preparedStatement.setInt(2, topWinner.getWonRaces());

            preparedStatement.executeUpdate();
        }
    }

    public List<TopWinner> getTopWinners() throws SQLException, IOException, ClassNotFoundException {

        Connection connection = DatabaseConfigurations.getConnection();

        String query =
                "SELECT `name` , wonRaces FROM top_winners ORDER BY wonRaces DESC;";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        List<TopWinner> reponse = new ArrayList<>();

        while (resultSet.next()) {
            TopWinner topWinner = new TopWinner();
            topWinner.setId(resultSet.getLong("id"));
            topWinner.setName(resultSet.getString("name"));
            topWinner.setWonRaces(resultSet.getInt("wonRaces"));

            reponse.add(topWinner);

        }
        return reponse;
    }
}
