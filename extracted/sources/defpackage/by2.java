package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class by2 implements Iterable, dx3 {
    public static final by2 b = new by2(new String[0]);
    public final String[] a;

    public by2(String[] strArr) {
        js3.p(strArr, "namesAndValues");
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        js3.p(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int iK = wq2.K(length, 0, -2);
        if (iK > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iK) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        String str = (String) ew.M0(i * 2, this.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final ay2 d() {
        ay2 ay2Var = new ay2(0);
        a.c0(ay2Var.a, this.a);
        return ay2Var;
    }

    public final TreeMap e() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        js3.o(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            Locale locale = Locale.US;
            js3.o(locale, "US");
            String lowerCase = strC.toLowerCase(locale);
            js3.o(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(f(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof by2) {
            return Arrays.equals(this.a, ((by2) obj).a);
        }
        return false;
    }

    public final String f(int i) {
        String str = (String) ew.M0((i * 2) + 1, this.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final List h(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            js3.o(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? EmptyList.a : listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(c(i), f(i));
        }
        return c26.K(pairArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            String strF = f(i);
            sb.append(strC);
            sb.append(": ");
            if (gh9.l(strC)) {
                strF = "██";
            }
            sb.append(strF);
            sb.append("\n");
        }
        return sb.toString();
    }
}
