package org.skrymer.onion.architecture.inventory;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "org.skrymer.onion.architecture.inventory")
public class ArchitectureSpec {

  @ArchTest
  public static final ArchRule myRule = onionArchitecture()
      .domainModels("org.skrymer.onion.architecture.inventory.domain.model..")
      .domainServices("org.skrymer.onion.architecture.inventory.domain.service..")
      .applicationServices("org.skrymer.onion.architecture.inventory.application..")
      .adapter("persistence", "org.skrymer.onion.architecture.inventory.adapter.persistence..")
      .adapter("rest", "org.skrymer.onion.architecture.inventory.adapter.rest..");
}
