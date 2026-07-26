package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class gk9 implements Iterable, xk9, rk9 {
    public final TreeMap a;
    public final TreeMap b;

    public gk9() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    @Override // defpackage.xk9
    public final Iterator a() {
        return new ck9(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    @Override // defpackage.xk9
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // defpackage.rk9
    public final xk9 d(String str) {
        xk9 xk9Var;
        return "length".equals(str) ? new nk9(Double.valueOf(o())) : (!f(str) || (xk9Var = (xk9) this.b.get(str)) == null) ? xk9.p0 : xk9Var;
    }

    @Override // defpackage.rk9
    public final void e(String str, xk9 xk9Var) {
        TreeMap treeMap = this.b;
        if (xk9Var == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, xk9Var);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gk9)) {
            return false;
        }
        gk9 gk9Var = (gk9) obj;
        if (o() != gk9Var.o()) {
            return false;
        }
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return gk9Var.a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!p(iIntValue).equals(gk9Var.p(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rk9
    public final boolean f(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final List h() {
        ArrayList arrayList = new ArrayList(o());
        for (int i = 0; i < o(); i++) {
            arrayList.add(p(i));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.xk9
    public final Double i() {
        TreeMap treeMap = this.a;
        return treeMap.size() == 1 ? p(0).i() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new al9(2, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (defpackage.j27.n(r7, r2, (defpackage.vk9) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).o() == r7.o()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    @Override // defpackage.xk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xk9 j(java.lang.String r38, defpackage.o77 r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instruction units count: 2200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk9.j(java.lang.String, o77, java.util.ArrayList):xk9");
    }

    @Override // defpackage.xk9
    public final String l() {
        return t(",");
    }

    @Override // defpackage.xk9
    public final xk9 m() {
        gk9 gk9Var = new gk9();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof rk9;
            TreeMap treeMap = gk9Var.a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (xk9) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((xk9) entry.getValue()).m());
            }
        }
        return gk9Var;
    }

    public final Iterator n() {
        return this.a.keySet().iterator();
    }

    public final int o() {
        TreeMap treeMap = this.a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final xk9 p(int i) {
        xk9 xk9Var;
        if (i < o()) {
            return (!r(i) || (xk9Var = (xk9) this.a.get(Integer.valueOf(i))) == null) ? xk9.p0 : xk9Var;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void q(int i, xk9 xk9Var) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(rm7.o(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        }
        TreeMap treeMap = this.a;
        if (xk9Var == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), xk9Var);
        }
    }

    public final boolean r(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(rm7.o(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
    }

    public final void s(int i) {
        TreeMap treeMap = this.a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, xk9.p0);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            xk9 xk9Var = (xk9) treeMap.get(numValueOf2);
            if (xk9Var != null) {
                treeMap.put(Integer.valueOf(i - 1), xk9Var);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String t(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= o()) {
                    break;
                }
                xk9 xk9VarP = p(i);
                sb.append(str2);
                if (!(xk9VarP instanceof dl9) && !(xk9VarP instanceof uk9)) {
                    sb.append(xk9VarP.l());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return t(",");
    }

    public gk9(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                q(i, (xk9) list.get(i));
            }
        }
    }
}
