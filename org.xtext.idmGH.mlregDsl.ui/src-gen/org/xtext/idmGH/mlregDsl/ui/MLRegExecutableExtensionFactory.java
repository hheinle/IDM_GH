/*
 * generated by Xtext 2.24.0
 */
package org.xtext.idmGH.mlregDsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.idmGH.mlregDsl.ui.internal.MlregDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MLRegExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MlregDslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MlregDslActivator activator = MlregDslActivator.getInstance();
		return activator != null ? activator.getInjector(MlregDslActivator.ORG_XTEXT_IDMGH_MLREGDSL_MLREG) : null;
	}

}
