package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qy7 {
    public final qz0 a;

    public /* synthetic */ qy7(qz0 qz0Var) {
        this.a = qz0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qy7) {
            return js3.i(this.a, ((qy7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
