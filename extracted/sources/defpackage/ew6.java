package defpackage;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class ew6 extends j77 {
    public final String b;
    public final long c;
    public final tv6 d;

    public ew6(String str, long j, tv6 tv6Var) {
        this.b = str;
        this.c = j;
        this.d = tv6Var;
    }

    @Override // defpackage.j77
    public final long d() {
        return this.c;
    }

    @Override // defpackage.j77
    public final ph0 d1() {
        return this.d;
    }

    @Override // defpackage.j77
    public final dt4 g() {
        String str = this.b;
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
