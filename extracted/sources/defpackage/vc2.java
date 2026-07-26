package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vc2 implements v40 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.v40
    public final void a(boolean z) {
        synchronized (xc2.j) {
            try {
                for (xc2 xc2Var : new ArrayList(xc2.k.values())) {
                    if (xc2Var.e.get()) {
                        Iterator it = xc2Var.i.iterator();
                        while (it.hasNext()) {
                            xc2 xc2Var2 = ((uc2) it.next()).a;
                            if (!z) {
                                ((we1) xc2Var2.h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
