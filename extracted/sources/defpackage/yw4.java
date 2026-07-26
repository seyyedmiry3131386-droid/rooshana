package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class yw4 {
    public static final ArrayDeque b;
    public Object a;

    static {
        char[] cArr = i29.a;
        b = new ArrayDeque(0);
    }

    public static yw4 a(Object obj) {
        yw4 yw4Var;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            yw4Var = (yw4) arrayDeque.poll();
        }
        if (yw4Var == null) {
            yw4Var = new yw4();
        }
        yw4Var.a = obj;
        return yw4Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yw4) && this.a.equals(((yw4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
