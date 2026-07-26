package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pr implements gb8, h51, gr4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pr(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // defpackage.gr4
    public void b(hq4 hq4Var) {
        hr4 hr4Var = (hr4) this.b;
        n94 n94VarR = hr4Var.g.r(hq4Var, ImmutableList.s((jp4) this.c), -1, -9223372036854775807L);
        wx7 wx7Var = new wx7(hr4Var, hq4Var, this.a);
        Executor executorA = e.a();
        ((i0) n94VarR).e(new g6(14, n94VarR, wx7Var, false), executorA);
    }

    @Override // defpackage.h51
    public Object f(bf8 bf8Var) {
        return (wn5.R() && ((Integer) bf8Var.d()).intValue() == 402) ? do3.m((Context) this.b, (Intent) this.c, this.a).j(new qa(0), new vv1(13)) : bf8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    @Override // defpackage.gb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.onSuccess(java.lang.Object):void");
    }
}
