package defpackage;

import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final class ls8 extends ct0 {
    public ToggleableState N;

    @Override // androidx.compose.foundation.a
    public final void F0(nn7 nn7Var) {
        f.h(nn7Var, this.N);
        tf tfVar = hy2.f;
        g gVar = d.r;
        ox3[] ox3VarArr = f.a;
        ox3 ox3Var = ox3VarArr[9];
        nn7Var.a(gVar, tfVar);
        gg ggVarE = fz.e(this.N != ToggleableState.c);
        if (ggVarE != null) {
            g gVar2 = d.s;
            ox3 ox3Var2 = ox3VarArr[10];
            nn7Var.a(gVar2, ggVarE);
        }
        f.c(nn7Var, new oq0(nn7Var, 1));
    }
}
