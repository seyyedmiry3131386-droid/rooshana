package androidx.paging;

import defpackage.e71;
import defpackage.g51;
import defpackage.o37;
import defpackage.pw7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {132}, m = "invokeSuspend", v = 1)
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ pw7 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(xe2 xe2Var, AtomicInteger atomicInteger, pw7 pw7Var, o37 o37Var, int i, g51 g51Var) {
        super(2, g51Var);
        this.b = xe2Var;
        this.c = atomicInteger;
        this.d = pw7Var;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.b, this.c, this.d, null, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        pw7 pw7Var = this.d;
        AtomicInteger atomicInteger = this.c;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                xe2 xe2Var = this.b;
                g gVar = new g(null, this.e, 0);
                this.a = 1;
                if (xe2Var.a(gVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                pw7Var.b(null);
            }
            return tx8.a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                pw7Var.b(null);
            }
        }
    }
}
