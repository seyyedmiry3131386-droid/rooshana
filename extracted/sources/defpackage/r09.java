package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r09 extends rh3 {
    public final String b;
    public final String c;

    public r09(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r09.class == obj.getClass()) {
            r09 r09Var = (r09) obj;
            if (this.a.equals(r09Var.a) && Objects.equals(this.b, r09Var.b) && Objects.equals(this.c, r09Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iK = rm7.k(this.a, 527, 31);
        String str = this.b;
        int iHashCode = (iK + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.rh3
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
