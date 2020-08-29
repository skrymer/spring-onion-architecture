package org.skrymer.onion.architecture.sales.domain.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.skrymer.onion.architecture.sales.domain.model.AModel;
import org.springframework.stereotype.Component;

@Component
public class SalesDomainService {
  public static final Log LOG = LogFactory.getLog(SalesDomainService.class);

  private final MyRepository myRepository;

  SalesDomainService(MyRepository myRepository){
    this.myRepository = myRepository;
  }

  public void doSomeBusinessLogic(AModel model){
      LOG.info("Do some business logic");
      myRepository.create(model);
  }
}
