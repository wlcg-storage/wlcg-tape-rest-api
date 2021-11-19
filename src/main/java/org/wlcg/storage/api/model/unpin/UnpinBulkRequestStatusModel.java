package org.wlcg.storage.api.model.unpin;

import java.util.ArrayList;
import java.util.List;

import org.wlcg.storage.api.model.BulkRequestStatusModel;

import io.swagger.v3.oas.annotations.media.Schema;

public class UnpinBulkRequestStatusModel extends BulkRequestStatusModel {
  @Schema(description = "The submitted request")
  private UnpinBulkRequestModel request;
  @Schema(description = "The list of unpinned files")
  private List<String> unpinnedFiles;
  @Schema(description = "The list of the files that have not been unpinned")
  private List<String> nonUnpinnedFiles;

  public UnpinBulkRequestStatusModel() {
    this.request = new UnpinBulkRequestModel();
    this.unpinnedFiles = new ArrayList<String>();
    this.nonUnpinnedFiles = new ArrayList<String>();
  }
  
  public UnpinBulkRequestModel getRequest() {
    return request;
  }
  public void setRequest(UnpinBulkRequestModel request) {
    this.request = request;
  }
  public void addUnpinnedFile(String path) {
    this.unpinnedFiles.add(path);
  }
  public List<String> getUnpinnedFiles() {
    return unpinnedFiles;
  }
  public void setUnpinnedFiles(List<String> unpinnedFiles) {
    this.unpinnedFiles = unpinnedFiles;
  }
  public void addNonUnpinnedFile(String path) {
    this.nonUnpinnedFiles.add(path);
  }
  public List<String> getNonUnpinnedFiles() {
    return nonUnpinnedFiles;
  }
  public void setNonUnpinnedFiles(List<String> nonUnpinnedFiles) {
    this.nonUnpinnedFiles = nonUnpinnedFiles;
  }
  
  
}
