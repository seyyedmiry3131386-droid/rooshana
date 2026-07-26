package androidx.compose.foundation.text;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", l = {212}, m = "getContextMenuItemsAvailability", v = 1)
final class CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 commonContextMenuAreaKt$getContextMenuItemsAvailability$2;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = this;
        } else {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(this);
        }
        Object obj2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.b;
        if (i2 == 0) {
            kotlin.b.b(obj2);
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2.b = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj2);
        throw null;
    }
}
