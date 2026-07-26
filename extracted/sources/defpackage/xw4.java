package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class xw4 extends nd1 {
    @Override // defpackage.nd1
    public final void d(Object obj, Object obj2) {
        yw4 yw4Var = (yw4) obj;
        yw4Var.getClass();
        ArrayDeque arrayDeque = yw4.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(yw4Var);
        }
    }
}
