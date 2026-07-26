package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.j;
import com.google.protobuf.m;
import com.google.protobuf.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class bb2 {
    public static final bb2 c = new bb2(0);
    public final nz7 a = new nz7(16);
    public boolean b;

    public bb2() {
    }

    public static int c(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int iD0 = j.d0(i);
        if (wireFormat$FieldType == WireFormat$FieldType.d) {
            iD0 *= 2;
        }
        return d(wireFormat$FieldType, obj) + iD0;
    }

    public static int d(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int size;
        int iE0;
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = j.j;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = j.j;
                return 4;
            case 2:
                return j.f0(((Long) obj).longValue());
            case 3:
                return j.f0(((Long) obj).longValue());
            case 4:
                return j.b0(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = j.j;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = j.j;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = j.j;
                return 1;
            case 8:
                if (!(obj instanceof ByteString)) {
                    return j.c0((String) obj);
                }
                Logger logger6 = j.j;
                size = ((ByteString) obj).size();
                iE0 = j.e0(size);
                break;
                break;
            case 9:
                Logger logger7 = j.j;
                return ((ev4) obj).getSerializedSize();
            case 10:
                Logger logger8 = j.j;
                size = ((ev4) obj).getSerializedSize();
                iE0 = j.e0(size);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    Logger logger9 = j.j;
                    size = ((byte[]) obj).length;
                    iE0 = j.e0(size);
                } else {
                    Logger logger10 = j.j;
                    size = ((ByteString) obj).size();
                    iE0 = j.e0(size);
                }
                break;
            case 12:
                return j.e0(((Integer) obj).intValue());
            case 13:
                return obj instanceof lr3 ? j.b0(((lr3) obj).getNumber()) : j.b0(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = j.j;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = j.j;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return j.e0((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return j.f0((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iE0 + size;
    }

    public static int e(hr2 hr2Var, Object obj) {
        WireFormat$FieldType wireFormat$FieldType = hr2Var.b;
        int i = hr2Var.a;
        if (!hr2Var.c) {
            return c(wireFormat$FieldType, i, obj);
        }
        List list = (List) obj;
        int iC = 0;
        if (!hr2Var.d) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC += c(wireFormat$FieldType, i, it.next());
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iC += d(wireFormat$FieldType, it2.next());
        }
        return j.e0(iC) + j.d0(i) + iC;
    }

    public static int g(Map.Entry entry) {
        hr2 hr2Var = (hr2) entry.getKey();
        Object value = entry.getValue();
        if (hr2Var.b.a != WireFormat$JavaType.MESSAGE || hr2Var.c || hr2Var.d) {
            return e(hr2Var, value);
        }
        int i = ((hr2) entry.getKey()).a;
        int iE0 = j.e0(i) + j.d0(2) + (j.d0(1) * 2);
        int iD0 = j.d0(3);
        int serializedSize = ((ev4) value).getSerializedSize();
        return dw1.h(serializedSize, serializedSize, iD0, iE0);
    }

    public static boolean j(Map.Entry entry) {
        hr2 hr2Var = (hr2) entry.getKey();
        if (hr2Var.b.a != WireFormat$JavaType.MESSAGE) {
            return true;
        }
        if (!hr2Var.c) {
            Object value = entry.getValue();
            if (value instanceof fv4) {
                return ((fv4) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        for (Object obj : (List) entry.getValue()) {
            if (!(obj instanceof fv4)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((fv4) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(defpackage.hr2 r5, java.lang.Object r6) {
        /*
            com.google.protobuf.WireFormat$FieldType r0 = r5.b
            java.nio.charset.Charset r1 = defpackage.tr3.a
            r6.getClass()
            com.google.protobuf.WireFormat$JavaType r0 = r0.a
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L24;
                case 7: goto L1b;
                case 8: goto L14;
                default: goto L12;
            }
        L12:
            r0 = r2
            goto L3e
        L14:
            boolean r0 = r6 instanceof defpackage.ev4
            if (r0 != 0) goto L19
            goto L12
        L19:
            r0 = r1
            goto L3e
        L1b:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L19
            boolean r0 = r6 instanceof defpackage.lr3
            if (r0 == 0) goto L12
            goto L19
        L24:
            boolean r0 = r6 instanceof com.google.protobuf.ByteString
            if (r0 != 0) goto L19
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L12
            goto L19
        L2d:
            boolean r0 = r6 instanceof java.lang.String
            goto L3e
        L30:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r0 = r6 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r0 = r6 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r0 = r6 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r0 = r6 instanceof java.lang.Integer
        L3e:
            if (r0 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.protobuf.WireFormat$FieldType r5 = r5.b
            com.google.protobuf.WireFormat$JavaType r5 = r5.a
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb2.p(hr2, java.lang.Object):void");
    }

    public static void q(j jVar, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.d) {
            jVar.y0(i, 3);
            ((ev4) obj).writeTo(jVar);
            jVar.y0(i, 4);
        }
        jVar.y0(i, wireFormat$FieldType.b);
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                jVar.p0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                jVar.n0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                jVar.C0(((Long) obj).longValue());
                break;
            case 3:
                jVar.C0(((Long) obj).longValue());
                break;
            case 4:
                jVar.r0(((Integer) obj).intValue());
                break;
            case 5:
                jVar.p0(((Long) obj).longValue());
                break;
            case 6:
                jVar.n0(((Integer) obj).intValue());
                break;
            case 7:
                jVar.h0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    jVar.x0((String) obj);
                } else {
                    jVar.l0((ByteString) obj);
                }
                break;
            case 9:
                ((ev4) obj).writeTo(jVar);
                break;
            case 10:
                jVar.t0((ev4) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    jVar.j0(bArr.length, bArr);
                } else {
                    jVar.l0((ByteString) obj);
                }
                break;
            case 12:
                jVar.A0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof lr3)) {
                    jVar.r0(((Integer) obj).intValue());
                } else {
                    jVar.r0(((lr3) obj).getNumber());
                }
                break;
            case 14:
                jVar.n0(((Integer) obj).intValue());
                break;
            case 15:
                jVar.p0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                jVar.A0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                jVar.C0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(hr2 hr2Var, Object obj) {
        List arrayList;
        if (!hr2Var.c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        p(hr2Var, obj);
        nz7 nz7Var = this.a;
        Object obj2 = nz7Var.get(hr2Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            nz7Var.put(hr2Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bb2 clone() {
        nz7 nz7Var;
        bb2 bb2Var = new bb2();
        int i = 0;
        while (true) {
            nz7Var = this.a;
            if (i >= nz7Var.b.size()) {
                break;
            }
            Map.Entry entryC = nz7Var.c(i);
            bb2Var.o((hr2) entryC.getKey(), entryC.getValue());
            i++;
        }
        for (Map.Entry entry : nz7Var.d()) {
            bb2Var.o((hr2) entry.getKey(), entry.getValue());
        }
        return bb2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bb2) {
            return this.a.equals(((bb2) obj).a);
        }
        return false;
    }

    public final int f() {
        nz7 nz7Var;
        int i = 0;
        int iG = 0;
        while (true) {
            nz7Var = this.a;
            if (i >= nz7Var.b.size()) {
                break;
            }
            iG += g(nz7Var.c(i));
            i++;
        }
        Iterator it = nz7Var.d().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public final int h() {
        nz7 nz7Var;
        int i = 0;
        int iE = 0;
        while (true) {
            nz7Var = this.a;
            if (i >= nz7Var.b.size()) {
                break;
            }
            Map.Entry entryC = nz7Var.c(i);
            iE += e((hr2) entryC.getKey(), entryC.getValue());
            i++;
        }
        for (Map.Entry entry : nz7Var.d()) {
            iE += e((hr2) entry.getKey(), entry.getValue());
        }
        return iE;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        int i = 0;
        while (true) {
            nz7 nz7Var = this.a;
            if (i >= nz7Var.b.size()) {
                Iterator it = nz7Var.d().iterator();
                while (it.hasNext()) {
                    if (!j((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!j(nz7Var.c(i))) {
                return false;
            }
            i++;
        }
    }

    public final Iterator k() {
        return ((rv) this.a.entrySet()).iterator();
    }

    public final void l() {
        nz7 nz7Var;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            nz7Var = this.a;
            if (i >= nz7Var.b.size()) {
                break;
            }
            Map.Entry entryC = nz7Var.c(i);
            if (entryC.getValue() instanceof o) {
                ((o) entryC.getValue()).makeImmutable();
            }
            i++;
        }
        if (!nz7Var.d) {
            for (int i2 = 0; i2 < nz7Var.b.size(); i2++) {
                Map.Entry entryC2 = nz7Var.c(i2);
                if (((hr2) entryC2.getKey()).c) {
                    entryC2.setValue(DesugarCollections.unmodifiableList((List) entryC2.getValue()));
                }
            }
            for (Map.Entry entry : nz7Var.d()) {
                if (((hr2) entry.getKey()).c) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!nz7Var.d) {
            nz7Var.c = nz7Var.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(nz7Var.c);
            nz7Var.f = nz7Var.f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(nz7Var.f);
            nz7Var.d = true;
        }
        this.b = true;
    }

    public final void m(bb2 bb2Var) {
        nz7 nz7Var;
        int i = 0;
        while (true) {
            nz7Var = bb2Var.a;
            if (i >= nz7Var.b.size()) {
                break;
            }
            n(nz7Var.c(i));
            i++;
        }
        Iterator it = nz7Var.d().iterator();
        while (it.hasNext()) {
            n((Map.Entry) it.next());
        }
    }

    public final void n(Map.Entry entry) {
        hr2 hr2Var = (hr2) entry.getKey();
        Object value = entry.getValue();
        boolean z = hr2Var.c;
        nz7 nz7Var = this.a;
        if (z) {
            Object arrayList = nz7Var.get(hr2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            nz7Var.put(hr2Var, arrayList);
            return;
        }
        if (hr2Var.b.a != WireFormat$JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            nz7Var.put(hr2Var, value);
            return;
        }
        Object obj2 = nz7Var.get(hr2Var);
        if (obj2 != null) {
            nz7Var.put(hr2Var, ((m) ((ev4) obj2).toBuilder()).mergeFrom((o) ((ev4) value)).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        nz7Var.put(hr2Var, value);
    }

    public final void o(hr2 hr2Var, Object obj) {
        if (!hr2Var.c) {
            p(hr2Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p(hr2Var, it.next());
            }
            obj = arrayList;
        }
        this.a.put(hr2Var, obj);
    }

    public bb2(int i) {
        l();
        l();
    }
}
