package org.skrymer.onion.architecture.sales.adapter.persistence;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.skrymer.onion.architecture.sales.domain.model.AModel;
import org.skrymer.onion.architecture.sales.domain.service.MyRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DBSaleRepository implements MyRepository {
  public static final Log LOG = LogFactory.getLog(DBSaleRepository.class);

  @Override
  public AModel create(AModel aModel) {
    LOG.info("Saving a model");
    return null;
  }
}
