package defpackage;

import androidx.compose.material3.e;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class zv4 extends gx4 implements m01, f14 {
    public LinkedHashMap o;

    @Override // defpackage.f14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        float f = ((au1) y97.t(this, e.c)).a;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        b96 b96VarT = yk4Var.t(j);
        boolean z = this.n && !Float.isNaN(f) && au1.a(f, f2) > 0;
        int iB0 = !Float.isNaN(f) ? el4Var.b0(f) : 0;
        int iMax = z ? Math.max(b96VarT.a, iB0) : b96VarT.a;
        int iMax2 = z ? Math.max(b96VarT.b, iB0) : b96VarT.b;
        if (z) {
            LinkedHashMap linkedHashMap = this.o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.o = linkedHashMap;
            }
            v49 v49Var = e.b;
            int iRound = Math.round((iB0 - b96VarT.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(v49Var, Integer.valueOf(iRound));
            pc3 pc3Var = e.a;
            int iRound2 = Math.round((iB0 - b96VarT.b) / 2.0f);
            linkedHashMap.put(pc3Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map mapI = this.o;
        if (mapI == null) {
            mapI = b.I();
        }
        return el4Var.D(iMax, iMax2, mapI, new uo3(iMax, b96VarT, iMax2));
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }
}
