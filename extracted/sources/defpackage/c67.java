package defpackage;

import android.os.Bundle;
import android.util.Base64;
import androidx.media3.common.ParserException;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c67 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final void a(Logger logger, af8 af8Var, ff8 ff8Var, String str) {
        logger.fine(ff8Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + af8Var.a);
    }

    public static String c(Object obj, String str) {
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return str + " value: " + obj;
    }

    public static final String d(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? bl4.s((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder()) : j <= -999500 ? bl4.s((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder()) : j <= 0 ? bl4.s((j - ((long) 500)) / ((long) 1000), " µs", new StringBuilder()) : j < 999500 ? bl4.s((j + ((long) 500)) / ((long) 1000), " µs", new StringBuilder()) : j < 999500000 ? bl4.s((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder()) : bl4.s((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder())}, 1));
    }

    public static xm8 e(Bundle bundle) {
        if (!t61.B(bundle, "bundle", xm8.class, "url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("url");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (!bundle.containsKey("showBottomNavigation")) {
            throw new IllegalArgumentException("Required argument \"showBottomNavigation\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("showBottomNavigation");
        if (!bundle.containsKey("showToolbarDivider")) {
            throw new IllegalArgumentException("Required argument \"showToolbarDivider\" is missing and does not have an android:defaultValue");
        }
        boolean z2 = bundle.getBoolean("showToolbarDivider");
        if (!bundle.containsKey("showToolbar")) {
            throw new IllegalArgumentException("Required argument \"showToolbar\" is missing and does not have an android:defaultValue");
        }
        boolean z3 = bundle.getBoolean("showToolbar");
        if (!bundle.containsKey("cacheControl")) {
            throw new IllegalArgumentException("Required argument \"cacheControl\" is missing and does not have an android:defaultValue");
        }
        boolean z4 = bundle.getBoolean("cacheControl");
        if (bundle.containsKey("finishOnBackPress")) {
            return new xm8(string, string2, z, z2, z3, z4, bundle.getBoolean("finishOnBackPress"));
        }
        throw new IllegalArgumentException("Required argument \"finishOnBackPress\" is missing and does not have an android:defaultValue");
    }

    public static final int f(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static jv4 g(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = j29.a;
            String[] strArrSplit = str.split(SimpleComparison.EQUAL_TO_OPERATION, 2);
            if (strArrSplit.length != 2) {
                wn5.k0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(i76.d(new h26(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    wn5.l0("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new ib9(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new jv4(arrayList);
    }

    public static final Class h(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            js3.o(rawType, "getRawType(...)");
            return h(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            js3.o(upperBounds, "getUpperBounds(...)");
            Object objK0 = ew.K0(upperBounds);
            js3.o(objK0, "first(...)");
            return h((Type) objK0);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            js3.o(genericComponentType, "getGenericComponentType(...)");
            return h(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + g27.a(type.getClass()));
    }

    public static hl5 i(h26 h26Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            n(3, h26Var, false);
        }
        h26Var.v((int) h26Var.o(), StandardCharsets.UTF_8);
        long jO = h26Var.o();
        String[] strArr = new String[(int) jO];
        for (int i = 0; i < jO; i++) {
            strArr[i] = h26Var.v((int) h26Var.o(), StandardCharsets.UTF_8);
        }
        if (z2 && (h26Var.x() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new hl5(18, strArr);
    }

    public static final px3 j(rb4 rb4Var, Class cls, List list) throws IllegalAccessException, InvocationTargetException {
        px3[] px3VarArr = (px3[]) list.toArray(new px3[0]);
        px3 px3VarR = rq4.r(cls, (px3[]) Arrays.copyOf(px3VarArr, px3VarArr.length));
        if (px3VarR != null) {
            return px3VarR;
        }
        ps0 ps0VarA = g27.a(cls);
        MapBuilder mapBuilder = dk6.a;
        px3 px3Var = (px3) dk6.a.get(ps0VarA);
        if (px3Var != null) {
            return px3Var;
        }
        rb4Var.getClass();
        if (((Map) rb4Var.b).get(ps0VarA) != null) {
            throw new ClassCastException();
        }
        if (cls.isInterface()) {
            return new qh6(g27.a(cls));
        }
        return null;
    }

    public static final px3 l(rb4 rb4Var, Type type, boolean z) {
        ArrayList<px3> arrayList;
        px3 px3VarL;
        px3 px3VarL2;
        zw3 zw3VarA;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                js3.o(upperBounds, "getUpperBounds(...)");
                genericComponentType = (Type) ew.K0(upperBounds);
            }
            js3.m(genericComponentType);
            if (z) {
                px3VarL2 = b67.f(rb4Var, genericComponentType);
            } else {
                js3.p(rb4Var, "<this>");
                px3VarL2 = l(rb4Var, genericComponentType, false);
                if (px3VarL2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                js3.n(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                zw3VarA = g27.a((Class) rawType);
            } else {
                if (!(genericComponentType instanceof zw3)) {
                    throw new IllegalStateException("unsupported type in GenericArray: " + g27.a(genericComponentType.getClass()));
                }
                zw3VarA = (zw3) genericComponentType;
            }
            js3.n(zw3VarA, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return new b27(zw3VarA, px3VarL2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return j(rb4Var, cls, EmptyList.a);
            }
            Class<?> componentType = cls.getComponentType();
            js3.o(componentType, "getComponentType(...)");
            if (z) {
                px3VarL = b67.f(rb4Var, componentType);
            } else {
                js3.p(rb4Var, "<this>");
                px3VarL = l(rb4Var, componentType, false);
                if (px3VarL == null) {
                    return null;
                }
            }
            return new b27(g27.a(componentType), px3VarL);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                js3.o(upperBounds2, "getUpperBounds(...)");
                Object objK0 = ew.K0(upperBounds2);
                js3.o(objK0, "first(...)");
                return l(rb4Var, (Type) objK0, true);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + g27.a(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        js3.n(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        js3.m(actualTypeArguments);
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                js3.m(type2);
                arrayList.add(b67.f(rb4Var, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                js3.m(type3);
                js3.p(rb4Var, "<this>");
                px3 px3VarL3 = l(rb4Var, type3, false);
                if (px3VarL3 == null) {
                    return null;
                }
                arrayList.add(px3VarL3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            px3 px3Var = (px3) arrayList.get(0);
            js3.p(px3Var, "elementSerializer");
            return new qv(px3Var, 1);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            px3 px3Var2 = (px3) arrayList.get(0);
            js3.p(px3Var2, "elementSerializer");
            return new qv(px3Var2, 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return ct2.e((px3) arrayList.get(0), (px3) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            px3 px3Var3 = (px3) arrayList.get(0);
            px3 px3Var4 = (px3) arrayList.get(1);
            js3.p(px3Var3, "keySerializer");
            js3.p(px3Var4, "valueSerializer");
            return new jh4(px3Var3, px3Var4, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            px3 px3Var5 = (px3) arrayList.get(0);
            px3 px3Var6 = (px3) arrayList.get(1);
            js3.p(px3Var5, "keySerializer");
            js3.p(px3Var6, "valueSerializer");
            return new jh4(px3Var5, px3Var6, 1);
        }
        if (Triple.class.isAssignableFrom(cls2)) {
            px3 px3Var7 = (px3) arrayList.get(0);
            px3 px3Var8 = (px3) arrayList.get(1);
            px3 px3Var9 = (px3) arrayList.get(2);
            js3.p(px3Var7, "aSerializer");
            js3.p(px3Var8, "bSerializer");
            js3.p(px3Var9, "cSerializer");
            return new zs8(px3Var7, px3Var8, px3Var9);
        }
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        for (px3 px3Var10 : arrayList) {
            js3.n(px3Var10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(px3Var10);
        }
        return j(rb4Var, cls2, arrayList2);
    }

    public static final g77 m(g77 g77Var) {
        js3.p(g77Var, "<this>");
        f77 f77VarD = g77Var.d();
        j77 j77Var = g77Var.g;
        f77VarD.g = new gy8(j77Var.g(), j77Var.d());
        return f77VarD.a();
    }

    public static boolean n(int i, h26 h26Var, boolean z) throws ParserException {
        if (h26Var.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + h26Var.a());
        }
        if (h26Var.x() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (h26Var.x() == 118 && h26Var.x() == 111 && h26Var.x() == 114 && h26Var.x() == 98 && h26Var.x() == 105 && h26Var.x() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }

    public static void o(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void p(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void q(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean r(xk9 xk9Var) {
        if (xk9Var == null) {
            return false;
        }
        Double dI = xk9Var.i();
        return !dI.isNaN() && dI.doubleValue() >= 0.0d && dI.equals(Double.valueOf(Math.floor(dI.doubleValue())));
    }

    public static zzbk s(String str) {
        zzbk zzbkVar = null;
        if (str != null && !str.isEmpty()) {
            zzbkVar = (zzbk) zzbk.I0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        throw new IllegalArgumentException(dw1.n("Unsupported commandId ", str));
    }

    public static boolean t(xk9 xk9Var, xk9 xk9Var2) {
        if (!xk9Var.getClass().equals(xk9Var2.getClass())) {
            return false;
        }
        if ((xk9Var instanceof dl9) || (xk9Var instanceof uk9)) {
            return true;
        }
        if (!(xk9Var instanceof nk9)) {
            return xk9Var instanceof cl9 ? xk9Var.l().equals(xk9Var2.l()) : xk9Var instanceof kk9 ? xk9Var.c().equals(xk9Var2.c()) : xk9Var == xk9Var2;
        }
        if (Double.isNaN(xk9Var.i().doubleValue()) || Double.isNaN(xk9Var2.i().doubleValue())) {
            return false;
        }
        return xk9Var.i().equals(xk9Var2.i());
    }

    public static int u(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double v(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static Object w(xk9 xk9Var) {
        if (xk9.q0.equals(xk9Var)) {
            return null;
        }
        if (xk9.p0.equals(xk9Var)) {
            return "";
        }
        if (xk9Var instanceof tk9) {
            return x((tk9) xk9Var);
        }
        if (!(xk9Var instanceof gk9)) {
            return !xk9Var.i().isNaN() ? xk9Var.i() : xk9Var.l();
        }
        ArrayList arrayList = new ArrayList();
        gk9 gk9Var = (gk9) xk9Var;
        int i = 0;
        while (i < gk9Var.o()) {
            if (i >= gk9Var.o()) {
                throw new NoSuchElementException(rm7.o(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            }
            int i2 = i + 1;
            Object objW = w(gk9Var.p(i));
            if (objW != null) {
                arrayList.add(objW);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap x(tk9 tk9Var) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(tk9Var.a.keySet())) {
            Object objW = w(tk9Var.d(str));
            if (objW != null) {
                map.put(str, objW);
            }
        }
        return map;
    }

    public static void y(o77 o77Var) {
        int iU = u(o77Var.O("runtime.counter").i().doubleValue() + 1.0d);
        if (iU > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        o77Var.M("runtime.counter", new nk9(Double.valueOf(iU)));
    }

    public abstract Object b();

    public abstract c67 k(String str, dp2 dp2Var);
}
