package androidx.compose.ui.platform;

import defpackage.lh0;
import defpackage.tb1;
import defpackage.za5;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2196, 2231}, m = "boundsUpdatesEventLoop$ui", v = 1)
final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    public za5 a;
    public lh0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(this);
    }
}
