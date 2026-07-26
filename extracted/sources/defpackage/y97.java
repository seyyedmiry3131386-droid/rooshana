package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.widget.ImageView;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.relocation.a;
import androidx.compose.runtime.i;
import androidx.compose.ui.node.j;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y97 implements jf3 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};
    public static final qm5 j;
    public static final sl3 k;
    public static final /* synthetic */ int l = 0;
    public static boolean m = true;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;

    static {
        int i2 = 26;
        j = new qm5(i2, (Object) null);
        k = new sl3(i2);
    }

    public static final StateListDrawable A(float[] fArr, int i2) {
        js3.p(fArr, "radius");
        LayerDrawable layerDrawableE = E(fArr, i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, layerDrawableE);
        return stateListDrawable;
    }

    public static StateListDrawable B(float f2, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i3 & 2) != 0) {
            i2 = sj8.b().O.c;
        }
        return z(i2, f2);
    }

    public static ao0 D(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ao0(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        ao0 ao0Var = new ao0(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            ao0 ao0Var2 = new ao0(bArrCopyOf, bArrCopyOf.length);
            while (ao0Var2.b() >= 16) {
                ao0Var2.t(2);
                int i4 = ao0Var2.i(14) & 16383;
                int iMin = Math.min(8 - ao0Var.d, 14);
                int i5 = ao0Var.d;
                int i6 = (8 - i5) - iMin;
                byte[] bArr2 = ao0Var.b;
                int i7 = ao0Var.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr2[i7]);
                bArr2[i7] = b5;
                int i8 = 14 - iMin;
                bArr2[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (i8 > 8) {
                    ao0Var.b[i9] = (byte) (i4 >>> (i8 - 8));
                    i8 -= 8;
                    i9++;
                }
                int i10 = 8 - i8;
                byte[] bArr3 = ao0Var.b;
                byte b6 = (byte) (bArr3[i9] & ((1 << i10) - 1));
                bArr3[i9] = b6;
                bArr3[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                ao0Var.t(14);
                ao0Var.a();
            }
        }
        ao0Var.o(bArrCopyOf.length, bArrCopyOf);
        return ao0Var;
    }

    public static final LayerDrawable E(float[] fArr, int i2) {
        js3.p(fArr, "radius");
        String strSubstring = String.format("%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)).substring(0, 2);
        js3.o(strSubstring, "substring(...)");
        int color = Integer.parseInt(strSubstring, 16) != 0 ? Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf(8 & 255), Integer.valueOf(i2 & 16777215)}, 2))) : i2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(fArr);
        String strSubstring2 = String.format("%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)).substring(0, 2);
        js3.o(strSubstring2, "substring(...)");
        int color2 = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf((Integer.parseInt(strSubstring2, 16) * 2) & 255), Integer.valueOf(i2 & 16777215)}, 2)));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(color2);
        gradientDrawable2.setCornerRadii(fArr);
        return new LayerDrawable(new Drawable[]{gradientDrawable, new RippleDrawable(ColorStateList.valueOf(color2), null, gradientDrawable2)});
    }

    public static long F(he6 he6Var, long j2, long j3, long j4) {
        aq7 aq7Var = he6Var.c;
        aq7 aq7Var2 = he6Var.c;
        boolean z = aq7Var.equals(aq7.l) || j3 < aq7Var2.c;
        if (he6Var.v) {
            if (z || j2 == -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    j4 = SystemClock.elapsedRealtime() - aq7Var2.c;
                }
                long j5 = aq7Var2.a.f + ((long) (j4 * he6Var.g.a));
                long j6 = aq7Var2.d;
                return j6 != -9223372036854775807L ? Math.min(j5, j6) : j5;
            }
        } else if (z || j2 == -9223372036854775807L) {
            return aq7Var2.a.f;
        }
        return j2;
    }

    public static final fu0 G(k79 k79Var) {
        fu0 fu0Var;
        w61 w61Var;
        js3.p(k79Var, "<this>");
        synchronized (k) {
            fu0Var = (fu0) k79Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (fu0Var == null) {
                try {
                    try {
                        ug1 ug1Var = up1.a;
                        w61Var = sg4.a.f;
                    } catch (NotImplementedError unused) {
                        w61Var = EmptyCoroutineContext.a;
                    }
                } catch (IllegalStateException unused2) {
                    w61Var = EmptyCoroutineContext.a;
                }
                fu0 fu0Var2 = new fu0(w61Var.l0(a27.a()));
                k79Var.a(fu0Var2, "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
                fu0Var = fu0Var2;
            }
        }
        return fu0Var;
    }

    public static final int H(zv zvVar, Object obj, int i2) {
        int i3 = zvVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int i4 = bt2.i(i3, i2, zvVar.a);
            if (i4 < 0 || js3.i(obj, zvVar.b[i4])) {
                return i4;
            }
            int i5 = i4 + 1;
            while (i5 < i3 && zvVar.a[i5] == i2) {
                if (js3.i(obj, zvVar.b[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = i4 - 1; i6 >= 0 && zvVar.a[i6] == i2; i6--) {
                if (js3.i(obj, zvVar.b[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static in3 I(rx1 rx1Var, long j2, int i2) {
        RepeatMode repeatMode = RepeatMode.a;
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        return new in3(rx1Var, j2);
    }

    public static cb6 J(cb6 cb6Var, cb6 cb6Var2) {
        if (cb6Var != null) {
            vd2 vd2Var = cb6Var.a;
            if (cb6Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i2 = 0; i2 < vd2Var.a.size(); i2++) {
                    if (cb6Var2.a(vd2Var.b(i2))) {
                        int iB = vd2Var.b(i2);
                        vy2.s(!false);
                        sparseBooleanArray.append(iB, true);
                    }
                }
                vy2.s(!false);
                return new cb6(new vd2(sparseBooleanArray));
            }
        }
        return cb6.b;
    }

    public static boolean K(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static int L(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static he6 M(he6 he6Var, he6 he6Var2, fe6 fe6Var, cb6 cb6Var) {
        if (fe6Var.a && cb6Var.a(17)) {
            he6Var2 = he6Var2.i(he6Var.j);
        }
        return (fe6Var.b && cb6Var.a(30)) ? he6Var2.a(he6Var.D) : he6Var2;
    }

    public static int N(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static uw0 O(int i2, h26 h26Var) {
        int iJ = h26Var.j();
        if (h26Var.j() == 1684108385) {
            h26Var.K(8);
            String strT = h26Var.t(iJ - 16);
            return new uw0("und", strT, strT);
        }
        wn5.k0("MetadataUtil", "Failed to parse comment attribute: " + hh0.c(i2));
        return null;
    }

    public static dm P(h26 h26Var) {
        int iJ = h26Var.j();
        if (h26Var.j() != 1684108385) {
            wn5.k0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iJ2 = h26Var.j();
        byte[] bArr = lg0.a;
        int i2 = iJ2 & 16777215;
        String str = i2 == 13 ? "image/jpeg" : i2 == 14 ? "image/png" : null;
        if (str == null) {
            o40.E(i2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        h26Var.K(4);
        int i3 = iJ - 16;
        byte[] bArr2 = new byte[i3];
        h26Var.h(bArr2, 0, i3);
        return new dm(3, str, null, bArr2);
    }

    public static ei8 Q(int i2, h26 h26Var, String str) {
        int iJ = h26Var.j();
        if (h26Var.j() == 1684108385 && iJ >= 22) {
            h26Var.K(10);
            int iD = h26Var.D();
            if (iD > 0) {
                String strN = rm7.n(iD, "");
                int iD2 = h26Var.D();
                if (iD2 > 0) {
                    strN = strN + "/" + iD2;
                }
                return new ei8(str, null, ImmutableList.s(strN));
            }
        }
        wn5.k0("MetadataUtil", "Failed to parse index/count attribute: " + hh0.c(i2));
        return null;
    }

    public static int R(h26 h26Var) {
        int iJ = h26Var.j();
        if (h26Var.j() == 1684108385) {
            h26Var.K(8);
            int i2 = iJ - 16;
            if (i2 == 1) {
                return h26Var.x();
            }
            if (i2 == 2) {
                return h26Var.D();
            }
            if (i2 == 3) {
                return h26Var.A();
            }
            if (i2 == 4 && (h26Var.a[h26Var.b] & 128) == 0) {
                return h26Var.B();
            }
        }
        wn5.k0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static rh3 S(int i2, String str, h26 h26Var, boolean z, boolean z2) {
        int iR = R(h26Var);
        if (z2) {
            iR = Math.min(1, iR);
        }
        if (iR >= 0) {
            return z ? new ei8(str, null, ImmutableList.s(Integer.toString(iR))) : new uw0("und", str, Integer.toString(iR));
        }
        wn5.k0("MetadataUtil", "Failed to parse uint8 attribute: " + hh0.c(i2));
        return null;
    }

    public static ei8 T(int i2, h26 h26Var, String str) {
        int iJ = h26Var.j();
        if (h26Var.j() == 1684108385) {
            h26Var.K(8);
            return new ei8(str, null, ImmutableList.s(h26Var.t(iJ - 16)));
        }
        wn5.k0("MetadataUtil", "Failed to parse text attribute: " + hh0.c(i2));
        return null;
    }

    public static int V(ao0 ao0Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && ao0Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return ao0Var.i(iArr[i2]) + i4;
    }

    public static final tg7 W(qz0 qz0Var) {
        Object[] objArr = new Object[0];
        boolean zD = qz0Var.d(0);
        Object objM = qz0Var.M();
        if (zD || objM == jz0.a) {
            objM = new js5(16);
            qz0Var.l0(objM);
        }
        return (tg7) o37.B(objArr, tg7.j, (bp2) objM, qz0Var, 0);
    }

    public static void X(int i2, jv4 jv4Var, rj2 rj2Var, jv4 jv4Var2, jv4... jv4VarArr) {
        if (jv4Var2 == null) {
            jv4Var2 = new jv4(new iv4[0]);
        }
        if (jv4Var != null) {
            int i3 = 0;
            while (true) {
                iv4[] iv4VarArr = jv4Var.a;
                if (i3 >= iv4VarArr.length) {
                    break;
                }
                iv4 iv4Var = iv4VarArr[i3];
                if (iv4Var instanceof wk4) {
                    wk4 wk4Var = (wk4) iv4Var;
                    if (!wk4Var.a.equals("com.android.capture.fps")) {
                        jv4Var2 = jv4Var2.a(wk4Var);
                    } else if (i2 == 2) {
                        jv4Var2 = jv4Var2.a(wk4Var);
                    }
                }
                i3++;
            }
        }
        for (jv4 jv4Var3 : jv4VarArr) {
            jv4Var2 = jv4Var2.b(jv4Var3);
        }
        if (jv4Var2.a.length > 0) {
            rj2Var.k = jv4Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y(gb6 gb6Var, iq4 iq4Var) {
        int i2 = iq4Var.b;
        long j2 = iq4Var.c;
        ImmutableList immutableList = iq4Var.a;
        if (i2 == -1) {
            if (gb6Var.f0(20)) {
                gb6Var.c0(immutableList);
                return;
            } else {
                if (immutableList.isEmpty()) {
                    return;
                }
                gb6Var.P((jp4) immutableList.get(0));
                return;
            }
        }
        if (gb6Var.f0(20)) {
            gb6Var.A(immutableList, iq4Var.b, j2);
        } else {
            if (immutableList.isEmpty()) {
                return;
            }
            gb6Var.k((jp4) immutableList.get(0), j2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String Z(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static int a0(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static int b0(Object obj) {
        return a0(obj == null ? 0 : obj.hashCode());
    }

    public static o38 c0(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new o38(f2, f3, obj);
    }

    public static lt8 e0(int i2, int i3, zy1 zy1Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            zy1Var = az1.a;
        }
        return new lt8(i2, i3, zy1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ef A[Catch: RejectedExecutionException -> 0x01ce, TryCatch #0 {RejectedExecutionException -> 0x01ce, blocks: (B:150:0x01e9, B:156:0x01f6, B:158:0x0207, B:162:0x020f, B:152:0x01ef), top: B:189:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(java.lang.String r23, final defpackage.hx4 r24, final defpackage.gj8 r25, defpackage.dp2 r26, int r27, boolean r28, final int r29, int r30, defpackage.qz0 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y97.f(java.lang.String, hx4, gj8, dp2, int, boolean, int, int, qz0, int, int):void");
    }

    public static hx4 f0(hx4 hx4Var, tg7 tg7Var) {
        Orientation orientation = Orientation.a;
        ab5 ab5Var = tg7Var.d;
        float f2 = ot0.a;
        return hx4Var.d(zk8.s(ex4.b, uc3.c)).d(new vg7(null, ab5Var, tg7Var, null, orientation, true, true)).d(new ScrollingLayoutElement(tg7Var, true));
    }

    public static final int g(j jVar, rd rdVar) {
        j jVarO0 = jVar.o0();
        if (jVarO0 == null) {
            rn3.b("Child of " + jVar + " cannot be null when calculating alignment line");
        }
        if (jVar.r0().c().containsKey(rdVar)) {
            Integer num = (Integer) jVar.r0().c().get(rdVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iN0 = jVarO0.n0(rdVar);
            if (iN0 != Integer.MIN_VALUE) {
                jVarO0.j = true;
                jVar.k = true;
                jVar.x0();
                jVarO0.j = false;
                jVar.k = false;
                return iN0 + ((int) (rdVar instanceof pc3 ? jVarO0.t0() & 4294967295L : jVarO0.t0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final gx4 h(ri1 ri1Var, int i2) {
        gx4 gx4Var = ((gx4) ri1Var).a.f;
        if (gx4Var == null || (gx4Var.d & i2) == 0) {
            return null;
        }
        while (gx4Var != null) {
            int i3 = gx4Var.c;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return gx4Var;
            }
            gx4Var = gx4Var.f;
        }
        return null;
    }

    public static final void i(zv zvVar, int i2) {
        zvVar.a = new int[i2];
        zvVar.b = new Object[i2];
    }

    public static void j(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            te.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (m) {
            try {
                te.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    public static boolean k(aq7 aq7Var, aq7 aq7Var2) {
        fb6 fb6Var = aq7Var.a;
        int i2 = fb6Var.b;
        fb6 fb6Var2 = aq7Var2.a;
        return i2 == fb6Var2.b && fb6Var.e == fb6Var2.e && fb6Var.h == fb6Var2.h && fb6Var.i == fb6Var2.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean l(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = m(r8, r9, r10)
            boolean r1 = m(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = L(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y97.l(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean m(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final hx4 n(hx4 hx4Var, a aVar) {
        return hx4Var.d(new sg0(aVar));
    }

    public static int o(long j2, long j3) {
        if (j2 == -9223372036854775807L || j3 == -9223372036854775807L) {
            return 0;
        }
        if (j3 == 0) {
            return 100;
        }
        return j29.i(j29.Z(j2, j3), 0, 100);
    }

    public static bt3 p(dp3 dp3Var, String str) {
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.b(null, null, Thread.currentThread().getId() == zk8.b);
        ct3 ct3Var = new ct3(str, dp3Var, Binder.getCallingUid());
        Void[] voidArr = new Void[0];
        while (true) {
            try {
                Object objQ = ct3Var.q(voidArr);
                js3.o(objQ, "executeWithoutInterrupt(...)");
                return (bt3) objQ;
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void q(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String r(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static int s(int i2, double d2) {
        int iMax = Math.max(i2, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d2 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i3 = iHighestOneBit << 1;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object t(m01 m01Var, i iVar) {
        if (!((gx4) m01Var).a.n) {
            rn3.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        i56 i56Var = (i56) y40.H(m01Var).D;
        i56Var.getClass();
        return wu8.G(i56Var, iVar);
    }

    public static wk4 v(jv4 jv4Var, String str) {
        int i2 = 0;
        while (true) {
            iv4[] iv4VarArr = jv4Var.a;
            if (i2 >= iv4VarArr.length) {
                return null;
            }
            iv4 iv4Var = iv4VarArr[i2];
            if (iv4Var instanceof wk4) {
                wk4 wk4Var = (wk4) iv4Var;
                if (wk4Var.a.equals(str)) {
                    return wk4Var;
                }
            }
            i2++;
        }
    }

    public static final RippleDrawable w(int i2) {
        return new RippleDrawable(ColorStateList.valueOf(i2), null, null);
    }

    public static RippleDrawable x() {
        return w(sj8.b().O.c);
    }

    public static final String y(bs1 bs1Var) {
        String strSubstring = null;
        if (bs1Var == null) {
            return null;
        }
        if (!eq.n(bs1Var)) {
            return ((es1) bs1Var).c;
        }
        int iO = eq.o(bs1Var);
        String str = (iO == 10 || iO == 40) ? "apk" : "obb";
        String str2 = ((es1) bs1Var).c;
        char c2 = bc2.a;
        if (str2 != null) {
            int iLastIndexOf = str2.lastIndexOf(46);
            if (Math.max(str2.lastIndexOf(47), str2.lastIndexOf(92)) > iLastIndexOf) {
                iLastIndexOf = -1;
            }
            strSubstring = iLastIndexOf == -1 ? str2 : str2.substring(0, iLastIndexOf);
        }
        return t61.j(strSubstring, ".", str);
    }

    public static final StateListDrawable z(int i2, float f2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, f2);
        return A(fArr, i2);
    }

    public abstract int C();

    public abstract /* bridge */ l32 d0();
}
