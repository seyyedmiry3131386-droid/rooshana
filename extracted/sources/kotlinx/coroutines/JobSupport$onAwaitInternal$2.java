package kotlinx.coroutines;

import defpackage.rp2;
import defpackage.rx0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements rp2 {
    static {
        new JobSupport$onAwaitInternal$2();
    }

    public JobSupport$onAwaitInternal$2() {
        super(3, c.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.a;
        ((c) obj).getClass();
        if (obj3 instanceof rx0) {
            throw ((rx0) obj3).a;
        }
        return obj3;
    }
}
