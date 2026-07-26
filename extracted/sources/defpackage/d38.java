package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class d38 {
    public static final c38 Companion = new c38();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ d38(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            wq2.S(i, 63, b38.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d38)) {
            return false;
        }
        d38 d38Var = (d38) obj;
        return js3.i(this.a, d38Var.a) && js3.i(this.b, d38Var.b) && js3.i(this.c, d38Var.c) && js3.i(this.d, d38Var.d) && js3.i(this.e, d38Var.e) && js3.i(this.f, d38Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rm7.k(this.e, rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SpixUserRequestDto(accountId=", this.a, ", uuid=", this.b, ", device=");
        o40.I(this.c, ", manufacturer=", this.d, ", androidApi=", sbT);
        return dw1.p(this.e, ", cpuAbis=", this.f, ")", sbT);
    }

    public d38(String str, String str2, String str3, String str4, String str5, String str6) {
        js3.p(str5, "androidApi");
        js3.p(str6, "cpuAbis");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
