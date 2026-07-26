package kotlin.collections.builders;

import defpackage.bh4;
import defpackage.ch4;
import defpackage.gx3;
import defpackage.js3;
import defpackage.yg4;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, gx3 {
    public static final MapBuilder n;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public bh4 j;
    public ch4 k;
    public bh4 l;
    public boolean m;

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.m = true;
        n = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.m) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        SerializedMap serializedMap = new SerializedMap();
        serializedMap.a = this;
        return serializedMap;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iK = k(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iK];
                if (i3 <= 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f = i5;
                        objArr[i4] = obj;
                        this.c[i4] = iK;
                        iArr[iK] = i5;
                        this.i++;
                        this.h++;
                        if (i2 > this.e) {
                            this.e = i2;
                        }
                        return i4;
                    }
                    h(1);
                } else {
                    if (js3.i(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        l(this.d.length * 2);
                        break;
                    }
                    iK = iK == 0 ? this.d.length - 1 : iK - 1;
                }
            }
        }
    }

    public final MapBuilder b() {
        c();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        MapBuilder mapBuilder = n;
        js3.n(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void c() {
        if (this.m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        js3.Q(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            js3.Q(objArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void e(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        js3.Q(this.a, i3, i);
        if (objArr != null) {
            js3.Q(objArr, i3, this.f);
        }
        this.f = i3;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        bh4 bh4Var = this.l;
        if (bh4Var != null) {
            return bh4Var;
        }
        bh4 bh4Var2 = new bh4(this, 0);
        this.l = bh4Var2;
        return bh4Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.i == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection collection) {
        js3.p(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Map.Entry entry) {
        js3.p(entry, "entry");
        int i = i(entry.getKey());
        if (i < 0) {
            return false;
        }
        Object[] objArr = this.b;
        js3.m(objArr);
        return js3.i(objArr[i], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.b;
        js3.m(objArr);
        return objArr[i];
    }

    public final void h(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
            js3.o(objArrCopyOf2, "copyOf(...)");
            this.a = objArrCopyOf2;
            Object[] objArr2 = this.b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i6);
                js3.o(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.c, i6);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        yg4 yg4Var = new yg4(this, 0);
        int i = 0;
        while (yg4Var.hasNext()) {
            int i2 = yg4Var.a;
            MapBuilder mapBuilder = (MapBuilder) yg4Var.d;
            if (i2 >= mapBuilder.f) {
                throw new NoSuchElementException();
            }
            yg4Var.a = i2 + 1;
            yg4Var.b = i2;
            Object obj = mapBuilder.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.b;
            js3.m(objArr);
            Object obj2 = objArr[yg4Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            yg4Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int iK = k(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iK];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (js3.i(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iK = iK == 0 ? this.d.length - 1 : iK - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int j(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                js3.m(objArr);
                if (js3.i(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        bh4 bh4Var = this.j;
        if (bh4Var != null) {
            return bh4Var;
        }
        bh4 bh4Var2 = new bh4(this, 1);
        this.j = bh4Var2;
        return bh4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r6) {
        /*
            r5 = this;
            int r0 = r5.h
            int r0 = r0 + 1
            r5.h = r0
            int r0 = r5.f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.g = r6
        L1c:
            int r6 = r5.f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.a
            r0 = r0[r2]
            int r0 = r5.k(r0)
            int r1 = r5.e
        L2c:
            int[] r3 = r5.d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.l(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.a
            java.lang.String r1 = "<this>"
            defpackage.js3.p(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.c
            r0 = r0[r12]
            int r1 = r11.e
            int r1 = r1 * 2
            int[] r2 = r11.d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.k(r5)
            int r5 = r5 - r0
            int[] r9 = r11.d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.c
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int r12 = r11.h
            int r12 = r12 + 1
            r11.h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.m(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        js3.p(map, "from");
        c();
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        h(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!js3.i(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int i = i(obj);
        if (i < 0) {
            return null;
        }
        Object[] objArr = this.b;
        js3.m(objArr);
        Object obj2 = objArr[i];
        m(i);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        yg4 yg4Var = new yg4(this, 0);
        while (yg4Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = yg4Var.a;
            MapBuilder mapBuilder = (MapBuilder) yg4Var.d;
            if (i2 >= mapBuilder.f) {
                throw new NoSuchElementException();
            }
            yg4Var.a = i2 + 1;
            yg4Var.b = i2;
            Object obj = mapBuilder.a[i2];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = mapBuilder.b;
            js3.m(objArr);
            Object obj2 = objArr[yg4Var.b];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            yg4Var.e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        ch4 ch4Var = this.k;
        if (ch4Var != null) {
            return ch4Var;
        }
        ch4 ch4Var2 = new ch4(0, this);
        this.k = ch4Var2;
        return ch4Var2;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
