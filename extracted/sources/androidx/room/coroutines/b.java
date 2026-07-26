package androidx.room.coroutines;

import androidx.room.Transactor$SQLiteTransactionType;
import defpackage.dq8;
import defpackage.g51;
import defpackage.gv6;
import defpackage.js3;
import defpackage.mb7;
import defpackage.qp2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final class b implements dq8, gv6 {
    public final FunctionReferenceImpl a;
    public final mb7 b;
    public final AtomicInteger c;
    public Transactor$SQLiteTransactionType d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(qp2 qp2Var, mb7 mb7Var) {
        js3.p(mb7Var, "delegate");
        this.a = (FunctionReferenceImpl) qp2Var;
        this.b = mb7Var;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.dq8
    public final Boolean a(g51 g51Var) {
        return Boolean.valueOf(this.d != null || this.b.n());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, qp2] */
    @Override // defpackage.dq8
    public final Object b(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, qp2 qp2Var, SuspendLambda suspendLambda) {
        Object objInvoke = this.a.invoke(new PassthroughConnection$withTransaction$2(this, transactor$SQLiteTransactionType, qp2Var, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        return objInvoke;
    }

    @Override // defpackage.gv6
    public final mb7 c() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, qp2] */
    @Override // defpackage.vh6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r6, defpackage.dp2 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.coroutines.PassthroughConnection$usePrepared$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.coroutines.PassthroughConnection$usePrepared$1 r0 = (androidx.room.coroutines.PassthroughConnection$usePrepared$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.room.coroutines.PassthroughConnection$usePrepared$1 r0 = new androidx.room.coroutines.PassthroughConnection$usePrepared$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            dp2 r7 = r0.b
            java.lang.String r6 = r0.a
            kotlin.b.b(r8)
            goto L4a
        L3a:
            kotlin.b.b(r8)
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Boolean r8 = r5.a(r0)
            if (r8 != r1) goto L4a
            goto L66
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L68
            androidx.room.coroutines.PassthroughConnection$usePrepared$2 r8 = new androidx.room.coroutines.PassthroughConnection$usePrepared$2
            r8.<init>(r5, r6, r7, r2)
            r0.a = r2
            r0.b = r2
            r0.e = r3
            kotlin.jvm.internal.FunctionReferenceImpl r6 = r5.a
            java.lang.Object r6 = r6.invoke(r8, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            return r6
        L68:
            mb7 r8 = r5.b
            rb7 r6 = r8.m1(r6)
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L76
            defpackage.m91.i(r6, r2)
            return r7
        L76:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L78
        L78:
            r8 = move-exception
            defpackage.m91.i(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.b.d(java.lang.String, dp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(androidx.room.Transactor$SQLiteTransactionType r9, defpackage.qp2 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.room.coroutines.PassthroughConnection$transaction$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.room.coroutines.PassthroughConnection$transaction$1 r0 = (androidx.room.coroutines.PassthroughConnection$transaction$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.room.coroutines.PassthroughConnection$transaction$1 r0 = new androidx.room.coroutines.PassthroughConnection$transaction$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            java.util.concurrent.atomic.AtomicInteger r4 = r8.c
            r5 = 1
            mb7 r6 = r8.b
            r7 = 0
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L32
            int r5 = r0.a
            kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L30
            goto L78
        L30:
            r9 = move-exception
            goto L8c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.b.b(r11)
            int r11 = r9.ordinal()
            if (r11 == 0) goto L5a
            if (r11 == r5) goto L54
            r2 = 2
            if (r11 != r2) goto L4e
            java.lang.String r11 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.ln2.d(r6, r11)
            goto L5f
        L4e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L54:
            java.lang.String r11 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.ln2.d(r6, r11)
            goto L5f
        L5a:
            java.lang.String r11 = "BEGIN DEFERRED TRANSACTION"
            defpackage.ln2.d(r6, r11)
        L5f:
            int r11 = r4.incrementAndGet()
            if (r11 <= 0) goto L67
            r8.d = r9
        L67:
            p26 r9 = new p26     // Catch: java.lang.Throwable -> L30
            r11 = 0
            r9.<init>(r11, r8)     // Catch: java.lang.Throwable -> L30
            r0.a = r5     // Catch: java.lang.Throwable -> L30
            r0.d = r5     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r11 != r1) goto L78
            return r1
        L78:
            int r9 = r4.decrementAndGet()
            if (r9 != 0) goto L80
            r8.d = r7
        L80:
            if (r5 == 0) goto L88
            java.lang.String r9 = "END TRANSACTION"
            defpackage.ln2.d(r6, r9)
            return r11
        L88:
            defpackage.ln2.d(r6, r3)
            return r11
        L8c:
            boolean r10 = r9 instanceof androidx.room.coroutines.ConnectionPool$RollbackException     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L9d
            int r9 = r4.decrementAndGet()
            if (r9 != 0) goto L98
            r8.d = r7
        L98:
            defpackage.ln2.d(r6, r3)
            r9 = 0
            return r9
        L9d:
            throw r9     // Catch: java.lang.Throwable -> L9e
        L9e:
            r10 = move-exception
            goto La2
        La0:
            r10 = move-exception
            r9 = r7
        La2:
            int r11 = r4.decrementAndGet()     // Catch: android.database.SQLException -> Lab
            if (r11 != 0) goto Lad
            r8.d = r7     // Catch: android.database.SQLException -> Lab
            goto Lad
        Lab:
            r11 = move-exception
            goto Lb1
        Lad:
            defpackage.ln2.d(r6, r3)     // Catch: android.database.SQLException -> Lab
            goto Lb6
        Lb1:
            if (r9 == 0) goto Lb7
            defpackage.wu8.f(r9, r11)
        Lb6:
            throw r10
        Lb7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.b.e(androidx.room.Transactor$SQLiteTransactionType, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
