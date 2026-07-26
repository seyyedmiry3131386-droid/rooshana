package defpackage;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fi1 {
    public long a;
    public final Object b;
    public final Object c;

    public fi1(long j, dc0 dc0Var) {
        this.a = j;
        this.b = dc0Var;
        hg0 hg0Var = new hg0();
        hg0Var.d = this;
        hg0Var.c = new LinkedHashMap(0, 0.75f, true);
        hg0Var.a = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = hg0Var;
    }

    public void a(long j, long j2) {
        ((f49) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((f49) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public void b(ht4 ht4Var, wh3 wh3Var, Map map, long j) {
        hg0 hg0Var = (hg0) this.c;
        long j2 = hg0Var.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) hg0Var.c;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(ht4Var);
            if (objRemove != null) {
                hg0Var.b = hg0Var.c() - hg0Var.g(ht4Var, objRemove);
                hg0Var.b(ht4Var, objRemove, null);
            }
            ((dc0) this.b).w(ht4Var, wh3Var, map, j);
            return;
        }
        hw6 hw6Var = new hw6(wh3Var, map, j);
        Object objPut = linkedHashMap.put(ht4Var, hw6Var);
        hg0Var.b = hg0Var.g(ht4Var, hw6Var) + hg0Var.c();
        if (objPut != null) {
            hg0Var.b = hg0Var.c() - hg0Var.g(ht4Var, objPut);
            hg0Var.b(ht4Var, objPut, hw6Var);
        }
        hg0Var.j(hg0Var.a);
    }

    public fi1() {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy = VelocityTracker1D$Strategy.a;
        this.b = new f49();
        this.c = new f49();
    }
}
