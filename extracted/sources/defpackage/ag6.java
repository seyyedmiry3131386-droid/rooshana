package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ag6 implements a38 {
    public static final zf6 Companion = new zf6();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final kv3 j;

    public ag6(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, int i3, String str7) {
        if (511 != (i & 511)) {
            wq2.S(i, 511, yf6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = str5;
        this.g = str6;
        this.h = i3;
        this.i = str7;
        tv3 tv3Var = cv3.a;
        tv3Var.getClass();
        this.j = tv3Var.b(ct2.n(Companion.serializer()), this);
    }

    @Override // defpackage.a38
    public final String a() {
        return "playerData";
    }

    @Override // defpackage.a38
    public final String b() {
        return "player";
    }

    @Override // defpackage.a38
    public final kv3 c() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag6)) {
            return false;
        }
        ag6 ag6Var = (ag6) obj;
        return js3.i(this.a, ag6Var.a) && js3.i(this.b, ag6Var.b) && js3.i(this.c, ag6Var.c) && js3.i(this.d, ag6Var.d) && this.e == ag6Var.e && js3.i(this.f, ag6Var.f) && js3.i(this.g, ag6Var.g) && this.h == ag6Var.h && js3.i(this.i, ag6Var.i);
    }

    public final int hashCode() {
        int iK = (rm7.k(this.g, rm7.k(this.f, (rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31) + this.e) * 31, 31), 31) + this.h) * 31;
        String str = this.i;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("PlayerSpixRequestData(movieId=", this.a, ", playId=", this.b, ", mainUri=");
        o40.I(this.c, ", playerType=", this.d, ", position=", sbT);
        sbT.append(this.e);
        sbT.append(", errorType=");
        sbT.append(this.f);
        sbT.append(", uri=");
        sbT.append(this.g);
        sbT.append(", httpStatus=");
        sbT.append(this.h);
        sbT.append(", message=");
        return dw1.s(sbT, this.i, ")");
    }

    public ag6(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7) {
        js3.p(str, "movieId");
        js3.p(str2, "playId");
        js3.p(str3, "mainUri");
        js3.p(str4, "playerType");
        js3.p(str6, "uri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = i2;
        this.i = str7;
        tv3 tv3Var = cv3.a;
        tv3Var.getClass();
        this.j = tv3Var.b(ct2.n(Companion.serializer()), this);
    }
}
