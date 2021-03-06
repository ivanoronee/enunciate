/*
 * Copyright 2006-2008 Web Cohesion
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

package org.codehaus.enunciate.samples.jaxws;

import javax.jws.WebService;

/**
 * @author Ryan Heaton
 */
@WebService
public class BasicEndpointInterface {

  public int alreadyExisting(boolean bool) throws BasicFault {
    return 0;
  }

  public Double notConflictingMethod(short s, long l) throws NonConflictingFault {
    return null;
  }

}
