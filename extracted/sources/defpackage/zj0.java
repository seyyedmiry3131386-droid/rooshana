package defpackage;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class zj0 extends j77 {
    public final hp1 b;
    public final String c;
    public final String d;
    public final tv6 e;

    public zj0(hp1 hp1Var, String str, String str2) {
        this.b = hp1Var;
        this.c = str;
        this.d = str2;
        this.e = rf0.j(new gc0((t18) hp1Var.c.get(1), this));
    }

    @Override // defpackage.j77
    public final long d() {
        String str = this.d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = gh9.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.j77
    public final ph0 d1() {
        return this.e;
    }

    @Override // defpackage.j77
    public final dt4 g() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        Regex regex = dt4.e;
        try {
            return ok4.A(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
