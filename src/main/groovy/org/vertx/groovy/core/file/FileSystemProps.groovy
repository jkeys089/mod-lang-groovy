/**
 * Copyright 2013 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License") you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.vertx.groovy.core.file

import org.vertx.java.core.file.FileSystemProps as JFileSystemProps

import groovy.transform.CompileStatic

/**
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
 */
@CompileStatic
class FileSystemProps {
  private final JFileSystemProps props

  FileSystemProps(JFileSystemProps props) {
    this.props = props
  }

  /**
   * The total space on the file system, in bytes
   */
  long getTotalSpace() {
    props.totalSpace()
  }

  /**
   * The total un-allocated space on the file syste, in bytes
   */
  long getUnallocatedSpace() {
    props.unallocatedSpace()
  }

  /**
   * The total usable space on the file system, in bytes
   */
  long getUsableSpace() {
    props.usableSpace()
  }
}
