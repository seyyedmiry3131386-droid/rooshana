package io.sentry.compose.viewhierarchy;

import androidx.compose.ui.node.e;
import androidx.compose.ui.node.h;
import defpackage.c26;
import defpackage.js3;
import defpackage.jx4;
import defpackage.sy6;
import defpackage.zb5;
import io.sentry.compose.b;
import io.sentry.protocol.i0;
import io.sentry.u0;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewHierarchyExporter {
    public final u0 a;
    public volatile b b;
    public final AutoClosableReentrantLock c;

    public ComposeViewHierarchyExporter(u0 u0Var) {
        js3.p(u0Var, "logger");
        this.a = u0Var;
        this.c = new AutoClosableReentrantLock();
    }

    public static void a(b bVar, i0 i0Var, h hVar) {
        if (hVar.V()) {
            i0 i0Var2 = new i0();
            Iterator it = hVar.D().iterator();
            while (it.hasNext()) {
                String strA = bVar.a(((jx4) it.next()).a);
                if (strA != null) {
                    i0Var2.d = strA;
                }
            }
            sy6 sy6VarM = c26.m((e) hVar.H.d);
            i0Var2.g = Double.valueOf(sy6VarM.a);
            i0Var2.h = Double.valueOf(sy6VarM.b);
            i0Var2.f = Double.valueOf(sy6VarM.d - r3);
            i0Var2.e = Double.valueOf(sy6VarM.c - r2);
            String str = i0Var2.d;
            if (str == null) {
                str = "@Composable";
            }
            i0Var2.b = str;
            if (i0Var.k == null) {
                i0Var.k = new ArrayList();
            }
            List list = i0Var.k;
            js3.m(list);
            list.add(i0Var2);
            zb5 zb5VarK = hVar.K();
            int i = zb5VarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                a(bVar, i0Var2, (h) zb5VarK.a[i2]);
            }
        }
    }
}
