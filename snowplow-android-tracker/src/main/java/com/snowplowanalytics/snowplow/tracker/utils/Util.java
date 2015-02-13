/*
 * Copyright (c) 2015 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */

package com.snowplowanalytics.snowplow.tracker.utils;

import java.util.Map;
import java.util.UUID;

import android.util.Base64;

/**
 * Provides basic Utilities for the
 * Snowplow Tracker.
 */
public class Util {


    /**
     * Returns the current System time
     * as a String.
     *
     * @return the system time as a string
     */
    public static String getTimestamp() {
        return Long.toString(System.currentTimeMillis());
    }

    /**
     * Encodes a string into Base64.
     *
     * @param string the string too encode
     * @return a Base64 encoded string
     */
    public static String base64Encode(String string) {
        return Base64.encodeToString(string.getBytes(), Base64.URL_SAFE);
    }

    /**
     * Generates a random UUID for
     * each event.
     *
     * @return a UUID string
     */
    public static String getEventId() {
        return UUID.randomUUID().toString();
    }

    public static String serializeMap(Map map) {
        return "";
    }


}
