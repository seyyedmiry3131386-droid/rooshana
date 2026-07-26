package androidx.compose.foundation;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend", v = 1)
final class MagnifierNode$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(j jVar, g51 g51Var) {
        super(2, g51Var);
        this.b = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MagnifierNode$onAttach$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MagnifierNode$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (defpackage.ml9.s(getContext()).k0(r7, new defpackage.ut2(1, r8)) == r0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:13:0x0025, B:16:0x002e], limit reached: 23 */
    /* JADX WARN: Path cross not found for [B:16:0x002e, B:13:0x0025], limit reached: 23 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:21:0x0050). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            androidx.compose.foundation.j r4 = r7.b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.b.b(r8)
            goto L50
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.b.b(r8)
            goto L2e
        L1e:
            kotlin.b.b(r8)
        L21:
            kotlinx.coroutines.channels.a r8 = r4.y
            if (r8 == 0) goto L2e
            r7.a = r3
            java.lang.Object r8 = r8.l(r7)
            if (r8 != r0) goto L2e
            goto L4f
        L2e:
            r96 r8 = r4.t
            if (r8 == 0) goto L21
            us3 r8 = new us3
            r1 = 13
            r8.<init>(r1)
            r7.a = r2
            w61 r1 = r7.getContext()
            qx4 r1 = defpackage.ml9.s(r1)
            ut2 r5 = new ut2
            r6 = 1
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.k0(r7, r5)
            if (r8 != r0) goto L50
        L4f:
            return r0
        L50:
            r96 r8 = r4.t
            if (r8 == 0) goto L21
            t96 r8 = (defpackage.t96) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
