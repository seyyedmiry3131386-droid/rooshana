package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f00 {
    public static final f00 e = new f00(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public f00(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j29.Q(i3) ? j29.t(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        return this.a == f00Var.a && this.b == f00Var.b && this.c == f00Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return dw1.q(sb, this.c, ']');
    }
}
