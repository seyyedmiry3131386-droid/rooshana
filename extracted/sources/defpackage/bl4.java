package defpackage;

import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.a;
import androidx.compose.ui.graphics.Path$Direction;
import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import org.pcap4j.packet.namednumber.PppDllProtocol;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bl4 {
    public static String A(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder B(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder C(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder D(String str, DialogDataModel dialogDataModel, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(dialogDataModel);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder E(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void F(long j, String str, StringBuilder sb) {
        sb.append((Object) zu0.i(j));
        sb.append(str);
    }

    public static void G(MyketRecyclerData myketRecyclerData, ArrayList arrayList) {
        arrayList.add(new RecyclerItem(myketRecyclerData));
    }

    public static void H(String str, String str2, String str3) {
        th0.k(b.M(new Pair(str, str2)), str3);
    }

    public static void I(PppDllProtocol pppDllProtocol, HashMap map, PppDllProtocol pppDllProtocol2, PppDllProtocol pppDllProtocol3, PppDllProtocol pppDllProtocol4) {
        map.put(pppDllProtocol.value(), pppDllProtocol2);
        map.put(pppDllProtocol3.value(), pppDllProtocol4);
    }

    public static boolean a(fx4 fx4Var, dp2 dp2Var) {
        return ((Boolean) dp2Var.invoke(fx4Var)).booleanValue();
    }

    public static int b(cl4 cl4Var, es3 es3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new jf1((yk4) list.get(i2), IntrinsicMinMax.b, IntrinsicWidthHeight.b));
        }
        return cl4Var.d(new ls3(es3Var, es3Var.getLayoutDirection()), arrayList, j31.b(i, 0, 13)).a();
    }

    public static int c(cl4 cl4Var, es3 es3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new jf1((yk4) list.get(i2), IntrinsicMinMax.b, IntrinsicWidthHeight.a));
        }
        return cl4Var.d(new ls3(es3Var, es3Var.getLayoutDirection()), arrayList, j31.b(0, i, 7)).b();
    }

    public static int d(cl4 cl4Var, es3 es3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new jf1((yk4) list.get(i2), IntrinsicMinMax.a, IntrinsicWidthHeight.b));
        }
        return cl4Var.d(new ls3(es3Var, es3Var.getLayoutDirection()), arrayList, j31.b(i, 0, 13)).a();
    }

    public static int e(cl4 cl4Var, es3 es3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new jf1((yk4) list.get(i2), IntrinsicMinMax.a, IntrinsicWidthHeight.a));
        }
        return cl4Var.d(new ls3(es3Var, es3Var.getLayoutDirection()), arrayList, j31.b(0, i, 7)).b();
    }

    public static n94 f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((jp4) it.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                hj3 hj3Var = new hj3();
                hj3Var.l(unsupportedOperationException);
                return hj3Var;
            }
        }
        return ja1.y(list);
    }

    public static hx4 g(hx4 hx4Var, hx4 hx4Var2) {
        return hx4Var2 == ex4.b ? hx4Var : new a(hx4Var, hx4Var2);
    }

    public static void h(eh ehVar, u26 u26Var) {
        Path path = ehVar.a;
        if (!(u26Var instanceof eh)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((eh) u26Var).a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void i(u26 u26Var, sy6 sy6Var) {
        Path$Direction[] path$DirectionArr = Path$Direction.a;
        eh ehVar = (eh) u26Var;
        ehVar.getClass();
        float f = sy6Var.a;
        float f2 = sy6Var.d;
        float f3 = sy6Var.c;
        float f4 = sy6Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            gh.b("Invalid rectangle, make sure no value is NaN");
        }
        if (ehVar.b == null) {
            ehVar.b = new RectF();
        }
        RectF rectF = ehVar.b;
        js3.m(rectF);
        rectF.set(f, f4, f3, f2);
        Path path = ehVar.a;
        RectF rectF2 = ehVar.b;
        js3.m(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void j(u26 u26Var, fa7 fa7Var) {
        Path$Direction[] path$DirectionArr = Path$Direction.a;
        eh ehVar = (eh) u26Var;
        if (ehVar.b == null) {
            ehVar.b = new RectF();
        }
        RectF rectF = ehVar.b;
        js3.m(rectF);
        float f = fa7Var.a;
        long j = fa7Var.h;
        long j2 = fa7Var.g;
        long j3 = fa7Var.f;
        long j4 = fa7Var.e;
        rectF.set(f, fa7Var.b, fa7Var.c, fa7Var.d);
        if (ehVar.c == null) {
            ehVar.c = new float[8];
        }
        float[] fArr = ehVar.c;
        js3.m(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = ehVar.a;
        RectF rectF2 = ehVar.b;
        js3.m(rectF2);
        float[] fArr2 = ehVar.c;
        js3.m(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static int k(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean l(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static ClassCastException n(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException o(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object p(Number number, int i, Resources resources, List list, int i2) {
        y40.i(i, resources, number.floatValue());
        return list.get(i2);
    }

    public static String q(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String r(long j, String str) {
        return str + j;
    }

    public static String s(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String t(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static String u(String str, File file, String str2) {
        return str + file + str2;
    }

    public static String v(String str, Class cls) {
        return str + cls;
    }

    public static String w(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String x(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String y(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String z(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }
}
