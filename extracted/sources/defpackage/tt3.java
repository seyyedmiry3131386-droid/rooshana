package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.compose.ui.window.d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import com.google.android.material.appbar.MaterialToolbar;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.myket.player.domain.models.PlayerMovieData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tt3 {
    public static final fz1 a;
    public static final hy2 b;
    public static final ea0 c = new ea0();
    public static final uc3 d = new uc3(2);
    public static final ek6 e = new ek6(11);
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static Boolean h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    static {
        int i2 = 29;
        a = new fz1(i2);
        b = new hy2(i2);
    }

    public static byte[] A(String str) {
        js3.p(str, "hexValue");
        byte[] bArr = new byte[str.length() / 2];
        int i2 = 0;
        int iK = wq2.K(0, str.length() - 1, 2);
        if (iK >= 0) {
            while (true) {
                int i3 = i2 + 2;
                String strSubstring = str.substring(i2, i3);
                js3.o(strSubstring, "substring(...)");
                js3.q(16);
                bArr[i2 / 2] = (byte) Integer.parseInt(strSubstring, 16);
                if (i2 == iK) {
                    break;
                }
                i2 = i3;
            }
        }
        return bArr;
    }

    public static void B(int i2, fa0 fa0Var, f31 f31Var, boolean z) {
        v21 v21Var;
        v21 v21Var2;
        boolean z2;
        v21 v21Var3;
        v21 v21Var4;
        if (f31Var.m) {
            return;
        }
        if (!(f31Var instanceof g31) && f31Var.A() && j(f31Var)) {
            g31.W(f31Var, fa0Var, new ea0());
        }
        v21 v21VarJ = f31Var.j(ConstraintAnchor$Type.a);
        v21 v21VarJ2 = f31Var.j(ConstraintAnchor$Type.c);
        int iD = v21VarJ.d();
        int iD2 = v21VarJ2.d();
        HashSet<v21> hashSet = v21VarJ.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.c;
        if (hashSet != null && v21VarJ.c) {
            for (v21 v21Var5 : hashSet) {
                f31 f31Var2 = v21Var5.d;
                int i3 = i2 + 1;
                boolean zJ = j(f31Var2);
                v21 v21Var6 = f31Var2.J;
                v21 v21Var7 = f31Var2.L;
                if (f31Var2.A() && zJ) {
                    z2 = true;
                    g31.W(f31Var2, fa0Var, new ea0());
                } else {
                    z2 = true;
                }
                boolean z3 = ((v21Var5 == v21Var6 && (v21Var4 = v21Var7.f) != null && v21Var4.c) || (v21Var5 == v21Var7 && (v21Var3 = v21Var6.f) != null && v21Var3.c)) ? z2 : false;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = f31Var2.U[0];
                if (constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour || zJ) {
                    if (!f31Var2.A()) {
                        if (v21Var5 == v21Var6 && v21Var7.f == null) {
                            int iE = v21Var6.e() + iD;
                            f31Var2.K(iE, f31Var2.r() + iE);
                            B(i3, fa0Var, f31Var2, z);
                        } else if (v21Var5 == v21Var7 && v21Var6.f == null) {
                            int iE2 = iD - v21Var7.e();
                            f31Var2.K(iE2 - f31Var2.r(), iE2);
                            B(i3, fa0Var, f31Var2, z);
                        } else if (z3 && !f31Var2.y()) {
                            I(i3, fa0Var, f31Var2, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour && f31Var2.v >= 0 && f31Var2.u >= 0 && (f31Var2.i0 == 8 || (f31Var2.r == 0 && f31Var2.Y == 0.0f))) {
                    if (!f31Var2.y() && !f31Var2.G && z3 && !f31Var2.y()) {
                        J(i3, f31Var, fa0Var, f31Var2, z);
                    }
                }
            }
        }
        if (f31Var instanceof aw2) {
            return;
        }
        HashSet<v21> hashSet2 = v21VarJ2.a;
        if (hashSet2 != null && v21VarJ2.c) {
            for (v21 v21Var8 : hashSet2) {
                f31 f31Var3 = v21Var8.d;
                int i4 = i2 + 1;
                boolean zJ2 = j(f31Var3);
                v21 v21Var9 = f31Var3.J;
                v21 v21Var10 = f31Var3.L;
                if (f31Var3.A() && zJ2) {
                    g31.W(f31Var3, fa0Var, new ea0());
                }
                boolean z4 = (v21Var8 == v21Var9 && (v21Var2 = v21Var10.f) != null && v21Var2.c) || (v21Var8 == v21Var10 && (v21Var = v21Var9.f) != null && v21Var.c);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = f31Var3.U[0];
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour || zJ2) {
                    if (!f31Var3.A()) {
                        if (v21Var8 == v21Var9 && v21Var10.f == null) {
                            int iE3 = v21Var9.e() + iD2;
                            f31Var3.K(iE3, f31Var3.r() + iE3);
                            B(i4, fa0Var, f31Var3, z);
                        } else if (v21Var8 == v21Var10 && v21Var9.f == null) {
                            int iE4 = iD2 - v21Var10.e();
                            f31Var3.K(iE4 - f31Var3.r(), iE4);
                            B(i4, fa0Var, f31Var3, z);
                        } else if (z4 && !f31Var3.y()) {
                            I(i4, fa0Var, f31Var3, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour && f31Var3.v >= 0 && f31Var3.u >= 0) {
                    if (f31Var3.i0 == 8 || (f31Var3.r == 0 && f31Var3.Y == 0.0f)) {
                        if (!f31Var3.y() && !f31Var3.G && z4 && !f31Var3.y()) {
                            J(i4, f31Var, fa0Var, f31Var3, z);
                        }
                    }
                }
            }
        }
        f31Var.m = true;
    }

    public static hx4 C(hx4 hx4Var, boolean z, hx4 hx4Var2) {
        if (!z) {
            hx4Var2 = ex4.b;
        }
        return hx4Var.d(hx4Var2);
    }

    public static qa5 D(oa5 oa5Var) {
        return new qa5(oa5Var, oa5Var.entrySet().iterator());
    }

    public static final hx4 E(r34 r34Var, qm5 qm5Var, Orientation orientation) {
        return new n24(r34Var, qm5Var, orientation);
    }

    public static SpannableString H(Resources resources, CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableString.length(), 17);
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.a.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(sj8.b().m), 0, spannableString.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 17);
        return spannableString;
    }

    public static void I(int i2, fa0 fa0Var, f31 f31Var, boolean z) {
        float f2 = f31Var.f0;
        v21 v21Var = f31Var.J;
        int iD = v21Var.f.d();
        v21 v21Var2 = f31Var.L;
        int iD2 = v21Var2.f.d();
        int iE = v21Var.e() + iD;
        int iE2 = iD2 - v21Var2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = f31Var.r();
        int i3 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i3 = (iD - iD2) - iR;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iR;
        if (iD > iD2) {
            i5 = i4 - iR;
        }
        f31Var.K(i4, i5);
        B(i2 + 1, fa0Var, f31Var, z);
    }

    public static void J(int i2, f31 f31Var, fa0 fa0Var, f31 f31Var2, boolean z) {
        float f2 = f31Var2.f0;
        v21 v21Var = f31Var2.J;
        int iE = v21Var.e() + v21Var.f.d();
        v21 v21Var2 = f31Var2.L;
        int iD = v21Var2.f.d() - v21Var2.e();
        if (iD >= iE) {
            int iR = f31Var2.r();
            if (f31Var2.i0 != 8) {
                int i3 = f31Var2.r;
                if (i3 == 2) {
                    iR = (int) (f31Var2.f0 * 0.5f * (f31Var instanceof g31 ? f31Var.r() : f31Var.V.r()));
                } else if (i3 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(f31Var2.u, iR);
                int i4 = f31Var2.v;
                if (i4 > 0) {
                    iR = Math.min(i4, iR);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iR)) + 0.5f));
            f31Var2.K(i5, iR + i5);
            B(i2 + 1, fa0Var, f31Var2, z);
        }
    }

    public static void K(int i2, fa0 fa0Var, f31 f31Var) {
        float f2 = f31Var.g0;
        v21 v21Var = f31Var.K;
        int iD = v21Var.f.d();
        v21 v21Var2 = f31Var.M;
        int iD2 = v21Var2.f.d();
        int iE = v21Var.e() + iD;
        int iE2 = iD2 - v21Var2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = f31Var.l();
        int i3 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i3 = (iD - iD2) - iL;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iL;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iL;
        }
        f31Var.L(i5, i6);
        N(i2 + 1, fa0Var, f31Var);
    }

    public static void L(int i2, f31 f31Var, fa0 fa0Var, f31 f31Var2) {
        float f2 = f31Var2.g0;
        v21 v21Var = f31Var2.K;
        int iE = v21Var.e() + v21Var.f.d();
        v21 v21Var2 = f31Var2.M;
        int iD = v21Var2.f.d() - v21Var2.e();
        if (iD >= iE) {
            int iL = f31Var2.l();
            if (f31Var2.i0 != 8) {
                int i3 = f31Var2.s;
                if (i3 == 2) {
                    iL = (int) (f2 * 0.5f * (f31Var instanceof g31 ? f31Var.l() : f31Var.V.l()));
                } else if (i3 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(f31Var2.x, iL);
                int i4 = f31Var2.y;
                if (i4 > 0) {
                    iL = Math.min(i4, iL);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iL)) + 0.5f));
            f31Var2.L(i5, iL + i5);
            N(i2 + 1, fa0Var, f31Var2);
        }
    }

    public static final long M(long j2) {
        return (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void N(int i2, fa0 fa0Var, f31 f31Var) {
        v21 v21Var;
        v21 v21Var2;
        v21 v21Var3;
        v21 v21Var4;
        if (f31Var.n) {
            return;
        }
        if (!(f31Var instanceof g31) && f31Var.A() && j(f31Var)) {
            g31.W(f31Var, fa0Var, new ea0());
        }
        v21 v21VarJ = f31Var.j(ConstraintAnchor$Type.b);
        v21 v21VarJ2 = f31Var.j(ConstraintAnchor$Type.d);
        int iD = v21VarJ.d();
        int iD2 = v21VarJ2.d();
        HashSet<v21> hashSet = v21VarJ.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.c;
        if (hashSet != null && v21VarJ.c) {
            for (v21 v21Var5 : hashSet) {
                f31 f31Var2 = v21Var5.d;
                int i3 = i2 + 1;
                boolean zJ = j(f31Var2);
                v21 v21Var6 = f31Var2.K;
                v21 v21Var7 = f31Var2.M;
                if (f31Var2.A() && zJ) {
                    g31.W(f31Var2, fa0Var, new ea0());
                }
                boolean z = (v21Var5 == v21Var6 && (v21Var4 = v21Var7.f) != null && v21Var4.c) || (v21Var5 == v21Var7 && (v21Var3 = v21Var6.f) != null && v21Var3.c);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = f31Var2.U[1];
                if (constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour || zJ) {
                    if (!f31Var2.A()) {
                        if (v21Var5 == v21Var6 && v21Var7.f == null) {
                            int iE = v21Var6.e() + iD;
                            f31Var2.L(iE, f31Var2.l() + iE);
                            N(i3, fa0Var, f31Var2);
                        } else if (v21Var5 == v21Var7 && v21Var6.f == null) {
                            int iE2 = iD - v21Var7.e();
                            f31Var2.L(iE2 - f31Var2.l(), iE2);
                            N(i3, fa0Var, f31Var2);
                        } else if (z && !f31Var2.z()) {
                            K(i3, fa0Var, f31Var2);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour && f31Var2.y >= 0 && f31Var2.x >= 0 && (f31Var2.i0 == 8 || (f31Var2.s == 0 && f31Var2.Y == 0.0f))) {
                    if (!f31Var2.z() && !f31Var2.G && z && !f31Var2.z()) {
                        L(i3, f31Var, fa0Var, f31Var2);
                    }
                }
            }
        }
        char c2 = 1;
        if (f31Var instanceof aw2) {
            return;
        }
        HashSet<v21> hashSet2 = v21VarJ2.a;
        if (hashSet2 != null && v21VarJ2.c) {
            for (v21 v21Var8 : hashSet2) {
                f31 f31Var3 = v21Var8.d;
                int i4 = i2 + 1;
                boolean zJ2 = j(f31Var3);
                v21 v21Var9 = f31Var3.K;
                v21 v21Var10 = f31Var3.M;
                if (f31Var3.A() && zJ2) {
                    g31.W(f31Var3, fa0Var, new ea0());
                }
                boolean z2 = (v21Var8 == v21Var9 && (v21Var2 = v21Var10.f) != null && v21Var2.c) || (v21Var8 == v21Var10 && (v21Var = v21Var9.f) != null && v21Var.c);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = f31Var3.U[1];
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour || zJ2) {
                    if (!f31Var3.A()) {
                        if (v21Var8 == v21Var9 && v21Var10.f == null) {
                            int iE3 = v21Var9.e() + iD2;
                            f31Var3.L(iE3, f31Var3.l() + iE3);
                            N(i4, fa0Var, f31Var3);
                        } else if (v21Var8 == v21Var10 && v21Var9.f == null) {
                            int iE4 = iD2 - v21Var10.e();
                            f31Var3.L(iE4 - f31Var3.l(), iE4);
                            N(i4, fa0Var, f31Var3);
                        } else if (z2 && !f31Var3.z()) {
                            K(i4, fa0Var, f31Var3);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour && f31Var3.y >= 0 && f31Var3.x >= 0 && (f31Var3.i0 == 8 || (f31Var3.s == 0 && f31Var3.Y == 0.0f))) {
                    if (!f31Var3.z() && !f31Var3.G && z2 && !f31Var3.z()) {
                        L(i4, f31Var, fa0Var, f31Var3);
                    }
                }
            }
        }
        v21 v21VarJ3 = f31Var.j(ConstraintAnchor$Type.e);
        if (v21VarJ3.a != null && v21VarJ3.c) {
            int iD3 = v21VarJ3.d();
            for (v21 v21Var11 : v21VarJ3.a) {
                f31 f31Var4 = v21Var11.d;
                int i5 = i2 + 1;
                boolean zJ3 = j(f31Var4);
                v21 v21Var12 = f31Var4.N;
                if (f31Var4.A() && zJ3) {
                    g31.W(f31Var4, fa0Var, new ea0());
                }
                if (f31Var4.U[c2] != constraintWidget$DimensionBehaviour || zJ3) {
                    if (f31Var4.A()) {
                        continue;
                    } else if (v21Var11 == v21Var12) {
                        int iE5 = v21Var11.e() + iD3;
                        if (f31Var4.E) {
                            int i6 = iE5 - f31Var4.c0;
                            int i7 = f31Var4.X + i6;
                            f31Var4.b0 = i6;
                            f31Var4.K.l(i6);
                            f31Var4.M.l(i7);
                            v21Var12.l(iE5);
                            f31Var4.l = c2;
                        }
                        N(i5, fa0Var, f31Var4);
                    }
                }
                c2 = 1;
            }
        }
        f31Var.n = true;
    }

    public static final void a(tr5 tr5Var, qd qdVar, a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? qz0Var.f(tr5Var) : qz0Var.h(tr5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.f(qdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.h(aVar) ? 256 : 128;
        }
        boolean z = true;
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !qz0Var.f(tr5Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM = qz0Var.M();
            if (z3 || objM == jz0.a) {
                objM = new pw2(qdVar, tr5Var);
                qz0Var.l0(objM);
            }
            d.a((pw2) objM, null, new gi6(false, SecureFlagPolicy.a, false), aVar, qz0Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i2, 2, tr5Var, qdVar, aVar);
        }
    }

    public static final void b(hx4 hx4Var, float f2, long j2, qz0 qz0Var, int i2, int i3) {
        int i4;
        qz0Var.c0(75144485);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = i2 | (qz0Var.f(hx4Var) ? 4 : 2);
        }
        int i6 = i4 | (qz0Var.c(f2) ? 32 : 16) | (qz0Var.e(j2) ? 256 : 128);
        boolean z = true;
        if (qz0Var.R(i6 & 1, (i6 & 147) != 146)) {
            qz0Var.W();
            if ((i2 & 1) != 0 && !qz0Var.z()) {
                qz0Var.U();
            } else if (i5 != 0) {
                hx4Var = ex4.b;
            }
            qz0Var.r();
            hx4 hx4VarD = b.d(b.c(hx4Var, 1.0f), f2);
            boolean z2 = (i6 & 112) == 32;
            if ((((i6 & 896) ^ 384) <= 256 || !qz0Var.e(j2)) && (i6 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM = qz0Var.M();
            if (z3 || objM == jz0.a) {
                objM = new kq1(f2, 0, j2);
                qz0Var.l0(objM);
            }
            ml9.c(hx4VarD, (dp2) objM, qz0Var, 0);
        } else {
            qz0Var.U();
        }
        hx4 hx4Var2 = hx4Var;
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new lq1(hx4Var2, f2, j2, i2, i3, 0);
        }
    }

    public static final void c(hx4 hx4Var, boolean z, xc6 xc6Var, PlayerMovieData playerMovieData, dl5 dl5Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        PlayerMovieData playerMovieData2;
        dl5 dl5Var2;
        hx4 hx4Var2;
        dv dvVar;
        ex4 ex4Var;
        boolean z2;
        boolean z3;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-1409330917);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= qz0Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.f(xc6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var2.h(playerMovieData) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? qz0Var2.f(dl5Var) : qz0Var2.h(dl5Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= qz0Var2.h(dp2Var) ? 131072 : 65536;
        }
        if (qz0Var2.R(i3 & 1, (74899 & i3) != 74898)) {
            zu0 zu0Var = new zu0(zu0.g);
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            g74 g74VarD = fv.D(br9.C(zu0Var, new zu0(((tj8) objJ).J.e)));
            ex4 ex4Var2 = ex4.b;
            hx4 hx4VarC = yh0.C(rq4.e(b.c(ex4Var2, 1.0f), g74VarD), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_12, qz0Var2), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_16, qz0Var2));
            bb0 bb0Var = eq.n;
            int i4 = 6;
            if (z) {
                qz0Var2.a0(-2071280148);
                qz0Var2.q(false);
                dvVar = jv.d;
            } else {
                qz0Var2.a0(-2071244374);
                ev evVar = new ev(ml9.q(hq6.space_8, qz0Var2), false, new ae(i4));
                qz0Var2.q(false);
                dvVar = evVar;
            }
            cb7 cb7VarA = bb7.a(dvVar, bb0Var, qz0Var2, 48);
            long j2 = qz0Var2.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarC);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, androidx.compose.ui.node.d.f, cb7VarA);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i5), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var2, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.d, hx4VarC2);
            av avVar = jz0.a;
            if (z) {
                qz0Var2.a0(1374662734);
                String strF = ln2.f(vs6.player_unlock, qz0Var2);
                wy5 wy5Var = ci0.a;
                Object objJ2 = qz0Var2.j(u58Var);
                js3.m(objJ2);
                long j3 = ((tj8) objJ2).J.a;
                Object objJ3 = qz0Var2.j(u58Var);
                js3.m(objJ3);
                ex4Var = ex4Var2;
                bi0 bi0VarA = ci0.a(((tj8) objJ3).I.a, j3, 0L, 0L, qz0Var, 12);
                Integer numValueOf = Integer.valueOf(br6.player_ic_lock);
                boolean z4 = (i3 & 458752) == 131072;
                Object objM = qz0Var.M();
                if (z4 || objM == avVar) {
                    objM = new ba(6, dp2Var);
                    qz0Var.l0(objM);
                }
                wu8.a(null, strF, bi0VarA, numValueOf, (bp2) objM, qz0Var, 0, 1);
                qz0Var2 = qz0Var;
                qz0Var2.q(false);
                playerMovieData2 = playerMovieData;
                dl5Var2 = dl5Var;
                z3 = true;
            } else {
                ex4Var = ex4Var2;
                qz0Var2.a0(1375132043);
                int i6 = i3 & 57344;
                js3.b(null, xc6Var, playerMovieData, dp2Var, dl5Var, qz0Var2, ((i3 >> 3) & 1008) | ((i3 >> 6) & 7168) | i6);
                playerMovieData2 = playerMovieData;
                if (playerMovieData2.b()) {
                    qz0Var2.a0(1375456582);
                    String strF2 = ln2.f(vs6.player_movie_change_episode_title, qz0Var2);
                    wy5 wy5Var2 = ci0.a;
                    Object objJ4 = qz0Var2.j(u58Var);
                    js3.m(objJ4);
                    long j4 = ((tj8) objJ4).I.a;
                    Object objJ5 = qz0Var2.j(u58Var);
                    js3.m(objJ5);
                    dl5Var2 = dl5Var;
                    bi0 bi0VarA2 = ci0.a(((tj8) objJ5).l, j4, 0L, 0L, qz0Var, 12);
                    qz0Var2 = qz0Var;
                    Integer numValueOf2 = Integer.valueOf(br6.player_ic_playlist);
                    boolean zH = qz0Var2.h(playerMovieData2) | (i6 == 16384 || ((i3 & 32768) != 0 && qz0Var2.h(dl5Var2)));
                    Object objM2 = qz0Var2.M();
                    if (zH || objM2 == avVar) {
                        z3 = true;
                        objM2 = new ty(dl5Var2, playerMovieData2, 1 == true ? 1 : 0);
                        qz0Var2.l0(objM2);
                    } else {
                        z3 = true;
                    }
                    wu8.a(null, strF2, bi0VarA2, numValueOf2, (bp2) objM2, qz0Var2, 0, 1);
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                    dl5Var2 = dl5Var;
                    qz0Var2.a0(1370430955);
                }
                qz0Var2.q(z2);
                qz0Var2.q(z2);
            }
            qz0Var2.q(z3);
            hx4Var2 = ex4Var;
        } else {
            playerMovieData2 = playerMovieData;
            dl5Var2 = dl5Var;
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new b04(hx4Var2, z, xc6Var, playerMovieData2, dl5Var2, dp2Var, i2, 0);
        }
    }

    public static final void d(int i2, qz0 qz0Var, bp2 bp2Var, dp2 dp2Var, hx4 hx4Var, dl5 dl5Var, xc6 xc6Var, wd6 wd6Var, PlayerMovieData playerMovieData) {
        int i3;
        boolean z;
        ex4 ex4Var;
        qz0 qz0Var2;
        qz0 qz0Var3 = qz0Var;
        js3.p(wd6Var, "playerControllerState");
        boolean z2 = wd6Var.g;
        js3.p(playerMovieData, "playerMovieData");
        js3.p(xc6Var, "playerConfig");
        js3.p(bp2Var, "progressBarTimeState");
        js3.p(dl5Var, "navigationStateManager");
        qz0Var3.c0(811524621);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var3.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var3.f(wd6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var3.h(playerMovieData) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var3.f(xc6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? qz0Var3.f(dl5Var) : qz0Var3.h(dl5Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var3.h(dp2Var) ? 1048576 : 524288;
        }
        if (qz0Var3.R(i3 & 1, (599187 & i3) != 599186)) {
            hx4 hx4VarC = b.c(hx4Var, 1.0f);
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var3, 0);
            long j2 = qz0Var3.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var3.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var3, hx4VarC);
            hz0.d0.getClass();
            bp2 bp2Var2 = androidx.compose.ui.node.d.b;
            qz0Var3.e0();
            if (qz0Var3.S) {
                qz0Var3.k(bp2Var2);
            } else {
                qz0Var3.o0();
            }
            ia7.o(qz0Var3, androidx.compose.ui.node.d.f, vv0VarA);
            ia7.o(qz0Var3, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var3, Integer.valueOf(i4), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var3, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var3, androidx.compose.ui.node.d.d, hx4VarC2);
            boolean z3 = wd6Var.f;
            ex4 ex4Var2 = ex4.b;
            if (!z3 || z2) {
                qz0Var3.a0(-311554895);
                z = false;
                ex4Var = ex4Var2;
                yh0.h(yh0.B(ex4Var2, ml9.q(hq6.space_16, qz0Var3), 0.0f, 2), bp2Var, playerMovieData.a.k, dp2Var, 0L, 0L, 0L, 0L, 0.0f, 0.0f, qz0Var3, (i3 >> 9) & 7280);
                qz0Var2 = qz0Var3;
                qz0Var2.q(false);
            } else {
                qz0Var3.a0(-314105141);
                qz0Var3.q(false);
                z = false;
                ex4Var = ex4Var2;
                qz0Var2 = qz0Var3;
            }
            if (z2) {
                qz0 qz0Var4 = qz0Var2;
                boolean z4 = z;
                qz0Var3 = qz0Var4;
                qz0Var3.a0(-310944505);
                z27.a(qz0Var3, b.d(ex4Var, ml9.q(hq6.bottom_bar_height_landscape, qz0Var3)));
                qz0Var3.q(z4);
            } else {
                qz0Var2.a0(-311192970);
                int i5 = i3 >> 3;
                int i6 = ((i3 << 3) & 7168) | (i5 & 896) | (57344 & i5) | (i5 & 458752);
                qz0 qz0Var5 = qz0Var2;
                boolean z5 = z;
                qz0Var3 = qz0Var5;
                c(null, wd6Var.f, xc6Var, playerMovieData, dl5Var, dp2Var, qz0Var3, i6);
                qz0Var3.q(z5);
            }
            qz0Var3.q(true);
        } else {
            qz0Var3.U();
        }
        my6 my6VarS = qz0Var3.s();
        if (my6VarS != null) {
            my6VarS.d = new a04(hx4Var, wd6Var, playerMovieData, xc6Var, bp2Var, dl5Var, dp2Var, i2);
        }
    }

    public static final void e(hx4 hx4Var, String str, wd6 wd6Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        qz0 qz0Var2 = qz0Var;
        js3.p(str, "hintText");
        js3.p(wd6Var, "playerControllerState");
        qz0Var2.c0(-499001166);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= qz0Var2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.f(wd6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var2.h(dp2Var) ? 2048 : 1024;
        }
        int i4 = i3;
        if (qz0Var2.R(i4 & 1, (i4 & 1171) != 1170)) {
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.h(Boolean.FALSE);
                qz0Var2.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            Object objM2 = qz0Var2.M();
            if (objM2 == avVar) {
                objM2 = new v8(wb5Var, 7);
                qz0Var2.l0(objM2);
            }
            ex4 ex4Var = ex4.b;
            hx4 hx4VarH = br9.H(ex4Var, (bp2) objM2);
            boolean z = (i4 & 896) == 256;
            Object objM3 = qz0Var2.M();
            if (z || objM3 == avVar) {
                objM3 = new xv3(wb5Var, wd6Var, 9);
                qz0Var2.l0(objM3);
            }
            bp2 bp2Var = (bp2) objM3;
            lt8 lt8VarE0 = y97.e0(700, wd6Var.e ? 0 : 3000, null, 4);
            boolean z2 = (i4 & 7168) == 2048;
            Object objM4 = qz0Var2.M();
            int i5 = 3;
            if (z2 || objM4 == avVar) {
                objM4 = new y8(i5, dp2Var);
                qz0Var2.l0(objM4);
            }
            hx4 hx4VarB = yh0.B(ix4.d(hx4VarH, bp2Var, lt8VarE0, (dp2) objM4, qz0Var2, 0, 0), ml9.q(hq6.space_8, qz0Var2), 0.0f, 2);
            float fQ = ml9.q(hq6.size_1, qz0Var2);
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarA = yh0.A(hx4VarB.d(new me0(fQ, new k18(((tj8) objJ).I.a), la7.a)), ml9.q(hq6.space_12, qz0Var2), ml9.q(hq6.space_4, qz0Var2));
            bb0 bb0Var = eq.m;
            fv fvVar = jv.a;
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_4, qz0Var2)), bb0Var, qz0Var2, 48);
            long j2 = qz0Var2.T;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var2 = androidx.compose.ui.node.d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, androidx.compose.ui.node.d.f, cb7VarA);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i6), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var2, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.d, hx4VarC);
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            mi8.b(str, null, ((tj8) objJ2).I.a, 0L, 0L, null, 0L, 0, false, 0, 0, ((wf5) qz0Var2.j(aw8.a)).i, qz0Var, (i4 >> 3) & 14, 0, 131066);
            qz0Var2 = qz0Var;
            g16 g16VarG = rf0.G(br6.player_ic_wifi, qz0Var2);
            hx4 hx4VarI = b.i(ex4Var, ml9.q(hq6.size_16, qz0Var2));
            Object objJ3 = qz0Var2.j(u58Var);
            js3.m(objJ3);
            kh3.a(g16VarG, hx4VarI, ((tj8) objJ3).I.a, qz0Var2, 56, 0);
            qz0Var2.q(true);
            hx4Var2 = ex4Var;
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(hx4Var2, str, wd6Var, dp2Var, i2, 7);
        }
    }

    public static final void f(final hx4 hx4Var, final String str, final boolean z, qz0 qz0Var, final int i2) {
        qz0 qz0Var2 = qz0Var;
        js3.p(str, "title");
        qz0Var2.c0(-283154420);
        int i3 = i2 | (qz0Var2.f(hx4Var) ? 4 : 2) | (qz0Var2.f(str) ? 32 : 16) | (qz0Var2.g(z) ? 256 : 128);
        if (qz0Var2.R(i3 & 1, (i3 & 147) != 146)) {
            hx4 hx4VarA = yh0.A(b.c(hx4Var, 1.0f), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_8, qz0Var2));
            fv fvVar = jv.a;
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var2)), eq.m, qz0Var2, 48);
            long j2 = qz0Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, androidx.compose.ui.node.d.f, cb7VarA);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i4), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var2, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.d, hx4VarC);
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            long j3 = ((tj8) objJ).g;
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            long j4 = ((tj8) objJ2).k;
            long j5 = zu0.h;
            lv0 lv0Var = (lv0) qz0Var2.j(mv0.a);
            mu6 mu6Var = lv0Var.Z;
            if (mu6Var == null) {
                mu6Var = new mu6(mv0.c(lv0Var, vu6.d), mv0.c(lv0Var, vu6.e), zu0.b(0.38f, mv0.c(lv0Var, vu6.a)), zu0.b(0.38f, mv0.c(lv0Var, vu6.b)));
                lv0Var.Z = mu6Var;
            }
            if (j3 == 16) {
                j3 = mu6Var.a;
            }
            long j6 = j3;
            if (j4 == 16) {
                j4 = mu6Var.b;
            }
            long j7 = j4;
            long j8 = j5 != 16 ? j5 : mu6Var.c;
            if (j5 == 16) {
                j5 = mu6Var.d;
            }
            su6.a(z, null, false, new mu6(j6, j7, j8, j5), qz0Var2, ((i3 >> 6) & 14) | 48);
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).g;
            Object objJ3 = qz0Var2.j(u58Var);
            js3.m(objJ3);
            mi8.b(str, null, ((tj8) objJ3).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, (i3 >> 3) & 14, 0, 131066);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(str, z, i2) { // from class: pu6
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(1);
                    tt3.f(this.a, this.b, this.c, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void g(final tr5 tr5Var, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j2, final float f2, final zc8 zc8Var, qz0 qz0Var, final int i2) {
        int i3;
        final long j3;
        int i4;
        long j4;
        final boolean z3;
        qz0Var.c0(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? qz0Var.f(tr5Var) : qz0Var.h(tr5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var.d(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var.f(zc8Var) ? 1048576 : 524288;
        }
        if (qz0Var.R(i3 & 1, (533651 & i3) != 533650)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                qz0Var.U();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            qz0Var.r();
            if (z) {
                float f3 = an7.a;
                z3 = (resolvedTextDirection == ResolvedTextDirection.a && !z2) || (resolvedTextDirection == ResolvedTextDirection.b && z2);
            } else {
                float f4 = an7.a;
                z3 = !((resolvedTextDirection == ResolvedTextDirection.a && !z2) || (resolvedTextDirection == ResolvedTextDirection.b && z2));
            }
            za0 za0Var = z3 ? yh0.b : yh0.a;
            int i5 = i4 & 14;
            boolean zG = (i5 == 4 || ((i4 & 8) != 0 && qz0Var.h(tr5Var))) | ((i4 & 112) == 32) | qz0Var.g(z3);
            Object objM = qz0Var.M();
            if (zG || objM == jz0.a) {
                objM = new th(tr5Var, z, z3);
                qz0Var.l0(objM);
            }
            final hx4 hx4VarA = hn7.a(zc8Var, false, (dp2) objM);
            final v69 v69Var = (v69) qz0Var.j(l.s);
            long j5 = j4;
            za0 za0Var2 = za0Var;
            j3 = j5;
            a(tr5Var, za0Var2, s7.X(1365123137, new qp2() { // from class: uh
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    qz0 qz0Var2 = (qz0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        um umVarA = l.s.a(v69Var);
                        final long j6 = j3;
                        final boolean z4 = z3;
                        final hx4 hx4Var = hx4VarA;
                        final tr5 tr5Var2 = tr5Var;
                        zk8.b(umVarA, s7.X(1260045569, new qp2() { // from class: wh
                            @Override // defpackage.qp2
                            public final Object invoke(Object obj3, Object obj4) {
                                qz0 qz0Var3 = (qz0) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (qz0Var3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j7 = j6;
                                    boolean z5 = z4;
                                    hx4 hx4Var2 = hx4Var;
                                    final tr5 tr5Var3 = tr5Var2;
                                    av avVar = jz0.a;
                                    if (j7 != 9205357640488583168L) {
                                        qz0Var3.a0(3458246);
                                        dv dvVar = z5 ? tt3.b : tt3.a;
                                        hx4 hx4VarH = b.h(hx4Var2, Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), 0.0f, 0.0f, 12);
                                        cb7 cb7VarA = bb7.a(dvVar, eq.l, qz0Var3, 0);
                                        long j8 = qz0Var3.T;
                                        int i6 = (int) (j8 ^ (j8 >>> 32));
                                        j56 j56VarL = qz0Var3.l();
                                        hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var3, hx4VarH);
                                        hz0.d0.getClass();
                                        bp2 bp2Var = androidx.compose.ui.node.d.b;
                                        qz0Var3.e0();
                                        if (qz0Var3.S) {
                                            qz0Var3.k(bp2Var);
                                        } else {
                                            qz0Var3.o0();
                                        }
                                        ia7.o(qz0Var3, androidx.compose.ui.node.d.f, cb7VarA);
                                        ia7.o(qz0Var3, androidx.compose.ui.node.d.e, j56VarL);
                                        ia7.g(qz0Var3, Integer.valueOf(i6), androidx.compose.ui.node.d.g);
                                        ia7.n(qz0Var3, androidx.compose.ui.node.d.h);
                                        ia7.o(qz0Var3, androidx.compose.ui.node.d.d, hx4VarC);
                                        boolean zH = qz0Var3.h(tr5Var3);
                                        Object objM2 = qz0Var3.M();
                                        if (zH || objM2 == avVar) {
                                            final int i7 = 0;
                                            objM2 = new bp2() { // from class: xh
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    switch (i7) {
                                                        case 0:
                                                            return Boolean.valueOf((tr5Var3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((tr5Var3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            qz0Var3.l0(objM2);
                                        }
                                        tt3.h(6, qz0Var3, (bp2) objM2, ex4.b, z5);
                                        qz0Var3.q(true);
                                        qz0Var3.q(false);
                                    } else {
                                        qz0Var3.a0(4389176);
                                        boolean zH2 = qz0Var3.h(tr5Var3);
                                        Object objM3 = qz0Var3.M();
                                        if (zH2 || objM3 == avVar) {
                                            final int i8 = 1;
                                            objM3 = new bp2() { // from class: xh
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    switch (i8) {
                                                        case 0:
                                                            return Boolean.valueOf((tr5Var3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((tr5Var3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            qz0Var3.l0(objM3);
                                        }
                                        tt3.h(0, qz0Var3, (bp2) objM3, hx4Var2, z5);
                                        qz0Var3.q(false);
                                    }
                                } else {
                                    qz0Var3.U();
                                }
                                return tx8.a;
                            }
                        }, qz0Var2), qz0Var2, 56);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, i5 | 384);
        } else {
            qz0Var.U();
            j3 = j2;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            final long j6 = j3;
            my6VarS.d = new qp2() { // from class: vh
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tt3.g(tr5Var, z, resolvedTextDirection, z2, j6, f2, zc8Var, (qz0) obj, hs9.W(i2 | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final void h(int i2, qz0 qz0Var, bp2 bp2Var, hx4 hx4Var, boolean z) {
        int i3;
        qz0Var.c0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (qz0Var.h(bp2Var) ? 32 : 16) | (qz0Var.g(z) ? 256 : 128);
        if (qz0Var.R(i4 & 1, (i4 & 147) != 146)) {
            z27.a(qz0Var, androidx.compose.ui.b.a(b.j(hx4Var, an7.a, an7.b), new zh(bp2Var, z)));
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new yh(hx4Var, bp2Var, z, i2);
        }
    }

    public static final void i(hx4 hx4Var, float f2, long j2, qz0 qz0Var, int i2, int i3) {
        int i4;
        float f3;
        float f4;
        qz0Var.c0(-1534852205);
        int i5 = i2 | (qz0Var.f(hx4Var) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (qz0Var.c(f2) ? 32 : 16);
        }
        long jD = j2;
        int i7 = i4 | (((i3 & 4) == 0 && qz0Var.e(jD)) ? 256 : 128);
        int i8 = 1;
        if (qz0Var.R(i7 & 1, (i7 & 147) != 146)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                f4 = i6 != 0 ? jq1.a : f2;
                if ((i3 & 4) != 0) {
                    float f5 = jq1.a;
                    i7 &= -897;
                    jD = mv0.d(nq1.a, qz0Var);
                }
            } else {
                qz0Var.U();
                if ((i3 & 4) != 0) {
                    i7 &= -897;
                }
                f4 = f2;
            }
            qz0Var.r();
            hx4 hx4VarL = b.l(hx4Var.d(b.b), f4);
            boolean z = ((((i7 & 896) ^ 384) > 256 && qz0Var.e(jD)) || (i7 & 384) == 256) | ((i7 & 112) == 32);
            Object objM = qz0Var.M();
            if (z || objM == jz0.a) {
                objM = new kq1(f4, i8, jD);
                qz0Var.l0(objM);
            }
            ml9.c(hx4VarL, (dp2) objM, qz0Var, 0);
            f3 = f4;
        } else {
            qz0Var.U();
            f3 = f2;
        }
        long j3 = jD;
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new lq1(hx4Var, f3, j3, i2, i3, 1);
        }
    }

    public static boolean j(f31 f31Var) {
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = f31Var.U;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
        f31 f31Var2 = f31Var.V;
        g31 g31Var = f31Var2 != null ? (g31) f31Var2 : null;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.a;
        if (g31Var != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = g31Var.U[0];
        }
        if (g31Var != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = g31Var.U[1];
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.c;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.b;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3 || f31Var.B() || constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour7 || (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour6 && f31Var.r == 0 && f31Var.Y == 0.0f && f31Var.u(0)) || (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour6 && f31Var.r == 1 && f31Var.v(0, f31Var.r()));
        boolean z2 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || f31Var.C() || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour7 || (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour6 && f31Var.s == 0 && f31Var.Y == 0.0f && f31Var.u(1)) || (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour6 && f31Var.s == 1 && f31Var.v(1, f31Var.l()));
        return (f31Var.Y > 0.0f && (z || z2)) || (z && z2);
    }

    public static final void n(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(dw1.j(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void o(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(dw1.j(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void p(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbB = bl4.B(i2, i3, "fromIndex: ", ", toIndex: ", ", size: ");
            sbB.append(i4);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(dw1.j(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void q(long j2, Orientation orientation) {
        if (orientation == Orientation.a) {
            if (h31.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            un3.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (h31.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            un3.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.jx9 r(defpackage.xe2 r7, int r8) {
        /*
            bp0 r0 = defpackage.cp0.c0
            r0.getClass()
            int r0 = defpackage.bp0.b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.a
            if (r1 == 0) goto L3b
            r1 = r7
            kotlinx.coroutines.flow.internal.a r1 = (kotlinx.coroutines.flow.internal.a) r1
            kotlinx.coroutines.channels.BufferOverflow r2 = r1.c
            xe2 r3 = r1.h()
            if (r3 == 0) goto L3b
            jx9 r7 = new jx9
            int r4 = r1.b
            r5 = -3
            if (r4 == r5) goto L29
            r5 = -2
            if (r4 == r5) goto L29
            if (r4 == 0) goto L29
            r0 = r4
            goto L35
        L29:
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.a
            r6 = 0
            if (r2 != r5) goto L32
            if (r4 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            w61 r8 = r1.a
            r7.<init>(r3, r0, r2, r8)
            return r7
        L3b:
            jx9 r8 = new jx9
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.a
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt3.r(xe2, int):jx9");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.og s(androidx.compose.ui.draw.b r26, float r27) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt3.s(androidx.compose.ui.draw.b, float):og");
    }

    public static final lf7 t(ComponentCallbacks componentCallbacks, g64 g64Var, yu8 yu8Var) {
        js3.p(yu8Var, "scopeArchetype");
        lf7 lf7VarB = dy3.x(componentCallbacks).b(dt2.q(componentCallbacks), dt2.r(componentCallbacks), componentCallbacks, yu8Var);
        lf7VarB.h.add(new ey0(g64Var));
        g64Var.D().a(new fy0(0, lf7VarB));
        return lf7VarB;
    }

    public static final l71 u(x79 x79Var) {
        return x79Var instanceof jx2 ? ((jx2) x79Var).i() : j71.b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void v(hv1 hv1Var, androidx.compose.ui.graphics.layer.a aVar) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f2;
        tm0 tm0VarV = hv1Var.X().v();
        androidx.compose.ui.graphics.layer.a aVar2 = (androidx.compose.ui.graphics.layer.a) hv1Var.X().c;
        fv2 fv2Var = aVar.a;
        if (aVar.s) {
            return;
        }
        aVar.a();
        if (!fv2Var.p()) {
            try {
                fv2Var.o(aVar.b, aVar.c, aVar, aVar.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = fv2Var.M() > 0.0f;
        if (z4) {
            tm0VarV.u();
        }
        Canvas canvasA = ve.a(tm0VarV);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = aVar.t;
            float f3 = (int) (j2 >> 32);
            float f4 = (int) (j2 & 4294967295L);
            long j3 = aVar.u;
            float f5 = ((int) (j3 >> 32)) + f3;
            float f6 = ((int) (j3 & 4294967295L)) + f4;
            float fA = fv2Var.a();
            tc0 tc0VarK = fv2Var.k();
            int iO = fv2Var.O();
            if (fA < 1.0f || iO != 3 || tc0VarK != null || fv2Var.j() == 1) {
                jx9 jx9VarC = aVar.p;
                if (jx9VarC == null) {
                    jx9VarC = dt2.c();
                    aVar.p = jx9VarC;
                }
                jx9VarC.n(fA);
                jx9VarC.o(iO);
                jx9VarC.q(tc0VarK);
                canvasA = canvasA;
                f2 = f3;
                canvasA.saveLayer(f2, f4, f5, f6, (Paint) jx9VarC.b);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f2 = f3;
            }
            canvasA.translate(f2, f4);
            canvasA.concat(fv2Var.K());
        }
        boolean z5 = !zIsHardwareAccelerated && aVar.w;
        if (z5) {
            tm0VarV.e();
            rq4 rq4VarD = aVar.d();
            if (rq4VarD instanceof ww5) {
                tm0VarV.s(((ww5) rq4VarD).p);
            } else if (rq4VarD instanceof xw5) {
                eh ehVarA = aVar.m;
                if (ehVarA != null) {
                    ehVarA.a.rewind();
                } else {
                    ehVarA = gh.a();
                    aVar.m = ehVarA;
                }
                bl4.j(ehVarA, ((xw5) rq4VarD).p);
                tm0VarV.i(ehVarA);
            } else {
                if (!(rq4VarD instanceof vw5)) {
                    throw new NoWhenBranchMatchedException();
                }
                tm0VarV.i(((vw5) rq4VarD).p);
            }
        }
        if (aVar2 != null) {
            ai0 ai0Var = aVar2.r;
            if (!ai0Var.a) {
                qn3.a("Only add dependencies during a tracking");
            }
            sb5 sb5Var = (sb5) ai0Var.d;
            if (sb5Var != null) {
                sb5Var.d(aVar);
            } else if (((androidx.compose.ui.graphics.layer.a) ai0Var.b) != null) {
                sb5 sb5Var2 = de7.a;
                sb5 sb5Var3 = new sb5();
                androidx.compose.ui.graphics.layer.a aVar3 = (androidx.compose.ui.graphics.layer.a) ai0Var.b;
                js3.m(aVar3);
                sb5Var3.d(aVar3);
                sb5Var3.d(aVar);
                ai0Var.d = sb5Var3;
                ai0Var.b = null;
            } else {
                ai0Var.b = aVar;
            }
            sb5 sb5Var4 = (sb5) ai0Var.e;
            if (sb5Var4 != null) {
                z3 = !sb5Var4.l(aVar);
            } else if (((androidx.compose.ui.graphics.layer.a) ai0Var.c) != aVar) {
                z3 = true;
            } else {
                ai0Var.c = null;
                z3 = false;
            }
            if (z3) {
                aVar.q++;
            }
        }
        if (ve.a(tm0VarV).isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasA;
            fv2Var.i(tm0VarV);
        } else {
            vm0 vm0Var = aVar.o;
            if (vm0Var == null) {
                vm0Var = new vm0();
                aVar.o = vm0Var;
            }
            wv8 wv8Var = vm0Var.b;
            qj1 qj1Var = aVar.b;
            LayoutDirection layoutDirection = aVar.c;
            long jM = M(aVar.u);
            qj1 qj1VarX = wv8Var.x();
            LayoutDirection layoutDirectionZ = wv8Var.z();
            tm0 tm0VarV2 = wv8Var.v();
            z2 = z5;
            canvas = canvasA;
            long jA = wv8Var.A();
            z = z4;
            androidx.compose.ui.graphics.layer.a aVar4 = (androidx.compose.ui.graphics.layer.a) wv8Var.c;
            wv8Var.N(qj1Var);
            wv8Var.O(layoutDirection);
            wv8Var.M(tm0VarV);
            wv8Var.P(jM);
            wv8Var.c = aVar;
            tm0VarV.e();
            try {
                aVar.c(vm0Var);
            } finally {
                tm0VarV.o();
                wv8Var.N(qj1VarX);
                wv8Var.O(layoutDirectionZ);
                wv8Var.M(tm0VarV2);
                wv8Var.P(jA);
                wv8Var.c = aVar4;
            }
        }
        if (z2) {
            tm0VarV.o();
        }
        if (z) {
            tm0VarV.f();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static boolean w(oa5 oa5Var, Object obj) {
        if (obj == oa5Var) {
            return true;
        }
        if (!(obj instanceof oa5)) {
            return false;
        }
        oa5 oa5Var2 = (oa5) obj;
        if (oa5Var.size() != oa5Var2.size() || oa5Var.entrySet().size() != oa5Var2.entrySet().size()) {
            return false;
        }
        for (pa5 pa5Var : oa5Var2.entrySet()) {
            if (oa5Var.s0(pa5Var.b()) != pa5Var.a()) {
                return false;
            }
        }
        return true;
    }

    public static ActionMenuView x(Toolbar toolbar) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton y(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList z(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public abstract void F(g2 g2Var, g2 g2Var2);

    public abstract void G(g2 g2Var, Thread thread);

    public abstract void O(ByteBuffer byteBuffer);

    public abstract void P(byte[] bArr, int i2, int i3);

    public abstract boolean k(h2 h2Var, d2 d2Var, d2 d2Var2);

    public abstract boolean l(h2 h2Var, Object obj, Object obj2);

    public abstract boolean m(h2 h2Var, g2 g2Var, g2 g2Var2);
}
