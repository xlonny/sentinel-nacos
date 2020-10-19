package com.alibaba.csp.sentinel.dashboard.rule.nacos;

/**
 * @author xlonny_wang
 */
public final class NacosConfigConstant {
    public static final String GROUP_ID = "SENTINEL_GROUP";

    public static final String FLOW_DATA_ID_PREFIX = "-flow-rules";
    public static final String DEGRADE_DATA_ID_PREFIX = "-degrade-rules";
    public static final String SYSTEM_DATA_ID_PREFIX = "-system-rules";
    public static final String PARAM_FLOW_DATA_ID_PREFIX = "-param-flow-rules";
    public static final String AUTHORITY_DATA_ID_PREFIX = "-authority-rules";
    public static final String DASHBOARD_PREFIX = "-dashboard";
    public static final String CLUSTER_MAP_DATA_ID_PREFIX = "-cluster-map";

    /**
     * cc for `cluster-client`
     */
    public static final String CLIENT_CONFIG_DATA_ID_PREFIX = "-cc-config";
    /**
     * cs for `cluster-server`
     */
    public static final String SERVER_TRANSPORT_CONFIG_DATA_ID_PREFIX = "-cs-transport-config";
    public static final String SERVER_FLOW_CONFIG_DATA_ID_PREFIX = "-cs-flow-config";
    public static final String SERVER_NAMESPACE_SET_DATA_ID_PREFIX = "-cs-namespace-set";
}