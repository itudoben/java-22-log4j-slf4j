package io.itudoben.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SlfLogMe {

private static final Logger logger = LoggerFactory.getLogger(SlfLogMe.class);

  public void say() {
    logger.trace("This is a trace!");
    logger.debug("This is a debug!");
    logger.info("This is an info!");
    logger.warn("This is a warn!");
    logger.error("This is an error!");

  }
}
