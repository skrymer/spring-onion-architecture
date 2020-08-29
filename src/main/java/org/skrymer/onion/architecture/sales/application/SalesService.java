package org.skrymer.onion.architecture.sales.application;

import org.skrymer.onion.architecture.sales.domain.model.AModel;
import org.skrymer.onion.architecture.sales.domain.service.SalesDomainService;
import org.springframework.stereotype.Service;

@Service
public class SalesService {
  private final SalesDomainService salesDomainService;

  SalesService(SalesDomainService salesDomainService){
    this.salesDomainService = salesDomainService;
  }

  public void doSomething(Dto dto) {
    // check security
    // validate dto
    // map dto to domain
    salesDomainService.doSomeBusinessLogic(new AModel());
  }
}
