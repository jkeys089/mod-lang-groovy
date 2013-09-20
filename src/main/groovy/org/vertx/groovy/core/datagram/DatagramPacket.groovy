/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vertx.groovy.core.datagram

import groovy.transform.CompileStatic
import org.vertx.groovy.core.buffer.Buffer
import org.vertx.java.core.datagram.DatagramPacket as JDatagramPacket

/**
 * A received Datagram packet (UDP) which contains the data and information about the sender of the data itself.
 *
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
 */
@CompileStatic
class DatagramPacket {

  private final JDatagramPacket packet
  private final Buffer buffer

  DatagramPacket(JDatagramPacket packet) {
    this.packet = packet
    this.buffer = new Buffer(packet.data())
  }

  /**
   * Returns the {@link InetSocketAddress} of the sender that send this {@link DatagramPacket}.
   */
  InetSocketAddress getSender() {
    packet.sender()
  }

  /**
   * Returns the data of the {@link DatagramPacket}
   */
  Buffer getData() {
    buffer
  }
}
