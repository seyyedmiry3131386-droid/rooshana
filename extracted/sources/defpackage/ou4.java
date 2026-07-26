package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.p1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ou4 implements n81 {
    public static final p1 b = p1.c().g(new sr4(24)).a(p1.c().h().g(new sr4(25)));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.n81
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((o81) arrayList.get(i)).b;
            long j3 = ((o81) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.n81
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.n81
    public final boolean d(o81 o81Var, long j) {
        long j2 = o81Var.b;
        vy2.j(j2 != -9223372036854775807L);
        vy2.j(o81Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < o81Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((o81) arrayList.get(size)).b) {
                arrayList.add(size + 1, o81Var);
                return z;
            }
        }
        arrayList.add(0, o81Var);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n81
    public final ImmutableList e(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((o81) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    o81 o81Var = (o81) arrayList.get(i);
                    if (j >= o81Var.b && j < o81Var.d) {
                        arrayList2.add(o81Var);
                    }
                    if (j < o81Var.b) {
                        break;
                    }
                }
                ImmutableList immutableListX = ImmutableList.x(b, arrayList2);
                lj3 lj3VarM = ImmutableList.m();
                for (int i2 = 0; i2 < immutableListX.size(); i2++) {
                    lj3VarM.Q(((o81) immutableListX.get(i2)).a);
                }
                return lj3VarM.S();
            }
        }
        return ImmutableList.q();
    }

    @Override // defpackage.n81
    public final long g(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((o81) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((o81) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((o81) arrayList.get(i)).b;
            long j3 = ((o81) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.n81
    public final void h(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((o81) arrayList.get(i)).b;
            if (j > j2 && j > ((o81) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
