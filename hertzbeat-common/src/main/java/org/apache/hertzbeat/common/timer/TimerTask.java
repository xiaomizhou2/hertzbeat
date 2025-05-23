/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hertzbeat.common.timer;

import java.util.concurrent.TimeUnit;

/**
 * Derived from Apache Dubbo org.apache.dubbo.common.timer.TimerTask 
 * <a href="https://github.com/apache/dubbo/blob/3.2/dubbo-common/src/main/java/org/apache/dubbo/common/timer/TimerTask.java">TimerTask.java</a>
 * A task which is executed after the delay specified with
 * {@link Timer#newTimeout(TimerTask, long, TimeUnit)} (TimerTask, long, TimeUnit)}.
 */
public interface TimerTask {

    /**
     * Executed after the delay specified with
     * {@link Timer#newTimeout(TimerTask, long, TimeUnit)}.
     * @param timeout a handle which is associated with this task
     * @throws Exception when error happen
     */
    void run(Timeout timeout) throws Exception;
}
