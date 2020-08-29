package org.skrymer.onion.architecture.inventory.application;

import org.skrymer.onion.architecture.inventory.domain.model.AModel;
import org.skrymer.onion.architecture.inventory.domain.service.InventoryDomainService;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
  private final InventoryDomainService myDomainService;

  InventoryService(InventoryDomainService myDomainService){
    this.myDomainService = myDomainService;
  }

  public void doSomething(Dto dto) {
    // check security
    // validate dto
    // map dto to domain
    myDomainService.doSomeBusinessLogic(new AModel());
  }
}
