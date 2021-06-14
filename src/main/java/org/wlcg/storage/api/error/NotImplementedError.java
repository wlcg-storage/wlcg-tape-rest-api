package org.wlcg.storage.api.error;

public class NotImplementedError extends ApiError {

  public static final String MSG = "This method is not implemented yet!";

  private static final long serialVersionUID = 1L;

  public NotImplementedError() {
    super(MSG);
  }

}
