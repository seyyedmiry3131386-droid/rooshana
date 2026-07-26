package androidx.room.coroutines;

import defpackage.e9;
import defpackage.g51;
import defpackage.tb1;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {220, 219}, m = "emit")
public final class FlowUtil$createFlow$$inlined$map$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public ze2 c;
    public final /* synthetic */ e9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowUtil$createFlow$$inlined$map$1$2$1(e9 e9Var, g51 g51Var) {
        super(g51Var);
        this.d = e9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
