package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ym3) {
            return this.a == ((ym3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.a + ')';
    }
}
