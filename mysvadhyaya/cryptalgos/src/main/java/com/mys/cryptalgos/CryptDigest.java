package com.mys.cryptalgos;

import java.security.MessageDigest;

public interface CryptDigest {
	
	public String getType();
	
	public MessageDigest createDigest();

}
