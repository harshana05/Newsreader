/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.mime4j.message;

/**
 * Encapsulates the body of an entity (see RFC 2045).
 * <p>
 * A body can be a {@link Message}, a {@link Multipart} or a {@link SingleBody}.
 * This interface should not be implemented directly by classes other than
 * those.
 */
public interface Body extends Disposable {

    /**
     * Gets the parent of this body.
     * 
     * @return the parent.
     */
    Entity getParent();

    /**
     * Sets the parent of this body.
     * 
     * @param parent
     *            the parent.
     */
    void setParent(Entity parent);

}
