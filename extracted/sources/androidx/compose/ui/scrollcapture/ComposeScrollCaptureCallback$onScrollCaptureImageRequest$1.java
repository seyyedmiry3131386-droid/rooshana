package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.vq3;
import java.util.function.Consumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {121}, m = "invokeSuspend", v = 1)
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ScrollCaptureSession c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ Consumer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(a aVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = scrollCaptureSession;
        this.d = rect;
        this.e = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ScrollCaptureSession scrollCaptureSession = this.c;
            Rect rect = this.d;
            vq3 vq3Var = new vq3(rect.left, rect.top, rect.right, rect.bottom);
            this.a = 1;
            obj = a.a(this.b, scrollCaptureSession, vq3Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.e.n(uy6.r((vq3) obj));
        return tx8.a;
    }
}
