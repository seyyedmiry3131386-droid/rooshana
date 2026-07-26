package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uv3 extends hw3 {
    public final boolean a;
    public final no7 b;
    public final String c;

    public uv3(Object obj, boolean z, no7 no7Var) {
        js3.p(obj, "body");
        this.a = z;
        this.b = no7Var;
        this.c = obj.toString();
        if (no7Var != null && !no7Var.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // defpackage.hw3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uv3.class != obj.getClass()) {
            return false;
        }
        uv3 uv3Var = (uv3) obj;
        return this.a == uv3Var.a && js3.i(this.c, uv3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a ? 1231 : 1237) * 31);
    }

    @Override // defpackage.hw3
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        y78.a(sb, str);
        return sb.toString();
    }
}
