package com.google.protobuf;

import defpackage.ee4;
import defpackage.ev4;
import defpackage.gf7;
import defpackage.hq3;
import defpackage.i44;
import defpackage.nr3;
import defpackage.qm5;
import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static final Class a;
    public static final v b;
    public static final x c;

    static {
        Class<?> cls;
        Class<?> cls2;
        v vVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                vVar = (v) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = vVar;
        c = new x();
    }

    public static void A(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                jVar.B0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int iF0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iF0 += j.f0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        jVar.A0(iF0);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            jVar.C0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void B(int i, List list, qm5 qm5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!(list instanceof i44)) {
            while (i2 < list.size()) {
                jVar.w0(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        i44 i44Var = (i44) list;
        while (i2 < list.size()) {
            Object objA1 = i44Var.a1(i2);
            if (objA1 instanceof String) {
                jVar.w0(i, (String) objA1);
            } else {
                jVar.k0(i, (ByteString) objA1);
            }
            i2++;
        }
    }

    public static void C(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.z0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int iE0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE0 += j.e0(((Integer) list.get(i3)).intValue());
        }
        jVar.A0(iE0);
        while (i2 < list.size()) {
            jVar.A0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.B0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int iF0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF0 += j.f0(((Long) list.get(i3)).longValue());
        }
        jVar.A0(iF0);
        while (i2 < list.size()) {
            jVar.C0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hq3)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += j.b0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB0;
        }
        hq3 hq3Var = (hq3) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += j.b0(hq3Var.e(i));
            i++;
        }
        return iB02;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.d0(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.d0(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hq3)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += j.b0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB0;
        }
        hq3 hq3Var = (hq3) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += j.b0(hq3Var.e(i));
            i++;
        }
        return iB02;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ee4)) {
            int iF0 = 0;
            while (i < size) {
                iF0 += j.f0(((Long) list.get(i)).longValue());
                i++;
            }
            return iF0;
        }
        ee4 ee4Var = (ee4) list;
        int iF02 = 0;
        while (i < size) {
            ee4Var.d(i);
            iF02 += j.f0(ee4Var.b[i]);
            i++;
        }
        return iF02;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hq3)) {
            int iE0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iE0 += j.e0((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iE0;
        }
        hq3 hq3Var = (hq3) list;
        int iE02 = 0;
        while (i < size) {
            int iE = hq3Var.e(i);
            iE02 += j.e0((iE >> 31) ^ (iE << 1));
            i++;
        }
        return iE02;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ee4)) {
            int iF0 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iF0 += j.f0((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iF0;
        }
        ee4 ee4Var = (ee4) list;
        int iF02 = 0;
        while (i < size) {
            ee4Var.d(i);
            long j = ee4Var.b[i];
            iF02 += j.f0((j >> 63) ^ (j << 1));
            i++;
        }
        return iF02;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hq3)) {
            int iE0 = 0;
            while (i < size) {
                iE0 += j.e0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iE0;
        }
        hq3 hq3Var = (hq3) list;
        int iE02 = 0;
        while (i < size) {
            iE02 += j.e0(hq3Var.e(i));
            i++;
        }
        return iE02;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ee4)) {
            int iF0 = 0;
            while (i < size) {
                iF0 += j.f0(((Long) list.get(i)).longValue());
                i++;
            }
            return iF0;
        }
        ee4 ee4Var = (ee4) list;
        int iF02 = 0;
        while (i < size) {
            ee4Var.d(i);
            iF02 += j.f0(ee4Var.b[i]);
            i++;
        }
        return iF02;
    }

    public static Object j(Object obj, int i, AbstractList abstractList, nr3 nr3Var, Object obj2, v vVar) {
        if (nr3Var == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (nr3Var.a(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    obj2 = vVar.a(obj);
                }
                ((x) vVar).getClass();
                ((w) obj2).f(i << 3, Long.valueOf(iIntValue));
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(v vVar, Object obj, Object obj2) {
        ((x) vVar).getClass();
        o oVar = (o) obj;
        w wVarE = oVar.unknownFields;
        w wVar = ((o) obj2).unknownFields;
        w wVar2 = w.f;
        if (!wVar2.equals(wVar)) {
            if (wVar2.equals(wVarE)) {
                wVarE = w.e(wVarE, wVar);
            } else {
                wVarE.getClass();
                if (!wVar.equals(wVar2)) {
                    wVarE.a();
                    int i = wVarE.a + wVar.a;
                    wVarE.b(i);
                    System.arraycopy(wVar.b, 0, wVarE.b, wVarE.a, wVar.a);
                    System.arraycopy(wVar.c, 0, wVarE.c, wVarE.a, wVar.a);
                    wVarE.a = i;
                }
            }
        }
        oVar.unknownFields = wVarE;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.i0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = j.j;
            i3++;
        }
        jVar.A0(i3);
        while (i2 < list.size()) {
            jVar.h0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, qm5 qm5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qm5Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((j) qm5Var.b).k0(i, (ByteString) list.get(i2));
        }
    }

    public static void o(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                jVar.getClass();
                jVar.o0(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = j.j;
            i3 += 8;
        }
        jVar.A0(i3);
        while (i2 < list.size()) {
            jVar.p0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void p(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.q0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += j.b0(((Integer) list.get(i3)).intValue());
        }
        jVar.A0(iB0);
        while (i2 < list.size()) {
            jVar.r0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.m0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = j.j;
            i3 += 4;
        }
        jVar.A0(i3);
        while (i2 < list.size()) {
            jVar.n0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void r(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.o0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = j.j;
            i3 += 8;
        }
        jVar.A0(i3);
        while (i2 < list.size()) {
            jVar.p0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void s(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                jVar.getClass();
                jVar.m0(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = j.j;
            i3 += 4;
        }
        jVar.A0(i3);
        while (i2 < list.size()) {
            jVar.n0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void t(int i, List list, qm5 qm5Var, gf7 gf7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qm5Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            qm5Var.v(i, list.get(i2), gf7Var);
        }
    }

    public static void u(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.q0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += j.b0(((Integer) list.get(i3)).intValue());
        }
        jVar.A0(iB0);
        while (i2 < list.size()) {
            jVar.r0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.B0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int iF0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF0 += j.f0(((Long) list.get(i3)).longValue());
        }
        jVar.A0(iF0);
        while (i2 < list.size()) {
            jVar.C0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, qm5 qm5Var, gf7 gf7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qm5Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((j) qm5Var.b).s0(i, (ev4) list.get(i2), gf7Var);
        }
    }

    public static void x(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.m0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = j.j;
            i3 += 4;
        }
        jVar.A0(i3);
        while (i2 < list.size()) {
            jVar.n0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void y(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.o0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = j.j;
            i3 += 8;
        }
        jVar.A0(i3);
        while (i2 < list.size()) {
            jVar.p0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void z(int i, List list, qm5 qm5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) qm5Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                jVar.z0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        jVar.y0(i, 2);
        int iE0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iE0 += j.e0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        jVar.A0(iE0);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            jVar.A0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }
}
