package androidx.room;

import defpackage.dq8;
import defpackage.g51;
import defpackage.p26;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {318, 319}, m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends SuspendLambda implements qp2 {
    public ObservedTableStates$ObserveOp[] a;
    public h b;
    public dq8 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ObservedTableStates$ObserveOp[] h;
    public final /* synthetic */ h i;
    public final /* synthetic */ dq8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr, h hVar, dq8 dq8Var, g51 g51Var) {
        super(2, g51Var);
        this.h = observedTableStates$ObserveOpArr;
        this.i = hVar;
        this.j = dq8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.h, this.i, this.j, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) create((p26) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (androidx.room.h.b(r7, r6, r11, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r10.g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L1c
        Lc:
            int r1 = r10.f
            int r4 = r10.e
            int r5 = r10.d
            dq8 r6 = r10.c
            androidx.room.h r7 = r10.b
            androidx.room.ObservedTableStates$ObserveOp[] r8 = r10.a
            kotlin.b.b(r11)
            goto L58
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            kotlin.b.b(r11)
            androidx.room.ObservedTableStates$ObserveOp[] r11 = r10.h
            int r1 = r11.length
            r4 = 0
            androidx.room.h r5 = r10.i
            dq8 r6 = r10.j
            r8 = r11
            r11 = r4
            r7 = r5
        L32:
            if (r4 >= r1) goto L78
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L75
            if (r5 == r3) goto L60
            if (r5 != r2) goto L5a
            r10.a = r8
            r10.b = r7
            r10.c = r6
            r10.d = r9
            r10.e = r4
            r10.f = r1
            r10.g = r2
            java.lang.Object r11 = androidx.room.h.c(r7, r6, r11, r10)
            if (r11 != r0) goto L57
            goto L74
        L57:
            r5 = r9
        L58:
            r11 = r5
            goto L76
        L5a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L60:
            r10.a = r8
            r10.b = r7
            r10.c = r6
            r10.d = r9
            r10.e = r4
            r10.f = r1
            r10.g = r3
            java.lang.Object r11 = androidx.room.h.b(r7, r6, r11, r10)
            if (r11 != r0) goto L57
        L74:
            return r0
        L75:
            r11 = r9
        L76:
            int r4 = r4 + r3
            goto L32
        L78:
            tx8 r11 = defpackage.tx8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
