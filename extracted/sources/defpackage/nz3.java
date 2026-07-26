package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import kotlin.time.DurationUnit;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class nz3 {
    public final mz3 a = new mz3();
    public final boolean b = true;

    public final void a(List list) {
        mz3 mz3Var = this.a;
        av avVar = mz3Var.a;
        Level level = Level.b;
        avVar.getClass();
        int iCompareTo = Level.e.compareTo(level);
        boolean z = this.b;
        if (iCompareTo > 0) {
            mz3Var.d(list, z);
            return;
        }
        long jA = rx4.a();
        mz3Var.d(list, z);
        long jA2 = sl8.a(jA);
        int size = ((ConcurrentHashMap) mz3Var.d.b).size();
        av avVar2 = mz3Var.a;
        StringBuilder sbR = rm7.r(size, "Started ", " definitions in ");
        int i = qx1.d;
        sbR.append(qx1.h(jA2, DurationUnit.c) / 1000.0d);
        sbR.append(" ms");
        String string = sbR.toString();
        avVar2.getClass();
        js3.p(string, "msg");
    }
}
