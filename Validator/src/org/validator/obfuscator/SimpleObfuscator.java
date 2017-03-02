/**
 * 
 */
package org.validator.obfuscator;

import org.apache.commons.lang3.StringUtils;

/**
 * @author scanady
 *
 */
public class SimpleObfuscator implements Obfuscator {

	public String obfuscate(String value) {
		return StringUtils.left(value,  1) + StringUtils.repeat("*", value.length() - 1);
	}
	
}
