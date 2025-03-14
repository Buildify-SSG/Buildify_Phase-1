package dto;

import lombok.Data;

import java.util.Date;

@Data
// aa
public class WarehouseDto {

    private String ware_id;
    private String client_id;
    private String prod_id;
    private int quantity;
    private Date last_inbound_day;
    private Date last_outbount_day;
}
