/*
 * Copyright 2010-2011, Qualcomm Innovation Center, Inc.
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
package org.alljoyn.bus.samples;

import org.alljoyn.bus.BusException;
import org.alljoyn.bus.annotation.BusInterface;
import org.alljoyn.bus.annotation.BusMethod;

@BusInterface (name = "org.sample.busMethods")
public interface SampleInterface {
    
    @BusMethod
    public String Ping(String str) throws BusException;
    
    @BusMethod
    public String Concatenate(String arg1, String arg2) throws BusException;
    
    @BusMethod
    public int Fibonacci(int arg1) throws BusException;
    
    @BusMethod
    public double Pi(int iterations) throws BusException;
}