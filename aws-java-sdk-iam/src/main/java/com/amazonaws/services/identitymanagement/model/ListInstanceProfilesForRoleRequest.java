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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListInstanceProfilesForRole" target="_top">AWS
 *      API Documentation</a>
 */
public class ListInstanceProfilesForRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the role to list instance profiles for.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The name of the role to list instance profiles for.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        The name of the role to list instance profiles for.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to list instance profiles for.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     * 
     * @return The name of the role to list instance profiles for.</p>
     *         <p>
     *         This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: =,.@-
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to list instance profiles for.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        The name of the role to list instance profiles for.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceProfilesForRoleRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *         received to indicate where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceProfilesForRoleRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     *        response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response
     *        element is <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *        when there are more results available. In that case, the <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells
     *        the service where to continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     * 
     * @return (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     *         response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>.</p>
     *         <p>
     *         If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *         when there are more results available. In that case, the <code>IsTruncated</code> response element
     *         returns <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that
     *         tells the service where to continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     * response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even when
     * there are more results available. In that case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells the
     * service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Use this only when paginating results to indicate the maximum number of items you want in the
     *        response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response
     *        element is <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, it defaults to 100. Note that IAM might return fewer results, even
     *        when there are more results available. In that case, the <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to include in the subsequent call that tells
     *        the service where to continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceProfilesForRoleRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInstanceProfilesForRoleRequest == false)
            return false;
        ListInstanceProfilesForRoleRequest other = (ListInstanceProfilesForRoleRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListInstanceProfilesForRoleRequest clone() {
        return (ListInstanceProfilesForRoleRequest) super.clone();
    }

}
