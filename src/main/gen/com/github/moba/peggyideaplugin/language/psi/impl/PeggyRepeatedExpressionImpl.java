// This is a generated file. Not intended for manual editing.
package com.github.moba.peggyideaplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.moba.peggyideaplugin.language.psi.PeggyTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.moba.peggyideaplugin.language.psi.*;

public class PeggyRepeatedExpressionImpl extends ASTWrapperPsiElement implements PeggyRepeatedExpression {

  public PeggyRepeatedExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PeggyVisitor visitor) {
    visitor.visitRepeatedExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PeggyVisitor) accept((PeggyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PeggyBoundaries getBoundaries() {
    return findNotNullChildByClass(PeggyBoundaries.class);
  }

  @Override
  @NotNull
  public List<PeggyExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PeggyExpression.class);
  }

  @Override
  @Nullable
  public PeggyLiteralMatcher getLiteralMatcher() {
    return findChildByClass(PeggyLiteralMatcher.class);
  }

  @Override
  @Nullable
  public PeggyRuleReferenceExpression getRuleReferenceExpression() {
    return findChildByClass(PeggyRuleReferenceExpression.class);
  }

  @Override
  @Nullable
  public PeggySemanticPredicateExpression getSemanticPredicateExpression() {
    return findChildByClass(PeggySemanticPredicateExpression.class);
  }

}