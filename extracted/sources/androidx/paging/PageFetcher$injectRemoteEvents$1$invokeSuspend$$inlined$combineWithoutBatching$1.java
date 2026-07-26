package androidx.paging;

import defpackage.e71;
import defpackage.g51;
import defpackage.o37;
import defpackage.pw7;
import defpackage.qp2;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {146}, m = "invokeSuspend", v = 1)
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    @tb1(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {126}, m = "invokeSuspend", v = 1)
    public final class AnonymousClass1 extends SuspendLambda implements sp2 {
        @Override // defpackage.sp2
        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    @tb1(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {132}, m = "invokeSuspend", v = 1)
    public final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ pw7 b;
        public final /* synthetic */ xe2 c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(xe2 xe2Var, AtomicInteger atomicInteger, pw7 pw7Var, o37 o37Var, int i, g51 g51Var) {
            super(2, g51Var);
            this.c = xe2Var;
            this.d = atomicInteger;
            this.e = i;
            this.b = pw7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.c, this.d, this.b, null, this.e, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            pw7 pw7Var = this.b;
            AtomicInteger atomicInteger = this.d;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    xe2 xe2Var = this.c;
                    g gVar = new g(null, this.e, 1);
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        new AtomicInteger(2);
        throw null;
    }
}
