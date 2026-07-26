package androidx.tv.material3;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1", f = "Carousel.kt", l = {239, 240, 243}, m = "invokeSuspend")
final class CarouselKt$AutoScrollSideEffect$3$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ a c;
    public final /* synthetic */ wb5 d;

    /* JADX INFO: renamed from: androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1$2, reason: invalid class name */
    @tb1(c = "androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1$2", f = "Carousel.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ int a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, g51Var);
            anonymousClass2.a = ((Number) obj).intValue();
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            return Boolean.valueOf(this.a == 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$AutoScrollSideEffect$3$1(long j, a aVar, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = j;
        this.c = aVar;
        this.d = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CarouselKt$AutoScrollSideEffect$3$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((CarouselKt$AutoScrollSideEffect$3$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (kotlinx.coroutines.flow.d.p(r9, r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0042 -> B:24:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:24:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.a
            r2 = 3
            r3 = 1
            androidx.tv.material3.a r4 = r8.c
            r5 = 2
            if (r1 == 0) goto L25
            if (r1 == r3) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r2) goto L15
            kotlin.b.b(r9)
            goto L5c
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.b.b(r9)
            goto L3c
        L21:
            kotlin.b.b(r9)
            goto L31
        L25:
            kotlin.b.b(r9)
        L28:
            r8.a = r3
            java.lang.Object r9 = defpackage.cc7.K(r8)
            if (r9 != r0) goto L31
            goto L5b
        L31:
            r8.a = r5
            long r6 = r8.b
            java.lang.Object r9 = kotlinx.coroutines.a.e(r6, r8)
            if (r9 != r0) goto L3c
            goto L5b
        L3c:
            n08 r9 = r4.a
            int r9 = r9.h()
            if (r9 <= 0) goto L5c
            androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1$1 r9 = new androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1$1
            r9.<init>()
            vb7 r9 = androidx.compose.runtime.g.l(r9)
            androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1$2 r1 = new androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1$2
            r6 = 0
            r1.<init>(r5, r6)
            r8.a = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.d.p(r9, r1, r8)
            if (r9 != r0) goto L5c
        L5b:
            return r0
        L5c:
            wb5 r9 = r8.d
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L6e
            r4.getClass()
            goto L28
        L6e:
            r1 = 0
            r4.c = r1
            int r6 = r4.a()
            int r6 = r6 + r3
            int r7 = r6 % r9
            if (r7 != 0) goto L7b
            goto L86
        L7b:
            r1 = r6 ^ r9
            int r1 = r1 >> 31
            r1 = r1 | r3
            if (r1 <= 0) goto L84
            r1 = r7
            goto L86
        L84:
            int r1 = r7 + r9
        L86:
            n08 r9 = r4.b
            r9.i(r1)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tv.material3.CarouselKt$AutoScrollSideEffect$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
