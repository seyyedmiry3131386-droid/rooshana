package defpackage;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends y {
    public static k3 d;
    public static final ResolvedTextDirection e = ResolvedTextDirection.b;
    public static final ResolvedTextDirection f = ResolvedTextDirection.a;
    public ri8 c;

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
        int iD;
        if (o().length() <= 0 || i >= o().length()) {
            return null;
        }
        ResolvedTextDirection resolvedTextDirection = e;
        if (i < 0) {
            ri8 ri8Var = this.c;
            if (ri8Var == null) {
                js3.V("layoutResult");
                throw null;
            }
            iD = ri8Var.b.d(0);
        } else {
            ri8 ri8Var2 = this.c;
            if (ri8Var2 == null) {
                js3.V("layoutResult");
                throw null;
            }
            int iD2 = ri8Var2.b.d(i);
            iD = G(iD2, resolvedTextDirection) == i ? iD2 : iD2 + 1;
        }
        ri8 ri8Var3 = this.c;
        if (ri8Var3 == null) {
            js3.V("layoutResult");
            throw null;
        }
        if (iD >= ri8Var3.b.f) {
            return null;
        }
        return k(G(iD, resolvedTextDirection), G(iD, f) + 1);
    }

    @Override // defpackage.y
    public final int[] w(int i) {
        int iD;
        if (o().length() <= 0 || i <= 0) {
            return null;
        }
        int length = o().length();
        ResolvedTextDirection resolvedTextDirection = f;
        if (i > length) {
            ri8 ri8Var = this.c;
            if (ri8Var == null) {
                js3.V("layoutResult");
                throw null;
            }
            iD = ri8Var.b.d(o().length());
        } else {
            ri8 ri8Var2 = this.c;
            if (ri8Var2 == null) {
                js3.V("layoutResult");
                throw null;
            }
            int iD2 = ri8Var2.b.d(i);
            iD = G(iD2, resolvedTextDirection) + 1 == i ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return k(G(iD, e), G(iD, resolvedTextDirection) + 1);
    }
}
