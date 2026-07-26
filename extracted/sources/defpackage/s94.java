package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s94 {
    public final Object a;
    public xe1 b = new xe1(5);
    public boolean c;
    public boolean d;

    public s94(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s94.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((s94) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
