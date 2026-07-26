package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.Display;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.b;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import com.google.android.gms.internal.measurement.q0;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class hy2 implements wf0, l51, ly0, v61, y98, c39, t08, tf0, h51, q37, bt9, oi1, RequestDTO, dv {
    public static final hy2 b = new hy2(1);
    public static final hy2 c = new hy2(2);
    public static final hy2 d = new hy2(3);
    public static final tf e = new tf(1);
    public static final tf f = new tf(2);
    public static final hy2 g = new hy2(5);
    public static final hy2 h = new hy2(6);
    public static final hy2 i = new hy2(7);
    public static final hy2 j = new hy2(8);
    public static final hy2 k = new hy2(9);
    public static final hy2 l = new hy2(10);
    public static final /* synthetic */ hy2 m = new hy2(11);
    public static final hy2 n = new hy2(12);
    public static final hy2 o = new hy2(13);
    public static final hy2 p = new hy2(14);
    public static final hy2 q = new hy2(15);
    public static final hy2 r = new hy2(16);
    public static final hy2 s = new hy2(17);
    public static final hy2 t = new hy2(18);
    public static final hy2 u = new hy2(19);
    public static final hy2 v = new hy2(20);
    public static final /* synthetic */ hy2 w = new hy2(21);
    public static final /* synthetic */ hy2 x = new hy2(22);
    public static final hy2 y = new hy2(23);
    public final /* synthetic */ int a;

    public /* synthetic */ hy2(int i2) {
        this.a = i2;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static do3 r(Context context, String[] strArr, String str) {
        String[] strArrT = t(context);
        int length = strArrT.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = strArrT[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String string = sb.toString();
                            sk6.B("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                do3 do3Var = new do3();
                                do3Var.a = zipFile;
                                do3Var.b = entry;
                                return do3Var;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static String[] s(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : t(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] t(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        kp9 kp9Var = (kp9) ((zm9) obj).getService();
        Parcel parcelN0 = kp9Var.n0();
        int i2 = lm9.a;
        parcelN0.writeInt(1);
        uy6.K(uy6.J(20293, parcelN0), parcelN0);
        kp9Var.o0(2002, parcelN0);
        ((cf8) obj2).b(Boolean.TRUE);
    }

    @Override // defpackage.oi1
    public boolean b(SSLSocket sSLSocket) {
        return m88.Z(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.oi1
    public d18 c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(bl4.v("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        return new bi(superclass);
    }

    @Override // defpackage.y98
    public void d(x98 x98Var) {
        x98Var.clear();
    }

    @Override // defpackage.dv, defpackage.hv
    public float e() {
        return 0;
    }

    @Override // defpackage.h51
    public Object f(bf8 bf8Var) throws IOException {
        if (bf8Var.f()) {
            return (Bundle) bf8Var.d();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(bf8Var.c()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", bf8Var.c());
    }

    @Override // defpackage.wf0
    public Rect g(Activity activity2) {
        int i2;
        Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
        js3.m(defaultDisplay);
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i3 = point.x;
        if (i3 == 0 || (i2 = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i3;
        rect.bottom = i2;
        return rect;
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        Object objG = o77Var.g(new so6(gx8.class, Executor.class));
        js3.o(objG, "get(...)");
        return tv8.o((Executor) objG);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.l51
    public Object i(Object obj) {
        switch (this.a) {
            case 2:
                j77 j77Var = (j77) obj;
                try {
                    gh0 gh0Var = new gh0();
                    j77Var.d1().e0(gh0Var);
                    dt4 dt4VarG = j77Var.g();
                    long jD = j77Var.d();
                    i77 i77Var = j77.a;
                    i77 i77Var2 = new i77(dt4VarG, jD, gh0Var);
                    j77Var.close();
                    return i77Var2;
                } catch (Throwable th) {
                    j77Var.close();
                    throw th;
                }
            default:
                ((j77) obj).close();
                return null;
        }
    }

    @Override // defpackage.y98
    public boolean j(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.dv
    public void k(qj1 qj1Var, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        jv.c(i2, iArr, iArr2, false);
    }

    @Override // defpackage.t08
    public boolean l(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // defpackage.c39
    public Object m(a aVar, float f2) {
        JsonReader$Token jsonReader$TokenD = aVar.d();
        if (jsonReader$TokenD == JsonReader$Token.a) {
            return sw3.b(aVar, f2);
        }
        if (jsonReader$TokenD == JsonReader$Token.c) {
            return sw3.b(aVar, f2);
        }
        if (jsonReader$TokenD != JsonReader$Token.g) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + jsonReader$TokenD);
        }
        PointF pointF = new PointF(((float) aVar.nextDouble()) * f2, ((float) aVar.nextDouble()) * f2);
        while (aVar.hasNext()) {
            aVar.z();
        }
        return pointF;
    }

    @Override // defpackage.tf0
    public long n(vl1 vl1Var, int i2) {
        return ((ri8) vl1Var.e).i(i2);
    }

    @Override // defpackage.bt9
    public boolean o(Class cls) {
        return q0.class.isAssignableFrom(cls);
    }

    @Override // defpackage.bt9
    public ht9 p(Class cls) {
        if (!q0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (ht9) q0.l(cls.asSubclass(q0.class)).o(3);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }

    public lb7 q(b bVar) {
        int i2;
        int i3;
        String str = bVar.n;
        if (str != null) {
            i2 = 1;
            i3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new lq(i3);
                case "application/x-icy":
                    return new mh3();
                case "application/id3":
                    return new qh3(null);
                case "application/x-emsg":
                    return new lq(i2);
                case "application/x-scte35":
                    return new h38();
            }
        }
        throw new IllegalArgumentException(dw1.n("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "ReferentialEqualityPolicy";
            case 29:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    public boolean u(b bVar) {
        String str = bVar.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
