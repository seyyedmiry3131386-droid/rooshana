package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class re3 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public re3(as7 as7Var) {
        this.a = 1;
        d();
        a(StateSet.WILD_CARD, as7Var);
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iK0 = f88.k0('&', i, 4, str);
            if (iK0 == -1) {
                iK0 = str.length();
            }
            int iK02 = f88.k0('=', i, 4, str);
            if (iK02 == -1 || iK02 > iK0) {
                String strSubstring = str.substring(i, iK0);
                js3.o(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iK02);
                js3.o(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iK02 + 1, iK0);
                js3.o(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i = iK0 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [as7[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, as7 as7Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = as7Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new as7[i2];
            System.arraycopy((as7[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((as7[]) this.e)[i3] = as7Var;
        this.b = i3 + 1;
    }

    public se3 b() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strO = hs9.O((String) this.d, 0, 0, 7);
        String strO2 = hs9.O((String) this.e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(hs9.O((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(wu0.V(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? hs9.O(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new se3(str, strO, strO2, str2, iC, arrayList3, arrayList, str4 != null ? hs9.O(str4, 0, 0, 7) : null, toString());
    }

    public int c() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        js3.m(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [as7[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void d() {
        this.c = new as7();
        this.d = new int[10][];
        this.e = new as7[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(defpackage.se3 r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re3.e(se3, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re3.toString():java.lang.String");
    }

    public re3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.d = "";
                this.e = "";
                this.b = -1;
                this.h = br9.E("");
                break;
        }
    }
}
