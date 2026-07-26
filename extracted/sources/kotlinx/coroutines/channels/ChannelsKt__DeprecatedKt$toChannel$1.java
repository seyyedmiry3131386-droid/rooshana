package kotlinx.coroutines.channels;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import defpackage.wn7;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514, 308}, m = "toChannel")
final class ChannelsKt__DeprecatedKt$toChannel$1<E, C extends wn7> extends ContinuationImpl {
    public wn7 a;
    public pw6 b;
    public lh0 c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return b.d(null, null, this);
    }
}
