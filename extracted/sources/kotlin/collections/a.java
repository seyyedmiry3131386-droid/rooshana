package kotlin.collections;

import defpackage.a77;
import defpackage.bl4;
import defpackage.br9;
import defpackage.cc7;
import defpackage.dp2;
import defpackage.dw;
import defpackage.dx3;
import defpackage.e12;
import defpackage.ew;
import defpackage.ex3;
import defpackage.gj4;
import defpackage.js3;
import defpackage.o27;
import defpackage.rm7;
import defpackage.uq3;
import defpackage.wu0;
import defpackage.wu8;
import defpackage.yu0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends yu0 {
    public static ArrayList A0(Object obj, Collection collection) {
        js3.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static void B0(dp2 dp2Var, List list) {
        int iY;
        js3.p(list, "<this>");
        js3.p(dp2Var, "predicate");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof dx3) || (list instanceof ex3)) {
                l0(list, dp2Var, true);
                return;
            } else {
                wu8.J(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iY2 = br9.y(list);
        int i = 0;
        if (iY2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) dp2Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iY2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iY = br9.y(list))) {
            return;
        }
        while (true) {
            list.remove(iY);
            if (iY == i) {
                return;
            } else {
                iY--;
            }
        }
    }

    public static void C0(Iterable iterable, dp2 dp2Var) {
        js3.p(iterable, "<this>");
        js3.p(dp2Var, "predicate");
        l0(iterable, dp2Var, true);
    }

    public static Object D0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object E0(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object F0(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(br9.y(list));
    }

    public static Object G0(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(br9.y(list));
    }

    public static List H0(Iterable iterable) {
        js3.p(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return P0(iterable);
        }
        List listR0 = R0(iterable);
        Collections.reverse(listR0);
        return listR0;
    }

    public static List I0(List list) {
        js3.p(list, "<this>");
        if (list.size() <= 1) {
            return P0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        js3.p(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ew.r0(array);
    }

    public static List J0(Iterable iterable, Comparator comparator) {
        js3.p(iterable, "<this>");
        js3.p(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listR0 = R0(iterable);
            yu0.Y(listR0, comparator);
            return listR0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return P0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        js3.p(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return ew.r0(array);
    }

    public static List K0(Iterable iterable, int i) {
        js3.p(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(bl4.q(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return EmptyList.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return P0(iterable);
            }
            if (i == 1) {
                return br9.B(n0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return br9.I(arrayList);
    }

    public static boolean[] L0(List list) {
        js3.p(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void M0(Iterable iterable, AbstractCollection abstractCollection) {
        js3.p(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] N0(Collection collection) {
        js3.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] O0(List list) {
        js3.p(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List P0(Iterable iterable) {
        js3.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return br9.I(R0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.a;
        }
        if (size != 1) {
            return Q0(collection);
        }
        return br9.B(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList Q0(Collection collection) {
        js3.p(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List R0(Iterable iterable) {
        js3.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Q0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        M0(iterable, arrayList);
        return arrayList;
    }

    public static Set S0(Iterable iterable) {
        js3.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        M0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set T0(Iterable iterable) {
        js3.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            M0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : a77.p(linkedHashSet.iterator().next()) : EmptySet.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.a;
        }
        if (size2 == 1) {
            return a77.p(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(b.L(collection.size()));
        M0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final int Z(int i, List list) {
        if (i >= 0 && i <= br9.y(list)) {
            return br9.y(list) - i;
        }
        StringBuilder sbR = rm7.r(i, "Element index ", " must be in range [");
        sbR.append(new uq3(0, br9.y(list), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public static final int a0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbR = rm7.r(i, "Position index ", " must be in range [");
        sbR.append(new uq3(0, list.size(), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public static void b0(Iterable iterable, Collection collection) {
        js3.p(collection, "<this>");
        js3.p(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void c0(ArrayList arrayList, Object[] objArr) {
        js3.p(arrayList, "<this>");
        js3.p(objArr, "elements");
        arrayList.addAll(ew.r0(objArr));
    }

    public static gj4 d0(List list) {
        js3.p(list, "<this>");
        return new gj4(list);
    }

    public static dw e0(Iterable iterable) {
        js3.p(iterable, "<this>");
        return new dw(1, iterable);
    }

    public static double f0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                br9.O();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static ArrayList g0(Iterable iterable, int i) {
        js3.p(iterable, "<this>");
        if (i <= 0 || i <= 0) {
            throw new IllegalArgumentException(bl4.q(i, "size ", " must be greater than zero.").toString());
        }
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            js3.p(it, "iterator");
            Iterator itH = !it.hasNext() ? e12.a : o27.h(new SlidingWindowKt$windowedIterator$1(i, i, it, null));
            while (itH.hasNext()) {
                arrayList.add((List) itH.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean h0(Iterable iterable, Object obj) {
        int iIndexOf;
        js3.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    br9.P();
                    throw null;
                }
                if (js3.i(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List i0(Iterable iterable) {
        js3.p(iterable, "<this>");
        return P0(S0(iterable));
    }

    public static List j0(List list) {
        js3.p(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return EmptyList.a;
        }
        if (size == 1) {
            return br9.B(u0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List k0(List list) {
        js3.p(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return K0(list, size);
    }

    public static final boolean l0(Iterable iterable, dp2 dp2Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) dp2Var.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static ArrayList m0(Iterable iterable) {
        js3.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object n0(Iterable iterable) {
        js3.p(iterable, "<this>");
        if (iterable instanceof List) {
            return o0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object o0(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object p0(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object q0(int i, List list) {
        js3.p(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void r0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, dp2 dp2Var) {
        js3.p(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            cc7.b(sb, obj, dp2Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void s0(Iterable iterable, StringBuilder sb, String str, dp2 dp2Var, int i) {
        if ((i & 64) != 0) {
            dp2Var = null;
        }
        r0(iterable, sb, str, "", "", "...", dp2Var);
    }

    public static String t0(Iterable iterable, CharSequence charSequence, String str, String str2, dp2 dp2Var, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            dp2Var = null;
        }
        js3.p(iterable, "<this>");
        js3.p(charSequence2, "separator");
        js3.p(str3, "prefix");
        StringBuilder sb = new StringBuilder();
        r0(iterable, sb, charSequence2, str3, str4, "...", dp2Var);
        return sb.toString();
    }

    public static Object u0(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(br9.y(list));
    }

    public static Object v0(List list) {
        js3.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable w0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object x0(ArrayList arrayList, Comparator comparator) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList y0(Object obj, List list) {
        js3.p(list, "<this>");
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && js3.i(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList z0(Iterable iterable, Collection collection) {
        js3.p(collection, "<this>");
        js3.p(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            b0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }
}
