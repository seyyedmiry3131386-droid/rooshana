package androidx.room;

import defpackage.dp2;
import defpackage.js3;
import defpackage.kr5;
import defpackage.tx8;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class InvalidationTracker$implementation$1 extends FunctionReferenceImpl implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        js3.p((Set) obj, "p0");
        a aVar = (a) this.receiver;
        ReentrantLock reentrantLock = aVar.d;
        reentrantLock.lock();
        try {
            List listP0 = kotlin.collections.a.P0(aVar.c.values());
            reentrantLock.unlock();
            Iterator it = listP0.iterator();
            if (!it.hasNext()) {
                return tx8.a;
            }
            ((kr5) it.next()).getClass();
            throw null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
