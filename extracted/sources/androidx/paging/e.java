package androidx.paging;

import defpackage.a06;
import defpackage.br9;
import defpackage.d9;
import defpackage.ew;
import defpackage.ff2;
import defpackage.fu0;
import defpackage.gf2;
import defpackage.i30;
import defpackage.js3;
import defpackage.mq8;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.ru7;
import defpackage.vb7;
import defpackage.xe2;
import defpackage.xp;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Object a = new Object();

    public static final void a(List list, Object obj, mq8 mq8Var, mq8 mq8Var2, int i, int i2) {
        js3.p(list, "<this>");
        int[] iArrO0 = mq8Var != null ? mq8Var.a : null;
        int[] iArr = mq8Var2 != null ? mq8Var2.a : null;
        if (iArrO0 != null && iArr != null) {
            int[] iArrR0 = ew.R0(iArrO0, iArr);
            LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.collections.b.L(iArrR0.length));
            for (int i3 : iArrR0) {
                linkedHashSet.add(Integer.valueOf(i3));
            }
            iArrO0 = kotlin.collections.a.O0(kotlin.collections.a.I0(kotlin.collections.a.P0(linkedHashSet)));
        } else if (iArrO0 == null && iArr != null) {
            iArrO0 = iArr;
        } else if (iArrO0 == null || iArr != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (obj == null) {
            return;
        }
        list.add(new mq8(iArrO0, br9.B(obj), i, br9.B(Integer.valueOf(i2))));
    }

    public static final pv6 b(xe2 xe2Var, fu0 fu0Var) {
        js3.p(xe2Var, "<this>");
        xe2 xe2VarI = i(xe2Var, new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(null, fu0Var));
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(3, null);
        js3.p(xe2VarI, "<this>");
        return kotlinx.coroutines.flow.d.z(new ff2(new gf2(new d9(1, new vb7(new FlowExtKt$simpleRunningReduce$1(xe2VarI, cachedPagingDataKt$cachedIn$2, null))), new CachedPagingDataKt$cachedIn$4(2, null)), new CachedPagingDataKt$cachedIn$5(3, null)), fu0Var, ru7.b, 1);
    }

    public static final a06 c(a06 a06Var, qp2 qp2Var) {
        js3.p(a06Var, "<this>");
        return new a06(new gf2(a06Var.a, qp2Var, 6), a06Var.b, a06Var.c, i30.e);
    }

    public static final a06 d(a06 a06Var, qp2 qp2Var) {
        js3.p(a06Var, "<this>");
        return new a06(new gf2(a06Var.a, qp2Var, 7), a06Var.b, a06Var.c, i30.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.mq8 r10, defpackage.rp2 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e.e(mq8, rp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static a06 f(a06 a06Var, rp2 rp2Var) {
        TerminalSeparatorType terminalSeparatorType = TerminalSeparatorType.a;
        xe2 xe2Var = a06Var.a;
        js3.p(xe2Var, "<this>");
        return new a06(new xp(xe2Var, new o(terminalSeparatorType, new SeparatorsKt$insertEventSeparators$separatorState$1(rp2Var, null)), 17), a06Var.b, a06Var.c, i30.e);
    }

    public static final a06 g(a06 a06Var, qp2 qp2Var) {
        js3.p(a06Var, "<this>");
        return new a06(new gf2(a06Var.a, qp2Var, 8), a06Var.b, a06Var.c, i30.e);
    }

    public static final xe2 h(qp2 qp2Var) {
        return kotlinx.coroutines.flow.d.d(new vb7(new SimpleChannelFlowKt$simpleChannelFlow$1(qp2Var, null)), -2);
    }

    public static final xe2 i(xe2 xe2Var, rp2 rp2Var) {
        js3.p(xe2Var, "<this>");
        return h(new FlowExtKt$simpleTransformLatest$1(xe2Var, rp2Var, null));
    }
}
