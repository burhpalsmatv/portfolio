package org.portfolio.portfolio.repository;

import org.portfolio.portfolio.model.Vinyl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VinylRepo {

    @Autowired
    protected DataSource dataSource;

    public List<Vinyl> getAllVinyls() {
        List<Vinyl> vinylList = new ArrayList<>();
        String sql = "SELECT * FROM vinyls";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Vinyl vinyl = new Vinyl();
                vinyl.setId(resultSet.getInt("id"));
                vinyl.setAlbumName(resultSet.getString("albumName"));
                vinyl.setArtistName(resultSet.getString("artistName"));
                vinyl.setReleaseYear(resultSet.getInt("releaseYear"));
                vinyl.setStory(resultSet.getString("story"));
                vinyl.setImg(resultSet.getString("img"));
                vinylList.add(vinyl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vinylList;
    }

    public Vinyl getVinylId(int id) {
        Vinyl vinyl = new Vinyl();
        String sql = "SELECT * FROM vinyls where id = ?";

        try (Connection con = dataSource.getConnection();
             PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    vinyl.setId(resultSet.getInt("id"));
                    vinyl.setAlbumName(resultSet.getString("albumName"));
                    vinyl.setArtistName(resultSet.getString("artistName"));
                    vinyl.setReleaseYear(resultSet.getInt("releaseYear"));
                    vinyl.setStory(resultSet.getString("story"));
                    vinyl.setImg(resultSet.getString("img"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vinyl;
    }

}
