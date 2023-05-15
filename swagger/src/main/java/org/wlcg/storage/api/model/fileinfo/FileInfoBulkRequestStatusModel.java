package org.wlcg.storage.api.model.fileinfo;

import java.util.ArrayList;
import java.util.List;

import org.wlcg.storage.api.model.BulkRequestStatusModel;

import io.swagger.v3.oas.annotations.media.Schema;

public class FileInfoBulkRequestStatusModel extends BulkRequestStatusModel {
	
  @Schema(description = "List of file informations")
	private List<FileInfoModel> fileInformation;
	
  @Schema(description = "The submitted request")
  private FileInfoBulkRequestModel request;
	
	public FileInfoBulkRequestStatusModel() {
		super();
		this.fileInformation = new ArrayList<FileInfoModel>();
	}

	public List<FileInfoModel> getFileInformation() {
		return fileInformation;
	}

	public void setFileInformation(List<FileInfoModel> fileInformation) {
		this.fileInformation = fileInformation;
	}

  public FileInfoBulkRequestModel getRequest() {
    return request;
  }

  public void setRequest(FileInfoBulkRequestModel request) {
    this.request = request;
  }	
	
}
