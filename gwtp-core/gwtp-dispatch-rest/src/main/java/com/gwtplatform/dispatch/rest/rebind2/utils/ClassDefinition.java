/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rest.rebind2.utils;

import com.google.gwt.core.ext.typeinfo.JClassType;

public class ClassDefinition {
    private final String packageName;
    private final String className;

    public ClassDefinition(
            JClassType classType) {
        this(classType.getPackage().getName(), classType.getSimpleSourceName());
    }

    public ClassDefinition(
            String packageName,
            String className) {
        this.packageName = packageName;
        this.className = className;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getClassName() {
        return className;
    }

    public String getQualifiedName() {
        return packageName + "." + className;
    }

    // TODO: Used at many place to get the qualified source name. Should use the right method
    @Override
    public String toString() {
        return getQualifiedName();
    }
}
