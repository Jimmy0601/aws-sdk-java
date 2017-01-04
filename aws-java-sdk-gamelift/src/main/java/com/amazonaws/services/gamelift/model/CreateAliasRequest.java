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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
 *      Documentation</a>
 */
public class CreateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Human-readable description of an alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Object specifying the fleet and routing type to use for the alias.
     * </p>
     */
    private RoutingStrategy routingStrategy;

    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with an alias. Alias names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label associated with an alias. Alias names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with an alias. Alias names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Human-readable description of an alias.
     * </p>
     * 
     * @param description
     *        Human-readable description of an alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-readable description of an alias.
     * </p>
     * 
     * @return Human-readable description of an alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-readable description of an alias.
     * </p>
     * 
     * @param description
     *        Human-readable description of an alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Object specifying the fleet and routing type to use for the alias.
     * </p>
     * 
     * @param routingStrategy
     *        Object specifying the fleet and routing type to use for the alias.
     */

    public void setRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    /**
     * <p>
     * Object specifying the fleet and routing type to use for the alias.
     * </p>
     * 
     * @return Object specifying the fleet and routing type to use for the alias.
     */

    public RoutingStrategy getRoutingStrategy() {
        return this.routingStrategy;
    }

    /**
     * <p>
     * Object specifying the fleet and routing type to use for the alias.
     * </p>
     * 
     * @param routingStrategy
     *        Object specifying the fleet and routing type to use for the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withRoutingStrategy(RoutingStrategy routingStrategy) {
        setRoutingStrategy(routingStrategy);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingStrategy() != null)
            sb.append("RoutingStrategy: ").append(getRoutingStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingStrategy() == null ^ this.getRoutingStrategy() == null)
            return false;
        if (other.getRoutingStrategy() != null && other.getRoutingStrategy().equals(this.getRoutingStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingStrategy() == null) ? 0 : getRoutingStrategy().hashCode());
        return hashCode;
    }

    @Override
    public CreateAliasRequest clone() {
        return (CreateAliasRequest) super.clone();
    }

}
