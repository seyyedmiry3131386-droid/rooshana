package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hz {
    public static final hz d = new gz().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public hz(gz gzVar) {
        this.a = gzVar.a;
        this.b = gzVar.b;
        this.c = gzVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz.class != obj.getClass()) {
            return false;
        }
        hz hzVar = (hz) obj;
        return this.a == hzVar.a && this.b == hzVar.b && this.c == hzVar.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
