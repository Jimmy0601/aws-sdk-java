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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about the job data for a partner action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ThirdPartyJobData" target="_top">AWS API
 *      Documentation</a>
 */
public class ThirdPartyJobData implements Serializable, Cloneable {

    private ActionTypeId actionTypeId;

    private ActionConfiguration actionConfiguration;

    private PipelineContext pipelineContext;
    /**
     * <p>
     * The name of the artifact that will be worked upon by the action, if any. This name might be system-generated,
     * such as "MyApp", or might be defined by the user when the action is created. The input artifact name must match
     * the name of an output artifact generated by an action in an earlier action or stage of the pipeline.
     * </p>
     */
    private java.util.List<Artifact> inputArtifacts;
    /**
     * <p>
     * The name of the artifact that will be the result of the action, if any. This name might be system-generated, such
     * as "MyBuiltApp", or might be defined by the user when the action is created.
     * </p>
     */
    private java.util.List<Artifact> outputArtifacts;

    private AWSSessionCredentials artifactCredentials;
    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     */
    private String continuationToken;
    /**
     * <p>
     * The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an AWS Key
     * Management Service (AWS KMS) key. This is optional and might not be present.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * @param actionTypeId
     */

    public void setActionTypeId(ActionTypeId actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    /**
     * @return
     */

    public ActionTypeId getActionTypeId() {
        return this.actionTypeId;
    }

    /**
     * @param actionTypeId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withActionTypeId(ActionTypeId actionTypeId) {
        setActionTypeId(actionTypeId);
        return this;
    }

    /**
     * @param actionConfiguration
     */

    public void setActionConfiguration(ActionConfiguration actionConfiguration) {
        this.actionConfiguration = actionConfiguration;
    }

    /**
     * @return
     */

    public ActionConfiguration getActionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * @param actionConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withActionConfiguration(ActionConfiguration actionConfiguration) {
        setActionConfiguration(actionConfiguration);
        return this;
    }

    /**
     * @param pipelineContext
     */

    public void setPipelineContext(PipelineContext pipelineContext) {
        this.pipelineContext = pipelineContext;
    }

    /**
     * @return
     */

    public PipelineContext getPipelineContext() {
        return this.pipelineContext;
    }

    /**
     * @param pipelineContext
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withPipelineContext(PipelineContext pipelineContext) {
        setPipelineContext(pipelineContext);
        return this;
    }

    /**
     * <p>
     * The name of the artifact that will be worked upon by the action, if any. This name might be system-generated,
     * such as "MyApp", or might be defined by the user when the action is created. The input artifact name must match
     * the name of an output artifact generated by an action in an earlier action or stage of the pipeline.
     * </p>
     * 
     * @return The name of the artifact that will be worked upon by the action, if any. This name might be
     *         system-generated, such as "MyApp", or might be defined by the user when the action is created. The input
     *         artifact name must match the name of an output artifact generated by an action in an earlier action or
     *         stage of the pipeline.
     */

    public java.util.List<Artifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The name of the artifact that will be worked upon by the action, if any. This name might be system-generated,
     * such as "MyApp", or might be defined by the user when the action is created. The input artifact name must match
     * the name of an output artifact generated by an action in an earlier action or stage of the pipeline.
     * </p>
     * 
     * @param inputArtifacts
     *        The name of the artifact that will be worked upon by the action, if any. This name might be
     *        system-generated, such as "MyApp", or might be defined by the user when the action is created. The input
     *        artifact name must match the name of an output artifact generated by an action in an earlier action or
     *        stage of the pipeline.
     */

    public void setInputArtifacts(java.util.Collection<Artifact> inputArtifacts) {
        if (inputArtifacts == null) {
            this.inputArtifacts = null;
            return;
        }

        this.inputArtifacts = new java.util.ArrayList<Artifact>(inputArtifacts);
    }

    /**
     * <p>
     * The name of the artifact that will be worked upon by the action, if any. This name might be system-generated,
     * such as "MyApp", or might be defined by the user when the action is created. The input artifact name must match
     * the name of an output artifact generated by an action in an earlier action or stage of the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputArtifacts(java.util.Collection)} or {@link #withInputArtifacts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputArtifacts
     *        The name of the artifact that will be worked upon by the action, if any. This name might be
     *        system-generated, such as "MyApp", or might be defined by the user when the action is created. The input
     *        artifact name must match the name of an output artifact generated by an action in an earlier action or
     *        stage of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withInputArtifacts(Artifact... inputArtifacts) {
        if (this.inputArtifacts == null) {
            setInputArtifacts(new java.util.ArrayList<Artifact>(inputArtifacts.length));
        }
        for (Artifact ele : inputArtifacts) {
            this.inputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the artifact that will be worked upon by the action, if any. This name might be system-generated,
     * such as "MyApp", or might be defined by the user when the action is created. The input artifact name must match
     * the name of an output artifact generated by an action in an earlier action or stage of the pipeline.
     * </p>
     * 
     * @param inputArtifacts
     *        The name of the artifact that will be worked upon by the action, if any. This name might be
     *        system-generated, such as "MyApp", or might be defined by the user when the action is created. The input
     *        artifact name must match the name of an output artifact generated by an action in an earlier action or
     *        stage of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withInputArtifacts(java.util.Collection<Artifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * <p>
     * The name of the artifact that will be the result of the action, if any. This name might be system-generated, such
     * as "MyBuiltApp", or might be defined by the user when the action is created.
     * </p>
     * 
     * @return The name of the artifact that will be the result of the action, if any. This name might be
     *         system-generated, such as "MyBuiltApp", or might be defined by the user when the action is created.
     */

    public java.util.List<Artifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The name of the artifact that will be the result of the action, if any. This name might be system-generated, such
     * as "MyBuiltApp", or might be defined by the user when the action is created.
     * </p>
     * 
     * @param outputArtifacts
     *        The name of the artifact that will be the result of the action, if any. This name might be
     *        system-generated, such as "MyBuiltApp", or might be defined by the user when the action is created.
     */

    public void setOutputArtifacts(java.util.Collection<Artifact> outputArtifacts) {
        if (outputArtifacts == null) {
            this.outputArtifacts = null;
            return;
        }

        this.outputArtifacts = new java.util.ArrayList<Artifact>(outputArtifacts);
    }

    /**
     * <p>
     * The name of the artifact that will be the result of the action, if any. This name might be system-generated, such
     * as "MyBuiltApp", or might be defined by the user when the action is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputArtifacts(java.util.Collection)} or {@link #withOutputArtifacts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outputArtifacts
     *        The name of the artifact that will be the result of the action, if any. This name might be
     *        system-generated, such as "MyBuiltApp", or might be defined by the user when the action is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withOutputArtifacts(Artifact... outputArtifacts) {
        if (this.outputArtifacts == null) {
            setOutputArtifacts(new java.util.ArrayList<Artifact>(outputArtifacts.length));
        }
        for (Artifact ele : outputArtifacts) {
            this.outputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the artifact that will be the result of the action, if any. This name might be system-generated, such
     * as "MyBuiltApp", or might be defined by the user when the action is created.
     * </p>
     * 
     * @param outputArtifacts
     *        The name of the artifact that will be the result of the action, if any. This name might be
     *        system-generated, such as "MyBuiltApp", or might be defined by the user when the action is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withOutputArtifacts(java.util.Collection<Artifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * @param artifactCredentials
     */

    public void setArtifactCredentials(AWSSessionCredentials artifactCredentials) {
        this.artifactCredentials = artifactCredentials;
    }

    /**
     * @return
     */

    public AWSSessionCredentials getArtifactCredentials() {
        return this.artifactCredentials;
    }

    /**
     * @param artifactCredentials
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withArtifactCredentials(AWSSessionCredentials artifactCredentials) {
        setArtifactCredentials(artifactCredentials);
        return this;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue
     *        the job asynchronously.
     */

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     * 
     * @return A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to
     *         continue the job asynchronously.
     */

    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue
     *        the job asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }

