package org.skrymer.onion.architecture.inventory.domain.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.skrymer.onion.architecture.inventory.domain.model.AModel;
import org.springframework.stereotype.Component;

@Component
public class InventoryDomainService {
  public static final Log LOG = LogFactory.getLog(InventoryDomainService.class);

  private final MyRepository myRepository;

  InventoryDomainService(MyRepository myRepository){
    this.myRepository = myRepository;
  }

  public void doSomeBusinessLogic(AModel model){
      LOG.info("Do some business logic");
      myRepository.create(model);
  }
}
