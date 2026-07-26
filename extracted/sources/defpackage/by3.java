package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class by3 {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof by3) {
            return js3.i(this.a, ((by3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
