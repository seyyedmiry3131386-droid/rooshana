package kotlinx.coroutines.sync;

import defpackage.qn7;
import defpackage.qp2;
import defpackage.rn7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements qp2 {
    public static final SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 a = new SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1();

    public SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, qn7.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = qn7.a;
        return new rn7(((Number) obj).longValue(), (rn7) obj2, 0);
    }
}
