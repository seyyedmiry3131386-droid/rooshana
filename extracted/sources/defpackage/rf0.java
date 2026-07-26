package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import androidx.compose.animation.f;
import androidx.compose.animation.j;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.Feature;
import com.google.common.collect.ImmutableSet;
import ir.myket.player.domain.models.PlayerMovieData;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rf0 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final a c = new a(308166403, new yf(9), false);
    public static final boolean[] d = new boolean[3];
    public static final vk8 e = new vk8(0, new long[0], new Object[0]);
    public static final Feature f;
    public static final Feature[] g;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    static {
        Feature feature = new Feature(2L, "sms_code_autofill");
        Feature feature2 = new Feature(2L, "sms_code_browser");
        Feature feature3 = new Feature(1L, "sms_retrieve");
        f = feature3;
        g = new Feature[]{feature, feature2, feature3, new Feature(3L, "user_consent")};
    }

    public static final float[] A(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static boolean B(Context context) {
        js3.p(context, "context");
        ((w91) ((el2) rq4.x(el2.class, m91.o(context.getApplicationContext())))).getClass();
        ImmutableSet immutableSetR = ImmutableSet.r();
        y97.q(immutableSetR.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (immutableSetR.isEmpty()) {
            return true;
        }
        return ((Boolean) immutableSetR.iterator().next()).booleanValue();
    }

    public static int C(int i2, int i3, int i4) throws IOException {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new IOException(dw1.j(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static final ArrayList D(Map map, dp2 dp2Var) {
        js3.p(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            di5 di5Var = (di5) entry.getValue();
            Boolean boolValueOf = di5Var != null ? Boolean.valueOf(di5Var.b) : null;
            js3.m(boolValueOf);
            if (!boolValueOf.booleanValue() && !di5Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) dp2Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final float[] E(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] F(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.g16 G(int r56, defpackage.qz0 r57) {
        /*
            Method dump skipped, instruction units count: 1776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf0.G(int, qz0):g16");
    }

    public static g H(ao0 ao0Var, boolean z) throws ParserException {
        int i2 = ao0Var.i(5);
        if (i2 == 31) {
            i2 = ao0Var.i(6) + 32;
        }
        int iY = y(ao0Var);
        int i3 = ao0Var.i(4);
        String strN = rm7.n(i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            iY = y(ao0Var);
            int i4 = ao0Var.i(5);
            if (i4 == 31) {
                i4 = ao0Var.i(6) + 32;
            }
            i2 = i4;
            if (i2 == 22) {
                i3 = ao0Var.i(4);
            }
        }
        if (z) {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6 && i2 != 7 && i2 != 17) {
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i2);
                }
            }
            if (ao0Var.h()) {
                wn5.k0("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (ao0Var.h()) {
                ao0Var.t(14);
            }
            boolean zH = ao0Var.h();
            if (i3 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i2 == 6 || i2 == 20) {
                ao0Var.t(3);
            }
            if (zH) {
                if (i2 == 22) {
                    ao0Var.t(16);
                }
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    ao0Var.t(3);
                }
                ao0Var.t(1);
            }
            switch (i2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i5 = ao0Var.i(2);
                    if (i5 == 2 || i5 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + i5);
                    }
                    break;
            }
        }
        int i6 = b[i3];
        if (i6 == -1) {
            throw ParserException.a(null, null);
        }
        g gVar = new g();
        gVar.b = iY;
        gVar.c = i6;
        gVar.a = strN;
        return gVar;
    }

    public static final View J(ri1 ri1Var) {
        if (!((gx4) ri1Var).a.n) {
            rn3.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) m14.a(y40.H(ri1Var));
    }

    public static final String K(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final jo3 L(InputStream inputStream) {
        js3.p(inputStream, "<this>");
        return new jo3(inputStream, new dm8());
    }

    public static final void a(final wa waVar, final dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        dp2 dp2Var2;
        wa waVar2;
        js3.p(waVar, "adLinkInfo");
        qz0Var.c0(-248940840);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(waVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            final Context context = (Context) qz0Var.j(e.b);
            i iVar = uj8.a;
            Object objJ = qz0Var.j(iVar);
            js3.m(objJ);
            final long j2 = ((tj8) objJ).i;
            wy5 wy5Var = ci0.a;
            Object objJ2 = qz0Var.j(iVar);
            js3.m(objJ2);
            long j3 = ((tj8) objJ2).j;
            Object objJ3 = qz0Var.j(iVar);
            js3.m(objJ3);
            bi0 bi0VarA = ci0.a(((tj8) objJ3).E, j3, 0L, 0L, qz0Var, 12);
            ka7 ka7VarA = la7.a(ml9.q(hq6.radius_8, qz0Var));
            float fQ = ml9.q(hq6.space_12, qz0Var);
            float fQ2 = ml9.q(hq6.space_8, qz0Var);
            wy5 wy5Var2 = new wy5(fQ, fQ2, fQ, fQ2);
            boolean zH = ((i3 & 112) == 32) | qz0Var.h(waVar) | qz0Var.h(context) | qz0Var.e(j2);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                Object obj = new bp2() { // from class: ua
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        bl4.H("on", "player_ad_button_link", "movie_click");
                        bl4.H("on", dy3.k ? "player_ad_button_land" : "player_ad_button_port", "movie_click");
                        wa waVar3 = waVar;
                        dp2Var.invoke(waVar3.c);
                        ct2.v(context, waVar3, j2);
                        return tx8.a;
                    }
                };
                dp2Var2 = dp2Var;
                waVar2 = waVar;
                qz0Var.l0(obj);
                objM = obj;
            } else {
                dp2Var2 = dp2Var;
                waVar2 = waVar;
            }
            androidx.compose.material3.a.a((bp2) objM, null, false, ka7VarA, bi0VarA, null, null, wy5Var2, s7.X(978634440, new va(0, waVar2), qz0Var), qz0Var, 805306368, 358);
        } else {
            dp2Var2 = dp2Var;
            waVar2 = waVar;
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(waVar2, dp2Var2, i2, 2);
        }
    }

    public static final void b(hx4 hx4Var, wd6 wd6Var, zl6 zl6Var, PlayerMovieData playerMovieData, rn5 rn5Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        js3.p(wd6Var, "playerControllerState");
        js3.p(zl6Var, "progressBarTimeState");
        js3.p(playerMovieData, "playerMovieDataState");
        js3.p(rn5Var, "nextEpisodeViewState");
        qz0Var.c0(-285399343);
        int i3 = i2 | (qz0Var.f(wd6Var) ? 32 : 16) | (qz0Var.h(zl6Var) ? 256 : 128) | (qz0Var.h(rn5Var) ? 16384 : 8192) | (qz0Var.h(dp2Var) ? 131072 : 65536);
        if (qz0Var.R(i3 & 1, (73875 & i3) != 73874)) {
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j2 = qz0Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4Var2 = hx4Var;
            hx4 hx4VarC = b.c(qz0Var, hx4Var2);
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
            cb0 cb0Var = eq.g;
            ng0 ng0Var = ng0.a;
            ex4 ex4Var = ex4.b;
            hx4 hx4VarA = ng0Var.a(ex4Var, cb0Var);
            if (wd6Var.d) {
                qz0Var.a0(428581507);
                boolean z = (458752 & i3) == 131072;
                Object objM = qz0Var.M();
                if (z || objM == jz0.a) {
                    objM = new ba(3, dp2Var);
                    qz0Var.l0(objM);
                }
                l87.a(hx4VarA, (bp2) objM, qz0Var, 0);
                qz0Var.q(false);
            } else {
                if (wd6Var.c) {
                    qz0Var.a0(428757339);
                    rq4.b(hx4VarA, qz0Var, 0);
                } else {
                    qz0Var.a0(425820523);
                }
                qz0Var.q(false);
            }
            if (rn5Var instanceof pn5) {
                qz0Var.a0(428917826);
                d(ng0Var.a(ex4Var, yh0.f), (pn5) rn5Var, zl6Var, dp2Var, qz0Var, ((i3 >> 9) & 112) | (i3 & 896) | ((i3 >> 6) & 7168));
            } else {
                qz0Var.a0(425820523);
            }
            qz0Var.q(false);
            qz0Var.q(true);
        } else {
            hx4Var2 = hx4Var;
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new z8(hx4Var2, wd6Var, zl6Var, playerMovieData, rn5Var, dp2Var, i2);
        }
    }

    public static final void c(hx4 hx4Var, bp2 bp2Var, String str, boolean z, bp2 bp2Var2, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        int i3;
        int i4;
        qz0Var.c0(1210038001);
        if ((i2 & 6) == 0) {
            hx4Var2 = hx4Var;
            i3 = (qz0Var.f(hx4Var2) ? 4 : 2) | i2;
        } else {
            hx4Var2 = hx4Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.g(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.h(bp2Var2) ? 16384 : 8192;
        }
        if (qz0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            if (z) {
                qz0Var.a0(-1089610444);
                i4 = hq6.space_16;
            } else {
                qz0Var.a0(-1089609132);
                i4 = hq6.space_20;
            }
            float fQ = ml9.q(i4, qz0Var);
            qz0Var.q(false);
            f.c(((Boolean) bp2Var.invoke()).booleanValue(), yh0.D(hx4Var2, ml9.q(hq6.space_16, qz0Var), 0.0f, ml9.q(hq6.space_16, qz0Var), fQ, 2), j.d(null, 3), j.e(null, 3), null, s7.X(-1567235815, new x5(str, bp2Var2, 7), qz0Var), qz0Var, 200064, 16);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new if6(hx4Var, bp2Var, str, z, bp2Var2, i2);
        }
    }

    public static final void d(hx4 hx4Var, pn5 pn5Var, zl6 zl6Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(-1443516383);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(pn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(zl6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 2048 : 1024;
        }
        int i5 = 0;
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            hx4 hx4VarD = yh0.D(hx4Var, ml9.q(hq6.space_16, qz0Var), 0.0f, ml9.q(hq6.space_16, qz0Var), ml9.q(hq6.next_episode_bottom_padding_portrait, qz0Var), 2);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = new mw7(i4);
                qz0Var.l0(objM);
            }
            hx4 hx4VarD2 = ix4.d(hx4VarD, (bp2) objM, null, null, qz0Var, 48, 6);
            b32 b32Var = pn5Var.a;
            boolean z = pn5Var.b;
            boolean zH = qz0Var.h(pn5Var) | qz0Var.h(zl6Var) | ((i3 & 7168) == 2048);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == avVar) {
                objM2 = new mz(pn5Var, zl6Var, dp2Var, i5);
                qz0Var.l0(objM2);
            }
            a32 a32Var = b32.Companion;
            ok4.e(hx4VarD2, b32Var, z, (bp2) objM2, qz0Var, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(hx4Var, pn5Var, zl6Var, dp2Var, i2, 2);
        }
    }

    public static final void e(hx4 hx4Var, pn5 pn5Var, boolean z, zl6 zl6Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        int i3;
        float fQ;
        qz0Var.c0(1983896803);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(pn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(zl6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.h(dp2Var) ? 16384 : 8192;
        }
        int i5 = 1;
        if (qz0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            if (z) {
                qz0Var.a0(-774974318);
                fQ = ml9.q(hq6.next_episode_bottom_padding_landscape, qz0Var);
                qz0Var.q(false);
            } else {
                qz0Var.a0(-774892013);
                fQ = ml9.q(hq6.next_episode_bottom_padding_portrait, qz0Var);
                qz0Var.q(false);
            }
            hx4 hx4VarD = yh0.D(hx4Var, ml9.q(hq6.space_16, qz0Var), 0.0f, ml9.q(hq6.space_16, qz0Var), fQ, 2);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = new mw7(i4);
                qz0Var.l0(objM);
            }
            hx4 hx4VarD2 = ix4.d(hx4VarD, (bp2) objM, null, null, qz0Var, 48, 6);
            b32 b32Var = pn5Var.a;
            boolean z2 = pn5Var.b;
            boolean zH = qz0Var.h(pn5Var) | qz0Var.h(zl6Var) | ((i3 & 57344) == 16384);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == avVar) {
                objM2 = new mz(pn5Var, zl6Var, dp2Var, i5);
                qz0Var.l0(objM2);
            }
            a32 a32Var = b32.Companion;
            ok4.e(hx4VarD2, b32Var, z2, (bp2) objM2, qz0Var, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new if6(hx4Var, pn5Var, z, zl6Var, dp2Var, i2);
        }
    }

    public static final void f(hx4 hx4Var, final wd6 wd6Var, zl6 zl6Var, PlayerMovieData playerMovieData, boolean z, rn5 rn5Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        dp2 dp2Var2;
        dp2 dp2Var3;
        boolean z2;
        za0 za0Var;
        js3.p(wd6Var, "playerControllerState");
        js3.p(zl6Var, "progressBarTimeState");
        js3.p(playerMovieData, "playerMovieDataState");
        js3.p(rn5Var, "nextEpisodeViewState");
        qz0Var.c0(-430234491);
        int i3 = i2 | (qz0Var.f(wd6Var) ? 32 : 16) | (qz0Var.h(zl6Var) ? 256 : 128) | (qz0Var.h(playerMovieData) ? 2048 : 1024) | (qz0Var.g(z) ? 16384 : 8192) | (qz0Var.h(rn5Var) ? 131072 : 65536) | (qz0Var.h(dp2Var) ? 1048576 : 524288);
        if (qz0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j2 = qz0Var.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4Var2 = hx4Var;
            hx4 hx4VarC = b.c(qz0Var, hx4Var2);
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
            cb0 cb0Var = eq.g;
            ng0 ng0Var = ng0.a;
            ex4 ex4Var = ex4.b;
            hx4 hx4VarA = ng0Var.a(ex4Var, cb0Var);
            boolean z3 = wd6Var.d;
            av avVar = jz0.a;
            if (z3) {
                qz0Var.a0(980182223);
                boolean z4 = (i3 & 3670016) == 1048576;
                Object objM = qz0Var.M();
                if (z4 || objM == avVar) {
                    objM = new ba(9, dp2Var);
                    qz0Var.l0(objM);
                }
                l87.a(hx4VarA, (bp2) objM, qz0Var, 0);
                qz0Var.q(false);
            } else {
                if (wd6Var.c) {
                    qz0Var.a0(980358055);
                    rq4.b(hx4VarA, qz0Var, 0);
                } else {
                    qz0Var.a0(977337911);
                }
                qz0Var.q(false);
            }
            if (rn5Var instanceof pn5) {
                qz0Var.a0(980519503);
                int i5 = i3 >> 6;
                e(ng0Var.a(ex4Var, yh0.f), (pn5) rn5Var, z, zl6Var, dp2Var, qz0Var, (i5 & 57344) | ((i3 >> 12) & 112) | (i5 & 896) | ((i3 << 3) & 7168));
                dp2Var3 = dp2Var;
                z2 = false;
            } else {
                dp2Var3 = dp2Var;
                z2 = false;
                qz0Var.a0(977337911);
            }
            qz0Var.q(z2);
            za0 za0Var2 = yh0.e;
            hx4 hx4VarA2 = ng0Var.a(ex4Var, za0Var2);
            int i6 = i3 & 112;
            boolean z5 = i6 == 32 ? true : z2;
            Object objM2 = qz0Var.M();
            if (z5 || objM2 == avVar) {
                final int i7 = 0;
                objM2 = new bp2() { // from class: hf6
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                return Boolean.valueOf(wd6Var.i);
                            default:
                                wd6 wd6Var2 = wd6Var;
                                return Boolean.valueOf(wd6Var2.j && !wd6Var2.i);
                        }
                    }
                };
                qz0Var.l0(objM2);
            }
            bp2 bp2Var2 = (bp2) objM2;
            String strF = ln2.f(vs6.player_skip_credits, qz0Var);
            int i8 = i3 & 3670016;
            boolean zH = qz0Var.h(playerMovieData) | (i8 == 1048576);
            Object objM3 = qz0Var.M();
            if (zH || objM3 == avVar) {
                za0Var = za0Var2;
                objM3 = new xv3(playerMovieData, dp2Var3, 13);
                qz0Var.l0(objM3);
            } else {
                za0Var = za0Var2;
            }
            bp2 bp2Var3 = (bp2) objM3;
            int i9 = (i3 >> 3) & 7168;
            dp2Var2 = dp2Var3;
            c(hx4VarA2, bp2Var2, strF, z, bp2Var3, qz0Var, i9);
            hx4 hx4VarA3 = ng0Var.a(ex4Var, za0Var);
            boolean z6 = i6 == 32;
            Object objM4 = qz0Var.M();
            if (z6 || objM4 == avVar) {
                final int i10 = 1;
                objM4 = new bp2() { // from class: hf6
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                return Boolean.valueOf(wd6Var.i);
                            default:
                                wd6 wd6Var2 = wd6Var;
                                return Boolean.valueOf(wd6Var2.j && !wd6Var2.i);
                        }
                    }
                };
                qz0Var.l0(objM4);
            }
            bp2 bp2Var4 = (bp2) objM4;
            String strF2 = ln2.f(vs6.player_play_from_beginning, qz0Var);
            boolean z7 = i8 == 1048576;
            Object objM5 = qz0Var.M();
            if (z7 || objM5 == avVar) {
                objM5 = new ba(10, dp2Var2);
                qz0Var.l0(objM5);
            }
            c(hx4VarA3, bp2Var4, strF2, z, (bp2) objM5, qz0Var, i9);
            qz0Var.q(true);
        } else {
            hx4Var2 = hx4Var;
            dp2Var2 = dp2Var;
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new an0(hx4Var2, wd6Var, zl6Var, playerMovieData, z, rn5Var, dp2Var2, i2);
        }
    }

    public static nv0 g(nv0 nv0Var) {
        yd9 yd9Var = ja1.i;
        ca7 ca7Var = ca7.e;
        if (gv0.a(nv0Var.b, gv0.a)) {
            androidx.compose.ui.graphics.colorspace.a aVar = (androidx.compose.ui.graphics.colorspace.a) nv0Var;
            yd9 yd9Var2 = aVar.d;
            if (!o(yd9Var2, yd9Var)) {
                return new androidx.compose.ui.graphics.colorspace.a(aVar.a, aVar.h, yd9Var, E(n((float[]) ca7Var.b, yd9Var2.a(), yd9Var.a()), aVar.i), aVar.k, aVar.n, aVar.e, aVar.f, aVar.g, -1);
            }
        }
        return nv0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r4 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int h(int r2, int r3, boolean r4, int r5) {
        /*
            r0 = 0
            if (r3 < r5) goto L8
            if (r4 == 0) goto L6
            return r0
        L6:
            int r5 = r5 - r3
            return r5
        L8:
            if (r4 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r5 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r4 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r4 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r5 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r4 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r4 != 0) goto L27
            return r0
        L27:
            int r5 = r5 - r3
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf0.h(int, int, boolean, int):int");
    }

    public static final sv6 i(by7 by7Var) {
        js3.p(by7Var, "<this>");
        return new sv6(by7Var);
    }

    public static final tv6 j(t18 t18Var) {
        js3.p(t18Var, "<this>");
        return new tv6(t18Var);
    }

    public static zm0 k(long j2, long j3, qz0 qz0Var, int i2, int i3) {
        long j4;
        long jB = (i3 & 2) != 0 ? mv0.b(j2, qz0Var) : j3;
        long j5 = zu0.h;
        long jB2 = zu0.b(0.38f, jB);
        lv0 lv0Var = (lv0) qz0Var.j(mv0.a);
        zm0 zm0Var = lv0Var.Y;
        if (zm0Var == null) {
            ColorSchemeKeyTokens colorSchemeKeyTokens = ic2.a;
            j4 = jB;
            zm0 zm0Var2 = new zm0(mv0.c(lv0Var, colorSchemeKeyTokens), mv0.a(lv0Var, mv0.c(lv0Var, colorSchemeKeyTokens)), gu9.l(zu0.b(ic2.e, mv0.c(lv0Var, ic2.c)), mv0.c(lv0Var, colorSchemeKeyTokens)), zu0.b(0.38f, mv0.a(lv0Var, mv0.c(lv0Var, colorSchemeKeyTokens))));
            lv0Var.Y = zm0Var2;
            zm0Var = zm0Var2;
        } else {
            j4 = jB;
        }
        long j6 = j2 != 16 ? j2 : zm0Var.a;
        long j7 = j4 != 16 ? j4 : zm0Var.b;
        if (j5 == 16) {
            j5 = zm0Var.c;
        }
        long j8 = j5;
        if (jB2 == 16) {
            jB2 = zm0Var.d;
        }
        return new zm0(j6, j7, j8, jB2);
    }

    public static androidx.compose.material3.b l() {
        return new androidx.compose.material3.b(ic2.b, ic2.i, ic2.g, ic2.h, ic2.f, ic2.d);
    }

    public static void m(g31 g31Var, l74 l74Var, f31 f31Var) {
        f31Var.o = -1;
        v21 v21Var = f31Var.N;
        v21 v21Var2 = f31Var.M;
        v21 v21Var3 = f31Var.K;
        v21 v21Var4 = f31Var.L;
        v21 v21Var5 = f31Var.J;
        f31Var.p = -1;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = g31Var.U[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.d;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.b;
        if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour3 && f31Var.U[0] == constraintWidget$DimensionBehaviour2) {
            int i2 = v21Var5.g;
            int iR = g31Var.r() - v21Var4.g;
            v21Var5.i = l74Var.k(v21Var5);
            v21Var4.i = l74Var.k(v21Var4);
            l74Var.d(v21Var5.i, i2);
            l74Var.d(v21Var4.i, iR);
            f31Var.o = 2;
            f31Var.a0 = i2;
            int i3 = iR - i2;
            f31Var.W = i3;
            int i4 = f31Var.d0;
            if (i3 < i4) {
                f31Var.W = i4;
            }
        }
        if (g31Var.U[1] == constraintWidget$DimensionBehaviour3 || f31Var.U[1] != constraintWidget$DimensionBehaviour2) {
            return;
        }
        int i5 = v21Var3.g;
        int iL = g31Var.l() - v21Var2.g;
        v21Var3.i = l74Var.k(v21Var3);
        v21Var2.i = l74Var.k(v21Var2);
        l74Var.d(v21Var3.i, i5);
        l74Var.d(v21Var2.i, iL);
        if (f31Var.c0 > 0 || f31Var.i0 == 8) {
            m18 m18VarK = l74Var.k(v21Var);
            v21Var.i = m18VarK;
            l74Var.d(m18VarK, f31Var.c0 + i5);
        }
        f31Var.p = 2;
        f31Var.b0 = i5;
        int i6 = iL - i5;
        f31Var.X = i6;
        int i7 = f31Var.e0;
        if (i6 < i7) {
            f31Var.X = i7;
        }
    }

    public static final float[] n(float[] fArr, float[] fArr2, float[] fArr3) {
        F(fArr, fArr2);
        F(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrA = A(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return E(fArrA, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean o(yd9 yd9Var, yd9 yd9Var2) {
        if (yd9Var == yd9Var2) {
            return true;
        }
        return Math.abs(yd9Var.a - yd9Var2.a) < 0.001f && Math.abs(yd9Var.b - yd9Var2.b) < 0.001f;
    }

    public static final boolean p(sy6 sy6Var, float f2, float f3) {
        float f4 = sy6Var.a;
        if (f2 > sy6Var.c || f4 > f2) {
            return false;
        }
        return f3 <= sy6Var.d && sy6Var.b <= f3;
    }

    public static final n21 q(nv0 nv0Var, nv0 nv0Var2) {
        if (nv0Var == nv0Var2) {
            return new l21(nv0Var, nv0Var, 1);
        }
        long j2 = nv0Var.b;
        long j3 = gv0.a;
        return (gv0.a(j2, j3) && gv0.a(nv0Var2.b, j3)) ? new m21((androidx.compose.ui.graphics.colorspace.a) nv0Var, (androidx.compose.ui.graphics.colorspace.a) nv0Var2) : new n21(nv0Var, nv0Var2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList r(ListBuilder listBuilder, ListBuilder listBuilder2) {
        js3.p(listBuilder, "f1");
        js3.p(listBuilder2, "f2");
        Iterator it = br9.x(listBuilder2).iterator();
        tq3 tq3Var = (tq3) it;
        if (!tq3Var.c) {
            throw new NoSuchElementException();
        }
        mq3 mq3Var = (mq3) it;
        int iNextInt = mq3Var.nextInt();
        if (tq3Var.c) {
            float fT = t(((lm6) listBuilder.get(0)).b, ((lm6) listBuilder2.get(iNextInt)).b);
            do {
                int iNextInt2 = mq3Var.nextInt();
                float fT2 = t(((lm6) listBuilder.get(0)).b, ((lm6) listBuilder2.get(iNextInt2)).b);
                if (Float.compare(fT, fT2) > 0) {
                    iNextInt = iNextInt2;
                    fT = fT2;
                }
            } while (tq3Var.c);
        }
        int iA = listBuilder.a();
        int iA2 = listBuilder2.a();
        ArrayList arrayListE = br9.E(listBuilder2.get(iNextInt));
        int i2 = iNextInt;
        for (int i3 = 1; i3 < iA; i3++) {
            int i4 = iNextInt - (iA - i3);
            if (i4 <= i2) {
                i4 += iA2;
            }
            Iterator it2 = new uq3(i2 + 1, i4, 1).iterator();
            tq3 tq3Var2 = (tq3) it2;
            if (!tq3Var2.c) {
                throw new NoSuchElementException();
            }
            mq3 mq3Var2 = (mq3) it2;
            int iNextInt3 = mq3Var2.nextInt();
            if (tq3Var2.c) {
                float fT3 = t(((lm6) listBuilder.get(i3)).b, ((lm6) listBuilder2.get(iNextInt3 % iA2)).b);
                do {
                    int iNextInt4 = mq3Var2.nextInt();
                    float fT4 = t(((lm6) listBuilder.get(i3)).b, ((lm6) listBuilder2.get(iNextInt4 % iA2)).b);
                    if (Float.compare(fT3, fT4) > 0) {
                        iNextInt3 = iNextInt4;
                        fT3 = fT4;
                    }
                } while (tq3Var2.c);
            }
            i2 = iNextInt3;
            arrayListE.add(listBuilder2.get(i2 % iA2));
        }
        return arrayListE;
    }

    public static final boolean s(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final float t(e92 e92Var, e92 e92Var2) {
        js3.p(e92Var, "f1");
        List list = e92Var.a;
        js3.p(e92Var2, "f2");
        List list2 = e92Var2.a;
        if ((e92Var instanceof c92) && (e92Var2 instanceof c92) && ((c92) e92Var).d != ((c92) e92Var2).d) {
            return Float.MAX_VALUE;
        }
        float fA = (((h81) kotlin.collections.a.u0(list)).a() + ((h81) kotlin.collections.a.o0(list)).a[0]) / 2.0f;
        float fB = (((h81) kotlin.collections.a.u0(list)).b() + ((h81) kotlin.collections.a.o0(list)).a[1]) / 2.0f;
        float fA2 = (((h81) kotlin.collections.a.u0(list2)).a() + ((h81) kotlin.collections.a.o0(list2)).a[0]) / 2.0f;
        float f2 = fA - fA2;
        float fB2 = fB - ((((h81) kotlin.collections.a.u0(list2)).b() + ((h81) kotlin.collections.a.o0(list2)).a[1]) / 2.0f);
        return (fB2 * fB2) + (f2 * f2);
    }

    public static final hx4 u(hx4 hx4Var, boolean z, ab5 ab5Var) {
        return hx4Var.d(z ? new zg2(ab5Var) : ex4.b);
    }

    public static Drawable v(Context context, int i2) {
        return u67.d().f(context, i2);
    }

    public static final float w(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = ti8.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : km3.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float x(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = ti8.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? km3.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static int y(ao0 ao0Var) throws ParserException {
        int i2 = ao0Var.i(4);
        if (i2 == 15) {
            if (ao0Var.b() >= 24) {
                return ao0Var.i(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (i2 < 13) {
            return a[i2];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(gv1 gv1Var) {
        if (((gx4) gv1Var).a.n) {
            y40.E(gv1Var, 1).Q0();
        }
    }

    public abstract void I(vp7 vp7Var, qi4 qi4Var);

    public abstract re8 M(String str);
}
