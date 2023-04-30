// This is a generated file. Not intended for manual editing.
package com.github.moba.peggyideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PeggyExpression extends PsiElement {

  @NotNull
  List<PeggyCodeBlock> getCodeBlockList();

  @NotNull
  List<PeggyExpression> getExpressionList();

  @NotNull
  List<PeggyLabelColon> getLabelColonList();

  @NotNull
  List<PeggyLiteralMatcher> getLiteralMatcherList();

  @NotNull
  List<PeggyPluck> getPluckList();

  @NotNull
  List<PeggyPrefixedOperator> getPrefixedOperatorList();

  @NotNull
  List<PeggyRepeatedExpression> getRepeatedExpressionList();

  @NotNull
  List<PeggyRuleReferenceExpression> getRuleReferenceExpressionList();

  @NotNull
  List<PeggySemanticPredicateExpression> getSemanticPredicateExpressionList();

  @NotNull
  List<PeggySuffixedOperator> getSuffixedOperatorList();

}
