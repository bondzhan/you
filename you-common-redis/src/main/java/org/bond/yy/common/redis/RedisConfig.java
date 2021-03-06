package org.bond.yy.common.redis;

public class RedisConfig {
//	  @Value("${spring.redis.database}")
	  private int database;
//	  @Value("${spring.redis.host}")
	  private String host;
//	  @Value("${spring.redis.port}")
	  private int port;
//	  @Value("${spring.redis.timeout}")
	  private int timeout;
//	  @Value("${spring.redis.password}")
	  private String password;
//	  @Value("${spring.redis.pool.max-idle}")
	  private int maxIdle;
//	  @Value("${spring.redis.pool.min-idle}")
	  private int minIdle;
//	  @Value("${spring.redis.pool.max-wait}")
	  private int maxWaitMillis;
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public int getMaxWaitMillis() {
		return maxWaitMillis;
	}
	public void setMaxWaitMillis(int maxWaitMillis) {
		this.maxWaitMillis = maxWaitMillis;
	}
}
