package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class se6 {
    public static final re6 Companion = new re6();
    public static final c24[] g = {null, null, null, null, null, a.b(LazyThreadSafetyMode.b, new js5(5))};
    public final String a;
    public final String b;
    public final String c;
    public final xt7 d;
    public final String e;
    public final List f;

    public /* synthetic */ se6(int i, String str, String str2, String str3, xt7 xt7Var, String str4, List list) {
        if (63 != (i & 63)) {
            wq2.S(i, 63, qe6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xt7Var;
        this.e = str4;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se6)) {
            return false;
        }
        se6 se6Var = (se6) obj;
        return js3.i(this.a, se6Var.a) && js3.i(this.b, se6Var.b) && js3.i(this.c, se6Var.c) && js3.i(this.d, se6Var.d) && js3.i(this.e, se6Var.e) && js3.i(this.f, se6Var.f);
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31);
        xt7 xt7Var = this.d;
        return this.f.hashCode() + rm7.k(this.e, (iK + (xt7Var == null ? 0 : xt7Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("PlayerMovieSeasonsDto(id=", this.a, ", title=", this.b, ", posterUrl=");
        sbT.append(this.c);
        sbT.append(", shareModel=");
        sbT.append(this.d);
        sbT.append(", type=");
        sbT.append(this.e);
        sbT.append(", seasons=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
