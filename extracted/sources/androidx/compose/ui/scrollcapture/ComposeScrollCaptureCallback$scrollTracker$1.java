package androidx.compose.ui.scrollcapture;

import defpackage.g51;
import defpackage.nr5;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {90}, m = "invokeSuspend", v = 1)
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ float b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.c, g51Var);
        composeScrollCaptureCallback$scrollTracker$1.b = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(((Number) obj).floatValue()), (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            float f = this.b;
            a aVar = this.c;
            qp2 qp2Var = (qp2) androidx.compose.ui.semantics.b.a(aVar.a.d, androidx.compose.ui.semantics.a.e);
            if (qp2Var == null) {
                throw t61.r("Required value was null.");
            }
            nr5 nr5Var = new nr5((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.a = 1;
            obj = qp2Var.invoke(nr5Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((nr5) obj).a & 4294967295L)));
    }
}
