package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yt5 {
    public final String a;

    public yt5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt5) && js3.i(this.a, ((yt5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bl4.y(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