    /**
     * <p>
     * The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an AWS Key
     * Management Service (AWS KMS) key. This is optional and might not be present.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an AWS
     *        Key Management Service (AWS KMS) key. This is optional and might not be present.
     */

    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an AWS Key
     * Management Service (AWS KMS) key. This is optional and might not be present.
     * </p>
     * 
     * @return The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an
     *         AWS Key Management Service (AWS KMS) key. This is optional and might not be present.
     */

    public EncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an AWS Key
     * Management Service (AWS KMS) key. This is optional and might not be present.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key used to encrypt and decrypt data in the artifact store for the pipeline, such as an AWS
     *        Key Management Service (AWS KMS) key. This is optional and might not be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJobData withEncryptionKey(EncryptionKey encryptionKey) {
        setEncryptionKey(encryptionKey);
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
        if (getActionTypeId() != null)
            sb.append("ActionTypeId: ").append(getActionTypeId()).append(",");
        if (getActionConfiguration() != null)
            sb.append("ActionConfiguration: ").append(getActionConfiguration()).append(",");
        if (getPipelineContext() != null)
            sb.append("PipelineContext: ").append(getPipelineContext()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getArtifactCredentials() != null)
            sb.append("ArtifactCredentials: ").append(getArtifactCredentials()).append(",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: ").append(getContinuationToken()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThirdPartyJobData == false)
            return false;
        ThirdPartyJobData other = (ThirdPartyJobData) obj;
        if (other.getActionTypeId() == null ^ this.getActionTypeId() == null)
            return false;
        if (other.getActionTypeId() != null && other.getActionTypeId().equals(this.getActionTypeId()) == false)
            return false;
        if (other.getActionConfiguration() == null ^ this.getActionConfiguration() == null)
            return false;
        if (other.getActionConfiguration() != null && other.getActionConfiguration().equals(this.getActionConfiguration()) == false)
            return false;
        if (other.getPipelineContext() == null ^ this.getPipelineContext() == null)
            return false;
        if (other.getPipelineContext() != null && other.getPipelineContext().equals(this.getPipelineContext()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getArtifactCredentials() == null ^ this.getArtifactCredentials() == null)
            return false;
        if (other.getArtifactCredentials() != null && other.getArtifactCredentials().equals(this.getArtifactCredentials()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTypeId() == null) ? 0 : getActionTypeId().hashCode());
        hashCode = prime * hashCode + ((getActionConfiguration() == null) ? 0 : getActionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPipelineContext() == null) ? 0 : getPipelineContext().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getArtifactCredentials() == null) ? 0 : getArtifactCredentials().hashCode());
        hashCode = prime * hashCode + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public ThirdPartyJobData clone() {
        try {
            return (ThirdPartyJobData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
