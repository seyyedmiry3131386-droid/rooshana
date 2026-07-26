package androidx.room;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {239, 239, 243}, m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$createFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h c;
    public final /* synthetic */ int[] d;
    public final /* synthetic */ String[] e;

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1, reason: invalid class name */
    @tb1(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {239}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, g51 g51Var) {
            super(2, g51Var);
            this.b = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (this.b.e(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$createFlow$1(h hVar, int[] iArr, String[] strArr, g51 g51Var) {
        super(2, g51Var);
        this.c = hVar;
        this.d = iArr;
        this.e = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        TriggerBasedInvalidationTracker$createFlow$1 triggerBasedInvalidationTracker$createFlow$1 = new TriggerBasedInvalidationTracker$createFlow$1(this.c, this.d, this.e, g51Var);
        triggerBasedInvalidationTracker$createFlow$1.b = obj;
        return triggerBasedInvalidationTracker$createFlow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((TriggerBasedInvalidationTracker$createFlow$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (defpackage.bt2.Z((defpackage.w61) r8, r9, r21) != r0) goto L41;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
