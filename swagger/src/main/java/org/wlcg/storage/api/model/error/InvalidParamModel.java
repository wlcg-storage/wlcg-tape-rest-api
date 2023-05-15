package org.wlcg.storage.api.model.error;

import io.swagger.v3.oas.annotations.media.Schema;

public class InvalidParamModel {
  @Schema(description = "The name of the invalid parameter")
  private String name;
  @Schema(description = "The reason why the parameter is invalid")
  private String reason;
  
  public InvalidParamModel(String name, String reason) {
    this.name = name;
    this.reason = reason;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getReason() {
    return reason;
  }
  
  public void setReason(String reason) {
    this.reason = reason;
  }
  
  
}
