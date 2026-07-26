package androidx.media3.common;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.common.PlayerExtensionsKt", f = "PlayerExtensions.kt", l = {47, 49}, m = "listen")
final class PlayerExtensionsKt$listen$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        c.a(null, null, this);
        return CoroutineSingletons.a;
    }
}
