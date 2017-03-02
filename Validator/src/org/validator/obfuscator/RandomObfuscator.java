/**
 * 
 */
package org.validator.obfuscator;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author scanady
 *
 */
public class RandomObfuscator implements Obfuscator {

	public String obfuscate(String value) {
		return RandomStringUtils.randomAscii(value.length());
	}
	
}
