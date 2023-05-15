package org.wlcg.storage.api.error;

public class NotFoundError extends ApiError {

  private static final long serialVersionUID = 1L;

  public NotFoundError(String message) {
    super(message);
  }
}
