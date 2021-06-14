package org.wlcg.storage.api.model;

public class FileStatusModel {

  String path;

  FileOperationStatusType status;

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
