package io.itudoben.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LogMe1 {
  private static final Logger logger = LogManager.getLogger(LogMe1.class);

  public void say() {
    logger.trace("This is a trace!");
    logger.debug("This is a debug!");
    logger.info("This is an info!");
    logger.warn("This is a warn!");
    logger.error("This is an error!");

  }

}
