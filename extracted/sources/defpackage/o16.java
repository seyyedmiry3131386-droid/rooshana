package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class o16 {
    public String a;
    public gj8 b;
    public oh2 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public qj1 i;
    public yg j;
    public boolean k;
    public long l;
    public ez3 m;
    public n16 n;
    public LayoutDirection o;
    public long s;
    public long h = vn3.a;
    public long p = j31.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public o16(String str, gj8 gj8Var, oh2 oh2Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = gj8Var;
        this.c = oh2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
    }

    public static long f(o16 o16Var, long j, LayoutDirection layoutDirection) {
        gj8 gj8Var = o16Var.b;
        ez3 ez3Var = o16Var.m;
        qj1 qj1Var = o16Var.i;
        js3.m(qj1Var);
        ez3 ez3VarQ = s7.q(ez3Var, layoutDirection, gj8Var, qj1Var, o16Var.c);
        o16Var.m = ez3VarQ;
        return ez3VarQ.a(o16Var.g, j);
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = j31.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, layoutDirection);
        }
        n16 n16VarE = e(layoutDirection);
        long jN = s7.n(jA, this.e, this.d, n16VarE.d());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iA = d77.a(new yg((ch) n16VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jN).b());
        int i6 = h31.i(jA);
        if (iA < i6) {
            iA = i6;
        }
        this.q = i;
        this.r = iA;
        return iA;
    }

    public final boolean b(long j, LayoutDirection layoutDirection) {
        n16 n16Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, layoutDirection) : j;
        yg ygVar = this.j;
        boolean z2 = false;
        if (ygVar != null && (n16Var = this.n) != null && !n16Var.b() && layoutDirection == this.o && (h31.b(jF, this.p) || (h31.h(jF) == h31.h(this.p) && h31.j(jF) == h31.j(this.p) && h31.g(jF) >= ygVar.b() && !ygVar.d.d))) {
            if (!h31.b(jF, this.p)) {
                yg ygVar2 = this.j;
                js3.m(ygVar2);
                this.l = j31.d(jF, (((long) d77.a(Math.min(ygVar2.a.i.c(), ygVar2.d()))) << 32) | (((long) d77.a(ygVar2.b())) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= ygVar2.d() && ((int) (4294967295L & r12)) >= ygVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        n16 n16VarE = e(layoutDirection);
        long jN = s7.n(jF, this.e, this.d, n16VarE.d());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        yg ygVar3 = new yg((ch) n16VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jN);
        this.p = jF;
        this.l = j31.d(jF, (((long) d77.a(ygVar3.b())) & 4294967295L) | (((long) d77.a(ygVar3.d())) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < ygVar3.d() || ((int) (r1 & 4294967295L)) < ygVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = ygVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = j31.h(0, 0, 0, 0);
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void d(qj1 qj1Var) {
        long jA;
        qj1 qj1Var2 = this.i;
        if (qj1Var != null) {
            int i = vn3.b;
            jA = vn3.a(qj1Var.getDensity(), qj1Var.O());
        } else {
            jA = vn3.a;
        }
        if (qj1Var2 == null) {
            this.i = qj1Var;
            this.h = jA;
        } else if (qj1Var == null || this.h != jA) {
            this.i = qj1Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final n16 e(LayoutDirection layoutDirection) {
        n16 chVar = this.n;
        if (chVar == null || layoutDirection != this.o || chVar.b()) {
            this.o = layoutDirection;
            String str = this.a;
            gj8 gj8VarL = sy7.l(this.b, layoutDirection);
            EmptyList emptyList = EmptyList.a;
            qj1 qj1Var = this.i;
            js3.m(qj1Var);
            chVar = new ch(str, gj8VarL, emptyList, emptyList, this.c, qj1Var);
        }
        this.n = chVar;
        return chVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : Ssh2PublicKeyAlgorithmName.NULL);
        sb.append(", lastDensity=");
        sb.append((Object) vn3.b(this.h));
        sb.append(", history=");
        return bl4.s(this.s, ", constraints=$)", sb);
    }
}
