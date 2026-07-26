package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends rh3 {
    public final String b;
    public final String c;
    public final String d;

    public uw0(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uw0.class == obj.getClass()) {
            uw0 uw0Var = (uw0) obj;
            if (Objects.equals(this.c, uw0Var.c) && Objects.equals(this.b, uw0Var.b) && Objects.equals(this.d, uw0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.rh3
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
