package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b01 implements ko7 {
    public final ImmutableList a;
    public long b;

    public b01(List list, List list2) {
        lj3 lj3VarM = ImmutableList.m();
        vy2.j(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            lj3VarM.O(new a01((ko7) list.get(i), (List) list2.get(i)));
        }
        this.a = lj3VarM.S();
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ko7
    public final boolean a() {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                return false;
            }
            if (((a01) immutableList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ko7
    public final long f() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            long jF = ((a01) immutableList.get(i)).f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        boolean zP;
        boolean z = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zP = false;
            while (true) {
                ImmutableList immutableList = this.a;
                if (i >= immutableList.size()) {
                    break;
                }
                long jF2 = ((a01) immutableList.get(i)).a.f();
                boolean z2 = jF2 != Long.MIN_VALUE && jF2 <= bb4Var.a;
                if (jF2 == jF || z2) {
                    zP |= ((a01) immutableList.get(i)).a.p(bb4Var);
                }
                i++;
            }
            z |= zP;
        } while (zP);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ko7
    public final long q() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            a01 a01Var = (a01) immutableList.get(i);
            long jQ = a01Var.q();
            ImmutableList immutableList2 = a01Var.b;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && jQ != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jQ);
            }
            if (jQ != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jQ);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ko7
    public final void v(long j) {
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i >= immutableList.size()) {
                return;
            }
            ((a01) immutableList.get(i)).v(j);
            i++;
        }
    }
}
