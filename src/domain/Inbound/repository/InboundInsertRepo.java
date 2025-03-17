package domain.Inbound.repository;

import dto.InboundDto;

public interface InboundInsertRepo {
    void insert(InboundDto inboundDto);
}
