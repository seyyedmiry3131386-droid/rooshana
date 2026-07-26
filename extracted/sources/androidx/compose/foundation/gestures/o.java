package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.a67;
import defpackage.ah7;
import defpackage.bh7;
import defpackage.dh7;
import defpackage.e49;
import defpackage.nr5;
import defpackage.qe1;
import defpackage.qp2;
import defpackage.rg7;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public bh7 a;
    public androidx.compose.foundation.c b;
    public qe1 c;
    public Orientation d;
    public boolean e;
    public androidx.compose.ui.input.nestedscroll.a f;
    public final n g;
    public final ah7 h;
    public boolean i;
    public int j = 1;
    public rg7 k = h.b;
    public final dh7 l = new dh7(this);
    public final a67 m = new a67(6, this);

    public o(bh7 bh7Var, androidx.compose.foundation.c cVar, qe1 qe1Var, Orientation orientation, boolean z, androidx.compose.ui.input.nestedscroll.a aVar, n nVar, ah7 ah7Var) {
        this.a = bh7Var;
        this.b = cVar;
        this.c = qe1Var;
        this.d = orientation;
        this.e = z;
        this.f = aVar;
        this.g = nVar;
        this.h = ah7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.Ref$LongRef r12 = r0.a
            kotlin.b.b(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L59
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L69
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.b.b(r14)
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r7.a = r12
            r11.i = r4
            androidx.compose.foundation.MutatePriority r14 = androidx.compose.foundation.MutatePriority.a     // Catch: java.lang.Throwable -> L66
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2     // Catch: java.lang.Throwable -> L66
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L63
            r0.a = r7     // Catch: java.lang.Throwable -> L63
            r0.d = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r12 = r11.f(r14, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r12 != r1) goto L58
            return r1
        L58:
            r12 = r7
        L59:
            r6.i = r3
            long r12 = r12.a
            e49 r14 = new e49
            r14.<init>(r12)
            return r14
        L63:
            r0 = move-exception
        L64:
            r12 = r0
            goto L69
        L66:
            r0 = move-exception
            r6 = r11
            goto L64
        L69:
            r6.i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.o.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(long j, boolean z, SuspendLambda suspendLambda) {
        tx8 tx8Var = tx8.a;
        if (!z || !(this.c instanceof qe1)) {
            long jA = e49.a(j, 0.0f, 0.0f, this.d == Orientation.b ? 1 : 2);
            ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
            androidx.compose.foundation.c cVar = this.b;
            if (cVar == null || !(this.a.d() || this.a.b())) {
                ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$12 = new ScrollingLogic$onScrollStopped$performFling$1(this, suspendLambda);
                scrollingLogic$onScrollStopped$performFling$12.c = jA;
                Object objInvokeSuspend = scrollingLogic$onScrollStopped$performFling$12.invokeSuspend(tx8Var);
                if (objInvokeSuspend == CoroutineSingletons.a) {
                    return objInvokeSuspend;
                }
            } else {
                Object objB = cVar.b(jA, scrollingLogic$onScrollStopped$performFling$1, suspendLambda);
                if (objB == CoroutineSingletons.a) {
                    return objB;
                }
            }
        }
        return tx8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r13v10, types: [gx4] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [gx4] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [zb5] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [zb5] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [gx4] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [zb5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(defpackage.rg7 r24, long r25, int r27) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.o.c(rg7, long, int):long");
    }

    public final float d(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long e(long j) {
        return this.e ? nr5.h(-1.0f, j) : j;
    }

    public final Object f(MutatePriority mutatePriority, qp2 qp2Var, ContinuationImpl continuationImpl) {
        Object objC = this.a.c(mutatePriority, new ScrollingLogic$scroll$2(null, qp2Var, this), continuationImpl);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == Orientation.b ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == Orientation.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) >= 0.7853981633974483d) {
            if (this.d == Orientation.a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (this.d == Orientation.b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
