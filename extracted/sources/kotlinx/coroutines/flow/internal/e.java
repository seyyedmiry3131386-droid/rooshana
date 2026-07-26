package kotlinx.coroutines.flow.internal;

import defpackage.bt2;
import defpackage.ct2;
import defpackage.dt2;
import defpackage.e71;
import defpackage.fo7;
import defpackage.g51;
import defpackage.pw6;
import defpackage.qk6;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tx8;
import defpackage.w61;
import defpackage.xe2;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {
    public final Iterable d;

    public e(Iterable iterable, w61 w61Var, int i, BufferOverflow bufferOverflow) {
        super(w61Var, i, bufferOverflow);
        this.d = iterable;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object f(rk6 rk6Var, g51 g51Var) {
        fo7 fo7Var = new fo7(rk6Var);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            bt2.G(rk6Var, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((xe2) it.next(), fo7Var, null), 3);
        }
        return tx8.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final a g(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return new e(this.d, w61Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final pw6 i(e71 e71Var) {
        qp2 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        BufferOverflow bufferOverflow = BufferOverflow.a;
        CoroutineStart coroutineStart = CoroutineStart.a;
        qk6 qk6Var = new qk6(ct2.p(e71Var, this.a), dt2.b(this.b, 4, bufferOverflow));
        qk6Var.m0(coroutineStart, qk6Var, channelFlow$collectToFun$1);
        return qk6Var;
    }
}
