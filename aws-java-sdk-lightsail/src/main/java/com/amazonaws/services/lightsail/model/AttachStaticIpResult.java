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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
 *      Documentation</a>
 */
public class AttachStaticIpResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about your API operations.
     * </p>
     */
    private java.util.List<Operation> operations;

    /**
     * <p>
     * An array of key-value pairs containing information about your API operations.
     * </p>
     * 
     * @return An array of key-value pairs containing information about your API operations.
     */

    public java.util.List<Operation> getOperations() {
        return operations;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your API operations.
     * </p>
     * 
     * @param operations
     *        An array of key-value pairs containing information about your API operations.
     */

    public void setOperations(java.util.Collection<Operation> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<Operation>(operations);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your API operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperations(java.util.Collection)} or {@link #withOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operations
     *        An array of key-value pairs containing information about your API operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachStaticIpResult withOperations(Operation... operations) {
        if (this.operations == null) {
            setOperations(new java.util.ArrayList<Operation>(operations.length));
        }
        for (Operation ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about your API operations.
     * </p>
     * 
     * @param operations
     *        An array of key-value pairs containing information about your API operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachStaticIpResult withOperations(java.util.Collection<Operation> operations) {
        setOperations(operations);
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
        if (getOperations() != null)
            sb.append("Operations: ").append(getOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachStaticIpResult == false)
            return false;
        AttachStaticIpResult other = (AttachStaticIpResult) obj;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null && other.getOperations().equals(this.getOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        return hashCode;
    }

    @Override
    public AttachStaticIpResult clone() {
        try {
            return (AttachStaticIpResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
