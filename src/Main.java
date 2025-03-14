import common.ValidCheck;
import domain.Inbound.controller.InboundSearchController;
import domain.Inbound.controller.InboundSearchControllerImp;
import domain.Inbound.repository.InboundSearchRepo;
import domain.Inbound.repository.InboundSearchRepoImp;
import domain.Inbound.service.InboundSearchService;
import domain.Inbound.service.InboundSearchServiceImp;

public class Main {

    public static void main(String[] args) {
        InboundSearchRepo repo = new InboundSearchRepoImp(); // Repository 생성
        InboundSearchService service = new InboundSearchServiceImp(repo);
        ValidCheck validCheck = new ValidCheck();
        InboundSearchController inboundSearchController =new InboundSearchControllerImp(service, validCheck);
        inboundSearchController.SearchAll();
    }


}
