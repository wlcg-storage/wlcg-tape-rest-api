package org.wlcg.storage.api.model.fileinfo;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Contains information about a file")
public class FileInfoModel {
  
  @Schema(description = "path of the file")
	private String path;
  @Schema(description = "true if the file exists, false otherwise")
	private boolean exists;
  @Schema(description = "True if the file is on disk, false otherwise")
	private boolean isOnDisk;
  @Schema(description = "True if the file is on tape, false otherwise")
	private boolean isOnTape;
  @Schema(description = "The checksums of the file")
	private List<ChecksumModel> checksums;
	@Schema(description = "An eventual error that is attached to this file")
  private String error;
	
  
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

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
	
	
}
