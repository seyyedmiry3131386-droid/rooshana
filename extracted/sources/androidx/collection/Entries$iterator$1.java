package androidx.collection;

import defpackage.g51;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
final class Entries$iterator$1 extends RestrictedSuspendLambda implements qp2 {
    public a b;
    public long[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Entries$iterator$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.k = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        Entries$iterator$1 entries$iterator$1 = new Entries$iterator$1(this.k, g51Var);
        entries$iterator$1.j = obj;
        return entries$iterator$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((Entries$iterator$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004e -> B:22:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.i
            r3 = 2
            r4 = 0
            r5 = 8
            r6 = 1
            if (r2 == 0) goto L2e
            if (r2 != r6) goto L26
            int r2 = r0.g
            int r7 = r0.f
            long r8 = r0.h
            int r10 = r0.e
            int r11 = r0.d
            long[] r12 = r0.c
            androidx.collection.a r13 = r0.b
            java.lang.Object r14 = r0.j
            io7 r14 = (defpackage.io7) r14
            kotlin.b.b(r22)
            goto L98
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            kotlin.b.b(r22)
            java.lang.Object r2 = r0.j
            io7 r2 = (defpackage.io7) r2
            androidx.collection.a r7 = r0.k
            rb5 r8 = r7.b
            long[] r8 = r8.a
            int r9 = r8.length
            int r9 = r9 - r3
            if (r9 < 0) goto La6
            r10 = r4
        L40:
            r11 = r8[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r13
            r13 = r7
            r7 = r14
            r14 = r2
            r2 = r4
            r19 = r11
            r12 = r8
            r11 = r9
            r8 = r19
        L62:
            if (r2 >= r7) goto L9b
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r8
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L98
            int r4 = r10 << 3
            int r4 = r4 + r2
            eh4 r5 = new eh4
            rb5 r15 = r13.b
            java.lang.Object[] r6 = r15.b
            r6 = r6[r4]
            java.lang.Object[] r15 = r15.c
            r4 = r15[r4]
            r5.<init>(r6, r4, r3)
            r0.j = r14
            r0.b = r13
            r0.c = r12
            r0.d = r11
            r0.e = r10
            r0.h = r8
            r0.f = r7
            r0.g = r2
            r6 = 1
            r0.i = r6
            r14.b(r0, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r1
        L98:
            long r8 = r8 >> r5
            int r2 = r2 + r6
            goto L62
        L9b:
            if (r7 != r5) goto La6
            r9 = r11
            r8 = r12
            r7 = r13
            r2 = r14
        La1:
            if (r10 == r9) goto La6
            int r10 = r10 + 1
            goto L40
        La6:
            tx8 r1 = defpackage.tx8.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.Entries$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
