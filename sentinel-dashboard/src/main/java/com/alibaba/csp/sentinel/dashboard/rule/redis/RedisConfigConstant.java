package com.alibaba.csp.sentinel.dashboard.rule.redis;

/**
 * @author xlonny_wang
 */
public final class RedisConfigConstant {
    public static final String GROUP_ID = "SENTINEL_GROUP";

    public static final String FLOW_DATA_ID_PREFIX = "sentinel-flow-rules:";
    public static final String DEGRADE_DATA_ID_PREFIX = "sentinel-degrade-rules:";
    public static final String SYSTEM_DATA_ID_PREFIX = "sentinel-system-rules:";
    public static final String PARAM_FLOW_DATA_ID_PREFIX = "sentinel-param-flow-rules:";
    public static final String AUTHORITY_DATA_ID_PREFIX = "sentinel-authority-rules:";
    public static final String DASHBOARD_PREFIX = "sentinel-dashboard-";
    public static final String CLUSTER_MAP_DATA_ID_PREFIX = "sentinel-cluster-map:";

    /**
     * cc for `cluster-client`
     */
    public static final String CLIENT_CONFIG_DATA_ID_PREFIX = "sentinel-cc-config-";
    /**
     * cs for `cluster-server`
     */
    public static final String SERVER_TRANSPORT_CONFIG_DATA_ID_PREFIX = "sentinel-cs-transport-config:";
    public static final String SERVER_FLOW_CONFIG_DATA_ID_PREFIX = "sentinel-cs-flow-config:";
    public static final String SERVER_NAMESPACE_SET_DATA_ID_PREFIX = "sentinel-cs-namespace-set:";
}