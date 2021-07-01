package com.rabbitmq.client.impl.recovery;

@FunctionalInterface
public interface RecoveredQueueNameSupplier {

    String getNameToUseForRecovery(final RecordedQueue recordedQueue);
}