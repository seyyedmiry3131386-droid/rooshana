package androidx.paging;

import defpackage.b97;
import defpackage.g51;
import defpackage.tb1;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", l = {51, 50}, m = "emit", v = 1)
public final class SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ze2 c;
    public final /* synthetic */ b97 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1(b97 b97Var, g51 g51Var) {
        super(g51Var);
        this.d = b97Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
