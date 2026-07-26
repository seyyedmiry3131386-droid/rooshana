package defpackage;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.platform.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.android.core.t0;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yq2 implements cc1, tz0 {
    public static volatile FirebaseAnalytics a;
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final no7[] d = new no7[0];
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;

    public static final void G(hx4 hx4Var, qd qdVar, a aVar, qz0 qz0Var, int i, int i2) {
        qd qdVar2;
        qz0Var.c0(380139498);
        int i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= qz0Var.f(qdVar) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if (qz0Var.R(i5 & 1, (i5 & 1171) != 1170)) {
            qd qdVar3 = i4 != 0 ? eq.c : qdVar;
            cl4 cl4VarD = bg0.d(qdVar3, false);
            boolean zF = qz0Var.f(cl4VarD);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = new iz(cl4VarD, aVar, 1);
                qz0Var.l0(objM);
            }
            e.b(hx4Var, (qp2) objM, qz0Var, i5 & 14, 0);
            qdVar2 = qdVar3;
        } else {
            qz0Var.U();
            qdVar2 = qdVar;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new og0(hx4Var, qdVar2, aVar, i, i2, 0);
        }
    }

    public static final s46 H(int i) {
        return new s46(i);
    }

    public static final void I(long j, gj8 gj8Var, qp2 qp2Var, qz0 qz0Var, int i) {
        qz0Var.c0(-684938728);
        int i2 = (qz0Var.e(j) ? 4 : 2) | i | (qz0Var.f(gj8Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(qp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            s01 s01Var = mi8.a;
            zk8.c(new um[]{u31.a.a(new zu0(j)), s01Var.a(((gj8) qz0Var.j(s01Var)).d(gj8Var))}, qp2Var, qz0Var, ((i2 >> 3) & 112) | 8);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new nn6(j, gj8Var, qp2Var, i, 0);
        }
    }

    public static final xj J(View view, int i, Boolean bool) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.round_drawable_default_border_radius);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.detail_button_radius);
        qm5 qm5Var = new qm5(4);
        ((xj) qm5Var.b).a = new sj(new tj(new dk(Integer.valueOf(sj8.b().l), Integer.valueOf(i)), new dk(Float.valueOf(dimensionPixelSize), Float.valueOf(dimensionPixelSize2))));
        return qm5Var.a(bool != null ? bool.booleanValue() : false);
    }

    public static final void K(View view, d75 d75Var, x55 x55Var, boolean z) {
        if (js3.i(x55Var, v55.b)) {
            MyketImageButton myketImageButton = d75Var.E;
            Resources resources = view.getResources();
            js3.o(resources, "getResources(...)");
            Drawable drawableK = p3.k(resources, yq6.ic_user_like);
            Drawable drawableMutate = drawableK.mutate();
            int i = sj8.b().n;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
            myketImageButton.setImageDrawable(drawableK);
            MyketImageButton myketImageButton2 = d75Var.z;
            Resources resources2 = view.getResources();
            js3.o(resources2, "getResources(...)");
            Drawable drawableK2 = p3.k(resources2, yq6.ic_user_dislike);
            drawableK2.mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
            myketImageButton2.setImageDrawable(drawableK2);
            return;
        }
        MyketImageButton myketImageButton3 = d75Var.E;
        int i2 = z ? yq6.ic_user_like_bold : yq6.ic_user_like;
        ThemeData themeDataB = sj8.b();
        int i3 = z ? themeDataB.l : themeDataB.n;
        Resources resources3 = view.getResources();
        js3.o(resources3, "getResources(...)");
        Drawable drawableK3 = p3.k(resources3, i2);
        Drawable drawableMutate2 = drawableK3.mutate();
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(i3, mode2));
        myketImageButton3.setImageDrawable(drawableK3);
        MyketImageButton myketImageButton4 = d75Var.z;
        int i4 = !z ? yq6.ic_user_dislike_bold : yq6.ic_user_dislike;
        int i5 = !z ? sj8.b().l : sj8.b().n;
        Resources resources4 = view.getResources();
        js3.o(resources4, "getResources(...)");
        Drawable drawableK4 = p3.k(resources4, i4);
        drawableK4.mutate().setColorFilter(new PorterDuffColorFilter(i5, mode2));
        myketImageButton4.setImageDrawable(drawableK4);
    }

    public static final void L(View view, d75 d75Var, boolean z) {
        MyketTextView myketTextView = d75Var.J;
        if (z) {
            myketTextView.setText(view.getContext().getString(rs6.movie_liked));
            myketTextView.setTextColor(sj8.b().x);
        } else {
            myketTextView.setText(view.getContext().getString(rs6.movie_disliked));
            myketTextView.setTextColor(sj8.b().A);
        }
    }

    public static final Set M(no7 no7Var) {
        js3.p(no7Var, "<this>");
        if (no7Var instanceof yk0) {
            return ((yk0) no7Var).b();
        }
        HashSet hashSet = new HashSet(no7Var.e());
        int iE = no7Var.e();
        for (int i = 0; i < iE; i++) {
            hashSet.add(no7Var.f(i));
        }
        return hashSet;
    }

    public static void N(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void O(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final no7[] P(List list) {
        no7[] no7VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (no7VarArr = (no7[]) list.toArray(new no7[0])) == null) ? d : no7VarArr;
    }

    public static void Q(long j, h26 h26Var, cp8[] cp8VarArr) {
        int i;
        while (true) {
            if (h26Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (h26Var.a() == 0) {
                    i = -1;
                    break;
                }
                int iX = h26Var.x();
                i2 += iX;
                if (iX != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (h26Var.a() == 0) {
                    i3 = -1;
                    break;
                }
                int iX2 = h26Var.x();
                i3 += iX2;
                if (iX2 != 255) {
                    break;
                }
            }
            int i4 = h26Var.b + i3;
            if (i3 == -1 || i3 > h26Var.a()) {
                wn5.k0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = h26Var.c;
            } else if (i == 4 && i3 >= 8) {
                int iX3 = h26Var.x();
                int iD = h26Var.D();
                int iJ = iD == 49 ? h26Var.j() : 0;
                int iX4 = h26Var.x();
                if (iD == 47) {
                    h26Var.K(1);
                }
                boolean z = iX3 == 181 && (iD == 49 || iD == 47) && iX4 == 3;
                if (iD == 49) {
                    z &= iJ == 1195456820;
                }
                if (z) {
                    R(j, h26Var, cp8VarArr);
                }
            }
            h26Var.J(i4);
        }
    }

    public static void R(long j, h26 h26Var, cp8[] cp8VarArr) {
        int iX = h26Var.x();
        if ((iX & 64) != 0) {
            h26Var.K(1);
            int i = (iX & 31) * 3;
            int i2 = h26Var.b;
            for (cp8 cp8Var : cp8VarArr) {
                h26Var.J(i2);
                cp8Var.d(i, h26Var);
                vy2.s(j != -9223372036854775807L);
                cp8Var.a(j, 1, i, 0, null);
            }
        }
    }

    public static final Path S(Path path) {
        js3.p(path, "<this>");
        js3.p(null, "base");
        try {
            int i = u36.a;
            js3.p(null, "base");
            throw null;
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + "\nthis path: " + path + "\nbase path: null", e2);
        }
    }

    public static tx0 T(String str, String str2) {
        q20 q20Var = new q20(str, str2);
        sx0 sx0VarB = tx0.b(q20.class);
        sx0VarB.c = 1;
        sx0VarB.g = new v4(13, q20Var);
        return sx0VarB.b();
    }

    public static float W(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    public static float X(float f2, float f3, float f4, float f5) {
        float fW = W(f2, f3, 0.0f, 0.0f);
        float fW2 = W(f2, f3, f4, 0.0f);
        float fW3 = W(f2, f3, f4, f5);
        float fW4 = W(f2, f3, 0.0f, f5);
        return (fW <= fW2 || fW <= fW3 || fW <= fW4) ? (fW2 <= fW3 || fW2 <= fW4) ? fW3 > fW4 ? fW3 : fW4 : fW2 : fW;
    }

    public static final long Y(float f2, long j) {
        return ge2.a(i0(j) / f2, j0(j) / f2);
    }

    public static final float Z(long j, long j2) {
        return (j0(j2) * j0(j)) + (i0(j2) * i0(j));
    }

    public static tx0 a0(String str, vv1 vv1Var) {
        sx0 sx0VarB = tx0.b(q20.class);
        sx0VarB.c = 1;
        sx0VarB.a(vj1.a(Context.class));
        sx0VarB.g = new j2(str, vv1Var, 19);
        return sx0VarB.b();
    }

    public static final int b0(fj2 fj2Var, int i) {
        boolean z = fj2Var.compareTo(fj2.d) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final String c0(Context context) {
        PackageManager packageManager;
        if (context != null && (packageManager = context.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
            return "tv";
        }
        Object systemService = context != null ? context.getSystemService("uimode") : null;
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        Integer numValueOf = uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null;
        return (numValueOf != null && numValueOf.intValue() == 5) ? "appliance" : (numValueOf != null && numValueOf.intValue() == 3) ? "car" : (numValueOf != null && numValueOf.intValue() == 2) ? "desk" : (numValueOf != null && numValueOf.intValue() == 4) ? "tv" : (numValueOf != null && numValueOf.intValue() == 7) ? "vr" : (numValueOf != null && numValueOf.intValue() == 6) ? "watch" : (numValueOf != null && numValueOf.intValue() == 1) ? context.getResources().getConfiguration().smallestScreenWidthDp >= 600 ? "tablet" : "normal" : "unknown";
    }

    public static final long d0(long j) {
        float fSqrt = (float) Math.sqrt((j0(j) * j0(j)) + (i0(j) * i0(j)));
        if (fSqrt > 0.0f) {
            return Y(fSqrt, j);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static float e0(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return cz1.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Intent f0(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strH0 = h0(context, componentName);
        if (strH0 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strH0);
        return h0(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static Intent g0(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strH0 = h0(appCompatActivity, appCompatActivity.getComponentName());
            if (strH0 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strH0);
            try {
                return h0(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                t0.d("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strH0 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String h0(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final float i0(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float j0(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final hx4 k0() {
        IntrinsicSize intrinsicSize = IntrinsicSize.a;
        return new cs3(o.a);
    }

    public static int l0(String str) {
        if (str == null) {
            return -1;
        }
        String strM = tv4.m(str);
        strM.getClass();
        switch (strM) {
        }
        return -1;
    }

    public static int m0(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final boolean n0(Context context) {
        String strC0 = c0(context);
        return strC0.equals("tv") || strC0.equals("tablet");
    }

    public static final boolean o0(Context context) {
        return c0(context).equals("tv");
    }

    public static float p0(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final long q0(long j, long j2) {
        return ge2.a(i0(j) - i0(j2), j0(j) - j0(j2));
    }

    public static Object r0(Class cls) {
        try {
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e2, e2);
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e3, e3);
        } catch (InstantiationException e4) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e4, e4);
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e5, e5);
        } catch (SecurityException e6) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e6, e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e7, e7);
        }
    }

    public static final String s0(zw3 zw3Var) {
        js3.p(zw3Var, "<this>");
        String strD = ((ps0) zw3Var).d();
        if (strD == null) {
            strD = "<local class name not available>";
        }
        return o40.y("Serializer for class '", strD, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static float t0(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return cz1.c(edgeEffect, f2, f3);
        }
        bz1.a(edgeEffect, f2, f3);
        return f2;
    }

    public static final long u0(long j, long j2) {
        return ge2.a(i0(j2) + i0(j), j0(j2) + j0(j));
    }

    public static final hx4 v0(qp2 qp2Var) {
        return new cg8(qp2Var);
    }

    public static final long w0(float f2, long j) {
        return ge2.a(i0(j) * f2, j0(j) * f2);
    }

    public static final long x0(long j, rn6 rn6Var) {
        float fI0 = i0(j);
        float fJ0 = j0(j);
        float[] fArr = (float[]) rn6Var.b;
        fArr[0] = fI0;
        fArr[1] = fJ0;
        ((Matrix) rn6Var.c).mapPoints(fArr);
        long jA = ge2.a(fArr[0], fArr[1]);
        return ge2.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }

    public static final hx4 y0(hx4 hx4Var) {
        IntrinsicSize intrinsicSize = IntrinsicSize.a;
        return hx4Var.d(new gs3(o.a));
    }

    @Override // defpackage.tz0
    public boolean A(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return g();
    }

    @Override // defpackage.cc1
    public abstract byte B();

    @Override // defpackage.cc1
    public abstract short C();

    @Override // defpackage.cc1
    public float D() {
        V();
        throw null;
    }

    @Override // defpackage.tz0
    public long E(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return x();
    }

    @Override // defpackage.cc1
    public double F() {
        V();
        throw null;
    }

    public void V() {
        throw new SerializationException(g27.a(getClass()) + " can't retrieve untyped values");
    }

    public void a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
    }

    @Override // defpackage.cc1
    public tz0 c(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return this;
    }

    @Override // defpackage.cc1
    public Object e(px3 px3Var) {
        js3.p(px3Var, "deserializer");
        return px3Var.deserialize(this);
    }

    @Override // defpackage.tz0
    public cc1 f(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return r(vj6Var.h(i));
    }

    @Override // defpackage.cc1
    public boolean g() {
        V();
        throw null;
    }

    @Override // defpackage.cc1
    public char h() {
        V();
        throw null;
    }

    @Override // defpackage.tz0
    public double j(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return F();
    }

    @Override // defpackage.tz0
    public char k(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return h();
    }

    @Override // defpackage.tz0
    public float l(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return D();
    }

    @Override // defpackage.tz0
    public byte n(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return B();
    }

    @Override // defpackage.tz0
    public String o(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return v();
    }

    @Override // defpackage.cc1
    public abstract int p();

    @Override // defpackage.tz0
    public short q(vj6 vj6Var, int i) {
        js3.p(vj6Var, "descriptor");
        return C();
    }

    @Override // defpackage.cc1
    public cc1 r(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return this;
    }

    public Object s(no7 no7Var, int i, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "deserializer");
        return e(px3Var);
    }

    @Override // defpackage.tz0
    public int t(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return p();
    }

    @Override // defpackage.cc1
    public String v() {
        V();
        throw null;
    }

    @Override // defpackage.cc1
    public int w(no7 no7Var) {
        js3.p(no7Var, "enumDescriptor");
        V();
        throw null;
    }

    @Override // defpackage.cc1
    public abstract long x();

    @Override // defpackage.cc1
    public boolean y() {
        return true;
    }

    @Override // defpackage.tz0
    public Object z(no7 no7Var, int i, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "deserializer");
        if (px3Var.getDescriptor().c() || y()) {
            return e(px3Var);
        }
        return null;
    }
}
