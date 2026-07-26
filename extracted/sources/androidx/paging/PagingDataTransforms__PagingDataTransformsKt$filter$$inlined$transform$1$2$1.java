package androidx.paging;

import defpackage.g51;
import defpackage.if2;
import defpackage.tb1;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {52, 50}, m = "emit", v = 1)
public final class PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ze2 c;
    public final /* synthetic */ if2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1(if2 if2Var, g51 g51Var) {
        super(g51Var);
        this.d = if2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
