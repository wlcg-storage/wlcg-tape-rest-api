package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class BulkRequestOptionsModel {

  @Schema(description = "Cancel the request on the first failure", required = false,
      defaultValue = "false")
  boolean cancelOnFirstFailure = false;

  @Schema(description = "Clears the request automagically on success", required = false,
      defaultValue = "false")
  boolean clearOnSuccess = false;

  @Schema(description = "Clears the request automagically on failure", required = false,
      defaultValue = "false")
  boolean clearOnFailure = false;

  @Schema(
      description = "Delays the clear operation by this amount of seconds. This option has meaning only when used in combination with clearOnSucess or clearOnFailure",
      required = false, defaultValue = "300")
  int delayClearBySecs;

  public boolean isCancelOnFirstFailure() {
    return cancelOnFirstFailure;
  }

  public void setCancelOnFirstFailure(boolean cancelOnFirstFailure) {
    this.cancelOnFirstFailure = cancelOnFirstFailure;
  }

  public boolean isClearOnSuccess() {
    return clearOnSuccess;
  }

  public void setClearOnSuccess(boolean clearOnSuccess) {
    this.clearOnSuccess = clearOnSuccess;
  }

  public boolean isClearOnFailure() {
    return clearOnFailure;
  }

  public void setClearOnFailure(boolean clearOnFailure) {
    this.clearOnFailure = clearOnFailure;
  }

  public int getDelayClearBySecs() {
    return delayClearBySecs;
  }

  public void setDelayClearBySecs(int delayClearBySecs) {
    this.delayClearBySecs = delayClearBySecs;
  }

}
