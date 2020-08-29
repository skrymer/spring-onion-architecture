package org.skrymer.onion.architecture.sales.adapter.rest;

import org.skrymer.onion.architecture.sales.application.Dto;
import org.skrymer.onion.architecture.sales.application.SalesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
  private final SalesService salesService;

  SalesController(SalesService salesService){
    this.salesService = salesService;
  }

  @PostMapping(value = "/sales/aModel")
  public void create(Dto dto){
    salesService.doSomething(dto);
  }

}
