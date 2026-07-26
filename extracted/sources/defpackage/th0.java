package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Bundle;
import android.os.Parcel;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value$ValueCase;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.f;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.android.core.t0;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes4.dex */
public final class th0 implements l51, wf0, c39, ly0, v61, t08, w67, cg9, q37, ih2, os, t54 {
    public static FirebaseAnalytics c;
    public final /* synthetic */ int a;
    public static final th0 b = new th0(0);
    public static final th0 d = new th0(2);
    public static final th0 e = new th0(3);
    public static final th0 f = new th0(4);
    public static final th0 g = new th0(5);
    public static final th0 h = new th0(6);
    public static final th0 i = new th0(7);
    public static final th0 j = new th0(8);
    public static final th0 k = new th0(9);
    public static final sy6 l = new sy6(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final th0 m = new th0(11);
    public static final /* synthetic */ th0 n = new th0(12);
    public static final /* synthetic */ th0 o = new th0(13);
    public static final th0 p = new th0(14);
    public static final th0 q = new th0(15);
    public static final th0 r = new th0(16);
    public static final th0 s = new th0(17);
    public static final th0 t = new th0(18);
    public static final p58 u = new p58(2);
    public static final p58 v = new p58(3);
    public static final th0 w = new th0(20);
    public static final th0 x = new th0(21);
    public static final /* synthetic */ th0 y = new th0(22);
    public static final /* synthetic */ th0 z = new th0(23);

    public /* synthetic */ th0(int i2) {
        this.a = i2;
    }

    public static void k(Map map, String str) {
        FirebaseAnalytics firebaseAnalytics = c;
        if (firebaseAnalytics != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                js3.p(str2, "key");
                js3.p(str3, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                bundle.putString(str2, str3);
            }
            yo9 yo9Var = firebaseAnalytics.a;
            yo9Var.getClass();
            yo9Var.c(new oo9(yo9Var, null, null, str, bundle, false, true));
        }
    }

    @Override // defpackage.cg9
    public yf9 a(Activity activity2, rj1 rj1Var) {
        js3.p(rj1Var, "densityCompatHelper");
        wf0.b0.getClass();
        return new yf9(new uf0(vf0.a().g(activity2)), rj1Var.b(activity2));
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        zm9 zm9Var = (zm9) obj;
        cf8 cf8Var = (cf8) obj2;
        switch (this.a) {
            case 22:
                cf8Var.b(null);
                break;
            default:
                kp9 kp9Var = (kp9) zm9Var.getService();
                Parcel parcelN0 = kp9Var.n0();
                int i2 = lm9.a;
                parcelN0.writeInt(1);
                uy6.K(uy6.J(20293, parcelN0), parcelN0);
                kp9Var.o0(2004, parcelN0);
                cf8Var.b(Boolean.TRUE);
                break;
        }
    }

    @Override // defpackage.t54
    public void c(e64 e64Var) {
        e64Var.k();
    }

    @Override // defpackage.cg9
    public yf9 d(Context context, rj1 rj1Var) {
        js3.p(rj1Var, "densityCompatHelper");
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            js3.o(baseContext, "getBaseContext(...)");
        }
        if (baseContext instanceof Activity) {
            return a((Activity) baseContext, rj1Var);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        js3.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        js3.o(defaultDisplay, "getDefaultDisplay(...)");
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new yf9(new Rect(0, 0, point.x, point.y), rj1Var.b(context));
    }

    public void e(String str) {
        js3.p(str, "message");
        k96 k96Var = k96.a;
        k96.a.j(str, 4, null);
    }

    @Override // defpackage.wf0
    public Rect g(Activity activity2) throws Exception {
        DisplayCutout displayCutoutB;
        Rect rect = new Rect();
        Configuration configuration = activity2.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (jr9.u(activity2)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                js3.n(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                js3.n(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            wf0.b0.getClass();
            t0.l(e2, vf0.b);
            activity2.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!jr9.u(activity2)) {
            Resources resources = activity2.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !jr9.u(activity2) && (displayCutoutB = ul.b(defaultDisplay)) != null) {
            if (rect.left == ul.A(displayCutoutB)) {
                rect.left = 0;
            }
            if (point.x - rect.right == ul.B(displayCutoutB)) {
                rect.right = ul.B(displayCutoutB) + rect.right;
            }
            if (rect.top == ul.C(displayCutoutB)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == ul.z(displayCutoutB)) {
                rect.bottom = ul.z(displayCutoutB) + rect.bottom;
            }
        }
        return rect;
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        Object objG = o77Var.g(new so6(r64.class, Executor.class));
        js3.o(objG, "get(...)");
        return tv8.o((Executor) objG);
    }

    @Override // defpackage.l51
    public Object i(Object obj) {
        switch (this.a) {
            case 0:
                return obj.toString();
            default:
                return (j77) obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // defpackage.os
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String j(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r5.length()
            r2 = 1
            int r0 = r0 - r2
            char r0 = r5.charAt(r0)
            r3 = 47
            if (r0 != r3) goto L1b
            r0 = 0
            java.lang.String r5 = defpackage.dw1.l(r5, r2, r0)
        L1b:
            if (r5 == 0) goto L32
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r2 = "^\\p{Alpha}+://.*$"
            r0.<init>(r2)
            boolean r0 = r0.f(r5)
            if (r0 != 0) goto L30
            java.lang.String r0 = "http://"
            java.lang.String r5 = r0.concat(r5)
        L30:
            if (r5 != 0) goto L34
        L32:
            java.lang.String r5 = ""
        L34:
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L3a
            r0.<init>(r5)     // Catch: java.net.MalformedURLException -> L3a
            return r5
        L3a:
            r5 = move-exception
            defpackage.lw.g(r5, r1, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th0.j(java.lang.String):java.lang.String");
    }

    @Override // defpackage.t08
    public boolean l(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                return false;
            default:
                return js3.i(obj, obj2);
        }
    }

    @Override // defpackage.c39
    public Object m(a aVar, float f2) {
        switch (this.a) {
            case 4:
                boolean z2 = aVar.d() == JsonReader$Token.a;
                if (z2) {
                    aVar.c1();
                }
                double dNextDouble = aVar.nextDouble();
                double dNextDouble2 = aVar.nextDouble();
                double dNextDouble3 = aVar.nextDouble();
                double dNextDouble4 = aVar.d() == JsonReader$Token.g ? aVar.nextDouble() : 1.0d;
                if (z2) {
                    aVar.W0();
                }
                if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
                    dNextDouble *= 255.0d;
                    dNextDouble2 *= 255.0d;
                    dNextDouble3 *= 255.0d;
                    if (dNextDouble4 <= 1.0d) {
                        dNextDouble4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
            default:
                return sw3.b(aVar, f2);
        }
    }

    public pb5 n(FileInputStream fileInputStream) throws CorruptionException {
        js3.p(fileInputStream, "input");
        try {
            gj6 gj6VarO = gj6.o(fileInputStream);
            pb5 pb5Var = new pb5(false);
            cj6[] cj6VarArr = (cj6[]) Arrays.copyOf(new cj6[0], 0);
            js3.p(cj6VarArr, "pairs");
            pb5Var.b();
            if (cj6VarArr.length > 0) {
                cj6 cj6Var = cj6VarArr[0];
                throw null;
            }
            Map mapM = gj6VarO.m();
            js3.o(mapM, "getPreferencesMap(...)");
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                kj6 kj6Var = (kj6) entry.getValue();
                js3.m(str);
                js3.m(kj6Var);
                PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCaseC = kj6Var.C();
                switch (preferencesProto$Value$ValueCaseC == null ? -1 : dj6.a[preferencesProto$Value$ValueCaseC.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        pb5Var.f(s7.e(str), Boolean.valueOf(kj6Var.t()));
                        break;
                    case 2:
                        pb5Var.f(new bj6(str), Float.valueOf(kj6Var.x()));
                        break;
                    case 3:
                        pb5Var.f(new bj6(str), Double.valueOf(kj6Var.w()));
                        break;
                    case 4:
                        pb5Var.f(new bj6(str), Integer.valueOf(kj6Var.y()));
                        break;
                    case 5:
                        pb5Var.f(new bj6(str), Long.valueOf(kj6Var.z()));
                        break;
                    case 6:
                        pb5Var.f(s7.c0(str), kj6Var.A());
                        break;
                    case 7:
                        bj6 bj6VarD0 = s7.d0(str);
                        sr3 sr3VarN = kj6Var.B().n();
                        js3.o(sr3VarN, "getStringsList(...)");
                        pb5Var.f(bj6VarD0, kotlin.collections.a.T0(sr3VarN));
                        break;
                    case 8:
                        pb5Var.f(new bj6(str), kj6Var.u().p());
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new pb5(b.U(pb5Var.a()), true);
        } catch (InvalidProtocolBufferException e2) {
            throw new CorruptionException("Unable to parse preferences proto.", e2);
        }
    }

    public void o(Object obj, mx8 mx8Var) {
        f fVarA;
        Map mapA = ((pb5) obj).a();
        ej6 ej6VarN = gj6.n();
        for (Map.Entry entry : mapA.entrySet()) {
            bj6 bj6Var = (bj6) entry.getKey();
            Object value = entry.getValue();
            String str = bj6Var.a;
            if (value instanceof Boolean) {
                jj6 jj6VarD = kj6.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                jj6VarD.c();
                kj6.q((kj6) jj6VarD.b, zBooleanValue);
                fVarA = jj6VarD.a();
            } else if (value instanceof Float) {
                jj6 jj6VarD2 = kj6.D();
                float fFloatValue = ((Number) value).floatValue();
                jj6VarD2.c();
                kj6.r((kj6) jj6VarD2.b, fFloatValue);
                fVarA = jj6VarD2.a();
            } else if (value instanceof Double) {
                jj6 jj6VarD3 = kj6.D();
                double dDoubleValue = ((Number) value).doubleValue();
                jj6VarD3.c();
                kj6.o((kj6) jj6VarD3.b, dDoubleValue);
                fVarA = jj6VarD3.a();
            } else if (value instanceof Integer) {
                jj6 jj6VarD4 = kj6.D();
                int iIntValue = ((Number) value).intValue();
                jj6VarD4.c();
                kj6.s((kj6) jj6VarD4.b, iIntValue);
                fVarA = jj6VarD4.a();
            } else if (value instanceof Long) {
                jj6 jj6VarD5 = kj6.D();
                long jLongValue = ((Number) value).longValue();
                jj6VarD5.c();
                kj6.l((kj6) jj6VarD5.b, jLongValue);
                fVarA = jj6VarD5.a();
            } else if (value instanceof String) {
                jj6 jj6VarD6 = kj6.D();
                jj6VarD6.c();
                kj6.m((kj6) jj6VarD6.b, (String) value);
                fVarA = jj6VarD6.a();
            } else if (value instanceof Set) {
                jj6 jj6VarD7 = kj6.D();
                hj6 hj6VarO = ij6.o();
                hj6VarO.c();
                ij6.l((ij6) hj6VarO.b, (Set) value);
                jj6VarD7.c();
                kj6.n((kj6) jj6VarD7.b, (ij6) hj6VarO.a());
                fVarA = jj6VarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                jj6 jj6VarD8 = kj6.D();
                byte[] bArr = (byte[]) value;
                ByteString byteStringH = ByteString.h(bArr, 0, bArr.length);
                jj6VarD8.c();
                kj6.p((kj6) jj6VarD8.b, byteStringH);
                fVarA = jj6VarD8.a();
            }
            ej6VarN.getClass();
            str.getClass();
            ej6VarN.c();
            gj6.l((gj6) ej6VarN.b).put(str, (kj6) fVarA);
        }
        gj6 gj6Var = (gj6) ej6VarN.a();
        int iA = gj6Var.a(null);
        Logger logger = e.q;
        if (iA > 4096) {
            iA = 4096;
        }
        e eVar = new e(mx8Var, iA);
        gj6Var.b(eVar);
        if (eVar.o > 0) {
            eVar.c0();
        }
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "NeverEqualPolicy";
            case 18:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.t54
    public void b(e64 e64Var) {
    }

    @Override // defpackage.w67
    public g67 f(g67 g67Var, sv5 sv5Var) {
        return g67Var;
    }
}
