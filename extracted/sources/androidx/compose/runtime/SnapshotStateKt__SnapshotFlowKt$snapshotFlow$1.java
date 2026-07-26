package androidx.compose.runtime;

import defpackage.bp2;
import defpackage.cp0;
import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sb5;
import defpackage.tb1;
import defpackage.ts5;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {143, 147, 170}, m = "invokeSuspend", v = 1)
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements qp2 {
    public sb5 a;
    public dp2 b;
    public cp0 c;
    public ts5 d;
    public Object e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ bp2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(bp2 bp2Var, g51 g51Var) {
        super(2, g51Var);
        this.h = bp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.h, g51Var);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.g = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x018d, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:45:0x00fc, B:57:0x012d], limit reached: 125 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0151 A[EDGE_INSN: B:124:0x0151->B:68:0x0151 BREAK  A[LOOP:0: B:38:0x00da->B:94:0x01a7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[Catch: all -> 0x0024, PHI: r2 r4 r6 r7 r8 r9 r10 r11
      0x00d7: PHI (r2v9 java.lang.Object) = (r2v12 java.lang.Object), (r2v15 java.lang.Object) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r4v1 int) = (r4v9 int), (r4v0 int) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r6v7 ts5) = (r6v23 ts5), (r6v26 ts5) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r7v2 cp0) = (r7v3 cp0), (r7v6 cp0) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r8v1 dp2) = (r8v2 dp2), (r8v5 dp2) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r9v1 sb5) = (r9v2 sb5), (r9v5 sb5) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r10v2 ze2) = (r10v3 ze2), (r10v8 ze2) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r11v5 java.lang.Object) = (r11v10 java.lang.Object), (r11v11 java.lang.Object) binds: [B:34:0x00d3, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0024, blocks: (B:8:0x001f, B:33:0x00c1, B:36:0x00d7, B:77:0x017e, B:92:0x01a3, B:93:0x01a6, B:15:0x003d, B:18:0x0052, B:25:0x0092, B:29:0x00a7, B:100:0x01b5, B:101:0x01b8, B:26:0x009c, B:28:0x00a4, B:98:0x01b1, B:99:0x01b4), top: B:113:0x0009, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #1 {all -> 0x0191, blocks: (B:50:0x0118, B:66:0x0144, B:69:0x0153, B:73:0x016b, B:75:0x0174, B:54:0x0123, B:58:0x012f), top: B:109:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7 A[LOOP:0: B:38:0x00da->B:94:0x01a7, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x018c -> B:81:0x018d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
