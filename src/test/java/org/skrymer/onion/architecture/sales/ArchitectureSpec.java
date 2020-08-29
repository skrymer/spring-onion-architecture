package org.skrymer.onion.architecture.sales;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "org.skrymer.onion.architecture.sales")
public class ArchitectureSpec {

  @ArchTest
  public static final ArchRule myRule = onionArchitecture()
      .domainModels("org.skrymer.onion.architecture.sales.domain.model..")
      .domainServices("org.skrymer.onion.architecture.sales.domain.service..")
      .applicationServices("org.skrymer.onion.architecture.sales.application..")
      .adapter("persistence", "org.skrymer.onion.architecture.sales.adapter.persistence..")
      .adapter("rest", "org.skrymer.onion.architecture.sales.adapter.rest..");

}
