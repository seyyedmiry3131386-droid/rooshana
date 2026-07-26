package defpackage;

import com.google.common.util.concurrent.b;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, b bVar, long j, o0 o0Var, o0 o0Var2) {
        while (!unsafe.compareAndSwapObject(bVar, j, o0Var, o0Var2)) {
            if (unsafe.getObject(bVar, j) != o0Var) {
                return false;
            }
        }
        return true;
    }
}
