package com.github.marschall.slf4j.equinox.test;


import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;

class LoggingBridgeTests {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Test
  void warn() {
    LOG.warn("test execution");
  }

}
