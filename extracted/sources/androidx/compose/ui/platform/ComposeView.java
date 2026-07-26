package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.hs9;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s08;
import defpackage.tx8;
import defpackage.wb5;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {
    public final wb5 i;
    public boolean j;

    public ComposeView(Context context) {
        this(context, null, 6, 0);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(final int i, qz0 qz0Var) {
        qz0Var.c0(420213850);
        int i2 = (qz0Var.h(this) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            qp2 qp2Var = (qp2) ((s08) this.i).getValue();
            if (qp2Var == null) {
                qz0Var.a0(-1238823553);
            } else {
                qz0Var.a0(98585282);
                qp2Var.invoke(qz0Var, 0);
            }
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(i) { // from class: androidx.compose.ui.platform.ComposeView$Content$1
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(1);
                    this.g.a(iW, (qz0) obj);
                    return tx8.a;
                }
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.j;
    }

    public final void setContent(qp2 qp2Var) {
        this.j = true;
        ((s08) this.i).setValue(qp2Var);
        if (isAttachedToWindow()) {
            c();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = androidx.compose.runtime.g.h(null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
