package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qy5 implements os0 {
    public final Class a;

    public qy5(Class cls) {
        js3.p(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.os0
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qy5) {
            return js3.i(this.a, ((qy5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
