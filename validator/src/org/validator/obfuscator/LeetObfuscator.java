/**
 * 
 */
package org.validator.obfuscator;

import org.validator.util.LeetBasic;

/**
 * @author scanady
 *
 */
public class LeetObfuscator implements Obfuscator {

	public String obfuscate(String value) {
		return new LeetBasic().toLeet(value);
	}

}
