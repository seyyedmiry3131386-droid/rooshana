package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mo7 extends o27 {
    public static ho7 p(Iterator it) {
        js3.p(it, "<this>");
        return new u21(new dw(4, it));
    }

    public static boolean q(ho7 ho7Var, Object obj) {
        Iterator it = ho7Var.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                br9.P();
                throw null;
            }
            if (js3.i(obj, next)) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static pc2 r(ho7 ho7Var, dp2 dp2Var) {
        js3.p(dp2Var, "predicate");
        return new pc2(ho7Var, true, dp2Var);
    }

    public static ho7 s(dp2 dp2Var, Object obj) {
        js3.p(dp2Var, "nextFunction");
        return obj == null ? h12.a : new gq1(new o06(26, obj), dp2Var);
    }

    public static String t(ho7 ho7Var, String str) {
        js3.p(ho7Var, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : ho7Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            cc7.b(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object u(ho7 ho7Var) {
        Iterator it = ho7Var.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static pc2 v(ho7 ho7Var, dp2 dp2Var) {
        return new pc2(new vq8(ho7Var, dp2Var), false, new vd7(23));
    }

    public static List w(ho7 ho7Var) {
        Iterator it = ho7Var.iterator();
        if (!it.hasNext()) {
            return EmptyList.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return br9.B(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList x(ho7 ho7Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ho7Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
