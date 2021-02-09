package org.xtext.idmGH.mlregDsl.tests;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.idmGH.mlregDsl.mLReg.Model;
import org.xtext.idmGH.mlregDsl.tests.MLRegInjectorProvider;
import org.xtext.idmGH.mlregDsl.tests.RCompiler;

@ExtendWith(InjectionExtension.class)
@InjectWith(MLRegInjectorProvider.class)
@SuppressWarnings("all")
public class MLRegParsingTest_R {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void testLinearReg1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("regression {file: \"datasets/ozone.csv\", testSize: 30, predictiveVariables: {2}, targetVariable: 1, algorithm: SVM, errorType: mean_absolute_error}");
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final RCompiler cmpR = new RCompiler(result);
      cmpR.compileAndRun();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
