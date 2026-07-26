package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class le extends o27 {
    public final int b;

    public le(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof le) && ((le) obj).b == this.b;
    }

    public final int hashCode() {
        return this.b * 31;
    }
}
