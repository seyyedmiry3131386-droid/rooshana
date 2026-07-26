package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.j256.ormlite.stmt.query.SimpleComparison;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class h27 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public h27() {
        new ConcurrentHashMap();
    }

    public static Object a(pa5 pa5Var) {
        if (pa5Var == null) {
            return null;
        }
        return pa5Var.b();
    }

    public static final long g() {
        return Thread.currentThread().getId();
    }

    public static void i() {
        Iterator it = Collections.EMPTY_LIST.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
    }

    public static final ViewParent j(View view) {
        js3.p(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(yr6.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void k(Bundle bundle, String str) {
        js3.p(str, "key");
        bundle.putString(str, null);
    }

    public static final void l(Bundle bundle, String str, Bundle bundle2) {
        js3.p(str, "key");
        js3.p(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        bundle.putBundle(str, bundle2);
    }

    public static final void m(String str, String str2, Bundle bundle) {
        js3.p(str, "key");
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        bundle.putString(str, str2);
    }

    public static final void n(Bundle bundle, String str, List list) {
        js3.p(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static String o(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strW;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strW = Ssh2PublicKeyAlgorithmName.NULL;
            } else {
                try {
                    strW = obj.toString();
                } catch (Exception e) {
                    String strJ = t61.j(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e);
                    strW = bl4.w(SimpleComparison.LESS_THAN_OPERATION, strJ, " threw ", e.getClass().getName(), SimpleComparison.GREATER_THAN_OPERATION);
                }
            }
            objArr[i2] = strW;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public abstract Typeface b(Context context, hi2 hi2Var, Resources resources, int i);

    public abstract Typeface c(Context context, hj2[] hj2VarArr, int i);

    public Typeface d(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface e(Context context, InputStream inputStream) {
        File fileH = j27.h(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (j27.c(fileH, inputStream)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }

    public Typeface f(Context context, Resources resources, int i, String str, int i2) {
        File fileH = j27.h(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (j27.b(fileH, resources, i)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }

    public hj2 h(hj2[] hj2VarArr, int i) {
        int i2 = (i & 1) == 0 ? ErrorDTO.CODE_ACCESS_DENIED : 700;
        boolean z = (i & 2) != 0;
        hj2 hj2Var = null;
        int i3 = Integer.MAX_VALUE;
        for (hj2 hj2Var2 : hj2VarArr) {
            int iAbs = (Math.abs(hj2Var2.c - i2) * 2) + (hj2Var2.d == z ? 0 : 1);
            if (hj2Var == null || i3 > iAbs) {
                hj2Var = hj2Var2;
                i3 = iAbs;
            }
        }
        return hj2Var;
    }
}
