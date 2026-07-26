package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.FunctionImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ps0 implements zw3, os0 {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List listC = br9.C(bp2.class, dp2.class, qp2.class, rp2.class, sp2.class, tp2.class, up2.class, vp2.class, wp2.class, xp2.class, cp2.class, ep2.class, fp2.class, gp2.class, hp2.class, ip2.class, jp2.class, kp2.class, lp2.class, mp2.class, op2.class, pp2.class, FunctionImpl.class);
        ArrayList arrayList = new ArrayList(wu0.V(listC, 10));
        for (Object obj : listC) {
            int i2 = i + 1;
            if (i < 0) {
                br9.P();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = b.S(arrayList);
    }

    public ps0(Class cls) {
        js3.p(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.os0
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String strR;
        Class cls = this.a;
        js3.p(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strR2 = y97.r(cls.getName());
            return strR2 == null ? cls.getCanonicalName() : strR2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strR = y97.r(componentType.getName())) != null) {
            strConcat = strR.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String d() {
        String strZ;
        Class cls = this.a;
        js3.p(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strZ2 = y97.Z(cls.getName());
                return strZ2 == null ? cls.getSimpleName() : strZ2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strZ = y97.Z(componentType.getName())) != null) {
                strConcat = strZ.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return f88.D0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return f88.C0('$', simpleName, simpleName);
        }
        return f88.D0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean e(Object obj) {
        Class clsV = this.a;
        js3.p(clsV, "jClass");
        Map map = b;
        js3.n(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsV);
        if (num != null) {
            return wu8.C(num.intValue(), obj);
        }
        if (clsV.isPrimitive()) {
            clsV = yh0.v(g27.a(clsV));
        }
        return clsV.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ps0) && yh0.v(this).equals(yh0.v((zw3) obj));
    }

    public final int hashCode() {
        return yh0.v(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
