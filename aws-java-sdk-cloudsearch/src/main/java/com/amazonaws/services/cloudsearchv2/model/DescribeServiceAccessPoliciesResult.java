/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code>DescribeServiceAccessPolicies</code> request.
 * </p>
 */
public class DescribeServiceAccessPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The access rules configured for the domain specified in the request.
     * </p>
     */
    private AccessPoliciesStatus accessPolicies;

    /**
     * <p>
     * The access rules configured for the domain specified in the request.
     * </p>
     * 
     * @param accessPolicies
     *        The access rules configured for the domain specified in the request.
     */

    public void setAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * The access rules configured for the domain specified in the request.
     * </p>
     * 
     * @return The access rules configured for the domain specified in the request.
     */

    public AccessPoliciesStatus getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * The access rules configured for the domain specified in the request.
     * </p>
     * 
     * @param accessPolicies
     *        The access rules configured for the domain specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceAccessPoliciesResult withAccessPolicies(AccessPoliciesStatus accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceAccessPoliciesResult == false)
            return false;
        DescribeServiceAccessPoliciesResult other = (DescribeServiceAccessPoliciesResult) obj;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceAccessPoliciesResult clone() {
        try {
            return (DescribeServiceAccessPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
