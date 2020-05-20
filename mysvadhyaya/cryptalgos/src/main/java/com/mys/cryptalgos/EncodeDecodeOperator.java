package com.mys.cryptalgos;

import java.util.Base64;

public class EncodeDecodeOperator {
	
	
	private EncoderOperationMode modeOfOperation;
	private String inputText;
	private String outputText;
	
	public EncodeDecodeOperator( EncoderOperationMode modeOfOperation, String inputText ) {
		this.modeOfOperation = modeOfOperation;
		this.inputText = inputText;
	}
	
	public EncodeDecodeOperator performOperation() {
		if( this.modeOfOperation == EncoderOperationMode.ENCODE )
			doEncoding();
		else
			doDecoding();
		return this;
	}
	
	private void doEncoding() {
		this.outputText = Base64.getEncoder().encodeToString(inputText.getBytes());
	}
	
	private void doDecoding() {
		this.outputText = new String( Base64.getDecoder().decode(this.inputText) );
	}
	
	public String getResult() {
		return this.outputText;
	}
	
	public void changeMode( EncoderOperationMode modeOfOperation ) {
		this.modeOfOperation = modeOfOperation;
	}
	
	public void setInputText( String inputText ) {
		this.inputText = inputText;
	}
	

}