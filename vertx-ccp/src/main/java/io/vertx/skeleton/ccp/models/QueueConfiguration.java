package io.vertx.skeleton.ccp.models;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.regex.Pattern;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class QueueConfiguration {

  private Boolean bootstrapQueue = true;
  private Boolean idempotency = false;
  private Integer idempotencyNumberOfDays = 2;
  private String queueName;
  private QueueType queueType = QueueType.PG_QUEUE;
  private Long emptyBackOffInMinutes = 5L;
  private Long throttleInMs = 100L;
  private Integer concurrency = null;
  private Long errorBackOffInMinutes = 5L;
  private Long retryIntervalInMinutes = 5L;
  private Long maxProcessingTimeInMinutes = 5L;
  private Long batchSize = 200L;
  private Integer maxRetry = 5;
  private Long maintenanceEvery = 30L;

  private Integer circuitBreakerMaxFailues = 10;

  public Boolean idempotentProcessors() {
    return idempotency;
  }

  public Integer circuitBreakerMaxFailues() {
    return circuitBreakerMaxFailues;
  }

  public QueueConfiguration setCircuitBreakerMaxFailuer(Integer circuitBreakerMaxFailuer) {
    this.circuitBreakerMaxFailues = circuitBreakerMaxFailuer;
    return this;
  }

  public Boolean bootstrapQueue() {
    return bootstrapQueue;
  }

  public QueueConfiguration setBootstrapQueue(Boolean bootstrapQueue) {
    this.bootstrapQueue = bootstrapQueue;
    return this;
  }

  public Integer concurrency() {
    return concurrency;
  }

  public QueueConfiguration setConcurrency(Integer concurrency) {
    this.concurrency = concurrency;
    return this;
  }

  public Long maintenanceEvery() {
    return maintenanceEvery;
  }

  public QueueConfiguration setMaintenanceEvery(Long maintenanceEvery) {
    this.maintenanceEvery = maintenanceEvery;
    return this;
  }

  public Boolean idempotentProcess() {
    return idempotency;
  }

  public QueueConfiguration setIdempotency(Boolean idempotency) {
    this.idempotency = idempotency;
    return this;
  }

  public Integer idempotencyNumberOfDays() {
    return idempotencyNumberOfDays;
  }

  public QueueConfiguration setIdempotencyNumberOfDays(Integer idempotencyNumberOfDays) {
    this.idempotencyNumberOfDays = idempotencyNumberOfDays;
    return this;
  }

  public String queueName() {
    return queueName;
  }

  public QueueConfiguration setQueueName(String queueName) {
    if (!Pattern.compile("[a-z0-9]+(?:_[a-z0-9]+)*").matcher(queueName).matches()) {
      throw new IllegalArgumentException("Queue name must be in snake_case -> " + queueName);
    }
    this.queueName = queueName;
    return this;
  }

  public QueueType queueType() {
    return queueType;
  }

  public QueueConfiguration setQueueType(QueueType queueType) {
    this.queueType = queueType;
    return this;
  }

  public Long emptyBackOffInMinutes() {
    return emptyBackOffInMinutes;
  }

  public QueueConfiguration setEmptyBackOffInMinutes(Long emptyBackOffInMinutes) {
    this.emptyBackOffInMinutes = emptyBackOffInMinutes;
    return this;
  }

  public Long throttleInMs() {
    return throttleInMs;
  }

  public QueueConfiguration setThrottleInMs(Long throttleInMs) {
    this.throttleInMs = throttleInMs;
    return this;
  }

  public Long errorBackOffInMinutes() {
    return errorBackOffInMinutes;
  }

  public QueueConfiguration setErrorBackOffInMinutes(Long errorBackOffInMinutes) {
    this.errorBackOffInMinutes = errorBackOffInMinutes;
    return this;
  }

  public Long retryIntervalInMinutes() {
    return retryIntervalInMinutes;
  }

  public QueueConfiguration setRetryIntervalInMinutes(Long retryIntervalInMinutes) {
    this.retryIntervalInMinutes = retryIntervalInMinutes;
    return this;
  }

  public Long maxProcessingTimeInMinutes() {
    return maxProcessingTimeInMinutes;
  }

  public QueueConfiguration setMaxProcessingTimeInMinutes(Long maxProcessingTimeInMinutes) {
    this.maxProcessingTimeInMinutes = maxProcessingTimeInMinutes;
    return this;
  }

  public Long batchSize() {
    return batchSize;
  }

  public QueueConfiguration setBatchSize(Long batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  public Integer maxRetry() {
    return maxRetry;
  }

  public QueueConfiguration setMaxRetry(Integer maxRetry) {
    this.maxRetry = maxRetry;
    return this;
  }


}
