package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.cb2;
import defpackage.gh4;
import defpackage.hf7;
import defpackage.hn5;
import defpackage.hn6;
import defpackage.i72;
import defpackage.k72;
import defpackage.lh4;
import defpackage.mu0;
import defpackage.o40;
import defpackage.pa2;
import defpackage.r79;
import defpackage.sr3;
import defpackage.t61;
import defpackage.u84;
import defpackage.vy8;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class h implements hf7 {
    public static final int[] n = new int[0];
    public static final Unsafe o = vy8.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final hn5 j;
    public final u84 k;
    public final m l;
    public final lh4 m;

    public h(int[] iArr, Object[] objArr, int i, int i2, a aVar, int[] iArr2, int i3, int i4, hn5 hn5Var, u84 u84Var, m mVar, k72 k72Var, lh4 lh4Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = aVar instanceof f;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = hn5Var;
        this.k = u84Var;
        this.l = mVar;
        this.e = aVar;
        this.m = lh4Var;
    }

    public static int A(long j, Object obj) {
        return ((Integer) vy8.c.h(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) vy8.c.h(j, obj)).longValue();
    }

    public static Field G(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbN = t61.n("Field ", str, " for ");
            sbN.append(cls.getName());
            sbN.append(" not found. Known fields are ");
            sbN.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbN.toString());
        }
    }

    public static int M(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void k(Object obj) {
        if (!r(obj)) {
            throw new IllegalArgumentException(o40.x(obj, "Mutating immutable message: "));
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof f) {
            return ((f) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.h y(defpackage.iv6 r34, defpackage.hn5 r35, defpackage.u84 r36, androidx.datastore.preferences.protobuf.m r37, defpackage.k72 r38, defpackage.lh4 r39) {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.y(iv6, hn5, u84, androidx.datastore.preferences.protobuf.m, k72, lh4):androidx.datastore.preferences.protobuf.h");
    }

    public static long z(int i) {
        return i & 1048575;
    }

    public final void C(Object obj, long j, d dVar, hf7 hf7Var, i72 i72Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        this.k.getClass();
        sr3 sr3VarA = u84.a(j, obj);
        mu0 mu0Var = dVar.a;
        int i = dVar.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            f fVarD = hf7Var.d();
            dVar.b(fVarD, hf7Var, i72Var);
            hf7Var.b(fVarD);
            sr3VarA.add(fVarD);
            if (mu0Var.e() || dVar.d != 0) {
                return;
            } else {
                iC = mu0Var.C();
            }
        } while (iC == i);
        dVar.d = iC;
    }

    public final void D(Object obj, int i, d dVar, hf7 hf7Var, i72 i72Var) throws InvalidProtocolBufferException {
        int iC;
        this.k.getClass();
        sr3 sr3VarA = u84.a(i & 1048575, obj);
        mu0 mu0Var = dVar.a;
        int i2 = dVar.b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            f fVarD = hf7Var.d();
            dVar.c(fVarD, hf7Var, i72Var);
            hf7Var.b(fVarD);
            sr3VarA.add(fVarD);
            if (mu0Var.e() || dVar.d != 0) {
                return;
            } else {
                iC = mu0Var.C();
            }
        } while (iC == i2);
        dVar.d = iC;
    }

    public final void E(int i, d dVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i) != 0) {
            dVar.w(2);
            vy8.o(i & 1048575, obj, dVar.a.B());
        } else if (!this.f) {
            vy8.o(i & 1048575, obj, dVar.e());
        } else {
            dVar.w(2);
            vy8.o(i & 1048575, obj, dVar.a.A());
        }
    }

    public final void F(int i, d dVar, Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i2 = 536870912 & i;
        u84 u84Var = this.k;
        if (i2 != 0) {
            u84Var.getClass();
            dVar.s(u84.a(i & 1048575, obj), true);
        } else {
            u84Var.getClass();
            dVar.s(u84.a(i & 1048575, obj), false);
        }
    }

    public final void H(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        vy8.m((1 << (i2 >>> 20)) | vy8.c.f(j, obj), j, obj);
    }

    public final void I(int i, int i2, Object obj) {
        vy8.m(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int J(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void K(int i, Object obj, Object obj2) {
        o.putObject(obj, N(i) & 1048575, obj2);
        H(i, obj);
    }

    public final void L(Object obj, int i, Object obj2, int i2) {
        o.putObject(obj, N(i2) & 1048575, obj2);
        I(i, i2, obj);
    }

    public final int N(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void O(Object obj, r79 r79Var) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        h hVar = this;
        int[] iArr = hVar.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iN = hVar.N(i7);
            int i9 = iArr[i7];
            int iM = M(iN);
            if (iM <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = iN;
                i2 = 1 << (i10 >>> 20);
            } else {
                i = iN;
                i2 = 0;
            }
            long j = i & i5;
            switch (iM) {
                case 0:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        double d = vy8.c.d(j, obj);
                        e eVar = (e) r79Var.b;
                        eVar.getClass();
                        eVar.l0(i9, Double.doubleToRawLongBits(d));
                    }
                    break;
                case 1:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        float fE = vy8.c.e(j, obj);
                        e eVar2 = (e) r79Var.b;
                        eVar2.getClass();
                        eVar2.j0(i9, Float.floatToRawIntBits(fE));
                    }
                    hVar = this;
                    break;
                case 2:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).v0(i9, unsafe.getLong(obj, j));
                    }
                    hVar = this;
                    break;
                case 3:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).v0(i9, unsafe.getLong(obj, j));
                    }
                    hVar = this;
                    break;
                case 4:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).n0(i9, unsafe.getInt(obj, j));
                    }
                    hVar = this;
                    break;
                case 5:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).l0(i9, unsafe.getLong(obj, j));
                    }
                    hVar = this;
                    break;
                case 6:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).j0(i9, unsafe.getInt(obj, j));
                    }
                    hVar = this;
                    break;
                case 7:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).g0(i9, vy8.c.c(j, obj));
                    }
                    hVar = this;
                    break;
                case 8:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((e) r79Var.b).q0(i9, (String) object);
                        } else {
                            ((e) r79Var.b).h0(i9, (ByteString) object);
                        }
                    }
                    hVar = this;
                    break;
                case 9:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).p0(i9, (a) unsafe.getObject(obj, j), hVar.o(i7));
                    }
                    break;
                case 10:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).h0(i9, (ByteString) unsafe.getObject(obj, j));
                    }
                    hVar = this;
                    break;
                case 11:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).t0(i9, unsafe.getInt(obj, j));
                    }
                    hVar = this;
                    break;
                case 12:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).n0(i9, unsafe.getInt(obj, j));
                    }
                    hVar = this;
                    break;
                case 13:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).j0(i9, unsafe.getInt(obj, j));
                    }
                    hVar = this;
                    break;
                case 14:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        ((e) r79Var.b).l0(i9, unsafe.getLong(obj, j));
                    }
                    hVar = this;
                    break;
                case 15:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        int i12 = unsafe.getInt(obj, j);
                        ((e) r79Var.b).t0(i9, (i12 >> 31) ^ (i12 << 1));
                    }
                    hVar = this;
                    break;
                case 16:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((e) r79Var.b).v0(i9, (j2 >> 63) ^ (j2 << 1));
                    }
                    hVar = this;
                    break;
                case 17:
                    if (hVar.q(obj, i7, i6, i8, i2)) {
                        r79Var.x(i9, unsafe.getObject(obj, j), hVar.o(i7));
                    }
                    break;
                case 18:
                    i3 = i6;
                    l.n(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 19:
                    i3 = i6;
                    l.r(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 20:
                    i3 = i6;
                    l.t(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 21:
                    i3 = i6;
                    l.z(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 22:
                    i3 = i6;
                    l.s(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 23:
                    i3 = i6;
                    l.q(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 24:
                    i3 = i6;
                    l.p(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 25:
                    i3 = i6;
                    l.m(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 26:
                    i4 = i6;
                    int i13 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = l.a;
                    if (list != null && !list.isEmpty()) {
                        r79Var.getClass();
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            ((e) r79Var.b).q0(i13, (String) list.get(i14));
                        }
                    }
                    i6 = i4;
                    break;
                case 27:
                    i4 = i6;
                    int i15 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    hf7 hf7VarO = hVar.o(i7);
                    Class cls2 = l.a;
                    if (list2 != null && !list2.isEmpty()) {
                        r79Var.getClass();
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            ((e) r79Var.b).p0(i15, (a) list2.get(i16), hf7VarO);
                        }
                    }
                    i6 = i4;
                    break;
                case 28:
                    i4 = i6;
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = l.a;
                    if (list3 != null && !list3.isEmpty()) {
                        r79Var.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ((e) r79Var.b).h0(i17, (ByteString) list3.get(i18));
                        }
                    }
                    i6 = i4;
                    break;
                case 29:
                    i3 = i6;
                    z = false;
                    l.y(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 30:
                    i3 = i6;
                    z = false;
                    l.o(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 31:
                    i3 = i6;
                    z = false;
                    l.u(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 32:
                    i3 = i6;
                    z = false;
                    l.v(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 33:
                    i3 = i6;
                    z = false;
                    l.w(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 34:
                    i3 = i6;
                    z = false;
                    l.x(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, false);
                    i6 = i3;
                    break;
                case 35:
                    i4 = i6;
                    l.n(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 36:
                    i4 = i6;
                    l.r(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 37:
                    i4 = i6;
                    l.t(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 38:
                    i4 = i6;
                    l.z(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 39:
                    i4 = i6;
                    l.s(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 40:
                    i4 = i6;
                    l.q(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 41:
                    i4 = i6;
                    l.p(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 42:
                    i4 = i6;
                    l.m(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 43:
                    i4 = i6;
                    l.y(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                    i4 = i6;
                    l.o(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                    i4 = i6;
                    l.u(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 46:
                    i4 = i6;
                    l.v(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 47:
                    i4 = i6;
                    l.w(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 48:
                    i4 = i6;
                    l.x(iArr[i7], (List) unsafe.getObject(obj, j), r79Var, true);
                    i6 = i4;
                    break;
                case 49:
                    i4 = i6;
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    hf7 hf7VarO2 = hVar.o(i7);
                    Class cls4 = l.a;
                    if (list4 != null && !list4.isEmpty()) {
                        r79Var.getClass();
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            r79Var.x(i19, list4.get(i20), hf7VarO2);
                        }
                    }
                    i6 = i4;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object objN = hVar.n(i7);
                        hVar.m.getClass();
                        pa2 pa2Var = ((gh4) objN).a;
                        e eVar3 = (e) r79Var.b;
                        eVar3.getClass();
                        for (Map.Entry entry : ((MapFieldLite) object2).entrySet()) {
                            eVar3.s0(i9, 2);
                            eVar3.u0(gh4.a(pa2Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            cb2.b(eVar3, (WireFormat$FieldType) pa2Var.c, 1, key);
                            cb2.b(eVar3, (WireFormat$FieldType) pa2Var.b, 2, value);
                            i6 = i6;
                        }
                    }
                    i4 = i6;
                    i6 = i4;
                    break;
                case 51:
                    if (hVar.s(i9, i7, obj)) {
                        double dDoubleValue = ((Double) vy8.c.h(j, obj)).doubleValue();
                        e eVar4 = (e) r79Var.b;
                        eVar4.getClass();
                        eVar4.l0(i9, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (hVar.s(i9, i7, obj)) {
                        float fFloatValue = ((Float) vy8.c.h(j, obj)).floatValue();
                        e eVar5 = (e) r79Var.b;
                        eVar5.getClass();
                        eVar5.j0(i9, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).v0(i9, B(j, obj));
                    }
                    break;
                case 54:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).v0(i9, B(j, obj));
                    }
                    break;
                case 55:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).n0(i9, A(j, obj));
                    }
                    break;
                case 56:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).l0(i9, B(j, obj));
                    }
                    break;
                case 57:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).j0(i9, A(j, obj));
                    }
                    break;
                case 58:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).g0(i9, ((Boolean) vy8.c.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (hVar.s(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((e) r79Var.b).q0(i9, (String) object3);
                        } else {
                            ((e) r79Var.b).h0(i9, (ByteString) object3);
                        }
                    }
                    break;
                case 60:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).p0(i9, (a) unsafe.getObject(obj, j), hVar.o(i7));
                    }
                    break;
                case 61:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).h0(i9, (ByteString) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).t0(i9, A(j, obj));
                    }
                    break;
                case 63:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).n0(i9, A(j, obj));
                    }
                    break;
                case 64:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).j0(i9, A(j, obj));
                    }
                    break;
                case 65:
                    if (hVar.s(i9, i7, obj)) {
                        ((e) r79Var.b).l0(i9, B(j, obj));
                    }
                    break;
                case 66:
                    if (hVar.s(i9, i7, obj)) {
                        int iA = A(j, obj);
                        ((e) r79Var.b).t0(i9, (iA >> 31) ^ (iA << 1));
                    }
                    break;
                case 67:
                    if (hVar.s(i9, i7, obj)) {
                        long jB = B(j, obj);
                        ((e) r79Var.b).v0(i9, (jB << 1) ^ (jB >> 63));
                    }
                    break;
                case 68:
                    if (hVar.s(i9, i7, obj)) {
                        r79Var.x(i9, unsafe.getObject(obj, j), hVar.o(i7));
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        ((o) hVar.l).getClass();
        ((f) obj).unknownFields.e(r79Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.hf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // defpackage.hf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b(java.lang.Object):void");
    }

    @Override // defpackage.hf7
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int iN = N(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iN) == 0 || q(obj, i2, i, i3, i11)) {
                int iM = M(iN);
                if (iM == 9 || iM == 17) {
                    if (q(obj, i2, i, i3, i11)) {
                        if (!o(i2).c(vy8.c.h(iN & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (iM != 27) {
                        if (iM == 60 || iM == 68) {
                            if (s(i8, i2, obj)) {
                                if (!o(i2).c(vy8.c.h(iN & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (iM != 49) {
                            if (iM != 50) {
                                continue;
                            } else {
                                Object objH = vy8.c.h(iN & 1048575, obj);
                                this.m.getClass();
                                MapFieldLite mapFieldLite = (MapFieldLite) objH;
                                if (!mapFieldLite.isEmpty() && ((WireFormat$FieldType) ((gh4) n(i2)).a.b).a == WireFormat$JavaType.MESSAGE) {
                                    hf7 hf7VarA = null;
                                    for (Object obj2 : mapFieldLite.values()) {
                                        if (hf7VarA == null) {
                                            hf7VarA = hn6.c.a(obj2.getClass());
                                        }
                                        if (!hf7VarA.c(obj2)) {
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) vy8.c.h(iN & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        hf7 hf7VarO = o(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (hf7VarO.c(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.hf7
    public final f d() {
        this.j.getClass();
        return ((f) this.e).i();
    }

    @Override // defpackage.hf7
    public final void e(Object obj, r79 r79Var) throws IOException {
        r79Var.getClass();
        O(obj, r79Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        ((androidx.datastore.preferences.protobuf.f) r2).unknownFields = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x067b A[Catch: all -> 0x040f, TryCatch #12 {all -> 0x040f, blocks: (B:144:0x0676, B:146:0x067b, B:147:0x0680, B:104:0x03f5, B:106:0x03fc, B:109:0x0412, B:110:0x0425, B:111:0x0438, B:112:0x044b, B:113:0x045e, B:114:0x0472, B:115:0x0486, B:116:0x049a, B:117:0x04b3, B:118:0x04cd, B:119:0x04e7, B:120:0x0502, B:121:0x051d, B:122:0x053a, B:123:0x0554, B:124:0x0569, B:125:0x0583, B:126:0x0590, B:127:0x05ac, B:128:0x05c7, B:129:0x05e2, B:130:0x05fc, B:131:0x0616, B:132:0x0630, B:133:0x064d, B:134:0x0660, B:138:0x066b), top: B:179:0x0676 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06a3 A[LOOP:3: B:157:0x06a1->B:158:0x06a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0686 A[SYNTHETIC] */
    @Override // defpackage.hf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r18, androidx.datastore.preferences.protobuf.d r19, defpackage.i72 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.f(java.lang.Object, androidx.datastore.preferences.protobuf.d, i72):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    @Override // defpackage.hf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(androidx.datastore.preferences.protobuf.f r17) {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.g(androidx.datastore.preferences.protobuf.f):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.hf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(androidx.datastore.preferences.protobuf.f r12) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.h(androidx.datastore.preferences.protobuf.f):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.hf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.datastore.preferences.protobuf.f r12, androidx.datastore.preferences.protobuf.f r13) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.i(androidx.datastore.preferences.protobuf.f, androidx.datastore.preferences.protobuf.f):boolean");
    }

    public final boolean j(f fVar, f fVar2, int i) {
        return p(i, fVar) == p(i, fVar2);
    }

    public final void l(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (vy8.c.h(N(i) & 1048575, obj) == null) {
            return;
        }
        m(i);
    }

    public final void m(int i) {
        if (this.b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object n(int i) {
        return this.b[(i / 3) * 2];
    }

    public final hf7 o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        hf7 hf7Var = (hf7) objArr[i2];
        if (hf7Var != null) {
            return hf7Var;
        }
        hf7 hf7VarA = hn6.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = hf7VarA;
        return hf7VarA;
    }

    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iN = N(i);
            long j2 = iN & 1048575;
            switch (M(iN)) {
                case 0:
                    if (Double.doubleToRawLongBits(vy8.c.d(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(vy8.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (vy8.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (vy8.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (vy8.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (vy8.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (vy8.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return vy8.c.c(j2, obj);
                case 8:
                    Object objH = vy8.c.h(j2, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof ByteString) {
                        return !ByteString.b.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (vy8.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.b.equals(vy8.c.h(j2, obj));
                case 11:
                    if (vy8.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (vy8.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (vy8.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (vy8.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (vy8.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (vy8.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (vy8.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & vy8.c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? p(i, obj) : (i3 & i4) != 0;
    }

    public final boolean s(int i, int i2, Object obj) {
        return vy8.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r0.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.Object r9, int r10, java.lang.Object r11, defpackage.i72 r12, androidx.datastore.preferences.protobuf.d r13) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r8 = this;
            int r10 = r8.N(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            ty8 r10 = defpackage.vy8.c
            java.lang.Object r10 = r10.h(r0, r9)
            lh4 r2 = r8.m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.MapFieldLite r10 = androidx.datastore.preferences.protobuf.MapFieldLite.b
            androidx.datastore.preferences.protobuf.MapFieldLite r10 = r10.c()
            defpackage.vy8.o(r0, r9, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.MapFieldLite r3 = (androidx.datastore.preferences.protobuf.MapFieldLite) r3
            boolean r3 = r3.a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.MapFieldLite r3 = androidx.datastore.preferences.protobuf.MapFieldLite.b
            androidx.datastore.preferences.protobuf.MapFieldLite r3 = r3.c()
            defpackage.lh4.a(r3, r10)
            defpackage.vy8.o(r0, r9, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.MapFieldLite r10 = (androidx.datastore.preferences.protobuf.MapFieldLite) r10
            gh4 r11 = (defpackage.gh4) r11
            pa2 r9 = r11.a
            r11 = 2
            r13.w(r11)
            mu0 r0 = r13.a
            int r1 = r0.D()
            int r1 = r0.l(r1)
            java.lang.Object r2 = r9.d
            java.lang.String r3 = ""
            r4 = r2
        L53:
            int r5 = r13.a()     // Catch: java.lang.Throwable -> L77
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9d
            boolean r6 = r0.e()     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L63
            goto L9d
        L63:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L79
            boolean r5 = r13.x()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            if (r5 == 0) goto L71
            goto L53
        L71:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            throw r5     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
        L77:
            r9 = move-exception
            goto La4
        L79:
            java.lang.Object r5 = r9.b     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r5 = (androidx.datastore.preferences.protobuf.WireFormat$FieldType) r5     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            java.lang.Object r4 = r13.i(r5, r6, r12)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            goto L53
        L86:
            java.lang.Object r5 = r9.c     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r5 = (androidx.datastore.preferences.protobuf.WireFormat$FieldType) r5     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            r6 = 0
            java.lang.Object r3 = r13.i(r5, r6, r6)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L90
            goto L53
        L90:
            boolean r5 = r13.x()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L97
            goto L53
        L97:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L77
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r9     // Catch: java.lang.Throwable -> L77
        L9d:
            r10.put(r3, r4)     // Catch: java.lang.Throwable -> L77
            r0.k(r1)
            return
        La4:
            r0.k(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.t(java.lang.Object, int, java.lang.Object, i72, androidx.datastore.preferences.protobuf.d):void");
    }

    public final void u(int i, Object obj, Object obj2) {
        if (p(i, obj2)) {
            long jN = N(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            hf7 hf7VarO = o(i);
            if (!p(i, obj)) {
                if (r(object)) {
                    f fVarD = hf7VarO.d();
                    hf7VarO.a(fVarD, object);
                    unsafe.putObject(obj, jN, fVarD);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                H(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!r(object2)) {
                f fVarD2 = hf7VarO.d();
                hf7VarO.a(fVarD2, object2);
                unsafe.putObject(obj, jN, fVarD2);
                object2 = fVarD2;
            }
            hf7VarO.a(object2, object);
        }
    }

    public final void v(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (s(i2, i, obj2)) {
            long jN = N(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jN);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            hf7 hf7VarO = o(i);
            if (!s(i2, i, obj)) {
                if (r(object)) {
                    f fVarD = hf7VarO.d();
                    hf7VarO.a(fVarD, object);
                    unsafe.putObject(obj, jN, fVarD);
                } else {
                    unsafe.putObject(obj, jN, object);
                }
                I(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jN);
            if (!r(object2)) {
                f fVarD2 = hf7VarO.d();
                hf7VarO.a(fVarD2, object2);
                unsafe.putObject(obj, jN, fVarD2);
                object2 = fVarD2;
            }
            hf7VarO.a(object2, object);
        }
    }

    public final Object w(int i, Object obj) {
        hf7 hf7VarO = o(i);
        long jN = N(i) & 1048575;
        if (!p(i, obj)) {
            return hf7VarO.d();
        }
        Object object = o.getObject(obj, jN);
        if (r(object)) {
            return object;
        }
        f fVarD = hf7VarO.d();
        if (object != null) {
            hf7VarO.a(fVarD, object);
        }
        return fVarD;
    }

    public final Object x(int i, int i2, Object obj) {
        hf7 hf7VarO = o(i2);
        if (!s(i, i2, obj)) {
            return hf7VarO.d();
        }
        Object object = o.getObject(obj, N(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        f fVarD = hf7VarO.d();
        if (object != null) {
            hf7VarO.a(fVarD, object);
        }
        return fVarD;
    }
}
