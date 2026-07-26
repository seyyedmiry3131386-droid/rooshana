package androidx.compose.foundation.text.input.internal;

import defpackage.t61;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {60}, m = "platformSpecificTextInputSession", v = 1)
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = this;
        } else {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(this);
        }
        Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.b;
        if (i2 == 0) {
            kotlin.b.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw t61.q(obj2);
    }
}
