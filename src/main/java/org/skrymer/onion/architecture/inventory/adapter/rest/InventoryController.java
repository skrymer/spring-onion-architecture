package org.skrymer.onion.architecture.inventory.adapter.rest;

import org.skrymer.onion.architecture.inventory.application.Dto;
import org.skrymer.onion.architecture.inventory.application.InventoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
  private final InventoryService inventoryService;

  InventoryController(InventoryService inventoryService){
    this.inventoryService = inventoryService;
  }

  @PostMapping(value = "/inventory/aModel")
  public void create(Dto dto){
    inventoryService.doSomething(dto);
  }

}
