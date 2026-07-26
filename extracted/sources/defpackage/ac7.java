package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ac7 implements Iterable {
    public xb7 a;
    public xb7 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public xb7 a(Object obj) {
        xb7 xb7Var = this.a;
        while (xb7Var != null && !xb7Var.a.equals(obj)) {
            xb7Var = xb7Var.c;
        }
        return xb7Var;
    }

    public Object c(Object obj) {
        xb7 xb7VarA = a(obj);
        if (xb7VarA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((zb7) it.next()).a(xb7VarA);
            }
        }
        xb7 xb7Var = xb7VarA.d;
        if (xb7Var != null) {
            xb7Var.c = xb7VarA.c;
        } else {
            this.a = xb7VarA.c;
        }
        xb7 xb7Var2 = xb7VarA.c;
        if (xb7Var2 != null) {
            xb7Var2.d = xb7Var;
        } else {
            this.b = xb7Var;
        }
        xb7VarA.c = null;
        xb7VarA.d = null;
        return xb7VarA.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.wb7) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.ac7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ac7 r7 = (defpackage.ac7) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            wb7 r3 = (defpackage.wb7) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            wb7 r4 = (defpackage.wb7) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            wb7 r7 = (defpackage.wb7) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            wb7 wb7Var = (wb7) it;
            if (!wb7Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) wb7Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        wb7 wb7Var = new wb7(this.a, this.b, 0);
        this.c.put(wb7Var, Boolean.FALSE);
        return wb7Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            wb7 wb7Var = (wb7) it;
            if (!wb7Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) wb7Var.next()).toString());
            if (wb7Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
