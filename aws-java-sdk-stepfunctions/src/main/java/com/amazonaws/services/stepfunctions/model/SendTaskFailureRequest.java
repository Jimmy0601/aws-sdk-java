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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/SendTaskFailure" target="_top">AWS API
 *      Documentation</a>
 */
public class SendTaskFailureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     */
    private String taskToken;
    /**
     * <p>
     * An arbitrary error code that identifies the cause of the failure.
     * </p>
     */
    private String error;
    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     */
    private String cause;

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     * 
     * @param taskToken
     *        The token that represents this task. Task tokens are generated by the service when the tasks are assigned
     *        to a worker (see GetActivityTask::taskToken).
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     * 
     * @return The token that represents this task. Task tokens are generated by the service when the tasks are assigned
     *         to a worker (see GetActivityTask::taskToken).
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a
     * worker (see GetActivityTask::taskToken).
     * </p>
     * 
     * @param taskToken
     *        The token that represents this task. Task tokens are generated by the service when the tasks are assigned
     *        to a worker (see GetActivityTask::taskToken).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTaskFailureRequest withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * An arbitrary error code that identifies the cause of the failure.
     * </p>
     * 
     * @param error
     *        An arbitrary error code that identifies the cause of the failure.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An arbitrary error code that identifies the cause of the failure.
     * </p>
     * 
     * @return An arbitrary error code that identifies the cause of the failure.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * An arbitrary error code that identifies the cause of the failure.
     * </p>
     * 
     * @param error
     *        An arbitrary error code that identifies the cause of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTaskFailureRequest withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the failure.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @return A more detailed explanation of the cause of the failure.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * A more detailed explanation of the cause of the failure.
     * </p>
     * 
     * @param cause
     *        A more detailed explanation of the cause of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTaskFailureRequest withCause(String cause) {
        setCause(cause);
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
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getCause() != null)
            sb.append("Cause: ").append(getCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendTaskFailureRequest == false)
            return false;
        SendTaskFailureRequest other = (SendTaskFailureRequest) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        return hashCode;
    }

    @Override
    public SendTaskFailureRequest clone() {
        return (SendTaskFailureRequest) super.clone();
    }

}
