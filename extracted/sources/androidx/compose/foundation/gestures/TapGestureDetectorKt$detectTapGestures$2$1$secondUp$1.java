package androidx.compose.foundation.gestures;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
final class TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(j jVar, g51 g51Var) {
        super(2, g51Var);
        this.a = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1 tapGestureDetectorKt$detectTapGestures$2$1$secondUp$1 = (TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        tapGestureDetectorKt$detectTapGestures$2$1$secondUp$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        this.a.b();
        return tx8.a;
    }
}
