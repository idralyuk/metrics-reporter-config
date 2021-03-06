/*
 * Copyright (C) 2012 AddThis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.addthis.metrics.reporter.config;

import com.yammer.metrics.reporting.ConsoleReporter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Use predicate (enable method does not support)
public class ConsoleReporterConfig extends AbstractReporterConfig
{
    private static final Logger log = LoggerFactory.getLogger(ConsoleReporterConfig.class);

    @Override
    public boolean enable()
    {
        try
        {
            ConsoleReporter.enable(getPeriod(), getRealTimeunit());
        }
        catch (Exception e)
        {
            log.error("Failure while enabling console reporter", e);
            return false;
        }
        return true;
    }

}
