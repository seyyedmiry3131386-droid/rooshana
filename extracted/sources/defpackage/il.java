package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class il {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public il(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il)) {
            return false;
        }
        il ilVar = (il) obj;
        return js3.i(this.a, ilVar.a) && this.b == ilVar.b && this.c == ilVar.c && js3.i(this.d, ilVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return bl4.y(sb, this.d, ')');
    }
}
