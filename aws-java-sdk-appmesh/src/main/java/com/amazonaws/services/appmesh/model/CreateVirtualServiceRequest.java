/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVirtualServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the service mesh in which to create the virtual service.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The virtual service specification to apply.
     * </p>
     */
    private VirtualServiceSpec spec;
    /**
     * <p>
     * The name to use for the virtual service.
     * </p>
     */
    private String virtualServiceName;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *        letters, numbers, hyphens, and underscores are allowed.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *         letters, numbers, hyphens, and underscores are allowed.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *        letters, numbers, hyphens, and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualServiceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh in which to create the virtual service.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh in which to create the virtual service.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh in which to create the virtual service.
     * </p>
     * 
     * @return The name of the service mesh in which to create the virtual service.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh in which to create the virtual service.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh in which to create the virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualServiceRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The virtual service specification to apply.
     * </p>
     * 
     * @param spec
     *        The virtual service specification to apply.
     */

    public void setSpec(VirtualServiceSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The virtual service specification to apply.
     * </p>
     * 
     * @return The virtual service specification to apply.
     */

    public VirtualServiceSpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The virtual service specification to apply.
     * </p>
     * 
     * @param spec
     *        The virtual service specification to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualServiceRequest withSpec(VirtualServiceSpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The name to use for the virtual service.
     * </p>
     * 
     * @param virtualServiceName
     *        The name to use for the virtual service.
     */

    public void setVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    /**
     * <p>
     * The name to use for the virtual service.
     * </p>
     * 
     * @return The name to use for the virtual service.
     */

    public String getVirtualServiceName() {
        return this.virtualServiceName;
    }

    /**
     * <p>
     * The name to use for the virtual service.
     * </p>
     * 
     * @param virtualServiceName
     *        The name to use for the virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualServiceRequest withVirtualServiceName(String virtualServiceName) {
        setVirtualServiceName(virtualServiceName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append(getSpec()).append(",");
        if (getVirtualServiceName() != null)
            sb.append("VirtualServiceName: ").append(getVirtualServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVirtualServiceRequest == false)
            return false;
        CreateVirtualServiceRequest other = (CreateVirtualServiceRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getVirtualServiceName() == null ^ this.getVirtualServiceName() == null)
            return false;
        if (other.getVirtualServiceName() != null && other.getVirtualServiceName().equals(this.getVirtualServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getVirtualServiceName() == null) ? 0 : getVirtualServiceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateVirtualServiceRequest clone() {
        return (CreateVirtualServiceRequest) super.clone();
    }

}
