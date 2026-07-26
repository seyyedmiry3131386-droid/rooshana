package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.animation.core.a;
import androidx.compose.foundation.layout.LayoutOrientation;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes.dex */
public abstract class dt2 {
    public static final zk a = new zk(Float.POSITIVE_INFINITY);
    public static final al b = new al(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final bl c = new bl(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final cl d = new cl(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final zk e = new zk(Float.NEGATIVE_INFINITY);
    public static final al f = new al(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final bl g = new bl(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final cl h = new cl(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final w81 i = new w81();
    public static final rl3 j = new rl3();
    public static final ql3 k = new ql3();
    public static final jh l = new jh(1022);
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A(int r7, java.lang.CharSequence r8) {
        /*
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto L8
            return r1
        L8:
            char r0 = r8.charAt(r7)
            r2 = 92
            r3 = 60
            if (r0 != r3) goto L39
        L12:
            int r7 = r7 + 1
            int r0 = r8.length()
            if (r7 >= r0) goto L38
            char r0 = r8.charAt(r7)
            r4 = 10
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            r4 = 62
            if (r0 == r4) goto L35
            if (r0 == r2) goto L2b
            goto L12
        L2b:
            int r0 = r7 + 1
            boolean r4 = defpackage.ub1.x(r0, r8)
            if (r4 == 0) goto L12
            r7 = r0
            goto L12
        L35:
            int r7 = r7 + 1
            return r7
        L38:
            return r1
        L39:
            r0 = 0
            r3 = r7
        L3b:
            int r4 = r8.length()
            if (r3 >= r4) goto L79
            char r4 = r8.charAt(r3)
            if (r4 == 0) goto L75
            r5 = 32
            if (r4 == r5) goto L75
            if (r4 == r2) goto L69
            r6 = 40
            if (r4 == r6) goto L64
            r5 = 41
            if (r4 == r5) goto L5e
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 == 0) goto L72
            if (r3 == r7) goto L78
            goto L77
        L5e:
            if (r0 != 0) goto L61
            goto L77
        L61:
            int r0 = r0 + (-1)
            goto L72
        L64:
            int r0 = r0 + 1
            if (r0 <= r5) goto L72
            goto L78
        L69:
            int r4 = r3 + 1
            boolean r5 = defpackage.ub1.x(r4, r8)
            if (r5 == 0) goto L72
            r3 = r4
        L72:
            int r3 = r3 + 1
            goto L3b
        L75:
            if (r3 == r7) goto L78
        L77:
            return r3
        L78:
            return r1
        L79:
            int r7 = r8.length()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt2.A(int, java.lang.CharSequence):int");
    }

    public static int B(int i2, CharSequence charSequence) {
        while (i2 < charSequence.length()) {
            switch (charSequence.charAt(i2)) {
                case '[':
                    return -1;
                case '\\':
                    int i3 = i2 + 1;
                    if (ub1.x(i3, charSequence)) {
                        i2 = i3;
                    }
                    break;
                case ']':
                    return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C(java.lang.CharSequence r3, int r4, char r5) {
        /*
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L28
            char r0 = r3.charAt(r4)
            r1 = 92
            if (r0 != r1) goto L18
            int r1 = r4 + 1
            boolean r2 = defpackage.ub1.x(r1, r3)
            if (r2 == 0) goto L18
            r4 = r1
            goto L25
        L18:
            if (r0 != r5) goto L1b
            return r4
        L1b:
            r1 = 41
            if (r5 != r1) goto L25
            r1 = 40
            if (r0 != r1) goto L25
            r3 = -1
            return r3
        L25:
            int r4 = r4 + 1
            goto L0
        L28:
            int r3 = r3.length()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt2.C(java.lang.CharSequence, int, char):int");
    }

    public static void D(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final long E(long j2) {
        LayoutOrientation layoutOrientation = LayoutOrientation.a;
        return j31.a(h31.j(j2), h31.h(j2), h31.i(j2), h31.g(j2));
    }

    public static final void F(vg6 vg6Var, long j2, dp2 dp2Var, boolean z) {
        MotionEvent motionEventA = vg6Var.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
        dp2Var.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        motionEventA.setAction(action);
    }

    public static final String G(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    public static final void H(va5 va5Var) {
        int i2;
        js3.p(va5Var, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = va5Var.a;
        int i3 = va5Var.b;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= i3) {
                break;
            }
            float f2 = fArr[i4];
            if (!boolValueOf.booleanValue() || 0.0f > f2 || f2 > 1.0f) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            i4++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException("FloatMapping - Progress outside of range: ".concat(va5.c(va5Var, 31)).toString());
        }
        Iterable iterableZ = ok4.Z(1, va5Var.b);
        if ((iterableZ instanceof Collection) && ((Collection) iterableZ).isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = iterableZ.iterator();
            i2 = 0;
            while (((tq3) it).c) {
                int iNextInt = ((mq3) it).nextInt();
                if (va5Var.b(iNextInt) < va5Var.b(iNextInt - 1) && (i2 = i2 + 1) < 0) {
                    br9.O();
                    throw null;
                }
            }
        }
        if (!(i2 <= 1)) {
            throw new IllegalArgumentException("FloatMapping - Progress wraps more than once: ".concat(va5.c(va5Var, 31)).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void I(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.cl6 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt2.I(android.content.Context, java.util.concurrent.Executor, cl6, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean J(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt2.J(android.content.Context):boolean");
    }

    public static a a(float f2) {
        return new a(Float.valueOf(f2), c26.h, Float.valueOf(0.01f), 8);
    }

    public static kotlinx.coroutines.channels.a b(int i2, int i3, BufferOverflow bufferOverflow) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            bufferOverflow = BufferOverflow.a;
        }
        if (i2 == -2) {
            if (bufferOverflow != BufferOverflow.a) {
                return new g11(1, bufferOverflow);
            }
            cp0.c0.getClass();
            return new kotlinx.coroutines.channels.a(bp0.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.a ? new kotlinx.coroutines.channels.a(i2) : new g11(i2, bufferOverflow) : new kotlinx.coroutines.channels.a(Integer.MAX_VALUE) : bufferOverflow == BufferOverflow.a ? new kotlinx.coroutines.channels.a(0) : new g11(1, bufferOverflow);
        }
        if (bufferOverflow == BufferOverflow.a) {
            return new g11(1, BufferOverflow.b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final jx9 c() {
        return new jx9(new Paint(7));
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final byte e(char c2) {
        if (c2 < '~') {
            return rp0.b[c2];
        }
        return (byte) 0;
    }

    public static int f(int i2, int i3) {
        long j2 = ((long) i2) + ((long) i3);
        int i4 = (int) j2;
        if (j2 == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i2 + ", " + i3 + ")");
    }

    public static long g(long j2, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.a;
        return j31.a(layoutOrientation == layoutOrientation2 ? h31.j(j2) : h31.i(j2), layoutOrientation == layoutOrientation2 ? h31.h(j2) : h31.g(j2), layoutOrientation == layoutOrientation2 ? h31.i(j2) : h31.j(j2), layoutOrientation == layoutOrientation2 ? h31.g(j2) : h31.h(j2));
    }

    public static ImageView.ScaleType h(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static long i(int i2, long j2) {
        return j31.a(0, h31.h(j2), (i2 & 4) != 0 ? h31.i(j2) : 0, h31.g(j2));
    }

    public static final int j(int i2, List list) {
        int i3;
        int i4 = ((l16) kotlin.collections.a.u0(list)).c;
        if (i2 > ((l16) kotlin.collections.a.u0(list)).c) {
            sn3.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            l16 l16Var = (l16) list.get(i3);
            byte b2 = l16Var.b > i2 ? (byte) 1 : l16Var.c <= i2 ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        StringBuilder sbR = rm7.r(i3, "Found paragraph index ", " should be in range [0, ");
        sbR.append(list.size());
        sbR.append(").\nDebug info: index=");
        sbR.append(i2);
        sbR.append(", paragraphs=[");
        sbR.append(k94.a(list, null, new i25(6), 31));
        sbR.append(']');
        sn3.a(sbR.toString());
        return i3;
    }

    public static final int k(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            l16 l16Var = (l16) list.get(i4);
            byte b2 = l16Var.d > i2 ? (byte) 1 : l16Var.e <= i2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int l(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((l16) kotlin.collections.a.u0(arrayList)).g) {
            return br9.y(arrayList);
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            l16 l16Var = (l16) arrayList.get(i3);
            byte b2 = l16Var.f > f2 ? (byte) 1 : l16Var.g <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void m(ArrayList arrayList, long j2, dp2 dp2Var) {
        int size = arrayList.size();
        for (int iJ = j(zi8.g(j2), arrayList); iJ < size; iJ++) {
            l16 l16Var = (l16) arrayList.get(iJ);
            if (l16Var.b >= zi8.f(j2)) {
                return;
            }
            if (l16Var.b != l16Var.c) {
                dp2Var.invoke(l16Var);
            }
        }
    }

    public static final bo9 n(Context context) {
        yk9 yk9Var;
        rq4.o(context, "Context must not be null");
        bo9 bo9Var = new bo9(context, bo9.m, null, eu2.c);
        wv wvVar = yk9.d;
        synchronized (yk9.class) {
            try {
                wk9 wk9Var = new wk9(bo9Var);
                wv wvVar2 = yk9.d;
                if (!wvVar2.containsKey(wk9Var)) {
                    wvVar2.put(wk9Var, new yk9());
                }
                yk9Var = (yk9) wvVar2.get(wk9Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        bo9Var.l = yk9Var;
        return bo9Var;
    }

    public static Set o() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static Object p(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return q3.e(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final String q(Object obj) {
        js3.p(obj, "<this>");
        return ax3.a(g27.a(obj.getClass())) + '@' + obj.hashCode();
    }

    public static final yu8 r(Object obj) {
        return new yu8(g27.a(obj.getClass()));
    }

    public static Serializable s(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return q3.h(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static final void t(w61 w61Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = a71.a.iterator();
        while (it.hasNext()) {
            try {
                ((z61) it.next()).y(w61Var, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    wu8.f(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            wu8.f(th, new DiagnosticCoroutineContextException(w61Var));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float u(defpackage.va5 r7, defpackage.va5 r8, float r9) {
        /*
            java.lang.String r0 = "xValues"
            defpackage.js3.p(r7, r0)
            java.lang.String r0 = "yValues"
            defpackage.js3.p(r8, r0)
            r0 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 > 0) goto L94
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 > 0) goto L94
            r1 = 0
            int r2 = r7.b
            uq3 r1 = defpackage.ok4.Z(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8c
            r2 = r1
            mq3 r2 = (defpackage.mq3) r2
            int r2 = r2.nextInt()
            float r3 = r7.b(r2)
            int r4 = r2 + 1
            int r5 = r7.b
            int r5 = r4 % r5
            float r5 = r7.b(r5)
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 < 0) goto L48
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L20
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 > 0) goto L20
            goto L50
        L48:
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L50
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 > 0) goto L20
        L50:
            int r1 = r7.b
            int r4 = r4 % r1
            float r1 = r7.b(r4)
            float r3 = r7.b(r2)
            float r1 = r1 - r3
            float r1 = defpackage.p29.d(r1, r0)
            float r3 = r8.b(r4)
            float r4 = r8.b(r2)
            float r3 = r3 - r4
            float r3 = defpackage.p29.d(r3, r0)
            r4 = 981668463(0x3a83126f, float:0.001)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L77
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L81
        L77:
            float r7 = r7.b(r2)
            float r9 = r9 - r7
            float r7 = defpackage.p29.d(r9, r0)
            float r7 = r7 / r1
        L81:
            float r8 = r8.b(r2)
            float r3 = r3 * r7
            float r3 = r3 + r8
            float r7 = defpackage.p29.d(r3, r0)
            return r7
        L8c:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r8 = "Collection contains no element matching the predicate."
            r7.<init>(r8)
            throw r7
        L94:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid progress: "
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt2.u(va5, va5, float):float");
    }

    public static hl4 v(yi yiVar, ra7 ra7Var) {
        List listB;
        js3.p(ra7Var, "polygon");
        ArrayList<h81> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = ra7Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            e92 e92Var = (e92) list.get(i2);
            List list2 = e92Var.a;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if ((e92Var instanceof c92) && i3 == list2.size() / 2) {
                    arrayList2.add(new Pair(e92Var, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i3));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iV = wu0.V(arrayList, 9);
        if (iV == 0) {
            listB = br9.B(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iV + 1);
            arrayList3.add(fValueOf);
            for (h81 h81Var : arrayList) {
                float fFloatValue = fValueOf.floatValue();
                float fC = yiVar.c(h81Var);
                if (fC < 0.0f) {
                    throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                fValueOf = Float.valueOf(fFloatValue + fC);
                arrayList3.add(fValueOf);
            }
            listB = arrayList3;
        }
        float fFloatValue2 = ((Number) kotlin.collections.a.u0(listB)).floatValue();
        va5 va5Var = new va5(listB.size());
        int size3 = listB.size();
        for (int i4 = 0; i4 < size3; i4++) {
            va5Var.a(((Number) listB.get(i4)).floatValue() / fFloatValue2);
        }
        ListBuilder listBuilderS = br9.s();
        int size4 = arrayList2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            int iIntValue = ((Number) ((Pair) arrayList2.get(i5)).b).intValue();
            listBuilderS.add(new lm6((va5Var.b(iIntValue + 1) + va5Var.b(iIntValue)) / 2, (e92) ((Pair) arrayList2.get(i5)).a));
        }
        return new hl4(yiVar, br9.q(listBuilderS), arrayList, va5Var);
    }

    public static void w(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(io.sentry.config.a.k(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void x(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final k79 y(ps0 ps0Var, u79 u79Var, l71 l71Var, lf7 lf7Var, bp2 bp2Var) {
        js3.p(u79Var, "viewModelStore");
        js3.p(l71Var, "extras");
        o77 o77Var = new o77(u79Var, new yy2(ps0Var, lf7Var, bp2Var), l71Var);
        ps0Var.b();
        String strB = ps0Var.b();
        if (strB != null) {
            return o77Var.u(ps0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final void z(om0 om0Var, g51 g51Var, boolean z) {
        Object obj = om0.g.get(om0Var);
        Throwable thH = om0Var.h(obj);
        Object objA = thH != null ? b.a(thH) : om0Var.i(obj);
        if (!z) {
            g51Var.resumeWith(objA);
            return;
        }
        js3.n(g51Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        qp1 qp1Var = (qp1) g51Var;
        ContinuationImpl continuationImpl = qp1Var.e;
        Object obj2 = qp1Var.g;
        w61 context = continuationImpl.getContext();
        Object objP = is3.P(context, obj2);
        ox8 ox8VarB = objP != is3.j ? ct2.B(continuationImpl, context, objP) : null;
        try {
            continuationImpl.resumeWith(objA);
            if (ox8VarB == null || ox8VarB.o0()) {
                is3.H(context, objP);
            }
        } catch (Throwable th) {
            if (ox8VarB == null || ox8VarB.o0()) {
                is3.H(context, objP);
            }
            throw th;
        }
    }
}
