package org.wlcg.storage.api.error;

public class ApiError extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ApiError(String message) {
    super(message);
  }

  public ApiError(String message, Throwable cause) {
    super(message, cause);
  }

}
