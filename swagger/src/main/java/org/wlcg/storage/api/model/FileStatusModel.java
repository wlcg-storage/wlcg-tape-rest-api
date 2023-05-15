package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class FileStatusModel {

  @Schema(description = "The file path", required = true)
  String path;

  @Schema(
      description = "A description related to the file operation status (e.g., an error message)",
      required = false)
  String reason;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

}
