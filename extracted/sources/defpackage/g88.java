package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g88 extends cc7 {
    public static String N(String str) {
        js3.p(str, "<this>");
        return mo7.t(new vq8(new dw(5, str), new kt("    ", 11)), "\n");
    }

    public static String O(String str) {
        List listB;
        int length;
        Comparable comparable;
        js3.p(str, "<this>");
        m74 m74Var = new m74(str);
        if (m74Var.hasNext()) {
            Object next = m74Var.next();
            if (m74Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (m74Var.hasNext()) {
                    arrayList.add(m74Var.next());
                }
                listB = arrayList;
            } else {
                listB = br9.B(next);
            }
        } else {
            listB = EmptyList.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listB) {
            if (!f88.n0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!js3.F(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listB.size();
        int iY = br9.y(listB);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listB) {
            int i = length + 1;
            if (length < 0) {
                br9.P();
                throw null;
            }
            String str3 = (String) obj2;
            String strE0 = ((length == 0 || length == iY) && f88.n0(str3)) ? null : f88.e0(iIntValue, str3);
            if (strE0 != null) {
                arrayList4.add(strE0);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        a.s0(arrayList4, sb, "\n", null, 124);
        return sb.toString();
    }

    public static String P(String str) {
        List listB;
        js3.p(str, "<this>");
        if (f88.n0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        m74 m74Var = new m74(str);
        if (m74Var.hasNext()) {
            Object next = m74Var.next();
            if (m74Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (m74Var.hasNext()) {
                    arrayList.add(m74Var.next());
                }
                listB = arrayList;
            } else {
                listB = br9.B(next);
            }
        } else {
            listB = EmptyList.a;
        }
        int length = str.length();
        listB.size();
        int iY = br9.y(listB);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listB.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                a.s0(arrayList2, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next2 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                br9.P();
                throw null;
            }
            String str2 = (String) next2;
            if ((i != 0 && i != iY) || !f88.n0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!js3.F(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && m88.Y(i3, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                    js3.o(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i2;
        }
    }
}
