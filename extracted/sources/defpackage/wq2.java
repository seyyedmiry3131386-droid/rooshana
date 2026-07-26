package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StatFs;
import android.provider.Settings;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.h;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.state.ToggleableState;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b;
import kotlin.time.DurationUnit;
import kotlinx.serialization.MissingFieldException;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wq2 {
    public static final AdSelectionManagerImplCommon$Ext10Impl$Companion a = new AdSelectionManagerImplCommon$Ext10Impl$Companion();
    public static final a b = new a(-351854498, new yf(14), false);
    public static final ym6 c = new ym6("image-destination");
    public static final ym6 d = new ym6("image-replacement-text-is-link");
    public static final ym6 e = new ym6("image-size");
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};
    public static final int[] h = {R.attr.resizeClip};
    public static final int[] i = {R.attr.transitionVisibilityMode};
    public static final int[] j = {R.attr.fadingMode};
    public static final int[] k = {R.attr.reparent, R.attr.reparentWithOverlay};
    public static final int[] l = {R.attr.slideEdge};
    public static final int[] m = {R.attr.transitionOrdering};
    public static final int[] n = {R.attr.minimumHorizontalAngle, R.attr.minimumVerticalAngle, R.attr.maximumAngle};
    public static final int[] o = {R.attr.patternPathData};
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ int u = 0;

    public static final String A() {
        Object objA;
        try {
            objA = Build.MODEL;
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        return (String) (Result.a(objA) == null ? objA : "");
    }

    public static final String B() {
        Object objA;
        try {
            objA = Build.DEVICE;
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        return (String) (Result.a(objA) == null ? objA : "");
    }

    public static final List C() {
        String[] strArr = Build.SUPPORTED_ABIS;
        js3.o(strArr, "SUPPORTED_ABIS");
        return ew.X0(strArr);
    }

    public static long D() {
        try {
            return new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static long E() {
        try {
            return new StatFs(Environment.getExternalStorageDirectory().getPath()).getTotalBytes();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static final boolean F(c cVar) {
        ToggleableState toggleableState = (ToggleableState) androidx.compose.ui.semantics.b.a(cVar.d, d.J);
        en7 en7Var = cVar.d;
        v97 v97Var = (v97) androidx.compose.ui.semantics.b.a(en7Var, d.y);
        boolean z = toggleableState != null;
        if (((Boolean) androidx.compose.ui.semantics.b.a(en7Var, d.I)) == null || (v97Var != null && v97Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String G(c cVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        int iT;
        Object objA = androidx.compose.ui.semantics.b.a(cVar.d, d.b);
        en7 en7Var = cVar.d;
        ToggleableState toggleableState = (ToggleableState) androidx.compose.ui.semantics.b.a(en7Var, d.J);
        v97 v97Var = (v97) androidx.compose.ui.semantics.b.a(en7Var, d.y);
        if (toggleableState != null) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (objA == null) {
                        objA = resources.getString(zs6.indeterminate);
                    }
                } else if (v97Var != null && v97Var.a == 2 && objA == null) {
                    objA = resources.getString(zs6.state_off);
                }
            } else if (v97Var != null && v97Var.a == 2 && objA == null) {
                objA = resources.getString(zs6.state_on);
            }
        }
        Boolean bool = (Boolean) androidx.compose.ui.semantics.b.a(en7Var, d.I);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((v97Var == null || v97Var.a != 4) && objA == null) {
                objA = zBooleanValue ? resources.getString(zs6.selected) : resources.getString(zs6.not_selected);
            }
        }
        yl6 yl6Var = (yl6) androidx.compose.ui.semantics.b.a(en7Var, d.c);
        if (yl6Var != null) {
            if (yl6Var != yl6.c) {
                if (objA == null) {
                    float f2 = yl6Var.b.a;
                    float f3 = f2 - 0.0f == 0.0f ? 0.0f : (yl6Var.a - 0.0f) / (f2 - 0.0f);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        iT = 0;
                    } else {
                        iT = 100;
                        if (f3 != 1.0f) {
                            iT = ok4.t(Math.round(f3 * 100), 1, 99);
                        }
                    }
                    objA = resources.getString(zs6.template_percent, Integer.valueOf(iT));
                }
            } else if (objA == null) {
                objA = resources.getString(zs6.in_progress);
            }
        }
        g gVar = d.F;
        if (en7Var.a.c(gVar)) {
            en7 en7VarK = new c(cVar.a, true, cVar.c, en7Var).k();
            Collection collection2 = (Collection) androidx.compose.ui.semantics.b.a(en7VarK, d.a);
            objA = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) androidx.compose.ui.semantics.b.a(en7VarK, d.B)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) androidx.compose.ui.semantics.b.a(en7VarK, gVar)) == null || charSequence.length() == 0)) ? resources.getString(zs6.state_empty) : null;
        }
        return (String) objA;
    }

    public static final ll H(c cVar) {
        en7 en7Var = cVar.d;
        g gVar = d.a;
        ll llVar = (ll) androidx.compose.ui.semantics.b.a(en7Var, d.F);
        List list = (List) androidx.compose.ui.semantics.b.a(cVar.d, d.B);
        return llVar == null ? list != null ? (ll) kotlin.collections.a.p0(list) : null : llVar;
    }

    public static final String I() {
        Object objA;
        try {
            objA = Build.MANUFACTURER;
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        return (String) (Result.a(objA) == null ? objA : "");
    }

    public static final String J() {
        Object objA;
        try {
            objA = Build.PRODUCT;
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        return (String) (Result.a(objA) == null ? objA : "");
    }

    public static final int K(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final float L(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final int M(float f2, int i2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static final lj5 N(dp2 dp2Var) {
        mj5 mj5Var = new mj5();
        dp2Var.invoke(mj5Var);
        boolean z = mj5Var.b;
        boolean z2 = mj5Var.c;
        int i2 = mj5Var.d;
        boolean z3 = mj5Var.e;
        ba4 ba4Var = mj5Var.a;
        return new lj5(z, z2, i2, false, z3, ba4Var.a, ba4Var.b, -1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(t36[] t36VarArr, Path path) {
        int i2;
        float[] fArr;
        int i3;
        t36 t36Var;
        int i4;
        char c2;
        float f2;
        float f3;
        t36 t36Var2;
        boolean z;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        t36[] t36VarArr2 = t36VarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = t36VarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c3 = 'm';
        while (i6 < length) {
            t36 t36Var3 = t36VarArr2[i6];
            char c4 = t36Var3.a;
            float[] fArr3 = t36Var3.b;
            float f12 = fArr2[i5];
            float f13 = fArr2[1];
            float f14 = fArr2[2];
            float f15 = fArr2[3];
            float f16 = fArr2[4];
            int i7 = i5;
            float f17 = fArr2[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i2 = 2;
                    break;
            }
            float f18 = f16;
            float f19 = f17;
            float f20 = f12;
            float f21 = f13;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c4 == 'A') {
                    fArr = fArr3;
                    i3 = i8;
                    t36Var = t36Var3;
                    float f22 = f20;
                    float f23 = f21;
                    i4 = i6;
                    c2 = c4;
                    int i9 = i3 + 5;
                    int i10 = i3 + 6;
                    t36.a(path, f22, f23, fArr[i9], fArr[i10], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f ? 1 : i7, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f14 = fArr[i9];
                    f2 = fArr[i10];
                    f15 = f2;
                    f3 = f14;
                } else if (c4 == 'C') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    t36Var = t36Var3;
                    c2 = c4;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    int i13 = i3 + 4;
                    int i14 = i3 + 5;
                    path2.cubicTo(fArr[i3], fArr[i3 + 1], fArr[i11], fArr[i12], fArr[i13], fArr[i14]);
                    float f24 = fArr[i13];
                    float f25 = fArr[i14];
                    f14 = fArr[i11];
                    f15 = fArr[i12];
                    f2 = f25;
                    f3 = f24;
                } else if (c4 == 'H') {
                    fArr = fArr3;
                    i3 = i8;
                    t36Var = t36Var3;
                    c2 = c4;
                    f2 = f21;
                    i4 = i6;
                    path2.lineTo(fArr[i3], f2);
                    f3 = fArr[i3];
                } else if (c4 == 'Q') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    t36Var = t36Var3;
                    c2 = c4;
                    int i15 = i3 + 1;
                    int i16 = i3 + 2;
                    int i17 = i3 + 3;
                    path2.quadTo(fArr[i3], fArr[i15], fArr[i16], fArr[i17]);
                    float f26 = fArr[i3];
                    float f27 = fArr[i15];
                    float f28 = fArr[i16];
                    float f29 = fArr[i17];
                    f14 = f26;
                    f15 = f27;
                    f3 = f28;
                    f2 = f29;
                } else if (c4 == 'V') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    t36Var = t36Var3;
                    f3 = f20;
                    c2 = c4;
                    path2.lineTo(f3, fArr[i3]);
                    f2 = fArr[i3];
                } else if (c4 != 'a') {
                    if (c4 == 'c') {
                        fArr = fArr3;
                        i3 = i8;
                        int i18 = i3 + 2;
                        int i19 = i3 + 3;
                        int i20 = i3 + 4;
                        int i21 = i3 + 5;
                        path2.rCubicTo(fArr[i3], fArr[i3 + 1], fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                        float f30 = fArr[i18] + f20;
                        float f31 = fArr[i19] + f21;
                        f20 += fArr[i20];
                        f21 += fArr[i21];
                        f14 = f30;
                        f15 = f31;
                    } else if (c4 != 'h') {
                        if (c4 != 'q') {
                            if (c4 != 'v') {
                                if (c4 == 'L') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    int i22 = i3 + 1;
                                    path2.lineTo(fArr[i3], fArr[i22]);
                                    f3 = fArr[i3];
                                    f2 = fArr[i22];
                                } else if (c4 == 'M') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    f3 = fArr[i3];
                                    f2 = fArr[i3 + 1];
                                    if (i3 > 0) {
                                        path2.lineTo(f3, f2);
                                    } else {
                                        path2.moveTo(f3, f2);
                                        f18 = f3;
                                        f19 = f2;
                                    }
                                } else if (c4 != 'S') {
                                    if (c4 == 'T') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                            f20 = (f20 * 2.0f) - f14;
                                            f21 = (f21 * 2.0f) - f15;
                                        }
                                        int i23 = i3 + 1;
                                        path2.quadTo(f20, f21, fArr[i3], fArr[i23]);
                                        f3 = fArr[i3];
                                        f2 = fArr[i23];
                                        t36Var = t36Var3;
                                        f14 = f20;
                                        f15 = f21;
                                    } else if (c4 == 'l') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        int i24 = i3 + 1;
                                        path2.rLineTo(fArr[i3], fArr[i24]);
                                        f20 += fArr[i3];
                                        f7 = fArr[i24];
                                    } else if (c4 == 'm') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        float f32 = fArr[i3];
                                        f20 += f32;
                                        float f33 = fArr[i3 + 1];
                                        f21 += f33;
                                        if (i3 > 0) {
                                            path2.rLineTo(f32, f33);
                                        } else {
                                            path2.rMoveTo(f32, f33);
                                            t36Var = t36Var3;
                                            f3 = f20;
                                            f18 = f3;
                                            f2 = f21;
                                            f19 = f2;
                                        }
                                    } else if (c4 != 's') {
                                        if (c4 != 't') {
                                            fArr = fArr3;
                                            i3 = i8;
                                            t36Var = t36Var3;
                                            f3 = f20;
                                        } else {
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f10 = f20 - f14;
                                                f11 = f21 - f15;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i25 = i8 + 1;
                                            path2.rQuadTo(f10, f11, fArr3[i8], fArr3[i25]);
                                            float f34 = f10 + f20;
                                            float f35 = f11 + f21;
                                            float f36 = f20 + fArr3[i8];
                                            f21 += fArr3[i25];
                                            f15 = f35;
                                            fArr = fArr3;
                                            i3 = i8;
                                            t36Var = t36Var3;
                                            f3 = f36;
                                            f14 = f34;
                                        }
                                        f2 = f21;
                                    } else {
                                        if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                            f8 = f21 - f15;
                                            f9 = f20 - f14;
                                        } else {
                                            f9 = 0.0f;
                                            f8 = 0.0f;
                                        }
                                        int i26 = i8;
                                        int i27 = i26 + 1;
                                        int i28 = i26 + 2;
                                        int i29 = i26 + 3;
                                        fArr = fArr3;
                                        i3 = i26;
                                        path2.rCubicTo(f9, f8, fArr3[i26], fArr3[i27], fArr3[i28], fArr3[i29]);
                                        f4 = fArr[i3] + f20;
                                        f5 = fArr[i27] + f21;
                                        f20 += fArr[i28];
                                        f6 = fArr[i29];
                                    }
                                    i4 = i6;
                                    c2 = c4;
                                } else {
                                    fArr = fArr3;
                                    i3 = i8;
                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                        f20 = (f20 * 2.0f) - f14;
                                        f21 = (f21 * 2.0f) - f15;
                                    }
                                    float f37 = f20;
                                    float f38 = f21;
                                    int i30 = i3 + 1;
                                    int i31 = i3 + 2;
                                    int i32 = i3 + 3;
                                    path2.cubicTo(f37, f38, fArr[i3], fArr[i30], fArr[i31], fArr[i32]);
                                    f14 = fArr[i3];
                                    f15 = fArr[i30];
                                    f3 = fArr[i31];
                                    f2 = fArr[i32];
                                }
                                i4 = i6;
                                t36Var = t36Var3;
                                c2 = c4;
                            } else {
                                fArr = fArr3;
                                i3 = i8;
                                path2.rLineTo(0.0f, fArr[i3]);
                                f7 = fArr[i3];
                            }
                            f21 += f7;
                        } else {
                            fArr = fArr3;
                            i3 = i8;
                            int i33 = i3 + 1;
                            int i34 = i3 + 2;
                            int i35 = i3 + 3;
                            path2.rQuadTo(fArr[i3], fArr[i33], fArr[i34], fArr[i35]);
                            f4 = fArr[i3] + f20;
                            f5 = fArr[i33] + f21;
                            f20 += fArr[i34];
                            f6 = fArr[i35];
                        }
                        f21 += f6;
                        f14 = f4;
                        f15 = f5;
                    } else {
                        fArr = fArr3;
                        i3 = i8;
                        path2.rLineTo(fArr[i3], 0.0f);
                        f20 += fArr[i3];
                    }
                    t36Var = t36Var3;
                    f3 = f20;
                    f2 = f21;
                    i4 = i6;
                    c2 = c4;
                } else {
                    fArr = fArr3;
                    i3 = i8;
                    int i36 = i3 + 5;
                    float f39 = fArr[i36] + f20;
                    int i37 = i3 + 6;
                    float f40 = fArr[i37] + f21;
                    float f41 = fArr[i3];
                    float f42 = fArr[i3 + 1];
                    float f43 = fArr[i3 + 2];
                    if (fArr[i3 + 3] != 0.0f) {
                        t36Var2 = t36Var3;
                        z = 1;
                    } else {
                        t36Var2 = t36Var3;
                        z = i7;
                    }
                    t36Var = t36Var2;
                    float f44 = f20;
                    c2 = c4;
                    float f45 = f21;
                    i4 = i6;
                    t36.a(path, f44, f45, f39, f40, f41, f42, f43, z, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f3 = f44 + fArr[i36];
                    f2 = f45 + fArr[i37];
                    f14 = f3;
                    f15 = f2;
                }
                i8 = i3 + i2;
                path2 = path;
                t36Var3 = t36Var;
                c4 = c2;
                i6 = i4;
                f20 = f3;
                f21 = f2;
                c3 = c4;
                fArr3 = fArr;
            }
            fArr2[i7] = f20;
            fArr2[1] = f21;
            fArr2[2] = f14;
            fArr2[3] = f15;
            fArr2[4] = f18;
            fArr2[5] = f19;
            c3 = t36Var3.a;
            i6++;
            t36VarArr2 = t36VarArr;
            path2 = path;
            i5 = i7;
        }
    }

    public static final long P(String str) {
        char cCharAt;
        int length = str.length();
        int i2 = (length <= 0 || !f88.d0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i2 > 16) {
            int i3 = i2;
            while (true) {
                if (i2 < length) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 == '0') {
                        if (i3 == i2) {
                            i3++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i2++;
                } else if (length - i3 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!m88.Z(str, Marker.ANY_NON_NULL_MARKER, false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(f88.e0(1, str));
    }

    public static final Object Q(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void R(fz7 fz7Var, ou ouVar, int i2) {
        while (true) {
            int i3 = fz7Var.v;
            if (i2 > i3 && i2 < fz7Var.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            fz7Var.O();
            if (fz7Var.y(fz7Var.v)) {
                ouVar.j();
            }
            fz7Var.j();
        }
    }

    public static final void S(int i2, int i3, no7 no7Var) {
        js3.p(no7Var, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(no7Var.f(i5));
            }
            i4 >>>= 1;
        }
        String strA = no7Var.a();
        js3.p(strA, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? dw1.p((String) arrayList.get(0), "' is required for type with serial name '", strA, "', but it was missing", new StringBuilder("Field '")) : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null);
    }

    public static final long T(int i2, DurationUnit durationUnit) {
        js3.p(durationUnit, "unit");
        return durationUnit.compareTo(DurationUnit.e) <= 0 ? t(xq2.o(i2, durationUnit, DurationUnit.b)) : U(i2, durationUnit);
    }

    public static final long U(long j2, DurationUnit durationUnit) {
        js3.p(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.b;
        long jO = xq2.o(4611686018426999999L, durationUnit2, durationUnit);
        return ((-jO) > j2 || j2 > jO) ? r(ok4.w(xq2.n(j2, durationUnit, DurationUnit.d), -4611686018427387903L, 4611686018427387903L)) : t(xq2.o(j2, durationUnit, durationUnit2));
    }

    public static final String V(byte b2) {
        char[] cArr = y40.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String W(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = y40.b;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return m88.R(cArr2, i3, 8);
    }

    public static String X(int i2) {
        return i2 == -1 ? "Unspecified" : i2 == 0 ? ApplicationStateDto.STATE_NONE : i2 == 1 ? "Characters" : i2 == 2 ? "Words" : i2 == 3 ? "Sentences" : "Invalid";
    }

    public static String Y(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + bt2.X(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + bt2.X(Float.intBitsToFloat(i2)) + ", " + bt2.X(Float.intBitsToFloat(i3)) + ')';
    }

    public static float Z(float f2, float f3, float f4, int i2) {
        return i2 > 0 ? (f4 / 2.0f) + f3 : f2;
    }

    public static final void a(hx4 hx4Var, String str, qz0 qz0Var, int i2) {
        String str2;
        js3.p(str, "title");
        qz0Var.c0(-828453168);
        int i3 = i2 | (qz0Var.f(hx4Var) ? 4 : 2) | (qz0Var.f(str) ? 32 : 16);
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            gj8 gj8Var = ((wf5) qz0Var.j(aw8.a)).d;
            u58 u58Var = uj8.a;
            Object objJ = qz0Var.j(u58Var);
            js3.m(objJ);
            mi8.b(str, yh0.C(hx4Var, ml9.q(hq6.space_16, qz0Var), ml9.q(hq6.space_8, qz0Var), ml9.q(hq6.space_16, qz0Var), ml9.q(hq6.space_16, qz0Var)), ((tj8) objJ).j, 0L, 0L, new of8(3), 0L, 0, false, 0, 0, gj8Var, qz0Var, (i3 >> 3) & 14, 0, 130040);
            str2 = str;
            float fQ = ml9.q(hq6.size_1, qz0Var);
            Object objJ2 = qz0Var.j(u58Var);
            js3.m(objJ2);
            tt3.b(null, fQ, ((tj8) objJ2).r, qz0Var, 0, 1);
        } else {
            str2 = str;
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new c20(hx4Var, str2, i2, 1);
        }
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final boolean c(c cVar) {
        en7 en7VarK = cVar.k();
        return !en7VarK.a.c(d.i);
    }

    public static final boolean d(c cVar, Resources resources) {
        List list = (List) androidx.compose.ui.semantics.b.a(cVar.d, d.a);
        return !s7.E(cVar) && (cVar.d.c || (cVar.o() && ((list != null ? (String) kotlin.collections.a.p0(list) : null) != null || H(cVar) != null || G(cVar, resources) != null || F(cVar))));
    }

    public static final long e(String str) {
        DurationUnit durationUnit;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i2 = qx1.d;
        char cCharAt2 = str.charAt(0);
        int i3 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i3 > 0 && f88.A0(str, '-');
        if (length <= i3) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i3) != 'P') {
            throw new IllegalArgumentException();
        }
        int i4 = i3 + 1;
        if (i4 == length) {
            throw new IllegalArgumentException();
        }
        DurationUnit durationUnit2 = null;
        long jG = 0;
        boolean z2 = false;
        while (i4 < length) {
            if (str.charAt(i4) != 'T') {
                int i5 = i4;
                while (i5 < str.length() && (('0' <= (cCharAt = str.charAt(i5)) && cCharAt < ':') || f88.d0("+-.", cCharAt))) {
                    i5++;
                }
                String strSubstring = str.substring(i4, i5);
                js3.o(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i4;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i6 = length2 + 1;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        durationUnit = DurationUnit.g;
                    } else if (cCharAt3 == 'M') {
                        durationUnit = DurationUnit.f;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        durationUnit = DurationUnit.e;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    durationUnit = DurationUnit.h;
                }
                if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iK0 = f88.k0('.', 0, 6, strSubstring);
                if (durationUnit != DurationUnit.e || iK0 <= 0) {
                    jG = qx1.g(jG, U(P(strSubstring), durationUnit));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iK0);
                    js3.o(strSubstring2, "substring(...)");
                    long jG2 = qx1.g(jG, U(P(strSubstring2), durationUnit));
                    String strSubstring3 = strSubstring.substring(iK0);
                    js3.o(strSubstring3, "substring(...)");
                    double d2 = Double.parseDouble(strSubstring3);
                    double dM = xq2.m(d2, durationUnit, DurationUnit.b);
                    if (Double.isNaN(dM)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jW = ok4.W(dM);
                    jG = qx1.g(jG2, (-4611686018426999999L > jW || jW >= 4611686018427000000L) ? s(ok4.W(xq2.m(d2, durationUnit, DurationUnit.d))) : t(jW));
                }
                durationUnit2 = durationUnit;
                i4 = i6;
            } else {
                if (z2 || (i4 = i4 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        return z ? qx1.j(jG) : jG;
    }

    public static float f(float f2, float f3, int i2) {
        return (Math.max(0, i2 - 1) * f3) + f2;
    }

    public static float g(float f2, float f3, int i2) {
        return i2 > 0 ? (f3 / 2.0f) + f2 : f2;
    }

    public static final boolean h(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        js3.p(bArr, "a");
        js3.p(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static IOException i(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return new IOException(string, iOException);
    }

    public static IOException j(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? i(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? i(file, iOException) : i(file, iOException) : parentFile.canWrite() ? i(file, iOException) : i(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? i(file, iOException) : i(file, iOException) : parentFile.canWrite() ? i(file, iOException) : i(file, iOException) : i(file, iOException);
    }

    public static boolean k(t36[] t36VarArr, t36[] t36VarArr2) {
        if (t36VarArr == null || t36VarArr2 == null || t36VarArr.length != t36VarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < t36VarArr.length; i2++) {
            t36 t36Var = t36VarArr[i2];
            char c2 = t36Var.a;
            t36 t36Var2 = t36VarArr2[i2];
            if (c2 != t36Var2.a || t36Var.b.length != t36Var2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(long j2, long j3) {
        long jD = D();
        return jD <= 0 || jD >= j2 - j3;
    }

    public static final void m(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder sbS = rm7.s(j2, "size=", " offset=");
            sbS.append(j3);
            sbS.append(" byteCount=");
            sbS.append(j4);
            throw new ArrayIndexOutOfBoundsException(sbS.toString());
        }
    }

    public static float[] n(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.t36[] o(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq2.o(java.lang.String):t36[]");
    }

    public static Path p(String str) {
        Path path = new Path();
        try {
            O(o(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static t36[] q(t36[] t36VarArr) {
        t36[] t36VarArr2 = new t36[t36VarArr.length];
        for (int i2 = 0; i2 < t36VarArr.length; i2++) {
            t36VarArr2[i2] = new t36(t36VarArr[i2]);
        }
        return t36VarArr2;
    }

    public static final long r(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = qx1.d;
        int i3 = sx1.a;
        return j3;
    }

    public static final long s(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? r(ok4.w(j2, -4611686018427387903L, 4611686018427387903L)) : t(j2 * ((long) 1000000));
    }

    public static final long t(long j2) {
        long j3 = j2 << 1;
        int i2 = qx1.d;
        int i3 = sx1.a;
        return j3;
    }

    public static final boolean u(long j2, long j3) {
        return j2 == j3;
    }

    public static final float v(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / ((long) 3))) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final h w(h hVar, dp2 dp2Var) {
        for (h hVarF = hVar.F(); hVarF != null; hVarF = hVarF.F()) {
            if (((Boolean) dp2Var.invoke(hVarF)).booleanValue()) {
                return hVarF;
            }
        }
        return null;
    }

    public static final String x() {
        Object objA;
        try {
            objA = String.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = "";
        }
        return (String) objA;
    }

    public static final String y(Context context) {
        Object objA;
        js3.p(context, "context");
        try {
            objA = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        return (String) (Result.a(objA) == null ? objA : "");
    }

    public static final String z() {
        Object objA;
        try {
            objA = Build.BRAND;
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th) {
            objA = b.a(th);
        }
        return (String) (Result.a(objA) == null ? objA : "");
    }
}
