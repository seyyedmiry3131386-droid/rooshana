package defpackage;

import com.google.common.util.concurrent.b;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, b bVar, long j, d0 d0Var, d0 d0Var2) {
        while (!unsafe.compareAndSwapObject(bVar, j, d0Var, d0Var2)) {
            if (unsafe.getObject(bVar, j) != d0Var) {
                return false;
            }
        }
        return true;
    }
}
