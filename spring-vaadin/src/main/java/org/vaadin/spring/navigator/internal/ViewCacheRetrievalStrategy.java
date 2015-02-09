/*
 * Copyright 2015 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.navigator.internal;

import org.springframework.beans.factory.BeanFactory;

/**
 * Strategy interface for getting the {@link org.vaadin.spring.navigator.internal.ViewCache}. The strategy pattern
 * is used to make it easier to mock the {@link org.vaadin.spring.navigator.internal.VaadinViewScope view scope} while doing testing. For internal use only.
 *
 * @author Petter Holmström (petter@vaadin.com)
 */
public interface ViewCacheRetrievalStrategy {

    /**
     * Returns the current bean store (never {@code null}).
     */
    ViewCache getViewCache(BeanFactory beanFactory);
}
