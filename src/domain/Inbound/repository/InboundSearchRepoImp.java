package domain.Inbound.repository;

import common.ErrorCode;
import config.DBConnection;
import dto.InboundDto;
import exception.InboundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InboundSearchRepoImp implements InboundSearchRepo {

    Connection connection = DBConnection.getConnection();
    CallableStatement cs = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;


    @Override
    public Optional<List<InboundDto>> SearchAll() {
        List<InboundDto> list = new ArrayList<>();

        try {
            String sql = new StringBuilder()
                    .append(" select * from inbound ").toString();
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                InboundDto dto = InboundDto.builder()
                        .inbound_number(rs.getString("inbound_number"))
                        .prod_id(rs.getString("prod_id"))
                        .client_id(rs.getString("client_id"))
                        .quantity(rs.getInt("quantity"))
                        .inbound_status(rs.getInt("inboud_status"))
                        .req_inbound_day(rs.getDate("req_inbound_day"))
                        .ware_id(rs.getString("ware_id"))
                        .build();
                list.add(dto);
            }
            pstmt.close();
            return Optional.of(list);
        } catch (SQLException e) {
//           throw new RuntimeException(e);
            e.printStackTrace();
            throw new InboundException(ErrorCode.DB_Test);

        }

    }
}
