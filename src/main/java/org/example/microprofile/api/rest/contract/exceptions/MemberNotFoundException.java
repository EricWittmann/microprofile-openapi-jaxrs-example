/*
 * Copyright 2014 JBoss Inc
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

package org.example.microprofile.api.rest.contract.exceptions;

/**
 * Thrown when trying to get a member of an organization.
 *
 * @author eric.wittmann@redhat.com
 */
public class MemberNotFoundException extends AbstractNotFoundException {

    private static final long serialVersionUID = 2785823316258685639L;

    /**
     * Constructor.
     */
    public MemberNotFoundException() {
    }
    
    /**
     * Constructor.
     * @param message the exception message
     */
    public MemberNotFoundException(String message) {
        super(message);
    }
    
    /**
     * @see org.example.microprofile.api.rest.contract.exceptions.AbstractRestException#getErrorCode()
     */
    @Override
    public int getErrorCode() {
        return ErrorCodes.MEMBER_NOT_FOUND;
    }
    
    /**
     * @see org.example.microprofile.api.rest.contract.exceptions.AbstractRestException#getMoreInfoUrl()
     */
    @Override
    public String getMoreInfoUrl() {
        return ErrorCodes.MEMBER_NOT_FOUND_INFO;
    }

}
