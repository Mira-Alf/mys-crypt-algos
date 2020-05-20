package com.mys.cryptalgos;

import javax.crypto.Cipher;

public interface CryptCipher {
	
	public String getType();
	
	public Cipher createCipher();

}
