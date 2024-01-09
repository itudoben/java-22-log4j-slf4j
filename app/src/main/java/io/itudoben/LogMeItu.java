package io.itudoben;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LogMeItu {
  private static final Logger logger = LogManager.getLogger(LogMeItu.class);

  public void say() {
    logger.trace("This is a trace!");
    logger.debug("This is a debug!");
    logger.info("This is an info!");
    logger.warn("This is a warn!");
    logger.error("This is an error!");

  }
}
