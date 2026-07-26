package androidx.room.util;

import androidx.room.d;
import defpackage.cq8;
import defpackage.e51;
import defpackage.js3;
import defpackage.w61;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final w61 a(d dVar, boolean z, ContinuationImpl continuationImpl) {
        cq8 cq8Var = (cq8) continuationImpl.getContext().r0(cq8.b);
        w61 w61Var = cq8Var != null ? cq8Var.a : null;
        if (!dVar.g()) {
            e51 e51Var = dVar.a;
            if (e51Var == null) {
                js3.V("coroutineScope");
                throw null;
            }
            w61 w61Var2 = e51Var.a;
            if (w61Var == null) {
                w61Var = EmptyCoroutineContext.a;
            }
            return w61Var2.l0(w61Var);
        }
        if (w61Var != null) {
            e51 e51Var2 = dVar.a;
            if (e51Var2 != null) {
                return e51Var2.a.l0(w61Var);
            }
            js3.V("coroutineScope");
            throw null;
        }
        if (z) {
            w61 w61Var3 = dVar.b;
            if (w61Var3 != null) {
                return w61Var3;
            }
            js3.V("transactionContext");
            throw null;
        }
        e51 e51Var3 = dVar.a;
        if (e51Var3 != null) {
            return e51Var3.a;
        }
        js3.V("coroutineScope");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.g51 r13, defpackage.dp2 r14, androidx.room.d r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            if (r0 == 0) goto L14
            r0 = r13
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r0 = (androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r13.f
            r2 = 3
            r3 = 2
            r7 = 1
            if (r1 == 0) goto L4b
            if (r1 == r7) goto L47
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.b.b(r0)
            return r0
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            boolean r14 = r13.d
            boolean r1 = r13.c
            dp2 r3 = r13.b
            androidx.room.d r4 = r13.a
            kotlin.b.b(r0)
            r12 = r14
            r11 = r1
            r9 = r3
            r10 = r4
            goto L91
        L47:
            kotlin.b.b(r0)
            return r0
        L4b:
            kotlin.b.b(r0)
            boolean r0 = r15.g()
            if (r0 == 0) goto L77
            boolean r0 = r15.i()
            if (r0 == 0) goto L77
            boolean r0 = r15.h()
            if (r0 == 0) goto L77
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1
            r1 = 0
            r2 = r14
            r3 = r15
            r5 = r16
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r14 = r0
            r13.f = r7
            java.lang.Object r13 = r15.j(r5, r14, r13)
            if (r13 != r6) goto L76
            goto La6
        L76:
            return r13
        L77:
            r5 = r16
            r4 = r17
            r13.a = r15
            r13.b = r14
            r13.c = r5
            r13.d = r4
            r13.f = r3
            w61 r3 = a(r15, r4, r13)
            if (r3 != r6) goto L8c
            goto La6
        L8c:
            r9 = r14
            r10 = r15
            r0 = r3
            r12 = r4
            r11 = r5
        L91:
            w61 r0 = (defpackage.w61) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r7 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r8 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = 0
            r13.a = r14
            r13.b = r14
            r13.f = r2
            java.lang.Object r13 = defpackage.bt2.Z(r0, r7, r13)
            if (r13 != r6) goto La7
        La6:
            return r6
        La7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.a.b(g51, dp2, androidx.room.d, boolean, boolean):java.lang.Object");
    }
}
