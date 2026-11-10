package com.msprojetos.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Response {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer codigoRetorno;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String msgRetorno;

	public Response() {
	}

}
