package org.wlcg.storage.api.model.fileinfo;

import java.util.ArrayList;
import java.util.List;

import org.wlcg.storage.api.model.BulkRequestStatusModel;

public class FileInfoBulkRequestStatusModel extends BulkRequestStatusModel {
	
	private List<FileInfoModel> fileInformation;
	
	
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
}
