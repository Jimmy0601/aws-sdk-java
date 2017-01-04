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

/**
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * A load balancer distributes incoming traffic across your EC2 instances. This enables you to increase the availability
 * of your application. The load balancer also monitors the health of its registered instances and ensures that it
 * routes traffic only to healthy instances. You configure your load balancer to accept incoming traffic by specifying
 * one or more listeners, which are configured with a protocol and port number for connections from clients to the load
 * balancer and a protocol and port number for connections from the load balancer to the instances.
 * </p>
 * <p>
 * Elastic Load Balancing supports two types of load balancers: Classic load balancers and Application load balancers
 * (new). A Classic load balancer makes routing and load balancing decisions either at the transport layer (TCP/SSL) or
 * the application layer (HTTP/HTTPS), and supports either EC2-Classic or a VPC. An Application load balancer makes
 * routing and load balancing decisions at the application layer (HTTP/HTTPS), supports path-based routing, and can
 * route requests to one or more ports on each EC2 instance or container instance in your virtual private cloud (VPC).
 * For more information, see the .
 * </p>
 * <p>
 * This reference covers the 2012-06-01 API, which supports Classic load balancers. The 2015-12-01 API supports
 * Application load balancers.
 * </p>
 * <p>
 * To get started, create a load balancer with one or more listeners using <a>CreateLoadBalancer</a>. Register your
 * instances with the load balancer using <a>RegisterInstancesWithLoadBalancer</a>.
 * </p>
 * <p>
 * All Elastic Load Balancing operations are <i>idempotent</i>, which means that they complete at most one time. If you
 * repeat an operation, it succeeds with a 200 OK response code.
 * </p>
 */
package com.amazonaws.services.elasticloadbalancing;

