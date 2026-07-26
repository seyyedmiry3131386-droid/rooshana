package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.commonmark.internal.a;
import org.commonmark.internal.b;

/* JADX INFO: loaded from: classes3.dex */
public final class yq1 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(xc0.class, ey2.class, qa2.class, fd3.class, pj8.class, m84.class, lm3.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final ol3 j;
    public final List k;
    public final uq1 l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(xc0.class, new yc0(0));
        map.put(ey2.class, new yc0(2));
        map.put(qa2.class, new yc0(1));
        map.put(fd3.class, new yc0(3));
        map.put(pj8.class, new yc0(6));
        map.put(m84.class, new yc0(5));
        map.put(lm3.class, new yc0(4));
        q = DesugarCollections.unmodifiableMap(map);
    }

    public yq1(ArrayList arrayList, ol3 ol3Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = ol3Var;
        this.k = arrayList2;
        uq1 uq1Var = new uq1(0);
        this.l = uq1Var;
        arrayList3.add(uq1Var);
        linkedHashSet.add(uq1Var);
    }

    public final void a(k kVar) {
        while (!h().b(kVar.d())) {
            e(h());
        }
        h().d().b(kVar.d());
        this.n.add(kVar);
        this.o.add(kVar);
    }

    public final void b(b bVar) {
        a aVar = bVar.b;
        aVar.a();
        for (t74 t74Var : aVar.c) {
            k16 k16Var = bVar.a;
            t74Var.f();
            co5 co5Var = k16Var.d;
            t74Var.d = co5Var;
            if (co5Var != null) {
                co5Var.e = t74Var;
            }
            t74Var.e = k16Var;
            k16Var.d = t74Var;
            co5 co5Var2 = k16Var.a;
            t74Var.a = co5Var2;
            if (t74Var.d == null) {
                co5Var2.b = t74Var;
            }
            String str = t74Var.f;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, t74Var);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.d) {
            int i = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.a;
            charSequenceSubSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().a(charSequenceSubSequence);
    }

    public final void d() {
        if (this.a.charAt(this.b) != '\t') {
            this.b++;
            this.c++;
        } else {
            this.b++;
            int i = this.c;
            this.c = (4 - (i % 4)) + i;
        }
    }

    public final void e(k kVar) {
        if (h() == kVar) {
            this.n.remove(r0.size() - 1);
        }
        if (kVar instanceof b) {
            b((b) kVar);
        }
        kVar.c();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((k) list.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final k h() {
        return (k) o40.u(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c9, code lost:
    
        if (r3 < 1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        r3 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d1, code lost:
    
        if (r3 >= r13.length()) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d3, code lost:
    
        r6 = r13.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d9, code lost:
    
        if (r6 == '\t') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01dd, code lost:
    
        if (r6 == ' ') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e0, code lost:
    
        r6 = r13.subSequence(r8, r15).toString();
        r14 = new defpackage.wv5();
        r14.g = java.lang.Integer.parseInt(r6);
        r14.h = r4;
        r4 = new defpackage.n84(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05e8, code lost:
    
        k(r22.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x01b6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0277 A[PHI: r21
      0x0277: PHI (r21v11 k) = 
      (r21v5 k)
      (r21v6 k)
      (r21v6 k)
      (r21v7 k)
      (r21v7 k)
      (r21v7 k)
      (r21v8 k)
      (r21v8 k)
      (r21v8 k)
      (r21v9 k)
      (r21v9 k)
      (r21v13 k)
      (r21v17 k)
     binds: [B:299:0x053b, B:267:0x04c2, B:296:0x051d, B:202:0x0384, B:258:0x0487, B:264:0x049e, B:187:0x0330, B:189:0x0338, B:386:0x0277, B:179:0x02fb, B:185:0x0324, B:158:0x0275, B:84:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186  */
    /* JADX WARN: Type inference failed for: r22v0, types: [yq1] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq1.i(java.lang.String):void");
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i;
        this.d = true;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
