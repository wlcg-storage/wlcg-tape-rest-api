package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class FileStatusModel {

  @Schema(description = "The file path", required = true)
  String path;

  @Schema(description = "The file operation status", required = true)
  FileOperationStatusType status;

  @Schema(
      description = "A description related to the file operation status (e.g., an error message)",
      required = false)
  String description;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FileOperationStatusType getStatus() {
    return status;
  }

  public void setStatus(FileOperationStatusType status) {
    this.status = status;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
