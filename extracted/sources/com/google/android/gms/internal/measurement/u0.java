package com.google.android.gms.internal.measurement;

import defpackage.c35;
import defpackage.ft9;
import defpackage.ks9;
import defpackage.pt9;
import defpackage.vs8;
import defpackage.ys9;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public static final vs8 a;

    static {
        ft9 ft9Var = ft9.c;
        a = new vs8();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        q0 q0Var = (q0) obj;
        pt9 pt9Var = q0Var.zzc;
        pt9 pt9Var2 = ((q0) obj2).zzc;
        pt9 pt9Var3 = pt9.f;
        if (!pt9Var3.equals(pt9Var2)) {
            if (pt9Var3.equals(pt9Var)) {
                int i = pt9Var.a + pt9Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(pt9Var.b, i);
                System.arraycopy(pt9Var2.b, 0, iArrCopyOf, pt9Var.a, pt9Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(pt9Var.c, i);
                System.arraycopy(pt9Var2.c, 0, objArrCopyOf, pt9Var.a, pt9Var2.a);
                pt9Var = new pt9(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                pt9Var.getClass();
                if (!pt9Var2.equals(pt9Var3)) {
                    if (!pt9Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = pt9Var.a + pt9Var2.a;
                    pt9Var.e(i2);
                    System.arraycopy(pt9Var2.b, 0, pt9Var.b, pt9Var.a, pt9Var2.a);
                    System.arraycopy(pt9Var2.c, 0, pt9Var.c, pt9Var.a, pt9Var2.a);
                    pt9Var.a = i2;
                }
            }
        }
        q0Var.zzc = pt9Var;
    }

    public static void c(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p0Var.m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        p0Var.p(i3);
        while (i2 < list.size()) {
            p0Var.s(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                p0Var.k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        p0Var.p(i3);
        while (i2 < list.size()) {
            p0Var.q(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void e(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ys9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.l(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += p0.f(((Long) list.get(i3)).longValue());
            }
            p0Var.p(iF);
            while (i2 < list.size()) {
                p0Var.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ys9 ys9Var = (ys9) list;
        if (!z) {
            while (i2 < ys9Var.c) {
                p0Var.l(i, ys9Var.c(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < ys9Var.c; i4++) {
            iF2 += p0.f(ys9Var.c(i4));
        }
        p0Var.p(iF2);
        while (i2 < ys9Var.c) {
            p0Var.r(ys9Var.c(i2));
            i2++;
        }
    }

    public static void f(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ys9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.l(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += p0.f(((Long) list.get(i3)).longValue());
            }
            p0Var.p(iF);
            while (i2 < list.size()) {
                p0Var.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ys9 ys9Var = (ys9) list;
        if (!z) {
            while (i2 < ys9Var.c) {
                p0Var.l(i, ys9Var.c(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < ys9Var.c; i4++) {
            iF2 += p0.f(ys9Var.c(i4));
        }
        p0Var.p(iF2);
        while (i2 < ys9Var.c) {
            p0Var.r(ys9Var.c(i2));
            i2++;
        }
    }

    public static void g(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ys9)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    p0Var.l(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iF += p0.f((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            p0Var.p(iF);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                p0Var.r((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        ys9 ys9Var = (ys9) list;
        if (!z) {
            while (i2 < ys9Var.c) {
                long jC = ys9Var.c(i2);
                p0Var.l(i, (jC >> 63) ^ (jC + jC));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < ys9Var.c; i4++) {
            long jC2 = ys9Var.c(i4);
            iF2 += p0.f((jC2 >> 63) ^ (jC2 + jC2));
        }
        p0Var.p(iF2);
        while (i2 < ys9Var.c) {
            long jC3 = ys9Var.c(i2);
            p0Var.r((jC3 >> 63) ^ (jC3 + jC3));
            i2++;
        }
    }

    public static void h(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ys9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            p0Var.p(i3);
            while (i2 < list.size()) {
                p0Var.s(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ys9 ys9Var = (ys9) list;
        if (!z) {
            while (i2 < ys9Var.c) {
                p0Var.m(i, ys9Var.c(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ys9Var.c; i6++) {
            ys9Var.c(i6);
            i5 += 8;
        }
        p0Var.p(i5);
        while (i2 < ys9Var.c) {
            p0Var.s(ys9Var.c(i2));
            i2++;
        }
    }

    public static void i(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ys9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            p0Var.p(i3);
            while (i2 < list.size()) {
                p0Var.s(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ys9 ys9Var = (ys9) list;
        if (!z) {
            while (i2 < ys9Var.c) {
                p0Var.m(i, ys9Var.c(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ys9Var.c; i6++) {
            ys9Var.c(i6);
            i5 += 8;
        }
        p0Var.p(i5);
        while (i2 < ys9Var.c) {
            p0Var.s(ys9Var.c(i2));
            i2++;
        }
    }

    public static void j(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ks9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += p0.f(((Integer) list.get(i3)).intValue());
            }
            p0Var.p(iF);
            while (i2 < list.size()) {
                p0Var.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ks9 ks9Var = (ks9) list;
        if (!z) {
            while (i2 < ks9Var.c) {
                p0Var.i(i, ks9Var.d(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < ks9Var.c; i4++) {
            iF2 += p0.f(ks9Var.d(i4));
        }
        p0Var.p(iF2);
        while (i2 < ks9Var.c) {
            p0Var.o(ks9Var.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, c35 c35Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ks9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += p0.v(((Integer) list.get(i3)).intValue());
            }
            p0Var.p(iV);
            while (i2 < list.size()) {
                p0Var.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ks9 ks9Var = (ks9) list;
        if (!z) {
            while (i2 < ks9Var.c) {
                p0Var.j(i, ks9Var.d(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < ks9Var.c; i4++) {
            iV2 += p0.v(ks9Var.d(i4));
        }
        p0Var.p(iV2);
        while (i2 < ks9Var.c) {
            p0Var.p(ks9Var.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, c35 c35Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ks9)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    p0Var.j(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iV += p0.v((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            p0Var.p(iV);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                p0Var.p((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        ks9 ks9Var = (ks9) list;
        if (!z) {
            while (i2 < ks9Var.c) {
                int iD = ks9Var.d(i2);
                p0Var.j(i, (iD >> 31) ^ (iD + iD));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < ks9Var.c; i4++) {
            int iD2 = ks9Var.d(i4);
            iV2 += p0.v((iD2 >> 31) ^ (iD2 + iD2));
        }
        p0Var.p(iV2);
        while (i2 < ks9Var.c) {
            int iD3 = ks9Var.d(i2);
            p0Var.p((iD3 >> 31) ^ (iD3 + iD3));
            i2++;
        }
    }

    public static void m(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ks9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            p0Var.p(i3);
            while (i2 < list.size()) {
                p0Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ks9 ks9Var = (ks9) list;
        if (!z) {
            while (i2 < ks9Var.c) {
                p0Var.k(i, ks9Var.d(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ks9Var.c; i6++) {
            ks9Var.d(i6);
            i5 += 4;
        }
        p0Var.p(i5);
        while (i2 < ks9Var.c) {
            p0Var.q(ks9Var.d(i2));
            i2++;
        }
    }

    public static void n(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ks9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            p0Var.p(i3);
            while (i2 < list.size()) {
                p0Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ks9 ks9Var = (ks9) list;
        if (!z) {
            while (i2 < ks9Var.c) {
                p0Var.k(i, ks9Var.d(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ks9Var.c; i6++) {
            ks9Var.d(i6);
            i5 += 4;
        }
        p0Var.p(i5);
        while (i2 < ks9Var.c) {
            p0Var.q(ks9Var.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!(list instanceof ks9)) {
            if (!z) {
                while (i2 < list.size()) {
                    p0Var.i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            p0Var.h(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += p0.f(((Integer) list.get(i3)).intValue());
            }
            p0Var.p(iF);
            while (i2 < list.size()) {
                p0Var.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ks9 ks9Var = (ks9) list;
        if (!z) {
            while (i2 < ks9Var.c) {
                p0Var.i(i, ks9Var.d(i2));
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < ks9Var.c; i4++) {
            iF2 += p0.f(ks9Var.d(i4));
        }
        p0Var.p(iF2);
        while (i2 < ks9Var.c) {
            p0Var.o(ks9Var.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, c35 c35Var, boolean z) throws zzll {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0 p0Var = (p0) c35Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                p0Var.p(i << 3);
                p0Var.n(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        p0Var.h(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        p0Var.p(i3);
        while (i2 < list.size()) {
            p0Var.n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ys9)) {
            int iF = 0;
            while (i < size) {
                iF += p0.f(((Long) list.get(i)).longValue());
                i++;
            }
            return iF;
        }
        ys9 ys9Var = (ys9) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += p0.f(ys9Var.c(i));
            i++;
        }
        return iF2;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ys9)) {
            int iF = 0;
            while (i < size) {
                iF += p0.f(((Long) list.get(i)).longValue());
                i++;
            }
            return iF;
        }
        ys9 ys9Var = (ys9) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += p0.f(ys9Var.c(i));
            i++;
        }
        return iF2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ys9)) {
            int iF = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iF += p0.f((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iF;
        }
        ys9 ys9Var = (ys9) list;
        int iF2 = 0;
        while (i < size) {
            long jC = ys9Var.c(i);
            iF2 += p0.f((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iF2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ks9)) {
            int iF = 0;
            while (i < size) {
                iF += p0.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        ks9 ks9Var = (ks9) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += p0.f(ks9Var.d(i));
            i++;
        }
        return iF2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ks9)) {
            int iF = 0;
            while (i < size) {
                iF += p0.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        ks9 ks9Var = (ks9) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += p0.f(ks9Var.d(i));
            i++;
        }
        return iF2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ks9)) {
            int iV = 0;
            while (i < size) {
                iV += p0.v(((Integer) list.get(i)).intValue());
                i++;
            }
            return iV;
        }
        ks9 ks9Var = (ks9) list;
        int iV2 = 0;
        while (i < size) {
            iV2 += p0.v(ks9Var.d(i));
            i++;
        }
        return iV2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ks9)) {
            int iV = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iV += p0.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iV;
        }
        ks9 ks9Var = (ks9) list;
        int iV2 = 0;
        while (i < size) {
            int iD = ks9Var.d(i);
            iV2 += p0.v((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iV2;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p0.v(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (p0.v(i << 3) + 8) * size;
    }
}
