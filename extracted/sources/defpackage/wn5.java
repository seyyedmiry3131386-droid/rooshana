package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.i;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.b;
import io.sentry.android.core.t0;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import okhttp3.TlsVersion;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wn5 {
    public static final byte[] a = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, Dot11LinkAdaptationControl.ASELI, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final Object b = new Object();
    public static final bn6 c = new bn6(new g66(25), new v27(4), 5);
    public static final ba4 d;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    static {
        int i2 = 0;
        d = new ba4(i2, i2);
    }

    public static final hx4 A(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new ev1(dp2Var));
    }

    public static void B(i iVar, rq4 rq4Var, ch0 ch0Var, float f2, iv1 iv1Var, int i2) {
        iv1 iv1Var2 = (i2 & 8) != 0 ? dc2.a : iv1Var;
        if (rq4Var instanceof ww5) {
            sy6 sy6Var = ((ww5) rq4Var).p;
            float f3 = sy6Var.a;
            iVar.g0(ch0Var, (((long) Float.floatToRawIntBits(sy6Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), c0(sy6Var), f2, iv1Var2);
            return;
        }
        if (!(rq4Var instanceof xw5)) {
            if (!(rq4Var instanceof vw5)) {
                throw new NoWhenBranchMatchedException();
            }
            iVar.M(((vw5) rq4Var).p, ch0Var, f2, iv1Var2, 3);
            return;
        }
        xw5 xw5Var = (xw5) rq4Var;
        eh ehVar = xw5Var.q;
        if (ehVar != null) {
            iVar.M(ehVar, ch0Var, f2, iv1Var2, 3);
            return;
        }
        fa7 fa7Var = xw5Var.p;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fa7Var.h >> 32));
        iVar.c(ch0Var, (((long) Float.floatToRawIntBits(fa7Var.a)) << 32) | (((long) Float.floatToRawIntBits(fa7Var.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fa7Var.b())) << 32) | (((long) Float.floatToRawIntBits(fa7Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f2, iv1Var2);
    }

    public static void C(hv1 hv1Var, rq4 rq4Var, long j2) {
        if (rq4Var instanceof ww5) {
            sy6 sy6Var = ((ww5) rq4Var).p;
            float f2 = sy6Var.a;
            hv1Var.l0(j2, (4294967295L & ((long) Float.floatToRawIntBits(sy6Var.b))) | (Float.floatToRawIntBits(f2) << 32), c0(sy6Var), 1.0f, 3);
            return;
        }
        boolean z = rq4Var instanceof xw5;
        dc2 dc2Var = dc2.a;
        if (!z) {
            if (!(rq4Var instanceof vw5)) {
                throw new NoWhenBranchMatchedException();
            }
            hv1Var.z(((vw5) rq4Var).p, j2, dc2Var);
            return;
        }
        xw5 xw5Var = (xw5) rq4Var;
        eh ehVar = xw5Var.q;
        if (ehVar != null) {
            hv1Var.z(ehVar, j2, dc2Var);
            return;
        }
        fa7 fa7Var = xw5Var.p;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fa7Var.h >> 32));
        float f3 = fa7Var.a;
        float f4 = fa7Var.b;
        hv1Var.R(j2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (((long) Float.floatToRawIntBits(fa7Var.b())) << 32) | (((long) Float.floatToRawIntBits(fa7Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), dc2Var);
    }

    public static final hx4 D(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new kv1(dp2Var));
    }

    public static final hx4 E(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new lv1(dp2Var));
    }

    public static void F(String str, String str2) {
        synchronized (b) {
            t0.d(str, a(str2, null));
        }
    }

    public static void G(String str, String str2, Exception exc) {
        String strO = O(str);
        if (Log.isLoggable(strO, 6)) {
            t0.e(strO, str2, exc);
        }
    }

    public static void H(String str, String str2, Throwable th) {
        synchronized (b) {
            t0.d(str, a(str2, th));
        }
    }

    public static final tq8 I(wa9 wa9Var, ll llVar) {
        wa9Var.getClass();
        int length = llVar.b.length();
        int length2 = llVar.b.length();
        int iMin = Math.min(length, 100);
        for (int i2 = 0; i2 < iMin; i2++) {
            i0(i2, length2, i2);
        }
        i0(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < iMin2; i3++) {
            j0(i3, length, i3);
        }
        j0(length2, length, length2);
        return new tq8(llVar, new ba4(llVar.b.length(), llVar.b.length()));
    }

    public static final Integer J(bz7 bz7Var, d01 d01Var, int i2, int i3) {
        Integer numJ;
        int[] iArr = bz7Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (bz7Var.j(i2) && bz7Var.i(i2) == 206 && js3.i(bz7Var.p(iArr, i2), sz0.e)) {
                Object objH = bz7Var.h(i2, 0);
                n37 n37Var = objH instanceof n37 ? (n37) objH : null;
                m37 m37Var = n37Var != null ? n37Var.a : null;
                oz0 oz0Var = m37Var instanceof oz0 ? (oz0) m37Var : null;
                if (oz0Var != null && oz0Var.a.equals(d01Var)) {
                    return Integer.valueOf(i2);
                }
            }
            if (bz7Var.d(i2) && (numJ = J(bz7Var, d01Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(numJ.intValue());
            }
            i2 = i4;
        }
    }

    public static final View K(View view, dp2 dp2Var, View view2) {
        View viewK;
        if (((Boolean) dp2Var.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != view2 && (viewK = K(childAt, dp2Var, view2)) != null) {
                return viewK;
            }
        }
        return null;
    }

    public static ww2 L(SSLSession sSLSession) throws IOException {
        List listK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        gr0 gr0VarX = gr0.b.x(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        TlsVersion.b.getClass();
        TlsVersion tlsVersionN = ol3.n(protocol);
        try {
            listK = ih9.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listK = EmptyList.a;
        }
        return new ww2(tlsVersionN, gr0VarX, ih9.k(sSLSession.getLocalCertificates()), new vw2(listK, 0));
    }

    public static List M(Context context) {
        if (context == null) {
            return EmptyList.a;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.fromParts("http", "", null));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        js3.o(listQueryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(((ResolveInfo) obj).activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int N(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static String O(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static String P(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (b) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void Q(String str) {
        synchronized (b) {
            a(str, null);
        }
    }

    public static boolean R() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1 A[PHI: r8
      0x00e1: PHI (r8v24 java.lang.String) = (r8v23 java.lang.String), (r8v47 java.lang.String) binds: [B:46:0x00c9, B:50:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void S(android.content.Intent r22) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn5.S(android.content.Intent):void");
    }

    public static void T(Bundle bundle, String str) {
        try {
            xc2.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    t0.n("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e3) {
                    t0.n("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = hl5.l(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            xc2 xc2VarC = xc2.c();
            xc2VarC.a();
            yd ydVar = (yd) xc2VarC.d.get(yd.class);
            if (ydVar != null) {
                ((zd) ydVar).a(bundle2, str);
            } else {
                t0.m("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            t0.d("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.jk0 U(defpackage.by2 r26) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn5.U(by2):jk0");
    }

    public static bj V(b bVar, gf4 gf4Var) {
        return new bj(xy3.a(bVar, gf4Var, 1.0f, th0.f, false), 0);
    }

    public static cj W(a aVar, gf4 gf4Var, boolean z) {
        return new cj(1, xy3.a(aVar, gf4Var, z ? n29.c() : 1.0f, eq.z, false));
    }

    public static bj X(b bVar, gf4 gf4Var, int i2) {
        tu2 tu2Var = new tu2();
        tu2Var.a = i2;
        ArrayList arrayListA = xy3.a(bVar, gf4Var, 1.0f, tu2Var, false);
        for (int i3 = 0; i3 < arrayListA.size(); i3++) {
            uy3 uy3Var = (uy3) arrayListA.get(i3);
            ru2 ru2Var = (ru2) uy3Var.b;
            ru2 ru2Var2 = (ru2) uy3Var.c;
            if (ru2Var != null && ru2Var2 != null) {
                float[] fArr = ru2Var.a;
                int length = fArr.length;
                float[] fArr2 = ru2Var2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    uy3Var = new uy3(ru2Var.b(fArrCopyOfRange), ru2Var2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i3, uy3Var);
        }
        return new bj(arrayListA, 1);
    }

    public static bj Y(a aVar, gf4 gf4Var) {
        return new bj(xy3.a(aVar, gf4Var, 1.0f, eq.C, false), 2);
    }

    public static bj Z(b bVar, gf4 gf4Var) {
        return new bj(xy3.a(bVar, gf4Var, n29.c(), hy2.q, true), 3);
    }

    public static String a(String str, Throwable th) {
        String strP = P(th);
        if (TextUtils.isEmpty(strP)) {
            return str;
        }
        StringBuilder sbE = bl4.E(str, "\n  ");
        sbE.append(strP.replace("\n", "\n  "));
        sbE.append('\n');
        return sbE.toString();
    }

    public static void a0(int i2, Context context, String str) {
        ActivityOptions activityOptionsMakeBasic;
        lw.f(null, "chromium packages must be greater than zero", !M(context).isEmpty());
        String str2 = ((ResolveInfo) M(context).get(0)).activityInfo.packageName;
        if (context == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", i2 | (-16777216));
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtras(bundle);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            String strL = jr9.l();
            if (!TextUtils.isEmpty(strL)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strL);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i3 >= 34) {
            activityOptionsMakeBasic = ActivityOptions.makeBasic();
            i3.A(activityOptionsMakeBasic);
        } else {
            activityOptionsMakeBasic = null;
        }
        if (i3 >= 36) {
            if (activityOptionsMakeBasic == null) {
                activityOptionsMakeBasic = ActivityOptions.makeBasic();
            }
            r3.i(activityOptionsMakeBasic, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        Bundle bundle3 = activityOptionsMakeBasic != null ? activityOptionsMakeBasic.toBundle() : null;
        Uri uri = Uri.parse(str);
        if (str2 != null && !f88.n0(str2)) {
            intent.setPackage(str2);
        }
        Bundle bundle4 = new Bundle();
        if (fg5.c(uri)) {
            ox3[] ox3VarArr = fe5.a;
            bundle4.putString("X-Access-Token", ir.myket.persistent.datasource.extensions.a.a((eb1) fe5.b.a(context, fe5.a[0])));
        }
        intent.putExtra("com.android.browser.headers", bundle4);
        intent.setData(uri);
        ContextCompat.startActivity(context, intent, bundle3);
    }

    public static String b(String str, int i2, int i3) {
        if (i2 < 0) {
            return sb7.o("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return sb7.o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(rm7.n(i3, "negative size: "));
    }

    public static boolean b0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ov6, tt9] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ge] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List c(fz7 fz7Var, Integer num, int i2, Integer num2) {
        int iG;
        int iS;
        mb5 mb5Var;
        if (fz7Var.w || fz7Var.p() == 0) {
            return EmptyList.a;
        }
        ?? ov6Var = new ov6(fz7Var);
        if (num2 != null) {
            iG = num2.intValue();
        } else {
            iG = fz7Var.v;
            if (iG < 0) {
                iG = fz7Var.G(fz7Var.b, i2);
            }
        }
        if (num == 0) {
            int iP = fz7Var.i - fz7Var.P(fz7Var.b, fz7Var.r(i2));
            ya5 ya5Var = fz7Var.s;
            num = Integer.valueOf(iP + ((ya5Var == null || (mb5Var = (mb5) ya5Var.b(i2)) == null) ? 0 : mb5Var.b));
        }
        int iR = fz7Var.r(i2) * 5;
        int[] iArr = fz7Var.b;
        if (iR < iArr.length) {
            iS = fz7Var.s(i2);
        } else {
            int iG2 = iG >= 0 ? fz7Var.G(iArr, iG) : iG;
            iS = fz7Var.s(iG);
            int i3 = iG;
            iG = iG2;
            i2 = i3;
        }
        while (i2 >= 0) {
            ov6Var.o(iS, (fz7Var.b[(fz7Var.r(i2) * 5) + 1] & 536870912) != 0 ? fz7Var.t(i2) : jz0.a, fz7Var.Q(i2), num);
            num = fz7Var.b(i2);
            if (iG >= 0) {
                int iG3 = fz7Var.G(fz7Var.b, iG);
                iS = fz7Var.s(iG);
                int i4 = iG;
                iG = iG3;
                i2 = i4;
            } else {
                i2 = iG;
            }
        }
        return (ArrayList) ov6Var.b;
    }

    public static final long c0(sy6 sy6Var) {
        float f2 = sy6Var.c - sy6Var.a;
        return (((long) Float.floatToRawIntBits(sy6Var.d - sy6Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static boolean d(Context context) {
        return !M(context).isEmpty();
    }

    public static String d0(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        String str = ((es1) bs1Var).d;
        js3.o(str, "getKey(...)");
        List listY0 = f88.y0(str, new String[]{"/"}, 6);
        return listY0.get(0) + "/" + listY0.get(1);
    }

    public static void e(int i2, int i3, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(sb7.o(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static String e0(MovieDownloadMetaData movieDownloadMetaData) {
        js3.p(movieDownloadMetaData, "movieDownloadMetaData");
        return movieDownloadMetaData.a + "/" + movieDownloadMetaData.f;
    }

    public static void f(long j2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(sb7.o(str, Long.valueOf(j2)));
        }
    }

    public static String f0(MovieDownloadMetaData movieDownloadMetaData) {
        js3.p(movieDownloadMetaData, "movieDownloadMetaData");
        return t61.i(e0(movieDownloadMetaData), "/media");
    }

    public static void g(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(sb7.o(str, obj));
        }
    }

    public static String g0(MovieDownloadMetaData movieDownloadMetaData) {
        return t61.i(e0(movieDownloadMetaData), "/sub");
    }

    public static void h(String str, int i2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(sb7.o(str, Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ov6, tt9] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList h0(bz7 bz7Var, int i2, Integer num) {
        ?? ov6Var = new ov6(bz7Var);
        int iQ = bz7Var.q(i2);
        ge geVarA = bz7Var.a(i2);
        while (i2 >= 0) {
            ov6Var.o(bz7Var.i(i2), bz7Var.k(i2) ? bz7Var.p(bz7Var.b, i2) : jz0.a, bz7Var.a.h(i2), num);
            if (iQ >= 0) {
                ge geVar = geVarA;
                geVarA = bz7Var.a(iQ);
                i2 = iQ;
                iQ = bz7Var.q(iQ);
                num = geVar;
            } else {
                i2 = iQ;
                num = geVarA;
            }
        }
        return (ArrayList) ov6Var.b;
    }

    public static void i(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final void i0(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbB = bl4.B(i4, i2, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbB.append(i3);
        sbB.append(']');
        un3.c(sbB.toString());
    }

    public static void j(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static final void j0(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbB = bl4.B(i4, i2, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbB.append(i3);
        sbB.append(']');
        un3.c(sbB.toString());
    }

    public static void k(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(sb7.o(str, obj, obj2));
        }
    }

    public static void k0(String str, String str2) {
        synchronized (b) {
            t0.m(str, a(str2, null));
        }
    }

    public static void l(int i2, int i3) {
        String strO;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strO = sb7.o("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(rm7.n(i3, "negative size: "));
                }
                strO = sb7.o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strO);
        }
    }

    public static void l0(String str, String str2, Throwable th) {
        synchronized (b) {
            t0.m(str, a(str2, th));
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(b("index", i2, i3));
        }
    }

    public static void o(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? b("start index", i2, i4) : (i3 < 0 || i3 > i4) ? b("end index", i3, i4) : sb7.o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void p(long j2, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(sb7.o(str, Long.valueOf(j2)));
        }
    }

    public static void q(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(sb7.o(str, obj));
        }
    }

    public static void r(String str, int i2, boolean z) {
        if (!z) {
            throw new IllegalStateException(sb7.o(str, Integer.valueOf(i2)));
        }
    }

    public static void s(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static final boolean u(sy6 sy6Var, float f2, float f3) {
        float f4 = sy6Var.a;
        if (f2 > sy6Var.c || f4 > f2) {
            return false;
        }
        return f3 <= sy6Var.d && sy6Var.b <= f3;
    }

    public static final u22 v(String str, Enum[] enumArr) {
        js3.p(enumArr, "values");
        return new u22(str, enumArr);
    }

    public static void w(String str) {
        synchronized (b) {
            a(str, null);
        }
    }

    public static void x(String str, String str2, Object obj) {
        if (Log.isLoggable(O(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:48|(3:117|49|(4:128|50|126|51))|(4:123|52|(1:54)(1:130)|116)|59|110|60|106|61|62|116) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r12)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] y(java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn5.y(java.lang.String):byte[]");
    }

    public static boolean z() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            xc2.c();
            xc2 xc2VarC = xc2.c();
            xc2VarC.a();
            context = xc2VarC.a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }
}
