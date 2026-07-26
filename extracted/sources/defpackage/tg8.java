package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tg8 {
    public final ll a;
    public final gj8 b;
    public final boolean e;
    public final qj1 g;
    public final oh2 h;
    public final List i;
    public rb4 j;
    public LayoutDirection k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;

    public tg8(ll llVar, gj8 gj8Var, boolean z, qj1 qj1Var, oh2 oh2Var, List list) {
        this.a = llVar;
        this.b = gj8Var;
        this.e = z;
        this.g = qj1Var;
        this.h = oh2Var;
        this.i = list;
    }

    public final void a(LayoutDirection layoutDirection) {
        rb4 rb4Var = this.j;
        if (rb4Var == null || layoutDirection != this.k || rb4Var.b()) {
            this.k = layoutDirection;
            rb4Var = new rb4(this.a, sy7.l(this.b, layoutDirection), this.i, this.g, this.h);
        }
        this.j = rb4Var;
    }
}
