package com.mys.cryptalgos;

import javax.crypto.Mac;

public interface CryptMac {
	
	public String getType();
	
	public Mac createMac();

}
