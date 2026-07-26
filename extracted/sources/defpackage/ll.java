package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ll implements CharSequence {
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        bn6 bn6Var = xd7.a;
    }

    public ll(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                kl klVar = (kl) list.get(i);
                Object obj = klVar.a;
                if (obj instanceof c28) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(klVar);
                } else if (obj instanceof p16) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(klVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listJ0 = arrayList2 != null ? a.J0(arrayList2, new yg2(6)) : null;
        if (listJ0 == null || listJ0.isEmpty()) {
            return;
        }
        int i2 = ((kl) a.o0(listJ0)).c;
        xa5 xa5Var = nq3.a;
        xa5 xa5Var2 = new xa5(1);
        xa5Var2.a(i2);
        int size2 = listJ0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            kl klVar2 = (kl) listJ0.get(i3);
            while (true) {
                if (xa5Var2.b != 0) {
                    int iD = xa5Var2.d();
                    int i4 = klVar2.b;
                    int i5 = klVar2.c;
                    if (i4 >= iD) {
                        xa5Var2.e(xa5Var2.b - 1);
                    } else if (i5 > iD) {
                        sn3.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iD);
                    }
                }
            }
            xa5Var2.a(klVar2.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ll subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.sn3.a(r1)
        L26:
            java.lang.String r1 = r10.b
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            java.lang.String r4 = "substring(...)"
            defpackage.js3.o(r1, r4)
            ll r4 = defpackage.ml.a
            if (r11 > r12) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.sn3.a(r2)
        L59:
            java.util.List r2 = r10.a
            if (r2 != 0) goto L5e
            goto L9e
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L6b:
            if (r0 >= r4) goto L98
            java.lang.Object r5 = r2.get(r0)
            kl r5 = (defpackage.kl) r5
            int r6 = r5.b
            int r7 = r5.c
            boolean r6 = defpackage.ml.b(r11, r12, r6, r7)
            if (r6 == 0) goto L95
            kl r6 = new kl
            java.lang.Object r8 = r5.a
            int r9 = r5.b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.d
            r6.<init>(r9, r7, r8, r5)
            r3.add(r6)
        L95:
            int r0 = r0 + 1
            goto L6b
        L98:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9f
        L9e:
            r3 = 0
        L9f:
            ll r11 = new ll
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll.subSequence(int, int):ll");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        return js3.i(this.b, llVar.b) && js3.i(this.a, llVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public ll(String str) {
        this(str, EmptyList.a);
    }

    public ll(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
