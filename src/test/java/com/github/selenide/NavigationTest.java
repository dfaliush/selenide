package com.github.selenide;

import org.junit.Test;

import static com.github.selenide.Navigation.makeUniqueUrl;
import static org.junit.Assert.assertEquals;

public class NavigationTest {
  @Test
  public void addsRandomNumbersToEveryUrlToAvoidIECaching() {
    assertEquals("http://chuck-norris.com?timestamp=666", makeUniqueUrl("http://chuck-norris.com", 666));
    assertEquals("http://chuck-norris.com?timestamp=666", makeUniqueUrl("http://chuck-norris.com?timestamp=123456789", 666));
    assertEquals("http://chuck-norris.com?timestamp=666", makeUniqueUrl("http://chuck-norris.com?timestamp=123456789#", 666));
    assertEquals("http://chuck-norris.com?timestamp=666", makeUniqueUrl("http://chuck-norris.com?timestamp=123456789&abc=def", 666));
  }
}
