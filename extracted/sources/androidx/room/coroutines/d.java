package androidx.room.coroutines;

import defpackage.bp2;
import defpackage.br9;
import defpackage.e21;
import defpackage.js3;
import defpackage.ov;
import defpackage.pn7;
import defpackage.qn7;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int a;
    public final bp2 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final e21[] f;
    public final pn7 g;
    public final ov h;

    public d(int i, bp2 bp2Var) {
        this.a = i;
        this.b = bp2Var;
        this.f = new e21[i];
        int i2 = qn7.a;
        this.g = new pn7(i);
        this.h = new ov(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            ov r0 = r6.h
            boolean r1 = r7 instanceof androidx.room.coroutines.Pool$acquire$1
            if (r1 == 0) goto L15
            r1 = r7
            androidx.room.coroutines.Pool$acquire$1 r1 = (androidx.room.coroutines.Pool$acquire$1) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            androidx.room.coroutines.Pool$acquire$1 r1 = new androidx.room.coroutines.Pool$acquire$1
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.c
            pn7 r4 = r6.g
            r5 = 1
            if (r3 == 0) goto L33
            if (r3 != r5) goto L2b
            kotlin.b.b(r7)
            goto L3f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.b.b(r7)
            r1.c = r5
            java.lang.Object r7 = r4.a(r1)
            if (r7 != r2) goto L3f
            return r2
        L3f:
            java.util.concurrent.locks.ReentrantLock r7 = r6.c     // Catch: java.lang.Throwable -> L79
            r7.lock()     // Catch: java.lang.Throwable -> L79
            boolean r1 = r6.e     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L7d
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L6f
            int r1 = r6.d     // Catch: java.lang.Throwable -> L7b
            int r2 = r6.a     // Catch: java.lang.Throwable -> L7b
            if (r1 < r2) goto L55
            goto L6f
        L55:
            e21 r1 = new e21     // Catch: java.lang.Throwable -> L7b
            bp2 r2 = r6.b     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L7b
            mb7 r2 = (defpackage.mb7) r2     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            e21[] r2 = r6.f     // Catch: java.lang.Throwable -> L7b
            int r3 = r6.d     // Catch: java.lang.Throwable -> L7b
            int r5 = r3 + 1
            r6.d = r5     // Catch: java.lang.Throwable -> L7b
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7b
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7b
        L6f:
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L7b
            e21 r0 = (defpackage.e21) r0     // Catch: java.lang.Throwable -> L7b
            r7.unlock()     // Catch: java.lang.Throwable -> L79
            return r0
        L79:
            r7 = move-exception
            goto L8a
        L7b:
            r0 = move-exception
            goto L86
        L7d:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            defpackage.ln2.i(r1, r0)     // Catch: java.lang.Throwable -> L7b
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L7b
        L86:
            r7.unlock()     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L79
        L8a:
            r4.e()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:11|53|12|31|55|38|(1:(1:48)(2:44|(1:46)))(1:40)|47|19|57|20|(1:22)(1:23)|(1:(2:32|33))(1:25)|27|(1:29)(13:30|31|55|38|(0)(0)|47|19|57|20|(0)(0)|(0)(0)|27|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r13 = r13;
        r12 = r12;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:20:0x0043, B:25:0x0060, B:27:0x0074, B:32:0x0082, B:33:0x0087), top: B:57:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:38:0x0094, B:40:0x0098, B:44:0x00a0, B:48:0x00a7), top: B:55:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007b -> B:31:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r10, defpackage.u11 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof androidx.room.coroutines.Pool$acquireWithTimeout$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = (androidx.room.coroutines.Pool$acquireWithTimeout$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = new androidx.room.coroutines.Pool$acquireWithTimeout$1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r10 = r0.a
            kotlin.jvm.internal.Ref$ObjectRef r12 = r0.c
            bp2 r2 = r0.b
            bp2 r2 = (defpackage.bp2) r2
            kotlin.b.b(r13)     // Catch: java.lang.Throwable -> L30
            goto L7d
        L30:
            r13 = move-exception
            goto L8f
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            kotlin.b.b(r13)
        L3e:
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            androidx.room.coroutines.Pool$acquireWithTimeout$2 r2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r13, r9, r4)     // Catch: java.lang.Throwable -> L8d
            r5 = r12
            bp2 r5 = (defpackage.bp2) r5     // Catch: java.lang.Throwable -> L8d
            r0.b = r5     // Catch: java.lang.Throwable -> L8d
            r0.c = r13     // Catch: java.lang.Throwable -> L8d
            r0.a = r10     // Catch: java.lang.Throwable -> L8d
            r0.f = r3     // Catch: java.lang.Throwable -> L8d
            int r5 = defpackage.qx1.d     // Catch: java.lang.Throwable -> L8d
            r5 = 0
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 <= 0) goto L5d
            r7 = r3
            goto L5e
        L5d:
            r7 = 0
        L5e:
            if (r7 != r3) goto L72
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.b     // Catch: java.lang.Throwable -> L8d
            r6 = 999999(0xf423f, double:4.94065E-318)
            long r5 = defpackage.wq2.U(r6, r5)     // Catch: java.lang.Throwable -> L8d
            long r5 = defpackage.qx1.g(r10, r5)     // Catch: java.lang.Throwable -> L8d
            long r5 = defpackage.qx1.d(r5)     // Catch: java.lang.Throwable -> L8d
            goto L74
        L72:
            if (r7 != 0) goto L82
        L74:
            java.lang.Object r2 = kotlinx.coroutines.a.m(r5, r2, r0)     // Catch: java.lang.Throwable -> L8d
            if (r2 != r1) goto L7b
            return r1
        L7b:
            r2 = r12
            r12 = r13
        L7d:
            r13 = r12
            r12 = r2
            r2 = r0
            r0 = r4
            goto L94
        L82:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            throw r2     // Catch: java.lang.Throwable -> L8d
        L88:
            r8 = r2
            r2 = r12
            r12 = r13
            r13 = r8
            goto L8f
        L8d:
            r2 = move-exception
            goto L88
        L8f:
            r8 = r13
            r13 = r12
            r12 = r2
            r2 = r0
            r0 = r8
        L94:
            boolean r5 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L9e
            r12.invoke()     // Catch: java.lang.Throwable -> L9c
            goto La5
        L9c:
            r10 = move-exception
            goto La8
        L9e:
            if (r0 != 0) goto La7
            java.lang.Object r13 = r13.a     // Catch: java.lang.Throwable -> L9c
            if (r13 == 0) goto La5
            return r13
        La5:
            r0 = r2
            goto L3e
        La7:
            throw r0     // Catch: java.lang.Throwable -> L9c
        La8:
            java.lang.Object r11 = r13.a
            e21 r11 = (defpackage.e21) r11
            if (r11 == 0) goto Lb1
            r9.e(r11)
        Lb1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.d.b(long, u11, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (e21 e21Var : this.f) {
                if (e21Var != null) {
                    e21Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        ov ovVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            ListBuilder listBuilderS = br9.s();
            int i = ovVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                listBuilderS.add(ovVar.get(i2));
            }
            ListBuilder listBuilderQ = br9.q(listBuilderS);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            pn7 pn7Var = this.g;
            pn7Var.getClass();
            sb2.append(Math.max(kotlinx.coroutines.sync.b.g.get(pn7Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + listBuilderQ.a() + ")[" + kotlin.collections.a.t0(listBuilderQ, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            e21[] e21VarArr = this.f;
            int length = e21VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                e21 e21Var = e21VarArr[i4];
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(e21Var != null ? e21Var.a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (e21Var != null) {
                    e21Var.g(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(e21 e21Var) {
        js3.p(e21Var, "connection");
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(e21Var);
            reentrantLock.unlock();
            this.g.e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
