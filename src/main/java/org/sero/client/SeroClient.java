package org.sero.client;

import com.sun.jna.Library;
import com.sun.jna.Native;

import io.github.novacrypto.base58.Base58;

public class SeroClient {

	private static Clibrary INSTANTCE;

	public interface Clibrary extends Library {
		void zero_init_no_circuit();

		byte zero_pkr_valid(byte[] pkr);

		byte zero_pk_valid(byte[] pk);
	}

	static {
		String libpath = System.getProperty("libpath");
		INSTANTCE = (Clibrary) Native.load(libpath, Clibrary.class);
		INSTANTCE.zero_init_no_circuit();
	}

	public static boolean pkrValid(String base58) {
		byte flag = INSTANTCE.zero_pkr_valid(Base58.base58Decode(base58));
		return (int) flag == 0;
	}

	public static boolean pkValid(String base58) {
		byte flag = INSTANTCE.zero_pk_valid(Base58.base58Decode(base58));
		return (int) flag == 0;
	}

}
