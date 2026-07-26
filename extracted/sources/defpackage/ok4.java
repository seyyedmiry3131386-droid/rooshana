package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.material3.k;
import androidx.compose.material3.n;
import androidx.compose.runtime.g;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import androidx.compose.ui.unit.LayoutDirection;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.a;
import defpackage.js3;
import defpackage.qp2;
import defpackage.wu8;
import ir.myket.movie.common.domain.models.EpisodeBannerType;
import ir.myket.player.viewmodel.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ok4 {
    public static final ax a = new ax();
    public static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final m97 c = new m97();
    public static final /* synthetic */ int d = 0;
    public static og e;
    public static ue f;
    public static vm0 g;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static dt4 A(String str) {
        js3.p(str, "<this>");
        ij4 ij4VarC = dt4.e.c(0, str);
        if (ij4VarC == null) {
            throw new IllegalArgumentException(rm7.m('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) ((gj4) ij4VarC.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        js3.o(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) ((gj4) ij4VarC.a()).get(2)).toLowerCase(locale);
        js3.o(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i2 = ij4VarC.b().b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new dt4(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            ij4 ij4VarC2 = dt4.f.c(i3, str);
            if (ij4VarC2 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i3);
                js3.o(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(bl4.y(sb, str, '\"').toString());
            }
            hj4 hj4Var = ij4VarC2.c;
            fj4 fj4VarC = hj4Var.c(1);
            String str3 = fj4VarC != null ? fj4VarC.a : null;
            if (str3 == null) {
                i2 = ij4VarC2.b().b;
            } else {
                fj4 fj4VarC2 = hj4Var.c(2);
                String strSubstring2 = fj4VarC2 != null ? fj4VarC2.a : null;
                if (strSubstring2 == null) {
                    fj4 fj4VarC3 = hj4Var.c(3);
                    js3.m(fj4VarC3);
                    strSubstring2 = fj4VarC3.a;
                } else if (f88.A0(strSubstring2, '\'') && f88.g0(strSubstring2, '\'') && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    js3.o(strSubstring2, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i2 = ij4VarC2.b().b;
            }
        }
    }

    public static final int B(qz0 qz0Var) {
        long j = qz0Var.T;
        return (int) (j ^ (j >>> 32));
    }

    public static int C(List list, InputStream inputStream, dr3 dr3Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new a(inputStream, dr3Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                int iB = ((ei3) list.get(i2)).b(inputStream, dr3Var);
                if (iB != -1) {
                    return iB;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static long E(double d2) {
        wn5.i("not a normal value", K(d2));
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static ImageHeaderParser$ImageType F(List list, InputStream inputStream, dr3 dr3Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new a(inputStream, dr3Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((ei3) list.get(i2)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType G(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((ei3) list.get(i2)).a(byteBuffer);
                AtomicReference atomicReference = lj0.a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = lj0.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static g51 I(g51 g51Var) {
        g51<Object> g51VarIntercepted;
        js3.p(g51Var, "<this>");
        ContinuationImpl continuationImpl = g51Var instanceof ContinuationImpl ? (ContinuationImpl) g51Var : null;
        return (continuationImpl == null || (g51VarIntercepted = continuationImpl.intercepted()) == null) ? g51Var : g51VarIntercepted;
    }

    public static final void J() {
        throw new IllegalStateException("Invalid applier");
    }

    public static boolean K(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static final hx4 L(hx4 hx4Var, lx3 lx3Var, n34 n34Var, Orientation orientation, boolean z) {
        return hx4Var.d(new o34(lx3Var, n34Var, orientation, z));
    }

    public static final bn6 M(dp2 dp2Var, qp2 qp2Var) {
        g8 g8Var = new g8(9, qp2Var);
        wu8.i(1, dp2Var);
        return new bn6(g8Var, dp2Var, 5);
    }

    public static final void N(yk4 yk4Var, xf2 xf2Var, long j, dp2 dp2Var) {
        if (xa7.e(xa7.d(yk4Var)) != 0.0f) {
            xf2Var.getClass();
            yk4Var.P(yk4Var.l(Integer.MAX_VALUE));
            return;
        }
        xa7.d(yk4Var);
        b96 b96VarT = yk4Var.t(j);
        dp2Var.invoke(b96VarT);
        xf2Var.getClass();
        b96VarT.U();
        b96VarT.T();
    }

    public static final void O(Context context, m8 m8Var, boolean z) {
        js3.p(context, "context");
        Intent intentPutExtra = new Intent("ir.myket.player.action.OPEN_APPLICATION").putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", m8Var.a).putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", z).putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", m8Var.e).putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", m8Var.f);
        js3.o(intentPutExtra, "putExtra(...)");
        context.startActivity(intentPutExtra);
    }

    public static final void Q(Context context, String str) {
        js3.p(context, "context");
        try {
            if (f88.n0(str)) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            if (!new Regex("^\\p{Alpha}+://.*$").f(str)) {
                str = "http://".concat(str);
            }
            if (str == null) {
                str = "";
            }
            intent.setData(Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addFlags(268435456);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                lw.g(null, "could not handle this operation!", null);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static final byte[] R(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        js3.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final androidx.compose.runtime.a S(qz0 qz0Var) {
        qz0 qz0Var2;
        qz0Var.X(206, sz0.e);
        if (qz0Var.S) {
            fz7.z(qz0Var.I);
        }
        Object objE = qz0Var.E();
        n37 p87Var = objE instanceof n37 ? (n37) objE : null;
        if (p87Var == null) {
            qz0Var2 = qz0Var;
            p87Var = new p87(new oz0(new androidx.compose.runtime.a(qz0Var2, qz0Var.T, qz0Var.q, qz0Var.C, qz0Var.h.t)), -1);
            qz0Var2.m0(p87Var);
        } else {
            qz0Var2 = qz0Var;
        }
        m37 m37Var = p87Var.a;
        js3.n(m37Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        androidx.compose.runtime.a aVar = ((oz0) m37Var).a;
        ((s08) aVar.f).setValue(qz0Var2.l());
        qz0Var2.q(false);
        return aVar;
    }

    public static int T(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int V(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static long W(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }

    public static final void X(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255));
    }

    public static sq3 Y(int i2, uq3 uq3Var) {
        js3.p(uq3Var, "<this>");
        q(i2 > 0, Integer.valueOf(i2));
        int i3 = uq3Var.a;
        int i4 = uq3Var.b;
        if (uq3Var.c <= 0) {
            i2 = -i2;
        }
        return new sq3(i3, i4, i2);
    }

    public static uq3 Z(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new uq3(i2, i3 - 1, 1);
        }
        uq3 uq3Var = uq3.d;
        return uq3.d;
    }

    public static final void a(hx4 hx4Var, String str, String str2, qz0 qz0Var, int i2) {
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-1886766586);
        int i3 = i2 | (qz0Var2.f(str) ? 32 : 16) | (qz0Var2.f(str2) ? 256 : 128);
        if (qz0Var2.R(i3 & 1, (i3 & 147) != 146)) {
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var2, 0);
            long j = qz0Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = b.c(qz0Var2, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, vv0VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i4), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            u58 u58Var = aw8.a;
            gj8 gj8Var = ((wf5) qz0Var2.j(u58Var)).i;
            u58 u58Var2 = uj8.a;
            Object objJ = qz0Var2.j(u58Var2);
            js3.m(objJ);
            mi8.b(str, null, ((tj8) objJ).j, 0L, 0L, new of8(5), 0L, 2, false, 2, 0, gj8Var, qz0Var2, (i3 >> 3) & 14, 24960, 109562);
            qz0Var2 = qz0Var2;
            if (str2 == null) {
                qz0Var2.a0(2061217372);
                qz0Var2.q(false);
            } else {
                qz0Var2.a0(2061217373);
                gj8 gj8Var2 = ((wf5) qz0Var2.j(u58Var)).j;
                Object objJ2 = qz0Var2.j(u58Var2);
                js3.m(objJ2);
                mi8.b(str2, null, ((tj8) objJ2).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var2, qz0Var, 0, 0, 131066);
                qz0Var2 = qz0Var;
                qz0Var2.q(false);
            }
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new w8(i2, 7, hx4Var, str, str2);
        }
    }

    public static Object a0(qp2 qp2Var, Object obj, g51 g51Var) {
        js3.p(qp2Var, "<this>");
        w61 context = g51Var.getContext();
        Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.a ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(g51Var) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(g51Var, context);
        wu8.i(2, qp2Var);
        return qp2Var.invoke(obj, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
    }

    public static final void b(final hx4 hx4Var, final dv dvVar, final hv hvVar, final int i2, final int i3, final yf2 yf2Var, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i4) {
        int i5;
        Object obj;
        bb0 bb0Var = eq.l;
        qz0Var.c0(-1956591841);
        if ((i4 & 6) == 0) {
            i5 = (qz0Var.f(hx4Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= qz0Var.f(dvVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= qz0Var.f(hvVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= qz0Var.f(bb0Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= qz0Var.d(i2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= qz0Var.d(i3) ? 131072 : 65536;
        }
        if ((12582912 & i4) == 0) {
            i5 |= qz0Var.h(aVar) ? 8388608 : 4194304;
        }
        int i6 = i5;
        if (qz0Var.R(i6 & 1, (i6 & 4793491) != 4793490)) {
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (objM == obj2) {
                yf2Var.getClass();
                FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.a;
                objM = new tf2();
                qz0Var.l0(objM);
            }
            tf2 tf2Var = (tf2) objM;
            int i7 = i6 >> 3;
            boolean zF = ((((i7 & 14) ^ 6) > 4 && qz0Var.f(dvVar)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && qz0Var.f(hvVar)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && qz0Var.f(bb0Var)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && qz0Var.d(i2)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && qz0Var.d(i3)) || (i7 & 24576) == 16384) | qz0Var.f(tf2Var);
            Object objM2 = qz0Var.M();
            if (zF || objM2 == obj2) {
                obj = obj2;
                Object xf2Var = new xf2(dvVar, hvVar, dvVar.e(), new x71(bb0Var), hvVar.e(), i2, i3, tf2Var);
                qz0Var.l0(xf2Var);
                objM2 = xf2Var;
            } else {
                obj = obj2;
            }
            xf2 xf2Var2 = (xf2) objM2;
            boolean z = ((i6 & 29360128) == 8388608) | ((i6 & 458752) == 131072);
            Object objM3 = qz0Var.M();
            Object obj3 = objM3;
            if (z || objM3 == obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new androidx.compose.runtime.internal.a(-1192950673, new qf2(aVar), true));
                yf2Var.getClass();
                FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.a;
                qz0Var.l0(arrayList);
                obj3 = arrayList;
            }
            androidx.compose.runtime.internal.a aVarD = e.d((List) obj3);
            boolean zF2 = qz0Var.f(xf2Var2);
            Object objM4 = qz0Var.M();
            if (zF2 || objM4 == obj) {
                objM4 = new k95(xf2Var2);
                qz0Var.l0(objM4);
            }
            cl4 cl4Var = (cl4) objM4;
            long j = qz0Var.T;
            int i8 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cl4Var);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i8), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            aVarD.invoke(qz0Var, 0);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: rf2
                @Override // defpackage.qp2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    ok4.b(hx4Var, dvVar, hvVar, i2, i3, yf2Var, aVar, (qz0) obj4, hs9.W(i4 | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final void c(hx4 hx4Var, dv dvVar, hv hvVar, bb0 bb0Var, int i2, int i3, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i4) {
        hx4 hx4Var2;
        bb0 bb0Var2;
        qz0Var.c0(-1303174015);
        int i5 = i4 | 6 | (qz0Var.f(dvVar) ? 32 : 16) | (qz0Var.f(hvVar) ? 256 : 128) | 3072 | (qz0Var.d(i2) ? 16384 : 8192) | (qz0Var.d(i3) ? 131072 : 65536);
        if (qz0Var.R(i5 & 1, (599187 & i5) != 599186)) {
            bb0 bb0Var3 = eq.l;
            yf2 yf2Var = yf2.p;
            int i6 = (i5 & 458752) | (i5 & 112) | 1572870 | (i5 & 896) | 3072 | (57344 & i5) | 12582912;
            ex4 ex4Var = ex4.b;
            b(ex4Var, dvVar, hvVar, i2, i3, yf2Var, aVar, qz0Var, i6);
            hx4Var2 = ex4Var;
            bb0Var2 = bb0Var3;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            bb0Var2 = bb0Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new pf2(hx4Var2, dvVar, hvVar, bb0Var2, i2, i3, aVar, i4);
        }
    }

    public static final void e(hx4 hx4Var, b32 b32Var, boolean z, bp2 bp2Var, qz0 qz0Var, int i2) {
        bp2 bp2Var2;
        boolean z2;
        qz0 qz0Var2 = qz0Var;
        js3.p(b32Var, "episode");
        qz0Var2.c0(-2077375529);
        int i3 = i2 | (qz0Var2.f(hx4Var) ? 4 : 2) | (qz0Var2.f(b32Var) ? 32 : 16) | (qz0Var2.g(z) ? 256 : 128) | (qz0Var2.h(bp2Var) ? 2048 : 1024);
        if (qz0Var2.R(i3 & 1, (i3 & 1171) != 1170)) {
            hx4 hx4VarM = androidx.compose.foundation.layout.b.m(hx4Var, ml9.q(hq6.next_episode_component_width, qz0Var2));
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarA = yh0.A(rq4.f(hx4VarM, ((tj8) objJ).i, la7.a(ml9.q(hq6.radius_8, qz0Var2))), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_8, qz0Var2));
            ab0 ab0Var = eq.p;
            fv fvVar = jv.a;
            vv0 vv0VarA = tv0.a(jv.g(ml9.q(hq6.space_12, qz0Var2)), ab0Var, qz0Var2, 48);
            long j = qz0Var2.T;
            int i4 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = b.c(qz0Var2, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var3 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var3);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var = d.f;
            ia7.o(qz0Var2, qp2Var, vv0VarA);
            qp2 qp2Var2 = d.e;
            ia7.o(qz0Var2, qp2Var2, j56VarL);
            Integer numValueOf = Integer.valueOf(i4);
            qp2 qp2Var3 = d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var3);
            dp2 dp2Var = d.h;
            ia7.n(qz0Var2, dp2Var);
            qp2 qp2Var4 = d.d;
            ia7.o(qz0Var2, qp2Var4, hx4VarC);
            ex4 ex4Var = ex4.b;
            hx4 hx4VarD = androidx.compose.foundation.layout.b.c(ex4Var, 1.0f).d(new nc3(eq.o));
            String strF = ln2.f(vs6.player_next_episode_title, qz0Var2);
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).k;
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            mi8.b(strF, hx4VarD, ((tj8) objJ2).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131064);
            qz0Var2 = qz0Var;
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var2)), eq.m, qz0Var2, 48);
            long j2 = qz0Var2.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL2 = qz0Var2.l();
            hx4 hx4VarC2 = b.c(qz0Var2, ex4Var);
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var3);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, qp2Var, cb7VarA);
            ia7.o(qz0Var2, qp2Var2, j56VarL2);
            ia7.g(qz0Var2, Integer.valueOf(i5), qp2Var3);
            ia7.n(qz0Var2, dp2Var);
            ia7.o(qz0Var2, qp2Var4, hx4VarC2);
            String str = b32Var.e;
            hx4 hx4VarS = zk8.s(androidx.compose.foundation.layout.b.j(ex4Var, ml9.q(hq6.next_episode_banner_width, qz0Var2), ml9.q(hq6.next_episode_banner_height, qz0Var2)), la7.a(ml9.q(hq6.radius_4, qz0Var2)));
            Object objJ3 = qz0Var2.j(u58Var);
            js3.m(objJ3);
            cc7.a(str, rq4.f(hx4VarS, ((tj8) objJ3).l, tt3.d), p41.a, null, qz0Var2, 1572912, 1976);
            a(androidx.compose.foundation.layout.b.c(ex4Var, 1.0f), b32Var.c, b32Var.h, qz0Var2, 6);
            qz0Var2.q(true);
            z2 = z;
            bp2Var2 = bp2Var;
            h((i3 >> 3) & 1008, qz0Var2, bp2Var2, null, z2);
            qz0Var2.q(true);
        } else {
            bp2Var2 = bp2Var;
            z2 = z;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new vx2(hx4Var, b32Var, z2, bp2Var2, i2, 2);
        }
    }

    public static final void f(hx4 hx4Var, we6 we6Var, c cVar, dl5 dl5Var, dp2 dp2Var, n nVar, bp2 bp2Var, String str, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        c cVar2;
        n nVar2;
        n nVarF;
        int i3;
        c cVar3;
        hx4 hx4Var3;
        js3.p(we6Var, "otherEpisodeBottomSheetNavKey");
        js3.p(dl5Var, "navigationStateManager");
        js3.p(str, "isPlayingText");
        qz0Var.c0(-690547148);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= qz0Var.f(we6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? qz0Var.f(dl5Var) : qz0Var.h(dl5Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= qz0Var.h(dp2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= qz0Var.h(bp2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= qz0Var.f(str) ? 8388608 : 4194304;
        }
        if (qz0Var.R(i4 & 1, (4793491 & i4) != 4793490)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                boolean z = (i4 & 112) == 32;
                Object objM = qz0Var.M();
                if (z || objM == jz0.a) {
                    objM = new hk3(24, we6Var);
                    qz0Var.l0(objM);
                }
                bp2 bp2Var2 = (bp2) objM;
                qz0Var.a0(-924953623);
                x79 x79VarA = uc4.a(qz0Var);
                if (x79VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                k79 k79VarY = dt2.y(g27.a(c.class), x79VarA.m(), tt3.u(x79VarA), oz3.a(qz0Var), bp2Var2);
                qz0Var.q(false);
                nVarF = k.f(6, 2, qz0Var);
                i3 = i4 & (-459649);
                cVar3 = (c) k79VarY;
                hx4Var3 = ex4.b;
            } else {
                qz0Var.U();
                hx4Var3 = hx4Var;
                nVarF = nVar;
                i3 = i4 & (-459649);
                cVar3 = cVar;
            }
            qz0Var.r();
            wb5 wb5VarA = androidx.lifecycle.compose.a.a(cVar3.d, qz0Var);
            wb5 wb5VarA2 = androidx.lifecycle.compose.a.a(cVar3.e, qz0Var);
            wb5 wb5VarA3 = androidx.lifecycle.compose.a.a(cVar3.f, qz0Var);
            pk7 pk7Var = (pk7) wb5VarA2.getValue();
            if (pk7Var == null) {
                qz0Var.a0(804194842);
                qz0Var.q(false);
            } else {
                qz0Var.a0(804194843);
                int i5 = i3;
                String str2 = we6Var.a;
                String str3 = we6Var.c;
                pj3 pj3Var = (pj3) wb5VarA.getValue();
                pj3 pj3Var2 = (pj3) wb5VarA3.getValue();
                boolean z2 = ((o) ((pj3) wb5VarA.getValue())).a() == 1;
                a32 a32Var = b32.Companion;
                int i6 = i5 << 12;
                g(hx4Var3, str2, str3, pj3Var, pk7Var, pj3Var2, z2, dl5Var, dp2Var, nVarF, bp2Var, str, qz0Var, (i5 & 14) | (i6 & 29360128) | (i6 & 234881024), (i5 >> 18) & 126);
                qz0Var.q(false);
            }
            hx4 hx4Var4 = hx4Var3;
            cVar2 = cVar3;
            hx4Var2 = hx4Var4;
            nVar2 = nVarF;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            cVar2 = cVar;
            nVar2 = nVar;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new sy(hx4Var2, we6Var, cVar2, dl5Var, dp2Var, nVar2, bp2Var, str, i2);
        }
    }

    public static final void g(hx4 hx4Var, final String str, final String str2, pj3 pj3Var, pk7 pk7Var, pj3 pj3Var2, boolean z, final dl5 dl5Var, dp2 dp2Var, final n nVar, final bp2 bp2Var, String str3, qz0 qz0Var, int i2, int i3) {
        int i4;
        pj3 pj3Var3;
        pk7 pk7Var2;
        boolean z2;
        int i5;
        EpisodeBannerType episodeBannerType;
        String str4;
        qz0Var.c0(1552741365);
        if ((i2 & 6) == 0) {
            i4 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= qz0Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= qz0Var.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            pj3Var3 = pj3Var;
            i4 |= qz0Var.f(pj3Var3) ? 2048 : 1024;
        } else {
            pj3Var3 = pj3Var;
        }
        if ((i2 & 24576) == 0) {
            pk7Var2 = pk7Var;
            i4 |= qz0Var.f(pk7Var2) ? 16384 : 8192;
        } else {
            pk7Var2 = pk7Var;
        }
        if ((196608 & i2) == 0) {
            i4 |= (i2 & 262144) == 0 ? qz0Var.f(pj3Var2) : qz0Var.h(pj3Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            z2 = z;
            i4 |= qz0Var.g(z2) ? 1048576 : 524288;
        } else {
            z2 = z;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= (i2 & 16777216) == 0 ? qz0Var.f(dl5Var) : qz0Var.h(dl5Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= qz0Var.h(dp2Var) ? 67108864 : 33554432;
        }
        Object obj = nVar;
        if ((i2 & 805306368) == 0) {
            i4 |= qz0Var.f(obj) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (qz0Var.h(bp2Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= qz0Var.f(str3) ? 32 : 16;
        }
        boolean z3 = false;
        if (qz0Var.R(i6 & 1, ((i6 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (objM == obj2) {
                objM = zk8.x(EmptyCoroutineContext.a, qz0Var);
                qz0Var.l0(objM);
            }
            final e71 e71Var = (e71) objM;
            if ((i6 & 458752) == 131072 || ((i6 & 262144) != 0 && qz0Var.f(pj3Var2))) {
                z3 = true;
            }
            Object objM2 = qz0Var.M();
            Object obj3 = objM2;
            if (z3 || objM2 == obj2) {
                ArrayList arrayList = new ArrayList(wu0.V(pj3Var2, 10));
                Iterator<E> it = pj3Var2.iterator();
                while (it.hasNext()) {
                    b32 b32Var = (b32) it.next();
                    boolean zI = js3.i(b32Var.b, str);
                    String str5 = b32Var.a;
                    String str6 = b32Var.c;
                    String str7 = b32Var.h;
                    String str8 = b32Var.e;
                    EpisodeBannerType episodeBannerType2 = b32Var.g;
                    if (zI) {
                        episodeBannerType = episodeBannerType2;
                        str4 = str3;
                    } else {
                        episodeBannerType = episodeBannerType2;
                        str4 = b32Var.d;
                    }
                    arrayList.add(new c32(str5, str6, str7, str8, episodeBannerType, zI, str4, new iw5(dp2Var, b32Var, obj, e71Var, bp2Var, 0)));
                    obj = nVar;
                }
                qz0Var.l0(arrayList);
                obj3 = arrayList;
            }
            final boolean z4 = z2;
            final pk7 pk7Var3 = pk7Var2;
            final pj3 pj3Var4 = pj3Var3;
            xq2.c(hx4Var, bp2Var, nVar, false, s7.X(-2057687296, new rp2() { // from class: jw5
                @Override // defpackage.rp2
                public final Object a(Object obj4, Object obj5, Object obj6) {
                    qz0 qz0Var2 = (qz0) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    js3.p((wv0) obj4, "$this$BottomSheetScaffold");
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final String strF = ln2.f(vs6.player_select_season_bottom_sheet_title, qz0Var2);
                        String str9 = pk7Var3.b;
                        final n nVar2 = nVar;
                        boolean zF = qz0Var2.f(nVar2);
                        final e71 e71Var2 = e71Var;
                        boolean zH = zF | qz0Var2.h(e71Var2);
                        final bp2 bp2Var2 = bp2Var;
                        boolean zF2 = zH | qz0Var2.f(bp2Var2);
                        final String str10 = str;
                        boolean zF3 = zF2 | qz0Var2.f(str10);
                        final String str11 = str2;
                        boolean zF4 = zF3 | qz0Var2.f(str11) | qz0Var2.f(strF);
                        final pj3 pj3Var5 = pj3Var4;
                        boolean zF5 = zF4 | qz0Var2.f(pj3Var5);
                        final dl5 dl5Var2 = dl5Var;
                        boolean zH2 = zF5 | qz0Var2.h(dl5Var2);
                        Object objM3 = qz0Var2.M();
                        if (zH2 || objM3 == jz0.a) {
                            bp2 bp2Var3 = new bp2() { // from class: kw5
                                @Override // defpackage.bp2
                                public final Object invoke() {
                                    ir.myket.player.ui.client.utils.extensions.a.a(nVar2, e71Var2, bp2Var2, new iw5(str10, str11, strF, pj3Var5, dl5Var2, 1));
                                    return tx8.a;
                                }
                            };
                            qz0Var2.l0(bp2Var3);
                            objM3 = bp2Var3;
                        }
                        zk8.g(null, str9, z4, (bp2) objM3, qz0Var2, 0);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), s7.X(-719195041, new va(7, (List) obj3), qz0Var), null, qz0Var, (i6 & 14) | 221184 | ((i5 << 3) & 112) | ((i6 >> 21) & 896), 72);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ja0(hx4Var, str, str2, pj3Var, pk7Var, pj3Var2, z, dl5Var, dp2Var, nVar, bp2Var, str3, i2, i3);
        }
    }

    public static final void h(int i2, qz0 qz0Var, bp2 bp2Var, hx4 hx4Var, final boolean z) {
        hx4 hx4Var2;
        qz0Var.c0(-205079657);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 256 : 128;
        }
        int i4 = i3;
        if (qz0Var.R(i4 & 1, (i4 & 147) != 146)) {
            hx4Var2 = ex4.b;
            ka7 ka7VarA = la7.a(ml9.q(hq6.radius_4, qz0Var));
            wy5 wy5Var = ci0.a;
            u58 u58Var = uj8.a;
            Object objJ = qz0Var.j(u58Var);
            js3.m(objJ);
            long j = ((tj8) objJ).h;
            Object objJ2 = qz0Var.j(u58Var);
            js3.m(objJ2);
            long j2 = ((tj8) objJ2).g;
            Object objJ3 = qz0Var.j(u58Var);
            js3.m(objJ3);
            long j3 = ((tj8) objJ3).p;
            Object objJ4 = qz0Var.j(u58Var);
            js3.m(objJ4);
            androidx.compose.material3.a.a(bp2Var, androidx.compose.foundation.layout.b.b(androidx.compose.foundation.layout.b.c(hx4Var2, 1.0f), 0.0f, ml9.q(hq6.size_32, qz0Var), 1), !z, ka7VarA, ci0.a(j2, j, j3, ((tj8) objJ4).q, qz0Var, 0), null, null, yh0.d(0.0f, ml9.q(hq6.space_8, qz0Var), 1), s7.X(1358540199, new rp2() { // from class: mn5
                @Override // defpackage.rp2
                public final Object a(Object obj, Object obj2, Object obj3) {
                    qz0 qz0Var2 = (qz0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    js3.p((db7) obj, "$this$Button");
                    if (!qz0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        qz0Var2.U();
                    } else if (z) {
                        qz0Var2.a0(794278596);
                        float fQ = ml9.q(hq6.size_20, qz0Var2);
                        Object objJ5 = qz0Var2.j(uj8.a);
                        js3.m(objJ5);
                        km6.a(androidx.compose.foundation.layout.b.i(ex4.b, fQ), ((tj8) objJ5).q, ml9.q(hq6.loading_indicator_thickness, qz0Var2), 0L, 0, 0, qz0Var2, 196608);
                        qz0Var2.q(false);
                    } else {
                        qz0Var2.a0(794536330);
                        mi8.b(ln2.f(vs6.player_movie_play, qz0Var2), null, 0L, 0L, 0L, new of8(3), 0L, 0, false, 0, 0, ((wf5) qz0Var2.j(aw8.a)).k, qz0Var2, 0, 0, 130046);
                        qz0Var2.q(false);
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, ((i4 >> 6) & 14) | 805306368, 352);
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new yh(hx4Var2, z, bp2Var, i2);
        }
    }

    public static final void i(hx4 hx4Var, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(790527681);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.g(null, th0.p);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = new v8(wb5Var, 8);
                qz0Var.l0(objM2);
            }
            bp2 bp2Var = (bp2) objM2;
            gi6 gi6Var = oh1.a;
            androidx.compose.foundation.text.contextmenu.provider.a aVarL = c26.l(hs9.c, qz0Var, 6);
            zk8.c(new um[]{kg8.b.a(dy3.F(bp2Var, qz0Var, 2)), kg8.a.a(aVarL)}, s7.X(1070596993, new bn0(hx4Var, wb5Var, aVar, aVarL, bp2Var), qz0Var), qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ji(hx4Var, aVar, i2, i4);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static final void j(hx4 hx4Var, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(155925518);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            boolean z = qz0Var.j(kg8.a) != null;
            boolean z2 = qz0Var.j(kg8.b) != null;
            if (z && z2) {
                qz0Var.a0(-1977187922);
                cl4 cl4VarD = bg0.d(eq.c, true);
                long j = qz0Var.T;
                int i4 = (int) ((j >>> 32) ^ j);
                j56 j56VarL = qz0Var.l();
                hx4 hx4VarC = b.c(qz0Var, hx4Var);
                hz0.d0.getClass();
                bp2 bp2Var = d.b;
                qz0Var.e0();
                if (qz0Var.S) {
                    qz0Var.k(bp2Var);
                } else {
                    qz0Var.o0();
                }
                ia7.o(qz0Var, d.f, cl4VarD);
                ia7.o(qz0Var, d.e, j56VarL);
                ia7.g(qz0Var, Integer.valueOf(i4), d.g);
                ia7.n(qz0Var, d.h);
                ia7.o(qz0Var, d.d, hx4VarC);
                aVar.invoke(qz0Var, Integer.valueOf((i3 >> 3) & 14));
                qz0Var.q(true);
                qz0Var.q(false);
            } else if (z) {
                qz0Var.a0(-1976997706);
                dy3.d(hx4Var, aVar, qz0Var, i3 & 126);
                qz0Var.q(false);
            } else if (z2) {
                qz0Var.a0(-1976846922);
                oh1.d(hx4Var, aVar, qz0Var, i3 & 126);
                qz0Var.q(false);
            } else {
                qz0Var.a0(-1976716505);
                i(hx4Var, aVar, qz0Var, i3 & 126);
                qz0Var.q(false);
            }
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ji(hx4Var, aVar, i2, 3);
        }
    }

    public static final boolean m(Object obj) {
        if (obj instanceof q08) {
            q08 q08Var = (q08) obj;
            if (q08Var.e() == th0.p || q08Var.e() == th0.t || q08Var.e() == hy2.r) {
                Object value = q08Var.getValue();
                if (value == null) {
                    return true;
                }
                return m(value);
            }
        } else {
            if ((obj instanceof np2) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i2 = 0; i2 < 7; i2++) {
                if (b[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void n(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void o(Object obj) {
        p(obj, "Argument must not be null");
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void q(boolean z, Number number) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static double r(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float s(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int t(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static int v(int i2, uq3 uq3Var) {
        js3.p(uq3Var, "range");
        int i3 = uq3Var.b;
        int i4 = uq3Var.a;
        if (!uq3Var.isEmpty()) {
            return i2 < Integer.valueOf(i4).intValue() ? Integer.valueOf(i4).intValue() : i2 > Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + uq3Var + '.');
    }

    public static long w(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder sbS = rm7.s(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbS.append(j2);
        sbS.append('.');
        throw new IllegalArgumentException(sbS.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g51 x(final g51 g51Var, final g51 g51Var2, final qp2 qp2Var) {
        js3.p(qp2Var, "<this>");
        if (qp2Var instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) qp2Var).create(g51Var, g51Var2);
        }
        final w61 context = g51Var2.getContext();
        return context == EmptyCoroutineContext.a ? new RestrictedContinuationImpl(g51Var2) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            public int a;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = this.a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.a = 2;
                    kotlin.b.b(obj);
                    return obj;
                }
                this.a = 1;
                kotlin.b.b(obj);
                qp2 qp2Var2 = qp2Var;
                js3.n(qp2Var2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                wu8.i(2, qp2Var2);
                return qp2Var2.invoke(g51Var, this);
            }
        } : new ContinuationImpl(g51Var2, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            public int a;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = this.a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.a = 2;
                    kotlin.b.b(obj);
                    return obj;
                }
                this.a = 1;
                kotlin.b.b(obj);
                qp2 qp2Var2 = qp2Var;
                js3.n(qp2Var2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                wu8.i(2, qp2Var2);
                return qp2Var2.invoke(g51Var, this);
            }
        };
    }

    public void H(mb7 mb7Var, Object obj) throws Exception {
        js3.p(mb7Var, "connection");
        rb7 rb7VarM1 = mb7Var.m1(z());
        try {
            l(rb7VarM1, obj);
            rb7VarM1.f1();
            m91.i(rb7VarM1, null);
        } finally {
        }
    }

    public abstract int k(int i2, LayoutDirection layoutDirection, b96 b96Var);

    public abstract void l(rb7 rb7Var, Object obj);

    public abstract String z();
}
