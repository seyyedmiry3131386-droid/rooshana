package androidx.room.coroutines;

import androidx.room.Transactor$SQLiteTransactionType;
import defpackage.dq8;
import defpackage.e21;
import defpackage.fv;
import defpackage.g51;
import defpackage.gv6;
import defpackage.js3;
import defpackage.ln2;
import defpackage.mb7;
import defpackage.ov;
import defpackage.p11;
import defpackage.qp2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class e implements dq8, gv6 {
    public final fv a;
    public final e21 b;
    public final boolean c;
    public final ov d;
    public volatile boolean e;

    public e(fv fvVar, e21 e21Var, boolean z) {
        js3.p(fvVar, "connectionElementKey");
        this.a = fvVar;
        this.b = e21Var;
        this.c = z;
        this.d = new ov();
    }

    @Override // defpackage.dq8
    public final Boolean a(g51 g51Var) {
        if (this.e) {
            ln2.i(21, "Connection is recycled");
            throw null;
        }
        p11 p11Var = (p11) g51Var.getContext().r0(this.a);
        if (p11Var != null && p11Var.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.n());
        }
        ln2.i(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.dq8
    public final Object b(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, qp2 qp2Var, SuspendLambda suspendLambda) {
        if (this.e) {
            ln2.i(21, "Connection is recycled");
            throw null;
        }
        p11 p11Var = (p11) suspendLambda.getContext().r0(this.a);
        if (p11Var != null && p11Var.b == this) {
            return g(transactor$SQLiteTransactionType, qp2Var, suspendLambda);
        }
        ln2.i(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.gv6
    public final mb7 c() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vh6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.dp2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl$usePrepared$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$usePrepared$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$usePrepared$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            e21 r7 = r0.c
            dp2 r8 = r0.b
            java.lang.String r0 = r0.a
            kotlin.b.b(r9)
            r9 = r7
            r7 = r0
            goto L66
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.b.b(r9)
            boolean r9 = r6.e
            r2 = 21
            if (r9 != 0) goto L8f
            w61 r9 = r0.getContext()
            fv r5 = r6.a
            u61 r9 = r9.r0(r5)
            p11 r9 = (defpackage.p11) r9
            if (r9 == 0) goto L89
            androidx.room.coroutines.e r9 = r9.b
            if (r9 != r6) goto L89
            e21 r9 = r6.b
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r3
            dc5 r2 = r9.b
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            wh6 r0 = new wh6     // Catch: java.lang.Throwable -> L7c
            e21 r1 = r6.b     // Catch: java.lang.Throwable -> L7c
            rb7 r7 = r1.m1(r7)     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7e
            defpackage.m91.i(r0, r4)     // Catch: java.lang.Throwable -> L7c
            r9.d(r4)
            return r7
        L7c:
            r7 = move-exception
            goto L85
        L7e:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L80
        L80:
            r8 = move-exception
            defpackage.m91.i(r0, r7)     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L7c
        L85:
            r9.d(r4)
            throw r7
        L89:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            defpackage.ln2.i(r2, r7)
            throw r4
        L8f:
            java.lang.String r7 = "Connection is recycled"
            defpackage.ln2.i(r2, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.e.d(java.lang.String, dp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(androidx.room.Transactor$SQLiteTransactionType r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            ov r0 = r7.d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1
            if (r2 == 0) goto L17
            r2 = r9
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r2 = (androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e = r3
            goto L1c
        L17:
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r2 = new androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r4 = r2.e
            r5 = 1
            e21 r6 = r7.b
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            e21 r8 = r2.b
            androidx.room.Transactor$SQLiteTransactionType r2 = r2.a
            kotlin.b.b(r9)
            r9 = r8
            r8 = r2
            goto L4e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.b.b(r9)
            r2.a = r8
            r2.b = r6
            r2.e = r5
            dc5 r9 = r6.b
            java.lang.Object r9 = r9.b(r2)
            if (r9 != r3) goto L4d
            return r3
        L4d:
            r9 = r6
        L4e:
            r2 = 0
            int r3 = r0.c     // Catch: java.lang.Throwable -> L68
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L7c
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L76
            if (r8 == r5) goto L70
            r1 = 2
            if (r8 != r1) goto L6a
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.ln2.d(r6, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L68:
            r8 = move-exception
            goto L9e
        L6a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L68
            throw r8     // Catch: java.lang.Throwable -> L68
        L70:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.ln2.d(r6, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L76:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            defpackage.ln2.d(r6, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L7c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r8.append(r3)     // Catch: java.lang.Throwable -> L68
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L68
            defpackage.ln2.d(r6, r8)     // Catch: java.lang.Throwable -> L68
        L90:
            xh6 r8 = new xh6     // Catch: java.lang.Throwable -> L68
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L68
            r0.addLast(r8)     // Catch: java.lang.Throwable -> L68
            tx8 r8 = defpackage.tx8.a     // Catch: java.lang.Throwable -> L68
            r9.d(r2)
            return r8
        L9e:
            r9.d(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.e.e(androidx.room.Transactor$SQLiteTransactionType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            ov r0 = r8.d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r10 instanceof androidx.room.coroutines.PooledConnectionImpl$endTransaction$1
            if (r3 == 0) goto L19
            r3 = r10
            androidx.room.coroutines.PooledConnectionImpl$endTransaction$1 r3 = (androidx.room.coroutines.PooledConnectionImpl$endTransaction$1) r3
            int r4 = r3.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.e = r4
            goto L1e
        L19:
            androidx.room.coroutines.PooledConnectionImpl$endTransaction$1 r3 = new androidx.room.coroutines.PooledConnectionImpl$endTransaction$1
            r3.<init>(r8, r10)
        L1e:
            java.lang.Object r10 = r3.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r5 = r3.e
            r6 = 1
            e21 r7 = r8.b
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            boolean r9 = r3.a
            e21 r3 = r3.b
            kotlin.b.b(r10)
            goto L4e
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.b.b(r10)
            r3.b = r7
            r3.a = r9
            r3.e = r6
            dc5 r10 = r7.b
            java.lang.Object r10 = r10.b(r3)
            if (r10 != r4) goto L4d
            return r4
        L4d:
            r3 = r7
        L4e:
            r10 = 0
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto Lac
            java.lang.Object r4 = kotlin.collections.a.F0(r0)     // Catch: java.lang.Throwable -> L6f
            xh6 r4 = (defpackage.xh6) r4     // Catch: java.lang.Throwable -> L6f
            r5 = 39
            if (r9 == 0) goto L86
            boolean r9 = r4.b     // Catch: java.lang.Throwable -> L6f
            if (r9 != 0) goto L86
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r9 == 0) goto L71
            java.lang.String r9 = "END TRANSACTION"
            defpackage.ln2.d(r7, r9)     // Catch: java.lang.Throwable -> L6f
            goto La6
        L6f:
            r9 = move-exception
            goto Lb4
        L71:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L6f
            int r0 = r4.a     // Catch: java.lang.Throwable -> L6f
            r9.append(r0)     // Catch: java.lang.Throwable -> L6f
            r9.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6f
            defpackage.ln2.d(r7, r9)     // Catch: java.lang.Throwable -> L6f
            goto La6
        L86:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r9 == 0) goto L92
            java.lang.String r9 = "ROLLBACK TRANSACTION"
            defpackage.ln2.d(r7, r9)     // Catch: java.lang.Throwable -> L6f
            goto La6
        L92:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            int r0 = r4.a     // Catch: java.lang.Throwable -> L6f
            r9.append(r0)     // Catch: java.lang.Throwable -> L6f
            r9.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6f
            defpackage.ln2.d(r7, r9)     // Catch: java.lang.Throwable -> L6f
        La6:
            tx8 r9 = defpackage.tx8.a     // Catch: java.lang.Throwable -> L6f
            r3.d(r10)
            return r9
        Lac:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "Not in a transaction"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        Lb4:
            r3.d(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.e.f(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        if (f(false, r0) != r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(androidx.room.Transactor$SQLiteTransactionType r11, defpackage.qp2 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.room.coroutines.PooledConnectionImpl$transaction$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.room.coroutines.PooledConnectionImpl$transaction$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$transaction$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$transaction$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$transaction$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L5e
            if (r2 == r8) goto L55
            if (r2 == r6) goto L4d
            if (r2 == r5) goto L47
            if (r2 == r4) goto L47
            if (r2 == r3) goto L39
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            java.lang.Throwable r11 = r0.b
            java.lang.Object r12 = r0.a
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            kotlin.b.b(r13)     // Catch: android.database.SQLException -> L44
            goto Lbe
        L44:
            r13 = move-exception
            goto Lb9
        L47:
            java.lang.Object r11 = r0.a
            kotlin.b.b(r13)
            return r11
        L4d:
            int r11 = r0.c
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L53
            goto L84
        L53:
            r11 = move-exception
            goto L93
        L55:
            java.lang.Object r11 = r0.a
            r12 = r11
            qp2 r12 = (defpackage.qp2) r12
            kotlin.b.b(r13)
            goto L70
        L5e:
            kotlin.b.b(r13)
            if (r11 != 0) goto L65
            androidx.room.Transactor$SQLiteTransactionType r11 = androidx.room.Transactor$SQLiteTransactionType.a
        L65:
            r0.a = r12
            r0.f = r8
            java.lang.Object r11 = r10.e(r11, r0)
            if (r11 != r1) goto L70
            goto Lb6
        L70:
            p26 r11 = new p26     // Catch: java.lang.Throwable -> L53
            r13 = 1
            r11.<init>(r13, r10)     // Catch: java.lang.Throwable -> L53
            r0.a = r9     // Catch: java.lang.Throwable -> L53
            r0.c = r8     // Catch: java.lang.Throwable -> L53
            r0.f = r6     // Catch: java.lang.Throwable -> L53
            java.lang.Object r13 = r12.invoke(r11, r0)     // Catch: java.lang.Throwable -> L53
            if (r13 != r1) goto L83
            goto Lb6
        L83:
            r11 = r8
        L84:
            if (r11 == 0) goto L87
            r7 = r8
        L87:
            r0.a = r13
            r0.f = r5
            java.lang.Object r11 = r10.f(r7, r0)
            if (r11 != r1) goto L92
            goto Lb6
        L92:
            return r13
        L93:
            boolean r12 = r11 instanceof androidx.room.coroutines.ConnectionPool$RollbackException     // Catch: java.lang.Throwable -> La9
            if (r12 == 0) goto La4
            r11 = 0
            r0.a = r11
            r0.f = r4
            java.lang.Object r12 = r10.f(r7, r0)
            if (r12 != r1) goto La3
            goto Lb6
        La3:
            return r11
        La4:
            throw r11     // Catch: java.lang.Throwable -> La5
        La5:
            r12 = move-exception
            r9 = r11
            r11 = r12
            goto Laa
        La9:
            r11 = move-exception
        Laa:
            r0.a = r9     // Catch: android.database.SQLException -> Lb7
            r0.b = r11     // Catch: android.database.SQLException -> Lb7
            r0.f = r3     // Catch: android.database.SQLException -> Lb7
            java.lang.Object r12 = r10.f(r7, r0)     // Catch: android.database.SQLException -> Lb7
            if (r12 != r1) goto Lbe
        Lb6:
            return r1
        Lb7:
            r13 = move-exception
            r12 = r9
        Lb9:
            if (r12 == 0) goto Lbf
            defpackage.wu8.f(r12, r13)
        Lbe:
            throw r11
        Lbf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.e.g(androidx.room.Transactor$SQLiteTransactionType, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
