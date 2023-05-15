package org.wlcg.storage.api.model.fileinfo;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Checksum object")
public class ChecksumModel {
  @Schema(description = "Checksum e.g adler32, md5...")
	private String type;
  @Schema(description = "Checksum value")
	private String value;
	
	public ChecksumModel(String type, String value){
	  this.type = type;
	  this.value = value;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
