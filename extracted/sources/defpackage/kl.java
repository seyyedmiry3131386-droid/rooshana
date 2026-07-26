package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kl {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public kl(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        sn3.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return js3.i(this.a, klVar.a) && this.b == klVar.b && this.c == klVar.c && js3.i(this.d, klVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return bl4.y(sb, this.d, ')');
    }

    public kl(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
