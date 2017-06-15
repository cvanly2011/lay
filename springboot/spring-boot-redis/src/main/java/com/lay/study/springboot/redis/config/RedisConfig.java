package com.lay.study.springboot.redis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Create by yalei.chen on 2017/6/15
 */
@Configuration
public class RedisConfig {

    @Bean(name = {"redisMasterProperties"})
    @ConditionalOnMissingBean
    public RedisMasterConfigProperties redisMasterProperties() {
        return new RedisMasterConfigProperties();
    }

    @Autowired
    @Qualifier("redisMasterProperties")
    private RedisMasterConfigProperties masterProperties;

    @Bean
    @Primary
    public RedisConnectionFactory jedisConnectionFactory(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(masterProperties.getPool().getMaxActive());
        poolConfig.setMaxIdle(masterProperties.getPool().getMaxIdle());
        poolConfig.setMaxWaitMillis(masterProperties.getPool().getMaxWait());
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnCreate(true);
        poolConfig.setTestWhileIdle(true);
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
        jedisConnectionFactory.setHostName(masterProperties.getHost());
        if(null != masterProperties.getPassword()){
            jedisConnectionFactory.setPassword(masterProperties.getPassword());
        }
        jedisConnectionFactory.setPort(masterProperties.getPort());

        //其他配置，可再次扩展

        return jedisConnectionFactory;
    }

    @Bean(name="masterRedisTemplate")
    @Primary
    @ConditionalOnMissingBean(
            name = {"masterRedisTemplate"}
    )
    public StringRedisTemplate redisTemplate(){
        StringRedisTemplate redisTemplate = new StringRedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }


    @Bean(name = {"redisSlaveOneProperties"})
    @ConditionalOnMissingBean
    public RedisSlave1ConfigProperties redisSlaveOneProperties() {
        return new RedisSlave1ConfigProperties();
    }

    @Autowired
    @Qualifier("redisSlaveOneProperties")
    private RedisSlave1ConfigProperties slaveOneProperties;

    @Bean(name = "slaveOneFactory")
    public RedisConnectionFactory jedisSlaveOneConnectionFactory(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(slaveOneProperties.getPool().getMaxActive());
        poolConfig.setMaxIdle(slaveOneProperties.getPool().getMaxIdle());
        poolConfig.setMaxWaitMillis(slaveOneProperties.getPool().getMaxWait());
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnCreate(true);
        poolConfig.setTestWhileIdle(true);
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
        jedisConnectionFactory.setHostName(slaveOneProperties.getHost());
        if(null != slaveOneProperties.getPassword()){
            jedisConnectionFactory.setPassword(slaveOneProperties.getPassword());
        }
        jedisConnectionFactory.setPort(slaveOneProperties.getPort());

        //其他配置，可再次扩展

        return jedisConnectionFactory;
    }

    @Bean(name="slaveOneRedisTemplate")
    @ConditionalOnMissingBean(
            name = {"slaveOneRedisTemplate"}
    )
    public StringRedisTemplate redisSlaveOneTemplate(){
        StringRedisTemplate redisTemplate = new StringRedisTemplate();
        redisTemplate.setConnectionFactory(jedisSlaveOneConnectionFactory());
        return redisTemplate;
    }
}
