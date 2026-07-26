package androidx.media3.common;

import defpackage.gb6;
import defpackage.qp2;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.common.PlayerExtensionsKt", f = "PlayerExtensions.kt", l = {112}, m = "listenImpl")
final class PlayerExtensionsKt$listenImpl$1 extends ContinuationImpl {
    public gb6 a;
    public qp2 b;
    public Ref$ObjectRef c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        c.b(null, null, this);
        return CoroutineSingletons.a;
    }
}
