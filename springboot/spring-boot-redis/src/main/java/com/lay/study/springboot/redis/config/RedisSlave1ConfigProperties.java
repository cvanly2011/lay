package com.lay.study.springboot.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Create by yalei.chen on 2017/6/15
 */
@ConfigurationProperties(
        prefix = "slaveOne.redis"
)
public class RedisSlave1ConfigProperties {

    private int database = 0;
    private String host = "localhost";
    private String password;
    private int port = 6379;
    private RedisSlave1ConfigProperties.Pool pool;
    private RedisSlave1ConfigProperties.Sentinel sentinel;

    public RedisSlave1ConfigProperties() {
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RedisSlave1ConfigProperties.Pool getPool() {
        return this.pool;
    }

    public void setPool(RedisSlave1ConfigProperties.Pool pool) {
        this.pool = pool;
    }

    public int getDatabase() {
        return this.database;
    }

    public void setDatabase(int database) {
        this.database = database;
    }

    public RedisSlave1ConfigProperties.Sentinel getSentinel() {
        return this.sentinel;
    }

    public void setSentinel(RedisSlave1ConfigProperties.Sentinel sentinel) {
        this.sentinel = sentinel;
    }

    public static class Sentinel {
        private String master;
        private String nodes;

        public Sentinel() {
        }

        public String getMaster() {
            return this.master;
        }

        public void setMaster(String master) {
            this.master = master;
        }

        public String getNodes() {
            return this.nodes;
        }

        public void setNodes(String nodes) {
            this.nodes = nodes;
        }
    }

    public static class Pool {
        private int maxIdle = 8;
        private int minIdle = 0;
        private int maxActive = 8;
        private int maxWait = -1;

        public Pool() {
        }

        public int getMaxIdle() {
            return this.maxIdle;
        }

        public void setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
        }

        public int getMinIdle() {
            return this.minIdle;
        }

        public void setMinIdle(int minIdle) {
            this.minIdle = minIdle;
        }

        public int getMaxActive() {
            return this.maxActive;
        }

        public void setMaxActive(int maxActive) {
            this.maxActive = maxActive;
        }

        public int getMaxWait() {
            return this.maxWait;
        }

        public void setMaxWait(int maxWait) {
            this.maxWait = maxWait;
        }
    }
}
