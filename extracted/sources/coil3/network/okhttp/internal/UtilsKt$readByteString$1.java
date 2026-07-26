package coil3.network.okhttp.internal;

import defpackage.gh0;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {39}, m = "readByteString")
final class UtilsKt$readByteString$1 extends ContinuationImpl {
    public gh0 a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UtilsKt$readByteString$1 utilsKt$readByteString$1;
        this.b = obj;
        int i = this.c | Integer.MIN_VALUE;
        this.c = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.c = i - Integer.MIN_VALUE;
            utilsKt$readByteString$1 = this;
        } else {
            utilsKt$readByteString$1 = new UtilsKt$readByteString$1(this);
        }
        Object obj2 = utilsKt$readByteString$1.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = utilsKt$readByteString$1.c;
        if (i2 == 0) {
            kotlin.b.b(obj2);
            utilsKt$readByteString$1.a = new gh0();
            utilsKt$readByteString$1.c = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gh0 gh0Var = utilsKt$readByteString$1.a;
        kotlin.b.b(obj2);
        return gh0Var.v(gh0Var.b);
    }
}
