package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r56 extends s1 {
    public final /* synthetic */ int a;
    public final r1 b;

    public /* synthetic */ r56(r1 r1Var, int i) {
        this.a = i;
        this.b = r1Var;
    }

    @Override // defpackage.s1
    public final int a() {
        switch (this.a) {
            case 0:
                return ((n56) this.b).c();
            default:
                return ((i66) this.b).c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                js3.p((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                js3.p((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                ((n56) this.b).clear();
                break;
            default:
                ((i66) this.b).clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            int r0 = r2.a
            switch(r0) {
                case 0: goto L42;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "element"
            defpackage.js3.p(r3, r0)
            r1 r0 = r2.b
            i66 r0 = (defpackage.i66) r0
            java.lang.String r1 = "map"
            defpackage.js3.p(r0, r1)
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L2e
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r1.equals(r3)
            goto L74
        L2e:
            java.lang.Object r1 = r3.getValue()
            if (r1 != 0) goto L40
            java.lang.Object r3 = r3.getKey()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L40
        L3e:
            r3 = 1
            goto L74
        L40:
            r3 = 0
            goto L74
        L42:
            java.lang.String r0 = "element"
            defpackage.js3.p(r3, r0)
            r1 r0 = r2.b
            n56 r0 = (defpackage.n56) r0
            java.lang.String r1 = "map"
            defpackage.js3.p(r0, r1)
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L63
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r1.equals(r3)
            goto L74
        L63:
            java.lang.Object r1 = r3.getValue()
            if (r1 != 0) goto L40
            java.lang.Object r3 = r3.getKey()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L40
            goto L3e
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r56.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new t56((n56) this.b);
            default:
                return new j66((i66) this.b, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        switch (this.a) {
            case 0:
                js3.p(entry, "element");
                return ((n56) this.b).remove(entry.getKey(), entry.getValue());
            default:
                js3.p(entry, "element");
                return ((i66) this.b).remove(entry.getKey(), entry.getValue());
        }
    }
}
