package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zb1 {
    public final wh3 a;
    public final boolean b;

    public zb1(wh3 wh3Var, boolean z) {
        this.a = wh3Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb1)) {
            return false;
        }
        zb1 zb1Var = (zb1) obj;
        return js3.i(this.a, zb1Var.a) && this.b == zb1Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.a);
        sb.append(", isSampled=");
        return bl4.A(sb, this.b, ')');
    }
}
