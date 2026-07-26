package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class s95 {
    public ll a;
    public oh2 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public ez3 h;
    public qj1 j;
    public gj8 k;
    public rb4 l;
    public LayoutDirection m;
    public ri8 n;
    public long q;
    public long i = vn3.a;
    public int o = -1;
    public int p = -1;

    public s95(ll llVar, gj8 gj8Var, oh2 oh2Var, int i, boolean z, int i2, int i3, List list) {
        this.a = llVar;
        this.b = oh2Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = gj8Var;
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = j31.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            ez3 ez3Var = this.h;
            gj8 gj8Var = this.k;
            qj1 qj1Var = this.j;
            js3.m(qj1Var);
            ez3 ez3VarQ = s7.q(ez3Var, layoutDirection, gj8Var, qj1Var, this.b);
            this.h = ez3VarQ;
            jA = ez3VarQ.a(this.f, jA);
        }
        int iA = d77.a(b(jA, layoutDirection).e);
        int i4 = h31.i(jA);
        if (iA < i4) {
            iA = i4;
        }
        this.o = i;
        this.p = iA;
        return iA;
    }

    public final q95 b(long j, LayoutDirection layoutDirection) {
        rb4 rb4VarE = e(layoutDirection);
        long jN = s7.n(j, this.d, this.c, rb4VarE.d());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new q95(rb4VarE, jN, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, LayoutDirection layoutDirection) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            ez3 ez3Var = this.h;
            gj8 gj8Var = this.k;
            qj1 qj1Var = this.j;
            js3.m(qj1Var);
            ez3 ez3VarQ = s7.q(ez3Var, layoutDirection, gj8Var, qj1Var, this.b);
            this.h = ez3VarQ;
            j = ez3VarQ.a(this.f, j);
        }
        ri8 ri8Var = this.n;
        if (ri8Var != null) {
            q95 q95Var = ri8Var.b;
            qi8 qi8Var = ri8Var.a;
            if (!q95Var.a.b()) {
                LayoutDirection layoutDirection2 = qi8Var.h;
                long j2 = qi8Var.j;
                if (layoutDirection == layoutDirection2 && (h31.b(j, j2) || (h31.h(j) == h31.h(j2) && h31.j(j) == h31.j(j2) && h31.g(j) >= q95Var.e && !q95Var.c))) {
                    ri8 ri8Var2 = this.n;
                    js3.m(ri8Var2);
                    if (h31.b(j, ri8Var2.a.j)) {
                        return false;
                    }
                    ri8 ri8Var3 = this.n;
                    js3.m(ri8Var3);
                    this.n = f(layoutDirection, j, ri8Var3.b);
                    return true;
                }
            }
        }
        this.n = f(layoutDirection, j, b(j, layoutDirection));
        return true;
    }

    public final void d(qj1 qj1Var) {
        long jA;
        qj1 qj1Var2 = this.j;
        if (qj1Var != null) {
            int i = vn3.b;
            jA = vn3.a(qj1Var.getDensity(), qj1Var.O());
        } else {
            jA = vn3.a;
        }
        if (qj1Var2 == null) {
            this.j = qj1Var;
            this.i = jA;
        } else if (qj1Var == null || this.i != jA) {
            this.j = qj1Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final rb4 e(LayoutDirection layoutDirection) {
        rb4 rb4Var = this.l;
        if (rb4Var == null || layoutDirection != this.m || rb4Var.b()) {
            this.m = layoutDirection;
            ll llVar = this.a;
            gj8 gj8VarL = sy7.l(this.k, layoutDirection);
            qj1 qj1Var = this.j;
            js3.m(qj1Var);
            oh2 oh2Var = this.b;
            List list = this.g;
            if (list == null) {
                list = EmptyList.a;
            }
            rb4Var = new rb4(llVar, gj8VarL, list, qj1Var, oh2Var);
        }
        this.l = rb4Var;
        return rb4Var;
    }

    public final ri8 f(LayoutDirection layoutDirection, long j, q95 q95Var) {
        float fMin = Math.min(q95Var.a.d(), q95Var.d);
        ll llVar = this.a;
        gj8 gj8Var = this.k;
        List list = this.g;
        if (list == null) {
            list = EmptyList.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        qj1 qj1Var = this.j;
        js3.m(qj1Var);
        return new ri8(new qi8(llVar, gj8Var, list, i, z, i2, qj1Var, layoutDirection, this.b, j), q95Var, j31.d(j, (((long) d77.a(fMin)) << 32) | (((long) d77.a(q95Var.e)) & 4294967295L)));
    }

    public final String toString() {
        qi8 qi8Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        ri8 ri8Var = this.n;
        Object h31Var = Ssh2PublicKeyAlgorithmName.NULL;
        sb.append(ri8Var != null ? "<TextLayoutResult>" : Ssh2PublicKeyAlgorithmName.NULL);
        sb.append(", lastDensity=");
        sb.append((Object) vn3.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        ri8 ri8Var2 = this.n;
        if (ri8Var2 != null && (qi8Var = ri8Var2.a) != null) {
            h31Var = new h31(qi8Var.j);
        }
        sb.append(h31Var);
        sb.append(')');
        return sb.toString();
    }
}
