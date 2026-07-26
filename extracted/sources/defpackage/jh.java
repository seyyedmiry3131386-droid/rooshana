package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jh implements yg6 {
    public final int b;

    public jh(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.b == ((jh) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return dw1.q(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
