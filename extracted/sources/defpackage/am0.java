package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class am0 implements a38 {
    public static final zl0 Companion = new zl0();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final kv3 g;

    public am0(int i, String str, String str2, int i2, int i3, String str3, String str4) {
        if (63 != (i & 63)) {
            wq2.S(i, 63, yl0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = str3;
        this.f = str4;
        tv3 tv3Var = cv3.a;
        tv3Var.getClass();
        this.g = tv3Var.b(ct2.n(Companion.serializer()), this);
    }

    @Override // defpackage.a38
    public final String a() {
        return "callbackData";
    }

    @Override // defpackage.a38
    public final String b() {
        return "callback";
    }

    @Override // defpackage.a38
    public final kv3 c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am0)) {
            return false;
        }
        am0 am0Var = (am0) obj;
        return js3.i(this.a, am0Var.a) && js3.i(this.b, am0Var.b) && this.c == am0Var.c && this.d == am0Var.d && js3.i(this.e, am0Var.e) && js3.i(this.f, am0Var.f);
    }

    public final int hashCode() {
        int iK = (((rm7.k(this.b, this.a.hashCode() * 31, 31) + this.c) * 31) + this.d) * 31;
        String str = this.e;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("CallbackUrlSpixRequestData(type=", this.a, ", url=", this.b, ", retryCount=");
        o40.J(sbT, this.c, ", httpStatus=", this.d, ", host=");
        return dw1.p(this.e, ", ip=", this.f, ")", sbT);
    }

    public am0(String str, String str2, int i, int i2, String str3, String str4) {
        js3.p(str, "type");
        js3.p(str2, "url");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        tv3 tv3Var = cv3.a;
        tv3Var.getClass();
        this.g = tv3Var.b(ct2.n(Companion.serializer()), this);
    }
}
