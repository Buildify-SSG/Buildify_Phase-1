package domain.Inbound.repository;

import config.DBConnection;
import dto.InboundDto;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class InboundInsertRepoImp implements InboundInsertRepo{

    Connection conn = DBConnection.getConnection();
    CallableStatement cs = null;


    @Override
    public void insert(InboundDto inboundDto) {
        try {
            conn.setAutoCommit(false);
            cs = conn.prepareCall("{call DB_Inbound_INsert(?,?,?,?,?,?,?)}");
//            cs.setString(1,);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
