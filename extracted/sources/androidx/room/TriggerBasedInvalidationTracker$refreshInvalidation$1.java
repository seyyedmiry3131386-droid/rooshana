package androidx.room;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {372}, m = "refreshInvalidation$room_runtime")
final class TriggerBasedInvalidationTracker$refreshInvalidation$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$refreshInvalidation$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r3.a = r4
            int r4 = r3.c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r0
            r3.c = r4
            androidx.room.h r4 = r3.b
            r4.getClass()
            int r1 = r3.c
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r3.c = r1
            r0 = r3
            goto L1e
        L19:
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            r0.<init>(r4, r3)
        L1e:
            java.lang.Object r1 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r0 = r0.c
            r2 = 0
            if (r0 == 0) goto L39
            r4 = 1
            if (r0 != r4) goto L31
            kotlin.b.b(r1)     // Catch: java.lang.Throwable -> L30
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            throw r2
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L39:
            kotlin.b.b(r1)
            r4.f(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
