package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.compose.foundation.f;
import androidx.compose.material3.l;
import androidx.compose.material3.m;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.a;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.versionedparcelable.ParcelImpl;
import io.sentry.android.core.t0;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.myket.movie.common.domain.models.EpisodeBannerType;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c26 {
    public static final bn6 c;
    public static final bn6 d;
    public static final bn6 e;
    public static final bn6 f;
    public static final bn6 g;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ int u = 0;
    public static final sv1 a = new sv1(2);
    public static final Object b = new Object();
    public static final mt8 h = new mt8(new lc8(17), new g39(4));
    public static final mt8 i = new mt8(new lc8(18), new lc8(19));
    public static final mt8 j = new mt8(new lc8(20), new lc8(21));
    public static final mt8 k = new mt8(new lc8(22), new lc8(23));
    public static final mt8 l = new mt8(new lc8(24), new lc8(25));
    public static final mt8 m = new mt8(new lc8(26), new lc8(27));
    public static final mt8 n = new mt8(new lc8(28), new lc8(29));
    public static final mt8 o = new mt8(new g39(0), new g39(1));
    public static final mt8 p = new mt8(new g39(2), new g39(3));

    static {
        int i2 = 5;
        c = new bn6(new ud7(26), new vd7(5), i2);
        d = new bn6(new ud7(27), new vd7(6), i2);
        e = new bn6(new ud7(28), new vd7(7), i2);
        f = new bn6(new ud7(29), new vd7(8), i2);
        g = new bn6(new yd7(0), new vd7(9), i2);
    }

    public static final int A(int i2, Resources resources, int i3, float f2) {
        ThreadLocal threadLocal = b77.a;
        return sv0.b(Math.abs(f2), resources.getColor(i2, null), resources.getColor(i3, null));
    }

    public static s49 E(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(c26.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final boolean F(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static boolean G(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean H(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean I(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean J(int i2) {
        int type;
        return (!I(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static final w0 K(Object[] objArr) {
        js3.p(objArr, "array");
        return new w0(objArr);
    }

    public static ov4 L(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    ov4 ov4Var = new ov4();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ov4Var.d = byteBufferDuplicate;
                    ov4Var.a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ov4Var.b = i7;
                    ov4Var.c = ((ByteBuffer) ov4Var.d).getShort(i7);
                    return ov4Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final boolean P(Throwable th, bp2 bp2Var) {
        List listR0;
        Object objInvoke;
        js3.p(th, "<this>");
        Integer num = rt3.a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            js3.o(suppressed, "getSuppressed(...)");
            listR0 = ew.r0(suppressed);
        } else {
            Method method = o96.b;
            listR0 = (method == null || (objInvoke = method.invoke(th, null)) == null) ? EmptyList.a : ew.r0((Throwable[]) objInvoke);
        }
        int size = listR0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listR0.get(i2)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            fz0 fz0Var = (fz0) bp2Var.invoke();
            if (fz0Var != null && !fz0Var.a.isEmpty()) {
                z = true;
            }
            if (z) {
                js3.m(fz0Var);
                diagnosticComposeException = new DiagnosticComposeException(fz0Var);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            wu8.f(th, diagnosticComposeException);
        }
        return z;
    }

    public static final void a(hx4 hx4Var, c32 c32Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        char c2;
        Context context;
        ex4 ex4Var;
        bb0 bb0Var;
        qp2 qp2Var;
        dp2 dp2Var;
        qp2 qp2Var2;
        qp2 qp2Var3;
        boolean z;
        Context context2;
        long j2;
        boolean z2;
        hx4 hx4VarJ;
        c32 c32Var2 = c32Var;
        qz0 qz0Var2 = qz0Var;
        js3.p(c32Var2, "item");
        qz0Var2.c0(1165453333);
        int i3 = i2 | 6 | (qz0Var2.f(c32Var2) ? 32 : 16);
        if (qz0Var2.R(i3 & 1, (i3 & 19) != 18)) {
            Context context3 = (Context) qz0Var2.j(e.b);
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = o40.r(qz0Var2);
            }
            ab5 ab5Var = (ab5) objM;
            m mVarA = r97.a(0.0f, 3, wu8.x(qz0Var2).z);
            boolean z3 = (i3 & 112) == 32;
            Object objM2 = qz0Var2.M();
            if (z3 || objM2 == avVar) {
                objM2 = new x2(21, c32Var2);
                qz0Var2.l0(objM2);
            }
            ex4 ex4Var2 = ex4.b;
            hx4 hx4VarZ = yh0.z(f.a(ex4Var2, ab5Var, mVarA, false, null, (bp2) objM2, 28), ml9.q(hq6.space_16, qz0Var2));
            fv fvVar = jv.a;
            ev evVarG = jv.g(ml9.q(hq6.space_8, qz0Var2));
            bb0 bb0Var2 = eq.m;
            cb7 cb7VarA = bb7.a(evVarG, bb0Var2, qz0Var2, 48);
            long j3 = qz0Var2.T;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = b.c(qz0Var2, hx4VarZ);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            qp2 qp2Var4 = d.f;
            ia7.o(qz0Var2, qp2Var4, cb7VarA);
            qp2 qp2Var5 = d.e;
            ia7.o(qz0Var2, qp2Var5, j56VarL);
            Integer numValueOf = Integer.valueOf(i4);
            qp2 qp2Var6 = d.g;
            ia7.g(qz0Var2, numValueOf, qp2Var6);
            dp2 dp2Var2 = d.h;
            ia7.n(qz0Var2, dp2Var2);
            qp2 qp2Var7 = d.d;
            ia7.o(qz0Var2, qp2Var7, hx4VarC);
            String str = c32Var2.d;
            if (str == null || f88.n0(str)) {
                c2 = ' ';
                context = context3;
                ex4Var = ex4Var2;
                bb0Var = bb0Var2;
                qp2Var = qp2Var5;
                dp2Var = dp2Var2;
                qp2Var2 = qp2Var6;
                qp2Var3 = qp2Var7;
                qz0Var2.a0(-764604335);
            } else {
                qz0Var2.a0(-761681748);
                String str2 = c32Var2.d;
                c2 = ' ';
                if (c32Var2.e == EpisodeBannerType.a) {
                    qz0Var2.a0(-1439752130);
                    hx4VarJ = androidx.compose.foundation.layout.b.j(ex4Var2, ml9.q(hq6.brief_movie_episode_banner_landscape_width, qz0Var2), ml9.q(hq6.brief_movie_episode_banner_landscape_height, qz0Var2));
                    qz0Var2.q(false);
                } else {
                    qz0Var2.a0(-1439570656);
                    hx4VarJ = androidx.compose.foundation.layout.b.j(ex4Var2, ml9.q(hq6.brief_movie_episode_banner_portrait_width, qz0Var2), ml9.q(hq6.brief_movie_episode_banner_portrait_height, qz0Var2));
                    qz0Var2.q(false);
                }
                qp2Var3 = qp2Var7;
                qp2Var = qp2Var5;
                ex4Var = ex4Var2;
                dp2Var = dp2Var2;
                bb0Var = bb0Var2;
                context = context3;
                qp2Var2 = qp2Var6;
                cc7.a(str2, zk8.s(hx4VarJ, la7.a(ml9.q(hq6.radius_8, qz0Var2))), p41.a, null, qz0Var2, 1572912, 1976);
            }
            qz0Var2.q(false);
            if (1.0f <= 0.0d) {
                pn3.a("invalid weight; must be greater than zero");
            }
            a24 a24Var = new a24(1.0f, true);
            vv0 vv0VarA = tv0.a(jv.g(ml9.q(hq6.space_4, qz0Var2)), eq.o, qz0Var2, 0);
            long j4 = qz0Var2.T;
            int i5 = (int) (j4 ^ (j4 >>> c2));
            j56 j56VarL2 = qz0Var2.l();
            hx4 hx4VarC2 = b.c(qz0Var2, a24Var);
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, qp2Var4, vv0VarA);
            ia7.o(qz0Var2, qp2Var, j56VarL2);
            ia7.g(qz0Var2, Integer.valueOf(i5), qp2Var2);
            ia7.n(qz0Var2, dp2Var);
            ia7.o(qz0Var2, qp2Var3, hx4VarC2);
            char c3 = c2;
            qp2 qp2Var8 = qp2Var;
            qp2 qp2Var9 = qp2Var2;
            dp2 dp2Var3 = dp2Var;
            qp2 qp2Var10 = qp2Var3;
            bb0 bb0Var3 = bb0Var;
            Context context4 = context;
            ex4 ex4Var3 = ex4Var;
            mi8.b(c32Var2.b, null, wu8.x(qz0Var2).k, 0L, 0L, null, 0L, 2, false, 1, 0, wu8.y(qz0Var2).g, qz0Var, 0, 24960, 110586);
            qz0 qz0Var3 = qz0Var;
            String str3 = c32Var2.c;
            if (str3 == null) {
                qz0Var3.a0(1188027888);
                qz0Var3.q(false);
                z = false;
                context2 = context4;
            } else {
                qz0Var3.a0(1188027889);
                z = false;
                context2 = context4;
                mi8.b(xa7.f(context4, str3), null, wu8.x(qz0Var3).k, 0L, 0L, null, 0L, 2, false, 1, 0, wu8.y(qz0Var3).i, qz0Var, 0, 24960, 110586);
                qz0Var3 = qz0Var;
                qz0Var3.q(false);
            }
            qz0Var3.q(true);
            cb7 cb7VarA2 = bb7.a(jv.b, bb0Var3, qz0Var3, 54);
            long j5 = qz0Var3.T;
            int i6 = (int) (j5 ^ (j5 >>> c3));
            j56 j56VarL3 = qz0Var3.l();
            hx4 hx4VarC3 = b.c(qz0Var3, ex4Var3);
            qz0Var3.e0();
            if (qz0Var3.S) {
                qz0Var3.k(bp2Var);
            } else {
                qz0Var3.o0();
            }
            ia7.o(qz0Var3, qp2Var4, cb7VarA2);
            ia7.o(qz0Var3, qp2Var8, j56VarL3);
            ia7.g(qz0Var3, Integer.valueOf(i6), qp2Var9);
            ia7.n(qz0Var3, dp2Var3);
            ia7.o(qz0Var3, qp2Var10, hx4VarC3);
            String strF = xa7.f(context2, c32Var.g);
            gj8 gj8Var = wu8.y(qz0Var3).k;
            if (c32Var.f) {
                qz0Var3.a0(-420433159);
                j2 = wu8.x(qz0Var3).g;
            } else {
                qz0Var3.a0(-420431843);
                j2 = wu8.x(qz0Var3).j;
            }
            qz0Var3.q(z);
            c32Var2 = c32Var;
            mi8.b(strF, null, j2, 0L, 0L, new of8(5), 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 130042);
            qz0Var2 = qz0Var;
            if (c32Var2.h) {
                qz0Var2.a0(-148399032);
                hx4Var2 = ex4Var3;
                kh3.a(rf0.G(br6.player_ic_chevron, qz0Var2), androidx.compose.foundation.layout.b.i(hx4Var2, ml9.q(hq6.size_16, qz0Var2)), wu8.x(qz0Var2).j, qz0Var2, 56, 0);
                z2 = false;
            } else {
                hx4Var2 = ex4Var3;
                z2 = false;
                qz0Var2.a0(-152625355);
            }
            qz0Var2.q(z2);
            qz0Var2.q(true);
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new iz(hx4Var2, c32Var2, i2, 7);
        }
    }

    public static kb2 b(s26 s26Var, tb2 tb2Var, String str, zv6 zv6Var, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            zv6Var = null;
        }
        return new kb2(s26Var, tb2Var, str, zv6Var);
    }

    public static final void c(hx4 hx4Var, String str, String str2, String str3, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        gj8 gj8Var;
        qz0 qz0Var2 = qz0Var;
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(dp2Var, "onValueChange");
        qz0Var2.c0(-1194021891);
        int i4 = i2 | (qz0Var2.f(hx4Var) ? 4 : 2) | (qz0Var2.f(str) ? 32 : 16) | (qz0Var2.f(str2) ? 256 : 128) | (qz0Var2.f(str3) ? 2048 : 1024);
        if (qz0Var2.R(i4 & 1, (i4 & 9363) != 9362)) {
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var2, 0);
            long j2 = qz0Var2.T;
            int i5 = (int) ((j2 >>> 32) ^ j2);
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
            ia7.g(qz0Var2, Integer.valueOf(i5), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            gj8 gj8Var2 = wu8.y(qz0Var2).g;
            ex4 ex4Var = ex4.b;
            hx4 hx4VarD = yh0.D(androidx.compose.foundation.layout.b.c(ex4Var, 1.0f), 0.0f, ml9.q(hq6.space_8, qz0Var2), 0.0f, 0.0f, 13);
            boolean z = !(str3 == null || f88.n0(str3));
            ka7 ka7VarA = la7.a(ml9.q(hq6.radius_8, qz0Var2));
            l lVar = l.a;
            long j3 = wu8.x(qz0Var2).p;
            long j4 = wu8.x(qz0Var2).g;
            long j5 = wu8.x(qz0Var2).g;
            long j6 = wu8.x(qz0Var2).j;
            long j7 = wu8.x(qz0Var2).g;
            long j8 = wu8.x(qz0Var2).g;
            long j9 = wu8.x(qz0Var2).j;
            long j10 = zu0.h;
            lv0 lv0Var = (lv0) qz0Var2.j(mv0.a);
            dh8 dh8VarA = lv0Var.a0;
            if (dh8VarA == null) {
                qz0Var2.a0(390452338);
                qz0Var2.q(false);
                dh8VarA = null;
            } else {
                qz0Var2.a0(390452339);
                bj8 bj8Var = (bj8) qz0Var2.j(cj8.a);
                if (!js3.i(dh8VarA.k, bj8Var)) {
                    dh8VarA = dh8VarA.a(dh8VarA.a, dh8VarA.b, dh8VarA.c, dh8VarA.d, dh8VarA.e, dh8VarA.f, dh8VarA.g, dh8VarA.h, dh8VarA.i, dh8VarA.j, bj8Var, dh8VarA.l, dh8VarA.m, dh8VarA.n, dh8VarA.o, dh8VarA.p, dh8VarA.q, dh8VarA.r, dh8VarA.s, dh8VarA.t, dh8VarA.u, dh8VarA.v, dh8VarA.w, dh8VarA.x, dh8VarA.y, dh8VarA.z, dh8VarA.A, dh8VarA.B, dh8VarA.C, dh8VarA.D, dh8VarA.E, dh8VarA.F, dh8VarA.G, dh8VarA.H, dh8VarA.I, dh8VarA.J, dh8VarA.K, dh8VarA.L, dh8VarA.M, dh8VarA.N, dh8VarA.O, dh8VarA.P, dh8VarA.Q);
                    lv0Var.a0 = dh8VarA;
                }
                qz0Var2.q(false);
            }
            if (dh8VarA == null) {
                qz0Var2.a0(-1788321191);
                long jC = mv0.c(lv0Var, jx5.o);
                long jC2 = mv0.c(lv0Var, jx5.u);
                ColorSchemeKeyTokens colorSchemeKeyTokens = jx5.b;
                i3 = i4;
                long jB = zu0.b(0.38f, mv0.c(lv0Var, colorSchemeKeyTokens));
                long jC3 = mv0.c(lv0Var, jx5.i);
                long j11 = zu0.g;
                long jC4 = mv0.c(lv0Var, jx5.a);
                long jC5 = mv0.c(lv0Var, jx5.h);
                bj8 bj8Var2 = (bj8) qz0Var2.j(cj8.a);
                long jC6 = mv0.c(lv0Var, jx5.r);
                long jC7 = mv0.c(lv0Var, jx5.A);
                long jB2 = zu0.b(0.12f, mv0.c(lv0Var, jx5.e));
                long jC8 = mv0.c(lv0Var, jx5.l);
                long jC9 = mv0.c(lv0Var, jx5.q);
                long jC10 = mv0.c(lv0Var, jx5.z);
                long jB3 = zu0.b(0.38f, mv0.c(lv0Var, jx5.d));
                long jC11 = mv0.c(lv0Var, jx5.k);
                long jC12 = mv0.c(lv0Var, jx5.t);
                long jC13 = mv0.c(lv0Var, jx5.C);
                long jB4 = zu0.b(0.38f, mv0.c(lv0Var, jx5.g));
                long jC14 = mv0.c(lv0Var, jx5.n);
                long jC15 = mv0.c(lv0Var, jx5.p);
                long jC16 = mv0.c(lv0Var, jx5.y);
                long jB5 = zu0.b(0.38f, mv0.c(lv0Var, jx5.c));
                long jC17 = mv0.c(lv0Var, jx5.j);
                ColorSchemeKeyTokens colorSchemeKeyTokens2 = jx5.v;
                long jC18 = mv0.c(lv0Var, colorSchemeKeyTokens2);
                long jC19 = mv0.c(lv0Var, colorSchemeKeyTokens2);
                gj8Var = gj8Var2;
                long jB6 = zu0.b(0.38f, mv0.c(lv0Var, colorSchemeKeyTokens));
                long jC20 = mv0.c(lv0Var, colorSchemeKeyTokens2);
                long jC21 = mv0.c(lv0Var, jx5.s);
                long jC22 = mv0.c(lv0Var, jx5.B);
                long jB7 = zu0.b(0.38f, mv0.c(lv0Var, jx5.f));
                long jC23 = mv0.c(lv0Var, jx5.m);
                ColorSchemeKeyTokens colorSchemeKeyTokens3 = jx5.w;
                long jC24 = mv0.c(lv0Var, colorSchemeKeyTokens3);
                long jC25 = mv0.c(lv0Var, colorSchemeKeyTokens3);
                long jB8 = zu0.b(0.38f, mv0.c(lv0Var, colorSchemeKeyTokens3));
                long jC26 = mv0.c(lv0Var, colorSchemeKeyTokens3);
                ColorSchemeKeyTokens colorSchemeKeyTokens4 = jx5.x;
                dh8VarA = new dh8(jC, jC2, jB, jC3, j11, j11, j11, j11, jC4, jC5, bj8Var2, jC6, jC7, jB2, jC8, jC9, jC10, jB3, jC11, jC12, jC13, jB4, jC14, jC15, jC16, jB5, jC17, jC18, jC19, jB6, jC20, jC21, jC22, jB7, jC23, jC24, jC25, jB8, jC26, mv0.c(lv0Var, colorSchemeKeyTokens4), mv0.c(lv0Var, colorSchemeKeyTokens4), zu0.b(0.38f, mv0.c(lv0Var, colorSchemeKeyTokens4)), mv0.c(lv0Var, colorSchemeKeyTokens4));
                lv0Var.a0 = dh8VarA;
                qz0Var2.q(false);
            } else {
                i3 = i4;
                gj8Var = gj8Var2;
                qz0Var2.a0(-1788515437);
                qz0Var2.q(false);
            }
            gx5.a(str, dp2Var, hx4VarD, false, gj8Var, s7.X(-180017299, new g8(17, str2), qz0Var2), z, null, null, null, 3, 0, ka7VarA, dh8VarA.a(j6, j10, j10, j9, j10, j10, j10, j10, j10, j10, null, j4, j3, j10, j7, j10, j10, j10, j10, j10, j10, j10, j10, j5, j10, j10, j8, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10, j10), qz0Var2, ((i3 >> 3) & 14) | 1572912);
            mi8.b(str3 == null ? "" : str3, androidx.compose.foundation.layout.b.c(ex4Var, 1.0f), wu8.x(qz0Var).g, 0L, 0L, null, 0L, 0, false, 0, 0, wu8.y(qz0Var).i, qz0Var, 48, 0, 131064);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new bn0(hx4Var, str, str2, str3, dp2Var, i2, 1);
        }
    }

    public static final void d(hx4 hx4Var, i iVar, a aVar, qz0 qz0Var, int i2) {
        int i3;
        a aVar2 = hs9.b;
        qz0Var.c0(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.f(iVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(aVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(aVar) ? 2048 : 1024;
        }
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = g.g(null, th0.p);
                qz0Var.l0(objM);
            }
            androidx.compose.foundation.text.contextmenu.provider.a aVarL = l(aVar2, qz0Var, (i3 >> 6) & 14);
            zk8.b(iVar.a(aVarL), s7.X(274270255, new ia0(hx4Var, (wb5) objM, aVar, aVarL, 0), qz0Var), qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i2, 3, hx4Var, iVar, aVar);
        }
    }

    public static final int e(int i2, int i3, Resources resources) {
        ThreadLocal threadLocal = b77.a;
        return Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i3 & 255), Integer.valueOf(resources.getColor(i2, null) & 16777215)}, 2)));
    }

    public static final View f(gx4 gx4Var) {
        AndroidViewHolder androidViewHolder = y40.H(gx4Var.a).q;
        View interopView = androidViewHolder != null ? androidViewHolder.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final long g(x44 x44Var, sy6 sy6Var, sy6 sy6Var2, int i2) {
        long jZ = z(x44Var, sy6Var, i2);
        if (zi8.d(jZ)) {
            return zi8.b;
        }
        long jZ2 = z(x44Var, sy6Var2, i2);
        if (zi8.d(jZ2)) {
            return zi8.b;
        }
        int i3 = (int) (jZ >> 32);
        int i4 = (int) (jZ2 & 4294967295L);
        return uy6.b(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final int h(int i2, Resources resources, float f2) {
        return A(i2, resources, f2 < 0.0f ? eq6.black : eq6.white, f2);
    }

    public static final boolean i(ri8 ri8Var, int i2) {
        q95 q95Var = ri8Var.b;
        int iD = q95Var.d(i2);
        return i2 == ri8Var.f(iD) || i2 == q95Var.c(iD, false) ? ri8Var.g(i2) != ri8Var.a(i2) : ri8Var.a(i2) != ri8Var.a(i2 - 1);
    }

    public static final long j(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    public static hx4 k() {
        return new yi4(1200, xi4.a, xi4.b);
    }

    public static final androidx.compose.foundation.text.contextmenu.provider.a l(a aVar, qz0 qz0Var, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && qz0Var.f(aVar)) || (i2 & 6) == 4;
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (z || objM == obj) {
            objM = new androidx.compose.foundation.text.contextmenu.provider.a(aVar);
            qz0Var.l0(objM);
        }
        androidx.compose.foundation.text.contextmenu.provider.a aVar2 = (androidx.compose.foundation.text.contextmenu.provider.a) objM;
        boolean zF = qz0Var.f(aVar2);
        Object objM2 = qz0Var.M();
        if (zF || objM2 == obj) {
            objM2 = new n(18, aVar2);
            qz0Var.l0(objM2);
        }
        zk8.d(aVar2, (dp2) objM2, qz0Var);
        return aVar2;
    }

    public static final sy6 m(v04 v04Var) {
        v04 v04VarW = v04Var.w();
        return v04VarW != null ? v04VarW.I(v04Var, true) : new sy6(0.0f, 0.0f, (int) (v04Var.k() >> 32), (int) (v04Var.k() & 4294967295L));
    }

    public static final sy6 n(v04 v04Var, boolean z) {
        v04 v04VarT = t(v04Var);
        float fK = (int) (v04VarT.k() >> 32);
        float fK2 = (int) (v04VarT.k() & 4294967295L);
        sy6 sy6VarI = v04VarT.I(v04Var, z);
        float f2 = sy6VarI.d;
        float f3 = sy6VarI.c;
        float f4 = sy6VarI.b;
        float f5 = sy6VarI.a;
        if (z) {
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > fK) {
                f5 = fK;
            }
        }
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > fK2) {
                f4 = fK2;
            }
        }
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fK) {
                fK = f3;
            }
            f3 = fK;
        }
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 <= fK2) {
                fK2 = f2;
            }
            f2 = fK2;
        }
        if (f5 == f3 || f4 == f2) {
            return sy6.e;
        }
        long jB = v04VarT.b((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jB2 = v04VarT.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jB3 = v04VarT.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jB4 = v04VarT.b((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
        return new sy6(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static qc0 q(pc0 pc0Var, Drawable drawable, int i2, int i3) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i2 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i3 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i2 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i3 = current.getIntrinsicHeight();
                    }
                    Lock lock = qq8.d;
                    lock.lock();
                    Bitmap bitmapD = pc0Var.d(i2, i3, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapD);
                        current.setBounds(0, 0, i2, i3);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapD;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    t0.m("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                t0.m("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            pc0Var = a;
        }
        return qc0.b(pc0Var, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet r(es0 es0Var, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(es0Var, bs0.a, as0.b, new ds0(f2, f3, f4));
        ds0 revealInfo = es0Var.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) es0Var, (int) f2, (int) f3, revealInfo.c, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static final ArrayList s(fz0 fz0Var) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR};
        List list = fz0Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            gz0 gz0Var = (gz0) list.get(i2);
            if (!ew.s0(iArr, gz0Var.a)) {
                if (gz0Var.a == 100) {
                    int i4 = i2 + 2;
                    if (i4 < size && ((gz0) list.get(i4)).a == 1000) {
                        break;
                    }
                    kotlin.collections.a.G0(arrayList);
                } else {
                    arrayList.add(gz0Var);
                }
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final v04 t(v04 v04Var) {
        v04 v04Var2;
        v04 v04VarW = v04Var.w();
        while (true) {
            v04 v04Var3 = v04VarW;
            v04Var2 = v04Var;
            v04Var = v04Var3;
            if (v04Var == null) {
                break;
            }
            v04VarW = v04Var.w();
        }
        androidx.compose.ui.node.m mVar = v04Var2 instanceof androidx.compose.ui.node.m ? (androidx.compose.ui.node.m) v04Var2 : null;
        if (mVar == null) {
            return v04Var2;
        }
        androidx.compose.ui.node.m mVar2 = mVar.s;
        while (true) {
            androidx.compose.ui.node.m mVar3 = mVar2;
            androidx.compose.ui.node.m mVar4 = mVar;
            mVar = mVar3;
            if (mVar == null) {
                return mVar4;
            }
            mVar2 = mVar.s;
        }
    }

    public static c26 u(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        if (i2 == 0) {
            return new px4(dArr, dArr2);
        }
        if (i2 == 2) {
            double d2 = dArr[0];
            double[] dArr3 = dArr2[0];
            u81 u81Var = new u81();
            u81Var.v = d2;
            u81Var.w = dArr3;
            return u81Var;
        }
        d74 d74Var = new d74();
        int length = dArr2[0].length;
        d74Var.x = new double[length];
        d74Var.v = dArr;
        d74Var.w = dArr2;
        if (length > 2) {
            double d3 = 0.0d;
            int i3 = 0;
            while (true) {
                double d4 = d3;
                if (i3 >= dArr.length) {
                    break;
                }
                double d5 = dArr2[i3][0];
                if (i3 > 0) {
                    Math.hypot(d5 - d3, d5 - d4);
                }
                i3++;
                d3 = d5;
            }
        }
        return d74Var;
    }

    public static final int v(q95 q95Var, long j2, v69 v69Var) {
        float fG = v69Var != null ? v69Var.g() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int iE = q95Var.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < q95Var.f(iE) - fG || Float.intBitsToFloat(i2) > q95Var.b(iE) + fG) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-fG) || Float.intBitsToFloat(i3) > q95Var.d + fG) {
            return -1;
        }
        return iE;
    }

    public static final long z(x44 x44Var, sy6 sy6Var, int i2) {
        si8 si8VarD = x44Var.d();
        q95 q95Var = si8VarD != null ? si8VarD.a.b : null;
        v04 v04VarC = x44Var.c();
        return (q95Var == null || v04VarC == null) ? zi8.b : q95Var.h(sy6Var.i(v04VarC.G(0L)), i2, th0.v);
    }

    public abstract double B(double d2);

    public abstract void C(double d2, double[] dArr);

    public abstract double[] D();

    public abstract void N();

    public abstract void O();

    public boolean o() {
        return false;
    }

    public abstract double w(double d2);

    public abstract void x(double d2, double[] dArr);

    public abstract void y(double d2, float[] fArr);

    public void M() {
    }
}
