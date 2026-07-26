package androidx.compose.ui.platform;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {776}, m = "textInputSession", v = 1)
final class AndroidComposeView$textInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ AndroidComposeView b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$1(AndroidComposeView androidComposeView, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = androidComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.J(null, this);
        return CoroutineSingletons.a;
    }
}
