package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ int c;
    public final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(k kVar, g51 g51Var) {
        super(3, g51Var);
        this.d = kVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.d, (g51) obj3);
        startedWhileSubscribed$command$1.b = (ze2) obj;
        startedWhileSubscribed$command$1.c = iIntValue;
        return startedWhileSubscribed$command$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[PHI: r1
      0x0064: PHI (r1v3 ze2) = (r1v2 ze2), (r1v6 ze2) binds: [B:25:0x0061, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[PHI: r1
      0x0074: PHI (r1v4 ze2) = (r1v3 ze2), (r1v7 ze2) binds: [B:28:0x0071, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
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
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L30
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            ze2 r1 = r8.b
            kotlin.b.b(r9)
            goto L74
        L24:
            ze2 r1 = r8.b
            kotlin.b.b(r9)
            goto L64
        L2a:
            ze2 r1 = r8.b
            kotlin.b.b(r9)
            goto L57
        L30:
            kotlin.b.b(r9)
            goto L82
        L34:
            kotlin.b.b(r9)
            ze2 r1 = r8.b
            int r9 = r8.c
            if (r9 <= 0) goto L48
            kotlinx.coroutines.flow.SharingCommand r9 = kotlinx.coroutines.flow.SharingCommand.a
            r8.a = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L82
            goto L81
        L48:
            kotlinx.coroutines.flow.k r9 = r8.d
            long r6 = r9.a
            r8.b = r1
            r8.a = r5
            java.lang.Object r9 = kotlinx.coroutines.a.e(r6, r8)
            if (r9 != r0) goto L57
            goto L81
        L57:
            kotlinx.coroutines.flow.SharingCommand r9 = kotlinx.coroutines.flow.SharingCommand.b
            r8.b = r1
            r8.a = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L64
            goto L81
        L64:
            r8.b = r1
            r8.a = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = kotlinx.coroutines.a.e(r3, r8)
            if (r9 != r0) goto L74
            goto L81
        L74:
            kotlinx.coroutines.flow.SharingCommand r9 = kotlinx.coroutines.flow.SharingCommand.c
            r3 = 0
            r8.b = r3
            r8.a = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L82
        L81:
            return r0
        L82:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
