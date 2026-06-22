package com.bridgelabz.quantitymeasurement.repository;

import com.bridgelabz.quantitymeasurement.entity.QuantityMeasurementEntity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuantityMeasurementDatabaseRepository implements IQuantityMeasurementRepository {

    private final String url = "jdbc:mysql://localhost:3306/quantity_measurement_db";
    private final String user = "root";
    private final String password = "password";

    public QuantityMeasurementDatabaseRepository() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            createTableIfNotExists();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createTableIfNotExists() {
        String sql = "CREATE TABLE IF NOT EXISTS quantity_measurement_entity (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "value1 DOUBLE," +
                "unit1 VARCHAR(50)," +
                "value2 DOUBLE," +
                "unit2 VARCHAR(50)," +
                "operation VARCHAR(50)," +
                "resultValue DOUBLE," +
                "resultUnit VARCHAR(50)" +
                ")";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(QuantityMeasurementEntity entity) {
        String sql = "INSERT INTO quantity_measurement_entity (value1, unit1, value2, unit2, operation, resultValue, resultUnit) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, entity.getValue1());
            pstmt.setString(2, entity.getUnit1());
            pstmt.setDouble(3, entity.getValue2());
            pstmt.setString(4, entity.getUnit2());
            pstmt.setString(5, entity.getOperation());
            pstmt.setDouble(6, entity.getResultValue());
            pstmt.setString(7, entity.getResultUnit());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<QuantityMeasurementEntity> findAll() {
        List<QuantityMeasurementEntity> list = new ArrayList<>();
        String sql = "SELECT * FROM quantity_measurement_entity";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                QuantityMeasurementEntity entity = new QuantityMeasurementEntity();
                entity.setId(rs.getInt("id"));
                entity.setValue1(rs.getDouble("value1"));
                entity.setUnit1(rs.getString("unit1"));
                entity.setValue2(rs.getDouble("value2"));
                entity.setUnit2(rs.getString("unit2"));
                entity.setOperation(rs.getString("operation"));
                entity.setResultValue(rs.getDouble("resultValue"));
                entity.setResultUnit(rs.getString("resultUnit"));
                list.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
