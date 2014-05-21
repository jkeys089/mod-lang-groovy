package core.isolation

import org.vertx.groovy.testframework.TestUtils

import java.util.concurrent.atomic.AtomicInteger

tu = new TestUtils(vertx)
tu.checkThread()

class CounterHolder {
  static final AtomicInteger counter = new AtomicInteger(0)
}

void testIsolation() {
  tu.azzert(CounterHolder.counter.incrementAndGet() == 1)
  tu.testComplete()
}

tu.registerTests(this)

tu.appReady()

void vertxStop() {
  tu.unregisterAll()
  tu.appStopped()
}

