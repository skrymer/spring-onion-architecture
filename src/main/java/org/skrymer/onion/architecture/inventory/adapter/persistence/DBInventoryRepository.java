package org.skrymer.onion.architecture.inventory.adapter.persistence;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.skrymer.onion.architecture.inventory.domain.model.AModel;
import org.skrymer.onion.architecture.inventory.domain.service.MyRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DBInventoryRepository implements MyRepository {
  public static final Log LOG = LogFactory.getLog(DBInventoryRepository.class);

  @Override
  public AModel create(AModel aModel) {
    LOG.info("Saving a model");
    return null;
  }
}
