/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.nebula.grails

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import com.netflix.nebula.grails.tasks.GrailsTask
import spock.lang.Specification

class PluginSpec extends Specification {
    Project project = ProjectBuilder.builder().build()

    def setup() {
        project.apply plugin: "nebula.grails"
        project.grails.grailsVersion = '2.0.0'
    }

    GrailsTask grailsTask(String name, Closure config = {}) {
        return project.task(name, type: GrailsTask, config) as GrailsTask
    }
}
