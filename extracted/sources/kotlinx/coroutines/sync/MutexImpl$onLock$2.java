package kotlinx.coroutines.sync;

import defpackage.js3;
import defpackage.rp2;
import defpackage.tv8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements rp2 {
    static {
        new MutexImpl$onLock$2();
    }

    public MutexImpl$onLock$2() {
        super(3, a.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj;
        aVar.getClass();
        if (!js3.i(obj3, tv8.e)) {
            return aVar;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj2).toString());
    }
}
