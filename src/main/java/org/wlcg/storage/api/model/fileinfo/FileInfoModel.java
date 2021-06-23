package org.wlcg.storage.api.model.fileinfo;

import java.util.ArrayList;
import java.util.List;

public class FileInfoModel {
	
	private String path;
	private boolean exists;
	private boolean isOnDisk;
	private boolean isOnTape;
	private List<ChecksumModel> checksums;
	
	public FileInfoModel() {
	  this.checksums = new ArrayList<ChecksumModel>();
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isExists() {
		return exists;
	}
	public void setExists(boolean exists) {
		this.exists = exists;
	}
	public boolean isOnDisk() {
		return isOnDisk;
	}
	public void setOnDisk(boolean isOnDisk) {
		this.isOnDisk = isOnDisk;
	}
	public boolean isOnTape() {
		return isOnTape;
	}
	public void setOnTape(boolean isOnTape) {
		this.isOnTape = isOnTape;
	}
	public List<ChecksumModel> getChecksums() {
		return checksums;
	}
	public void setChecksums(List<ChecksumModel> checksums) {
		this.checksums = checksums;
	}
}
