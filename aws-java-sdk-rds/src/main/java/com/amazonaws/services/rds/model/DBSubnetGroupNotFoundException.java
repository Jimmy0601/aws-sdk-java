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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group.
 * </p>
 */
public class DBSubnetGroupNotFoundException extends com.amazonaws.services.rds.model.AmazonRDSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DBSubnetGroupNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DBSubnetGroupNotFoundException(String message) {
        super(message);
    }

}
