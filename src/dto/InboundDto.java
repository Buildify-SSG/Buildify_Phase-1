package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class InboundDto {
    private String inbound_number;
    private String prod_id;
    private String client_id;
    private int quantity;
    private int inbound_status;
    private Date req_inbound_day;
    private String ware_id;
}
