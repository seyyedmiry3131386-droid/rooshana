package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px {
    public final Object a;

    public /* synthetic */ px(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof px) {
            return js3.i(this.a, ((px) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
