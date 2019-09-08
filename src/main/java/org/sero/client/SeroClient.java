package org.sero.client;

import com.sun.jna.Library;
import com.sun.jna.Native;

import io.github.novacrypto.base58.Base58;

public class SeroClient {
	public interface Clibrary extends Library {
		Clibrary INSTANTCE = (Clibrary) Native.load("czero", Clibrary.class);

		void zero_init_no_circuit();

		byte zero_pkr_valid(byte[] pkr);

		byte zero_pk_valid(byte[] pk);
	}

	static {
		Clibrary.INSTANTCE.zero_init_no_circuit();
	}

	public static boolean pkrValid(String base58) {
		byte flag = Clibrary.INSTANTCE.zero_pkr_valid(Base58.base58Decode(base58));
		return (int) flag == 0;
	}

	public static boolean pkValid(String base58) {
		byte flag = Clibrary.INSTANTCE.zero_pk_valid(Base58.base58Decode(base58));
		return (int) flag == 0;
	}

}
