package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class vk0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public zd1 e;

    public vk0(int i, String str, zd1 zd1Var) {
        this.a = i;
        this.b = str;
        this.e = zd1Var;
    }

    public final boolean a(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            uk0 uk0Var = (uk0) arrayList.get(i);
            long j3 = uk0Var.a;
            long j4 = uk0Var.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vk0.class == obj.getClass()) {
            vk0 vk0Var = (vk0) obj;
            if (this.a == vk0Var.a && this.b.equals(vk0Var.b) && this.c.equals(vk0Var.c) && this.e.equals(vk0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + rm7.k(this.b, this.a * 31, 31);
    }
}
