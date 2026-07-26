package defpackage;

import com.google.common.util.concurrent.b;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, b bVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(bVar, j, obj, obj2)) {
            if (unsafe.getObject(bVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
