package domain.Inbound.repository;

import dto.InboundDto;

import java.util.List;
import java.util.Optional;

public interface InboundSearchRepo {
    Optional<List<InboundDto>> SearchAll();

}
