package androidx.compose.foundation.gestures;

import defpackage.ah6;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.g51;
import defpackage.nq0;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 254, 1116, 1158, 279, 1197, 1240, 1252}, m = "invokeSuspend", v = 1)
final class DragGestureDetectorKt$detectDragGestures$13 extends RestrictedSuspendLambda implements qp2 {
    public Object b;
    public Object c;
    public Ref$LongRef d;
    public Ref$LongRef e;
    public nq0 f;
    public ah6 g;
    public boolean h;
    public float i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bp2 l;
    public final /* synthetic */ Ref$LongRef m;
    public final /* synthetic */ Orientation n;
    public final /* synthetic */ rp2 o;
    public final /* synthetic */ qp2 p;
    public final /* synthetic */ bp2 q;
    public final /* synthetic */ dp2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$13(bp2 bp2Var, Ref$LongRef ref$LongRef, Orientation orientation, rp2 rp2Var, qp2 qp2Var, bp2 bp2Var2, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.l = bp2Var;
        this.m = ref$LongRef;
        this.n = orientation;
        this.o = rp2Var;
        this.p = qp2Var;
        this.q = bp2Var2;
        this.r = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.l, this.m, this.n, this.o, this.p, this.q, this.r, g51Var);
        dragGestureDetectorKt$detectDragGestures$13.k = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x04a1, code lost:
    
        if (r6 == r1) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0503, code lost:
    
        if (defpackage.nr5.d(defpackage.at2.i0(r7, true)) == 0.0f) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0170, code lost:
    
        if (r5 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0178, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d1, code lost:
    
        if (r5 == r1) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fc A[PHI: r2 r3 r4 r5 r6 r11 r13 r14 r15 r16 r18
      0x00fc: PHI (r2v18 float) = (r2v12 float), (r2v31 float) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r3v11 nq0) = (r3v8 nq0), (r3v23 nq0) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r4v10 androidx.compose.ui.input.pointer.e) = (r4v5 androidx.compose.ui.input.pointer.e), (r4v13 androidx.compose.ui.input.pointer.e) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r5v13 androidx.compose.ui.input.pointer.e) = (r5v6 androidx.compose.ui.input.pointer.e), (r5v15 androidx.compose.ui.input.pointer.e) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r6v7 ah6) = (r6v2 ah6), (r6v8 ah6) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r11v3 int) = (r11v0 int), (r11v16 int) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r13v8 kotlin.jvm.internal.Ref$LongRef) = (r13v2 kotlin.jvm.internal.Ref$LongRef), (r13v10 kotlin.jvm.internal.Ref$LongRef) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r14v4 kotlin.jvm.internal.Ref$LongRef) = (r14v2 kotlin.jvm.internal.Ref$LongRef), (r14v5 kotlin.jvm.internal.Ref$LongRef) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r15v3 java.lang.Object) = (r15v2 java.lang.Object), (r15v7 java.lang.Object) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r16v10 long) = (r16v5 long), (r16v11 long) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r18v10 long) = (r18v5 long), (r18v11 long) binds: [B:12:0x00d2, B:33:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0336 -> B:160:0x043f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x033e -> B:114:0x0354). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0435 -> B:157:0x0436). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x04a1 -> B:172:0x04a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0186 -> B:30:0x0188). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x018b -> B:32:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0276 -> B:72:0x027c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0293 -> B:82:0x029e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02fb -> B:88:0x02b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
