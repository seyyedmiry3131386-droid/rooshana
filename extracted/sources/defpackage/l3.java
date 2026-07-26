package defpackage;

import androidx.compose.ui.semantics.c;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends y {
    public static l3 e;
    public static final ResolvedTextDirection f = ResolvedTextDirection.b;
    public static final ResolvedTextDirection g = ResolvedTextDirection.a;
    public ri8 c;
    public c d;

    public final int G(int i, ResolvedTextDirection resolvedTextDirection) {
        ri8 ri8Var = this.c;
        if (ri8Var == null) {
            js3.V("layoutResult");
            throw null;
        }
        int iF = ri8Var.f(i);
        ri8 ri8Var2 = this.c;
        if (ri8Var2 == null) {
            js3.V("layoutResult");
            throw null;
        }
        if (resolvedTextDirection != ri8Var2.g(iF)) {
            ri8 ri8Var3 = this.c;
            if (ri8Var3 != null) {
                return ri8Var3.f(i);
            }
            js3.V("layoutResult");
            throw null;
        }
        if (this.c != null) {
            return r6.b.c(i, false) - 1;
        }
        js3.V("layoutResult");
        throw null;
    }

    @Override // defpackage.y
    public final int[] g(int i) {
        int iE;
        if (o().length() <= 0 || i >= o().length()) {
            return null;
        }
        try {
            c cVar = this.d;
            if (cVar == null) {
                js3.V("node");
                throw null;
            }
            sy6 sy6VarG = cVar.g();
            int iRound = Math.round(sy6VarG.d - sy6VarG.b);
            if (i <= 0) {
                i = 0;
            }
            ri8 ri8Var = this.c;
            if (ri8Var == null) {
                js3.V("layoutResult");
                throw null;
            }
            int iD = ri8Var.b.d(i);
            ri8 ri8Var2 = this.c;
            if (ri8Var2 == null) {
                js3.V("layoutResult");
                throw null;
            }
            float f2 = ri8Var2.b.f(iD) + iRound;
            ri8 ri8Var3 = this.c;
            if (ri8Var3 == null) {
                js3.V("layoutResult");
                throw null;
            }
            if (ri8Var3 == null) {
                js3.V("layoutResult");
                throw null;
            }
            if (f2 < ri8Var3.b.f(r0.f - 1)) {
                ri8 ri8Var4 = this.c;
                if (ri8Var4 == null) {
                    js3.V("layoutResult");
                    throw null;
                }
                iE = ri8Var4.b.e(f2);
            } else {
                ri8 ri8Var5 = this.c;
                if (ri8Var5 == null) {
                    js3.V("layoutResult");
                    throw null;
                }
                iE = ri8Var5.b.f;
            }
            return k(i, G(iE - 1, g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.y
    public final int[] w(int i) {
        int iE;
        if (o().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            c cVar = this.d;
            if (cVar == null) {
                js3.V("node");
                throw null;
            }
            sy6 sy6VarG = cVar.g();
            int iRound = Math.round(sy6VarG.d - sy6VarG.b);
            int length = o().length();
            if (length <= i) {
                i = length;
            }
            ri8 ri8Var = this.c;
            if (ri8Var == null) {
                js3.V("layoutResult");
                throw null;
            }
            int iD = ri8Var.b.d(i);
            ri8 ri8Var2 = this.c;
            if (ri8Var2 == null) {
                js3.V("layoutResult");
                throw null;
            }
            float f2 = ri8Var2.b.f(iD) - iRound;
            if (f2 > 0.0f) {
                ri8 ri8Var3 = this.c;
                if (ri8Var3 == null) {
                    js3.V("layoutResult");
                    throw null;
                }
                iE = ri8Var3.b.e(f2);
            } else {
                iE = 0;
            }
            if (i == o().length() && iE < iD) {
                iE++;
            }
            return k(G(iE, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
