package kotlinx.coroutines.flow.internal;

import defpackage.bl4;
import defpackage.cq2;
import defpackage.ct2;
import defpackage.dt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.pw6;
import defpackage.qk6;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.tx8;
import defpackage.w61;
import defpackage.xe2;
import defpackage.ze2;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements cq2 {
    public final w61 a;
    public final int b;
    public final BufferOverflow c;

    public a(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        this.a = w61Var;
        this.b = i;
        this.c = bufferOverflow;
    }

    @Override // defpackage.xe2
    public Object a(ze2 ze2Var, g51 g51Var) {
        Object objV = js3.v(new ChannelFlow$collect$2(ze2Var, this, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.cq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xe2 c(defpackage.w61 r5, int r6, kotlinx.coroutines.channels.BufferOverflow r7) {
        /*
            r4 = this;
            w61 r0 = r4.a
            w61 r5 = r5.l0(r0)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.a
            kotlinx.coroutines.channels.BufferOverflow r2 = r4.c
            int r3 = r4.b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.js3.i(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            kotlinx.coroutines.flow.internal.a r5 = r4.g(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.a.c(w61, int, kotlinx.coroutines.channels.BufferOverflow):xe2");
    }

    public String d() {
        return null;
    }

    public abstract Object f(rk6 rk6Var, g51 g51Var);

    public abstract a g(w61 w61Var, int i, BufferOverflow bufferOverflow);

    public xe2 h() {
        return null;
    }

    public pw6 i(e71 e71Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.c;
        qp2 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        qk6 qk6Var = new qk6(ct2.p(e71Var, this.a), dt2.b(i, 4, this.c));
        qk6Var.m0(coroutineStart, qk6Var, channelFlow$collectToFun$1);
        return qk6Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        w61 w61Var = this.a;
        if (w61Var != emptyCoroutineContext) {
            arrayList.add("context=" + w61Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.a;
        BufferOverflow bufferOverflow2 = this.c;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return bl4.y(sb, kotlin.collections.a.t0(arrayList, ", ", null, null, null, 62), ']');
    }
}
