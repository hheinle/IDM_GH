/*
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MLRegAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/idmGH/mlregDsl/parser/antlr/internal/InternalMLReg.tokens");
	}
}
