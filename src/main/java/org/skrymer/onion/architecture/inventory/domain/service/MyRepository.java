package org.skrymer.onion.architecture.inventory.domain.service;

import org.skrymer.onion.architecture.inventory.domain.model.AModel;

public interface MyRepository {
  AModel create(AModel aModel);
}
