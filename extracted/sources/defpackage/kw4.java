package defpackage;

import android.content.Context;
import androidx.compose.runtime.g;
import androidx.compose.ui.platform.AbstractComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class kw4 extends AbstractComposeView {
    public final wb5 i;
    public boolean j;

    public kw4(Context context) {
        super(context, null, 6, 0);
        this.i = g.h(wy0.a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(int i, qz0 qz0Var) {
        qz0Var.c0(576708319);
        int i2 = (qz0Var.h(this) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            ((qp2) ((s08) this.i).getValue()).invoke(qz0Var, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new g8(i, 11, this);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.j;
    }
}
