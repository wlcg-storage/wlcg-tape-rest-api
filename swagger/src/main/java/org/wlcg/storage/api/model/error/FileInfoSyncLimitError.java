package org.wlcg.storage.api.model.error;

import io.swagger.v3.oas.annotations.media.Schema;

public class FileInfoSyncLimitError extends ErrorModel {
  
  @Schema(description = "The maximum number of request the user should not exceed for asynchronous FILEINFO call")
  private int maxRequestsForSyncFileInfo;
  
  FileInfoSyncLimitError(String type, String title, int status, String detail,int maxRequestsForSyncFileInfo){
    super(type,title,status,detail);
    this.maxRequestsForSyncFileInfo = maxRequestsForSyncFileInfo;
  }

  public int getMaxRequestsForSyncFileInfo() {
    return maxRequestsForSyncFileInfo;
  }

  public void setMaxRequestsForSyncFileInfo(int maxRequestsForSyncFileInfo) {
    this.maxRequestsForSyncFileInfo = maxRequestsForSyncFileInfo;
  }
}
