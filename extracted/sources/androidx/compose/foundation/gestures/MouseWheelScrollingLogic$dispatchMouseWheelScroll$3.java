package androidx.compose.foundation.gestures;

import defpackage.dh7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {297, 310, 334}, m = "invokeSuspend", v = 1)
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements qp2 {
    public Ref$BooleanRef a;
    public Ref$BooleanRef b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Ref$FloatRef f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ Ref$ObjectRef h;
    public final /* synthetic */ float i;
    public final /* synthetic */ i j;
    public final /* synthetic */ float k;
    public final /* synthetic */ o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref$FloatRef ref$FloatRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, float f, i iVar, float f2, o oVar, g51 g51Var) {
        super(2, g51Var);
        this.f = ref$FloatRef;
        this.g = ref$ObjectRef;
        this.h = ref$ObjectRef2;
        this.i = f;
        this.j = iVar;
        this.k = f2;
        this.l = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.f, this.g, this.h, this.i, this.j, this.k, this.l, g51Var);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.e = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create((dh7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x018b -> B:37:0x018c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
