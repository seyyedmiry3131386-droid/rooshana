package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fw7 {
    public int[] a;
    public Object[] b;
    public int c;

    public fw7(int i) {
        this.a = i == 0 ? bt2.f : new int[i];
        this.b = i == 0 ? bt2.h : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i * 2);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.b = objArrCopyOf;
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int i3 = bt2.i(i2, i, this.a);
        if (i3 < 0 || js3.i(obj, this.b[i3 << 1])) {
            return i3;
        }
        int i4 = i3 + 1;
        while (i4 < i2 && this.a[i4] == i) {
            if (js3.i(obj, this.b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = i3 - 1; i5 >= 0 && this.a[i5] == i; i5--) {
            if (js3.i(obj, this.b[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public void clear() {
        if (this.c > 0) {
            this.a = bt2.f;
            this.b = bt2.h;
            this.c = 0;
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int i2 = bt2.i(i, 0, this.a);
        if (i2 < 0 || this.b[i2 << 1] == null) {
            return i2;
        }
        int i3 = i2 + 1;
        while (i3 < i && this.a[i3] == 0) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = i2 - 1; i4 >= 0 && this.a[i4] == 0; i4--) {
            if (this.b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof fw7) {
                int i = this.c;
                if (i != ((fw7) obj).c) {
                    return false;
                }
                fw7 fw7Var = (fw7) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objJ = j(i2);
                    Object obj2 = fw7Var.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !fw7Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objJ2 = j(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return this.b[i << 1];
        }
        lb7.j("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void g(wv wvVar) {
        int i = wvVar.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(wvVar.f(i2), wvVar.j(i2));
            }
        } else if (i > 0) {
            ew.x0(0, 0, i, wvVar.a, this.a);
            ew.y0(0, 0, i << 1, wvVar.b, this.b);
            this.c = i;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            lb7.j("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                ew.x0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.b;
                ew.y0(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i7 << 1);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.b = objArrCopyOf;
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                ew.x0(0, 0, i, iArr, this.a);
                ew.y0(0, 0, i3, objArr, this.b);
            }
            if (i < i4) {
                int i8 = i + 1;
                ew.x0(i, i8, i2, iArr, this.a);
                ew.y0(i3, i8 << 1, i2 << 1, objArr, this.b);
            }
        }
        if (i2 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i4;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public Object i(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (!z) {
            lb7.j("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.c) {
            z = true;
        }
        if (z) {
            return this.b[(i << 1) + 1];
        }
        lb7.j("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i4 << 1);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.b = objArrCopyOf;
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            ew.x0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.b;
            ew.y0(i5 << 1, i3 << 1, this.c << 1, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !js3.i(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !js3.i(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }
}
