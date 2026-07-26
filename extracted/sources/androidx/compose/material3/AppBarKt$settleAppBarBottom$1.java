package androidx.compose.material3;

import defpackage.hm;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {2424, 2440}, m = "settleAppBarBottom")
final class AppBarKt$settleAppBarBottom$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$1;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        int i2 = hm.a;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            appBarKt$settleAppBarBottom$1 = this;
        } else {
            appBarKt$settleAppBarBottom$1 = new AppBarKt$settleAppBarBottom$1(this);
        }
        Object obj2 = appBarKt$settleAppBarBottom$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = appBarKt$settleAppBarBottom$1.b;
        if (i3 == 0) {
            kotlin.b.b(obj2);
            throw null;
        }
        if (i3 != 1 && i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj2);
        throw null;
    }
}
