package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h87 {
    public final HashSet a = new HashSet();

    public final void a() {
        if (j27.c == null) {
            j27.c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != j27.c) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
    }
}
