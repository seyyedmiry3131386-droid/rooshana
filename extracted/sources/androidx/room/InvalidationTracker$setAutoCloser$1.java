package androidx.room;

import defpackage.bp2;
import defpackage.hr5;
import defpackage.tx8;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class InvalidationTracker$setAutoCloser$1 extends FunctionReferenceImpl implements bp2 {
    @Override // defpackage.bp2
    public final Object invoke() {
        a aVar = (a) this.receiver;
        synchronized (aVar.g) {
            hr5 hr5Var = aVar.b.h;
            ReentrantLock reentrantLock = hr5Var.a;
            reentrantLock.lock();
            try {
                boolean[] zArr = hr5Var.c;
                Arrays.fill(zArr, 0, zArr.length, false);
                hr5Var.d = true;
            } finally {
                reentrantLock.unlock();
            }
        }
        return tx8.a;
    }
}
