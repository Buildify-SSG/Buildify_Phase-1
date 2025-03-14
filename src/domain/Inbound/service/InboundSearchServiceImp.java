package domain.Inbound.service;

import common.ErrorCode;
import domain.Inbound.repository.InboundSearchRepo;
import dto.InboundDto;
import exception.InboundException;
import exception.NotFoundException;

import java.util.List;

public class InboundSearchServiceImp implements InboundSearchService{

    private final InboundSearchRepo inboundSearchRepo;

    public InboundSearchServiceImp(InboundSearchRepo inboundSearchRepo){

        this.inboundSearchRepo = inboundSearchRepo;
    }


    @Override
    public List<InboundDto> SearchAll() {
        try{
            return inboundSearchRepo.SearchAll().orElseThrow(() -> new NotFoundException(String.valueOf(ErrorCode.DB_Test)));
        }catch(InboundException e){
            throw new InboundException(ErrorCode.DB_Test);
        }
    }
}
