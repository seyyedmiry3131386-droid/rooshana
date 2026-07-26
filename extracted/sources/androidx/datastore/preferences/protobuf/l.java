package androidx.datastore.preferences.protobuf;

import defpackage.br1;
import defpackage.ce0;
import defpackage.ee2;
import defpackage.fe4;
import defpackage.hn6;
import defpackage.iq3;
import defpackage.r79;
import defpackage.sr3;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final Class a;
    public static final m b;
    public static final o c;

    static {
        Class<?> cls;
        Class<?> cls2;
        hn6 hn6Var = hn6.c;
        m mVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            hn6 hn6Var2 = hn6.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                mVar = (m) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = mVar;
        c = new o();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof iq3)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += e.b0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB0;
        }
        iq3 iq3Var = (iq3) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += e.b0(iq3Var.d(i));
            i++;
        }
        return iB02;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.Z(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.Z(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof iq3)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += e.b0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB0;
        }
        iq3 iq3Var = (iq3) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += e.b0(iq3Var.d(i));
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
        if (!(list instanceof fe4)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += e.b0(((Long) list.get(i)).longValue());
                i++;
            }
            return iB0;
        }
        fe4 fe4Var = (fe4) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += e.b0(fe4Var.d(i));
            i++;
        }
        return iB02;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof iq3)) {
            int iW = 0;
            while (i < size) {
                iW += e.W(((Integer) list.get(i)).intValue());
                i++;
            }
            return iW;
        }
        iq3 iq3Var = (iq3) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += e.W(iq3Var.d(i));
            i++;
        }
        return iW2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fe4)) {
            int iX = 0;
            while (i < size) {
                iX += e.X(((Long) list.get(i)).longValue());
                i++;
            }
            return iX;
        }
        fe4 fe4Var = (fe4) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += e.X(fe4Var.d(i));
            i++;
        }
        return iX2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof iq3)) {
            int iA0 = 0;
            while (i < size) {
                iA0 += e.a0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA0;
        }
        iq3 iq3Var = (iq3) list;
        int iA02 = 0;
        while (i < size) {
            iA02 += e.a0(iq3Var.d(i));
            i++;
        }
        return iA02;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fe4)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += e.b0(((Long) list.get(i)).longValue());
                i++;
            }
            return iB0;
        }
        fe4 fe4Var = (fe4) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += e.b0(fe4Var.d(i));
            i++;
        }
        return iB02;
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
    public static void k(m mVar, Object obj, Object obj2) {
        ((o) mVar).getClass();
        f fVar = (f) obj;
        n nVar = fVar.unknownFields;
        n nVar2 = ((f) obj2).unknownFields;
        n nVar3 = n.f;
        if (!nVar3.equals(nVar2)) {
            if (nVar3.equals(nVar)) {
                int i = nVar.a + nVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(nVar.b, i);
                System.arraycopy(nVar2.b, 0, iArrCopyOf, nVar.a, nVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(nVar.c, i);
                System.arraycopy(nVar2.c, 0, objArrCopyOf, nVar.a, nVar2.a);
                nVar = new n(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                nVar.getClass();
                if (!nVar2.equals(nVar3)) {
                    if (!nVar.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = nVar.a + nVar2.a;
                    nVar.a(i2);
                    System.arraycopy(nVar2.b, 0, nVar.b, nVar.a, nVar2.a);
                    System.arraycopy(nVar2.c, 0, nVar.c, nVar.a, nVar2.a);
                    nVar.a = i2;
                }
            }
        }
        fVar.unknownFields = nVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (list instanceof ce0) {
            if (z) {
                eVar.s0(i, 2);
                eVar.u0(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                eVar.g0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = e.q;
            i3++;
        }
        eVar.u0(i3);
        while (i2 < list.size()) {
            eVar.e0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (list instanceof br1) {
            if (z) {
                eVar.s0(i, 2);
                eVar.u0(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                eVar.getClass();
                eVar.l0(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = e.q;
            i3 += 8;
        }
        eVar.u0(i3);
        while (i2 < list.size()) {
            eVar.m0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof iq3)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.n0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int iB0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB0 += e.b0(((Integer) list.get(i3)).intValue());
            }
            eVar.u0(iB0);
            while (i2 < list.size()) {
                eVar.o0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iq3 iq3Var = (iq3) list;
        if (!z) {
            while (i2 < 0) {
                eVar.n0(i, iq3Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int iB02 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iB02 += e.b0(iq3Var.d(i4));
        }
        eVar.u0(iB02);
        while (i2 < 0) {
            eVar.o0(iq3Var.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof iq3)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.j0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = e.q;
                i3 += 4;
            }
            eVar.u0(i3);
            while (i2 < list.size()) {
                eVar.k0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iq3 iq3Var = (iq3) list;
        if (!z) {
            while (i2 < 0) {
                eVar.j0(i, iq3Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            iq3Var.d(i6);
            Logger logger2 = e.q;
            i5 += 4;
        }
        eVar.u0(i5);
        while (i2 < 0) {
            eVar.k0(iq3Var.d(i2));
            i2++;
        }
    }

    public static void q(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof fe4)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.l0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = e.q;
                i3 += 8;
            }
            eVar.u0(i3);
            while (i2 < list.size()) {
                eVar.m0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fe4 fe4Var = (fe4) list;
        if (!z) {
            while (i2 < 0) {
                eVar.l0(i, fe4Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            fe4Var.d(i6);
            Logger logger2 = e.q;
            i5 += 8;
        }
        eVar.u0(i5);
        while (i2 < 0) {
            eVar.m0(fe4Var.d(i2));
            i2++;
        }
    }

    public static void r(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (list instanceof ee2) {
            if (z) {
                eVar.s0(i, 2);
                eVar.u0(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                eVar.getClass();
                eVar.j0(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = e.q;
            i3 += 4;
        }
        eVar.u0(i3);
        while (i2 < list.size()) {
            eVar.k0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof iq3)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.n0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int iB0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB0 += e.b0(((Integer) list.get(i3)).intValue());
            }
            eVar.u0(iB0);
            while (i2 < list.size()) {
                eVar.o0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iq3 iq3Var = (iq3) list;
        if (!z) {
            while (i2 < 0) {
                eVar.n0(i, iq3Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int iB02 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iB02 += e.b0(iq3Var.d(i4));
        }
        eVar.u0(iB02);
        while (i2 < 0) {
            eVar.o0(iq3Var.d(i2));
            i2++;
        }
    }

    public static void t(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof fe4)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.v0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int iB0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB0 += e.b0(((Long) list.get(i3)).longValue());
            }
            eVar.u0(iB0);
            while (i2 < list.size()) {
                eVar.w0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fe4 fe4Var = (fe4) list;
        if (!z) {
            while (i2 < 0) {
                eVar.v0(i, fe4Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int iB02 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iB02 += e.b0(fe4Var.d(i4));
        }
        eVar.u0(iB02);
        while (i2 < 0) {
            eVar.w0(fe4Var.d(i2));
            i2++;
        }
    }

    public static void u(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof iq3)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.j0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = e.q;
                i3 += 4;
            }
            eVar.u0(i3);
            while (i2 < list.size()) {
                eVar.k0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iq3 iq3Var = (iq3) list;
        if (!z) {
            while (i2 < 0) {
                eVar.j0(i, iq3Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            iq3Var.d(i6);
            Logger logger2 = e.q;
            i5 += 4;
        }
        eVar.u0(i5);
        while (i2 < 0) {
            eVar.k0(iq3Var.d(i2));
            i2++;
        }
    }

    public static void v(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof fe4)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.l0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = e.q;
                i3 += 8;
            }
            eVar.u0(i3);
            while (i2 < list.size()) {
                eVar.m0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fe4 fe4Var = (fe4) list;
        if (!z) {
            while (i2 < 0) {
                eVar.l0(i, fe4Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            fe4Var.d(i6);
            Logger logger2 = e.q;
            i5 += 8;
        }
        eVar.u0(i5);
        while (i2 < 0) {
            eVar.m0(fe4Var.d(i2));
            i2++;
        }
    }

    public static void w(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof iq3)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    eVar.t0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iW += e.W(((Integer) list.get(i3)).intValue());
            }
            eVar.u0(iW);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                eVar.u0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        iq3 iq3Var = (iq3) list;
        if (!z) {
            while (i2 < 0) {
                int iD = iq3Var.d(i2);
                eVar.t0(i, (iD >> 31) ^ (iD << 1));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iW2 += e.W(iq3Var.d(i4));
        }
        eVar.u0(iW2);
        while (i2 < 0) {
            int iD2 = iq3Var.d(i2);
            eVar.u0((iD2 >> 31) ^ (iD2 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof fe4)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    eVar.v0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += e.X(((Long) list.get(i3)).longValue());
            }
            eVar.u0(iX);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                eVar.w0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        fe4 fe4Var = (fe4) list;
        if (!z) {
            while (i2 < 0) {
                long jD = fe4Var.d(i2);
                eVar.v0(i, (jD >> 63) ^ (jD << 1));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iX2 += e.X(fe4Var.d(i4));
        }
        eVar.u0(iX2);
        while (i2 < 0) {
            long jD2 = fe4Var.d(i2);
            eVar.w0((jD2 >> 63) ^ (jD2 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof iq3)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.t0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int iA0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA0 += e.a0(((Integer) list.get(i3)).intValue());
            }
            eVar.u0(iA0);
            while (i2 < list.size()) {
                eVar.u0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        iq3 iq3Var = (iq3) list;
        if (!z) {
            while (i2 < 0) {
                eVar.t0(i, iq3Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int iA02 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iA02 += e.a0(iq3Var.d(i4));
        }
        eVar.u0(iA02);
        while (i2 < 0) {
            eVar.u0(iq3Var.d(i2));
            i2++;
        }
    }

    public static void z(int i, List list, r79 r79Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) r79Var.b;
        int i2 = 0;
        if (!(list instanceof fe4)) {
            if (!z) {
                while (i2 < list.size()) {
                    eVar.v0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eVar.s0(i, 2);
            int iB0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB0 += e.b0(((Long) list.get(i3)).longValue());
            }
            eVar.u0(iB0);
            while (i2 < list.size()) {
                eVar.w0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fe4 fe4Var = (fe4) list;
        if (!z) {
            while (i2 < 0) {
                eVar.v0(i, fe4Var.d(i2));
                i2++;
            }
            return;
        }
        eVar.s0(i, 2);
        int iB02 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iB02 += e.b0(fe4Var.d(i4));
        }
        eVar.u0(iB02);
        while (i2 < 0) {
            eVar.w0(fe4Var.d(i2));
            i2++;
        }
    }

    public static Object j(Object obj, int i, sr3 sr3Var, Object obj2, m mVar) {
        return obj2;
    }
}
