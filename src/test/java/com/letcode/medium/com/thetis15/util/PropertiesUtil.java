package com.letcode.medium.com.thetis15.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
  public Properties getProperties(String resource) {
    Properties prop = new Properties();
    try (InputStream input = getClass().getClassLoader().getResourceAsStream(resource)) {
      // load a properties file
      prop.load(input);
      // get the property value and print it out
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return prop;
  }
}
