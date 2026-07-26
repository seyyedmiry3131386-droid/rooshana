package androidx.compose.foundation.text;

import defpackage.tb1;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", l = {ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR}, m = "getContextMenuItemsAvailability", v = 1)
final class CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 commonContextMenuAreaKt$getContextMenuItemsAvailability$1;
        this.a = obj;
        int i = this.b | Integer.MIN_VALUE;
        this.b = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.b = i - Integer.MIN_VALUE;
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = this;
        } else {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$1(this);
        }
        Object obj2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.b;
        if (i2 == 0) {
            kotlin.b.b(obj2);
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1.b = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj2);
        throw null;
    }
}
