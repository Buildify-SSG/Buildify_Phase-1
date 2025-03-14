package domain.Inbound.controller;

import dto.InboundDto;

public interface InboundSearchController {
    InboundDto SearchOne(String s);
    void SearchAll();
    void Search();
}
