package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Error object")
public class ErrorModel {

  private String error;
  private String errorDescription;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

}
