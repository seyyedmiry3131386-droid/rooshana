package androidx.compose.ui.scrollcapture;

import defpackage.tb1;
import defpackage.vq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {136, 138, 142}, m = "onScrollCaptureImageRequest", v = 1)
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends ContinuationImpl {
    public Object a;
    public vq3 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return a.a(this.f, null, null, this);
    }
}
