package io.vertx.skeleton.models;

import io.vertx.core.json.JsonObject;

public record RejectedCommand(
  String entityId,
  JsonObject command,
  String commandClass,
  JsonObject error,
  PersistedRecord persistedRecord
) implements RepositoryRecord<RejectedCommand> {
  @Override
  public RejectedCommand with(final PersistedRecord persistedRecord) {
    return new RejectedCommand(entityId, command, commandClass, error, persistedRecord);
  }
}
