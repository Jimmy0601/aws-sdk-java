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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
 *      Documentation</a>
 */
public class DeleteKeyPairRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     */
    private String keyPairName;

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     * 
     * @param keyPairName
     *        The name of the key pair to delete.
     */

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     * 
     * @return The name of the key pair to delete.
     */

    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     * 
     * @param keyPairName
     *        The name of the key pair to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyPairRequest withKeyPairName(String keyPairName) {
        setKeyPairName(keyPairName);
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
        if (getKeyPairName() != null)
            sb.append("KeyPairName: ").append(getKeyPairName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyPairRequest == false)
            return false;
        DeleteKeyPairRequest other = (DeleteKeyPairRequest) obj;
        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeyPairRequest clone() {
        return (DeleteKeyPairRequest) super.clone();
    }

}
