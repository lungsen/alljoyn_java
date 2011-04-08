/*
 * Copyright 2009-2011, Qualcomm Innovation Center, Inc.
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.alljoyn.bus;

public class SessionOpts {

    /**
     * Holds the traffic type for this SessionOpt
     */
    public byte traffic;

    /**
     * Multi-point session capable.
     *
     * A session is multi-point if it can be joined multiple times to form a single
     * session with multi (greater than 2) endpoints. When false, each join attempt
     * creates a new point-to-point session.
     */
    public boolean isMultipoint;

    /**
     * Holds the proximity for this SessionOpt
     */
    public byte proximity;

    /**
     * Holds the allowed transports for this SessionOpt
     */
    public short transports;

    public SessionOpts() {
        traffic = TRAFFIC_MESSAGES;
        isMultipoint = false;
        proximity = PROXIMITY_ANY;
        transports = TRANSPORT_ANY;
    }

    /**
     * Use reliable message-based communication to move data between session endpoints.
     */
    public static final Byte TRAFFIC_MESSAGES       = 0x01;

    /**
     * Use unreliable (e.g., UDP) socket-based communication to move data between
     * session endpoints.  RAW does not imply raw sockets (that bypass ALL
     * enapsulation possibly down to the MAC level), it implies raw in an AllJoyn
     * sense --MESSAGE encapsulation is not used, but for example UDP + IP + MAC
     * encapsulation is used.
     */
    public static final Byte TRAFFIC_RAW_UNRELIABLE = 0x02;

    /**
     * Use reliable (e.g., TCP) socket-based communication to move data between
     * session endpoints.  RAW does not imply raw sockets (that bypass ALL
     * enapsulation possibly down to the MAC level), it implies raw in an AllJoyn
     * sense --MESSAGE encapsulation is not used, but for example UDP + IP + MAC
     * encapsulation is used.
     */
    public static final Byte TRAFFIC_RAW_RELIABLE   = 0x04;
    
    /**
     * Do not limit the spatial scope of sessions.  This means that sessions may
     * be joined by jointers located anywhere.
     */
    public static final Byte PROXIMITY_ANY      = (byte)0xff;

    /**
     * Limit the spatial scope of sessions to the local host.  Interpret as 
     * "the same physical machine."  This means that sessions may be joined by
     * jointers located only on the same physical machine as the one hosting the
     * session.
     */
    public static final Byte PROXIMITY_PHYSICAL = 0x01;

    /**
     * Limit the spatial scope of sessions to anwhere on the local logical
     * network segment.  This means that sessions may be joined by jointers
     * located somewhere on the network.
     */
    public static final Byte PROXIMITY_NETWORK  = 0x02;
    
    /**
     * Use no transport to communicate with a given session.
     */
    public static final Short TRANSPORT_NONE      = 0x0000;

    /**
     * Use any available transport to communicate with a given session.
     */
    public static final Short TRANSPORT_ANY       = (short)0xffff;

    /**
     * Use only the local transport to communicate with a given session.
     */
    public static final Short TRANSPORT_LOCAL     = 0x0001;

    /**
     * Use only Bluetooth transport to communicate with a given session.
     */
    public static final Short TRANSPORT_BLUETOOTH = 0x0002;

    /**
     * Use only a wireless local area network to communicate with a given session.
     */
    public static final Short TRANSPORT_WLAN      = 0x0004;

    /**
     * Use only a wireless wide area network to communicate with a given session.
     */
    public static final Short TRANSPORT_WWAN      = 0x0008;
}
