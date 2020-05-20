package com.mys.cryptalgos;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncodeDecodeOperatorTest {

	@Test
	public void shouldAnswerWithTrue() {
		String plainText = "This is Aparna!";
		EncodeDecodeOperator edop = new EncodeDecodeOperator( EncoderOperationMode.ENCODE, plainText );
		String encodedText = edop.performOperation().getResult();
		edop.changeMode(EncoderOperationMode.DECODE);
		edop.setInputText(encodedText);
		String decodedText = edop.performOperation().getResult();
		System.out.println("plainText=>"+plainText);
		System.out.println("encodedText=>"+encodedText);
		System.out.println("decodedText=>"+decodedText);
		assertTrue( plainText.equals(decodedText) );
	}

}
