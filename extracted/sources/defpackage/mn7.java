package defpackage;

import androidx.compose.ui.autofill.a;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final class mn7 {
    public final h a;
    public final g12 b;
    public final pq3 c;
    public final mb5 d = new mb5(2);

    public mn7(h hVar, g12 g12Var, ya5 ya5Var) {
        this.a = hVar;
        this.b = g12Var;
        this.c = ya5Var;
    }

    public final c a() {
        return new c(this.b, false, this.a, new en7());
    }

    public final void b(h hVar, en7 en7Var) {
        ll llVar;
        ll llVar2;
        mb5 mb5Var = this.d;
        Object[] objArr = mb5Var.a;
        int i = mb5Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            a aVar = (a) ((gn7) objArr[i2]);
            za5 za5Var = aVar.h;
            AndroidComposeView androidComposeView = aVar.c;
            k30 k30Var = aVar.a;
            en7 en7VarH = hVar.H();
            int i3 = hVar.b;
            String str = (en7Var == null || (llVar2 = (ll) b.a(en7Var, d.E)) == null) ? null : llVar2.b;
            String str2 = (en7VarH == null || (llVar = (ll) b.a(en7VarH, d.E)) == null) ? null : llVar.b;
            if (str != str2) {
                if (str == null) {
                    k30Var.h(androidComposeView, i3, true);
                } else if (str2 == null) {
                    k30Var.h(androidComposeView, i3, false);
                } else if (js3.i((tf) b.a(en7VarH, d.r), hy2.e)) {
                    k30Var.e(androidComposeView, i3, f30.a(str2));
                }
            }
            ToggleableState toggleableState = en7Var != null ? (ToggleableState) b.a(en7Var, d.J) : null;
            ToggleableState toggleableState2 = en7VarH != null ? (ToggleableState) b.a(en7VarH, d.J) : null;
            if (toggleableState != toggleableState2) {
                if (toggleableState == null) {
                    k30Var.h(androidComposeView, i3, true);
                } else if (toggleableState2 == null) {
                    k30Var.h(androidComposeView, i3, false);
                } else if (js3.i((tf) b.a(en7VarH, d.r), hy2.f)) {
                    int iOrdinal = toggleableState2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        k30Var.e(androidComposeView, i3, f30.b(bool.booleanValue()));
                    }
                }
            }
            gc2 gc2Var = en7Var != null ? (gc2) b.a(en7Var, d.s) : null;
            gc2 gc2Var2 = en7VarH != null ? (gc2) b.a(en7VarH, d.s) : null;
            if (!js3.i(gc2Var, gc2Var2)) {
                if (gc2Var == null) {
                    k30Var.h(androidComposeView, i3, true);
                } else if (gc2Var2 == null) {
                    k30Var.h(androidComposeView, i3, false);
                } else {
                    k30Var.e(androidComposeView, i3, ((gg) gc2Var2).a);
                }
            }
            boolean z = en7Var != null && en7Var.a.b(d.q);
            boolean z2 = en7VarH != null && en7VarH.a.b(d.q);
            if (z != z2) {
                if (z2) {
                    za5Var.a(i3);
                } else {
                    za5Var.e(i3);
                }
            }
        }
    }
}
