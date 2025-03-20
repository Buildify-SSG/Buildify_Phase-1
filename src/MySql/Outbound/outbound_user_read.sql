use wmsdb;


##
drop procedure if exists outbound_user_read;
DELIMITER &&
create procedure outbound_user_read(
    IN input_client_id varchar(100))
BEGIN
    select * from outbound
    where client_id = input_client_id;
end &&
DELIMITER ;
