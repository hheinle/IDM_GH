/*
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.idmGH.mlregDsl.MLRegRuntimeModule;
import org.xtext.idmGH.mlregDsl.MLRegStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MLRegIdeSetup extends MLRegStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MLRegRuntimeModule(), new MLRegIdeModule()));
	}
	
}
