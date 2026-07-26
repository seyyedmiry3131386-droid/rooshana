package kotlinx.coroutines.channels;

import defpackage.dp2;
import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {41}, m = "consumeEach")
final class ChannelsKt__DeprecatedKt$consumeEach$1<E> extends ContinuationImpl {
    public dp2 a;
    public pw6 b;
    public lh0 c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        int i = (this.e | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.e = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lh0 lh0Var = this.c;
        pw6 pw6Var = this.b;
        dp2 dp2Var = this.a;
        try {
            kotlin.b.b(obj);
            while (((Boolean) obj).booleanValue()) {
                dp2Var.invoke(lh0Var.f());
                this.a = dp2Var;
                this.b = pw6Var;
                this.c = lh0Var;
                this.e = 1;
                obj = lh0Var.d(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            pw6Var.g(null);
            return tx8.a;
        } catch (Throwable th) {
            pw6Var.g(null);
            throw th;
        }
    }
}
