package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wb9 extends cc9 {
    public final String a;
    public final String b;

    public wb9(String str, String str2) {
        js3.p(str, "connectedTime");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb9)) {
            return false;
        }
        wb9 wb9Var = (wb9) obj;
        return js3.i(this.a, wb9Var.a) && js3.i(this.b, wb9Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return bl4.w("Active(connectedTime=", this.a, ", appStatusTimer=", this.b, ")");
    }
}
