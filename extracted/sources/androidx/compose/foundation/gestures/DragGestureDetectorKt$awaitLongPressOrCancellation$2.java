package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vg6;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1026, 1048}, m = "invokeSuspend", v = 1)
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements qp2 {
    public vg6 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Ref$BooleanRef f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ Ref$ObjectRef h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, g51 g51Var) {
        super(2, g51Var);
        this.f = ref$BooleanRef;
        this.g = ref$ObjectRef;
        this.h = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.f, this.g, this.h, g51Var);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.e = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[EDGE_INSN: B:69:0x00d0->B:45:0x00d0 BREAK  A[LOOP:0: B:40:0x00bd->B:44:0x00cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b1 -> B:39:0x00b4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
