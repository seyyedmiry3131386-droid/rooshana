package androidx.room.util;

import androidx.room.Transactor$SQLiteTransactionType;
import androidx.room.d;
import defpackage.dp2;
import defpackage.dq8;
import defpackage.g51;
import defpackage.p26;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 extends SuspendLambda implements qp2 {
    public Transactor$SQLiteTransactionType a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public final /* synthetic */ dp2 e;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1, reason: invalid class name */
    @tb1(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
    public final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ dp2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, dp2 dp2Var) {
            super(2, g51Var);
            this.c = dp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((p26) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return obj;
            }
            b.b(obj);
            this.a = 1;
            Object objInvoke = this.c.invoke(this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1(g51 g51Var, dp2 dp2Var, d dVar) {
        super(2, g51Var);
        this.d = dVar;
        this.e = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1(g51Var, this.e, this.d);
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.c = obj;
        return dBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1) create((dq8) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[PHI: r1 r10
      0x0094: PHI (r1v7 dq8) = (r1v4 dq8), (r1v12 dq8) binds: [B:31:0x0091, B:15:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x0091, B:15:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r9.b
            androidx.room.d r2 = r9.d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L47
            if (r1 == r6) goto L3d
            if (r1 == r5) goto L33
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L23
            r0 = 5
            if (r1 != r0) goto L1b
            kotlin.b.b(r10)
            return r10
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r0 = r9.c
            kotlin.b.b(r10)
            goto La1
        L2a:
            java.lang.Object r1 = r9.c
            dq8 r1 = (defpackage.dq8) r1
            kotlin.b.b(r10)
            goto L94
        L33:
            androidx.room.Transactor$SQLiteTransactionType r1 = r9.a
            java.lang.Object r5 = r9.c
            dq8 r5 = (defpackage.dq8) r5
            kotlin.b.b(r10)
            goto L7a
        L3d:
            androidx.room.Transactor$SQLiteTransactionType r1 = r9.a
            java.lang.Object r6 = r9.c
            dq8 r6 = (defpackage.dq8) r6
            kotlin.b.b(r10)
            goto L60
        L47:
            kotlin.b.b(r10)
            java.lang.Object r10 = r9.c
            dq8 r10 = (defpackage.dq8) r10
            androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor$SQLiteTransactionType.b
            r9.c = r10
            r9.a = r1
            r9.b = r6
            java.lang.Boolean r6 = r10.a(r9)
            if (r6 != r0) goto L5d
            goto L9e
        L5d:
            r8 = r6
            r6 = r10
            r10 = r8
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L7d
            androidx.room.a r10 = r2.d()
            r9.c = r6
            r9.a = r1
            r9.b = r5
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r0) goto L79
            goto L9e
        L79:
            r5 = r6
        L7a:
            r10 = r1
            r1 = r5
            goto L7f
        L7d:
            r10 = r1
            r1 = r6
        L7f:
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1 r5 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1
            r6 = 0
            dp2 r7 = r9.e
            r5.<init>(r6, r7)
            r9.c = r1
            r9.a = r6
            r9.b = r4
            java.lang.Object r10 = r1.b(r10, r5, r9)
            if (r10 != r0) goto L94
            goto L9e
        L94:
            r9.c = r10
            r9.b = r3
            java.lang.Boolean r1 = r1.a(r9)
            if (r1 != r0) goto L9f
        L9e:
            return r0
        L9f:
            r0 = r10
            r10 = r1
        La1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lb0
            androidx.room.a r10 = r2.d()
            r10.b()
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
