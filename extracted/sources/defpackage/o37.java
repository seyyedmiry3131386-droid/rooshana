package defpackage;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class o37 {
    public final /* synthetic */ int a;

    public /* synthetic */ o37(int i) {
        this.a = i;
    }

    public static final Object A(Object[] objArr, bp2 bp2Var, qz0 qz0Var) {
        return C(Arrays.copyOf(objArr, objArr.length), wn5.c, bp2Var, qz0Var, 3456, 0);
    }

    public static final Object B(Object[] objArr, td7 td7Var, bp2 bp2Var, qz0 qz0Var, int i) {
        return C(Arrays.copyOf(objArr, objArr.length), td7Var, bp2Var, qz0Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object C(Object[] objArr, td7 td7Var, bp2 bp2Var, qz0 qz0Var, int i, int i2) {
        Object[] objArr2;
        td7 td7Var2;
        Object obj;
        Object objE;
        long j = qz0Var.T;
        js3.q(36);
        String string = Long.toString(j, 36);
        js3.o(string, "toString(...)");
        js3.n(td7Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        fd7 fd7Var = (fd7) qz0Var.j(hd7.a);
        Object objM = qz0Var.M();
        Object obj2 = jz0.a;
        if (objM == obj2) {
            Object objC = (fd7Var == null || (objE = fd7Var.e(string)) == null) ? null : td7Var.c(objE);
            if (objC == null) {
                objC = bp2Var.invoke();
            }
            objArr2 = objArr;
            td7Var2 = td7Var;
            Object ad7Var = new ad7(td7Var2, fd7Var, string, objC, objArr2);
            qz0Var.l0(ad7Var);
            objM = ad7Var;
        } else {
            objArr2 = objArr;
            td7Var2 = td7Var;
        }
        ad7 ad7Var2 = (ad7) objM;
        Object objInvoke = Arrays.equals(objArr2, ad7Var2.e) ? ad7Var2.d : null;
        if (objInvoke == null) {
            objInvoke = bp2Var.invoke();
        }
        boolean zH = qz0Var.h(ad7Var2) | ((((i & 112) ^ 48) > 32 && qz0Var.h(td7Var2)) || (i & 48) == 32) | qz0Var.h(fd7Var) | qz0Var.f(string) | qz0Var.h(objInvoke) | qz0Var.h(objArr2);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object gyVar = new gy(ad7Var2, td7Var2, fd7Var, string, obj, objArr3);
            qz0Var.l0(gyVar);
            objM2 = gyVar;
        } else {
            obj = objInvoke;
        }
        zk8.k((bp2) objM2, qz0Var);
        return obj;
    }

    public static int D(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static Rect b(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static String e(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                while (i6 < i3) {
                    byte b3 = byteBuffer.get(i6);
                    if (b3 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.c();
                }
                i += 2;
                o27.b(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.c();
                }
                int i8 = i + 2;
                i += 3;
                o27.c(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.c();
                }
                byte b4 = byteBuffer.get(i6);
                int i9 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                o27.a(b2, b4, b5, byteBuffer.get(i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static final boolean g(String str, String str2) {
        js3.p(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    js3.o(strSubstring, "substring(...)");
                    return js3.i(f88.J0(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static void h(View view, z99 z99Var) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        aa9 aa9Var = new aa9();
        aa9Var.a = paddingStart;
        aa9Var.b = paddingTop;
        aa9Var.c = paddingEnd;
        aa9Var.d = paddingBottom;
        rn6 rn6Var = new rn6(z99Var, aa9Var, 14);
        WeakHashMap weakHashMap = q69.a;
        h69.m(view, rn6Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new y69(1));
        }
    }

    public static float i(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final String k(Collection collection) {
        js3.p(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return g88.N(a.t0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static final String l(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static ViewGroup m(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static void n(View view, boolean z) {
        qf9 qf9VarI;
        if (z && (qf9VarI = q69.i(view)) != null) {
            qf9VarI.a.g(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean o(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static final String q(Collection collection) {
        return g88.N(a.t0(collection, ",", null, null, null, 62)) + g88.N(" }");
    }

    public static final String r(Collection collection) {
        return g88.N(a.t0(collection, ",", null, null, null, 62)) + g88.N("},");
    }

    public static PorterDuff.Mode t(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static int w(int i, int i2, int i3, ByteBuffer byteBuffer) {
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6 = i2;
        if (i != 0) {
            if (i6 >= i3) {
                return i;
            }
            byte b3 = (byte) i;
            if (b3 < -32) {
                if (b3 < -62) {
                    return -1;
                }
                int i7 = i6 + 1;
                if (byteBuffer.get(i6) > -65) {
                    return -1;
                }
                i6 = i7;
            } else if (b3 < -16) {
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    i5 = i6 + 1;
                    b2 = byteBuffer.get(i6);
                    if (i5 >= i3) {
                        return z.e(b3, b2);
                    }
                } else {
                    b2 = b4;
                    i5 = i6;
                }
                if (b2 > -65) {
                    return -1;
                }
                if (b3 == -32 && b2 < -96) {
                    return -1;
                }
                if (b3 == -19 && b2 >= -96) {
                    return -1;
                }
                i6 = i5 + 1;
                if (byteBuffer.get(i5) > -65) {
                    return -1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i6 + 1;
                    b5 = byteBuffer.get(i6);
                    if (i4 >= i3) {
                        return z.e(b3, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i6;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = byteBuffer.get(i4);
                    if (i8 >= i3) {
                        return z.f(b3, b5, b6);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 > -65) {
                    return -1;
                }
                if ((((b5 + 112) + (b3 << 28)) >> 30) != 0 || b > -65) {
                    return -1;
                }
                i6 = i4 + 1;
                if (byteBuffer.get(i4) > -65) {
                    return -1;
                }
            }
        }
        o37 o37Var = z.a;
        int i9 = i3 - 7;
        int i10 = i6;
        while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        int i11 = (i10 - i6) + i6;
        while (i11 < i3) {
            int i12 = i11 + 1;
            byte b7 = byteBuffer.get(i11);
            if (b7 >= 0) {
                i11 = i12;
            } else if (b7 < -32) {
                if (i12 >= i3) {
                    return b7;
                }
                if (b7 < -62 || byteBuffer.get(i12) > -65) {
                    return -1;
                }
                i11 += 2;
            } else if (b7 < -16) {
                if (i12 >= i3 - 1) {
                    return z.b(b7, i12, i3 - i12, byteBuffer);
                }
                int i13 = i11 + 2;
                byte b8 = byteBuffer.get(i12);
                if (b8 > -65) {
                    return -1;
                }
                if (b7 == -32 && b8 < -96) {
                    return -1;
                }
                if ((b7 == -19 && b8 >= -96) || byteBuffer.get(i13) > -65) {
                    return -1;
                }
                i11 += 3;
            } else {
                if (i12 >= i3 - 2) {
                    return z.b(b7, i12, i3 - i12, byteBuffer);
                }
                int i14 = i11 + 2;
                byte b9 = byteBuffer.get(i12);
                if (b9 > -65) {
                    return -1;
                }
                if ((((b9 + 112) + (b7 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i15 = i11 + 3;
                if (byteBuffer.get(i14) > -65) {
                    return -1;
                }
                i11 += 4;
                if (byteBuffer.get(i15) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final List y(rb7 rb7Var) {
        int iE = sb7.e(rb7Var, "id");
        int iE2 = sb7.e(rb7Var, "seq");
        int iE3 = sb7.e(rb7Var, "from");
        int iE4 = sb7.e(rb7Var, "to");
        ListBuilder listBuilderS = br9.s();
        while (rb7Var.f1()) {
            listBuilderS.add(new oj2((int) rb7Var.getLong(iE), (int) rb7Var.getLong(iE2), rb7Var.B0(iE3), rb7Var.B0(iE4)));
        }
        return a.I0(br9.q(listBuilderS));
    }

    public static final ke8 z(mb7 mb7Var, String str, boolean z) throws Exception {
        rb7 rb7VarM1 = mb7Var.m1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iE = sb7.e(rb7VarM1, "seqno");
            int iE2 = sb7.e(rb7VarM1, "cid");
            int iE3 = sb7.e(rb7VarM1, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int iE4 = sb7.e(rb7VarM1, "desc");
            if (iE != -1 && iE2 != -1 && iE3 != -1 && iE4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (rb7VarM1.f1()) {
                    if (((int) rb7VarM1.getLong(iE2)) >= 0) {
                        int i = (int) rb7VarM1.getLong(iE);
                        String strB0 = rb7VarM1.B0(iE3);
                        String str2 = rb7VarM1.getLong(iE4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strB0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listJ0 = a.J0(linkedHashMap.entrySet(), new ek6(6));
                ArrayList arrayList = new ArrayList(wu0.V(listJ0, 10));
                Iterator it = listJ0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listP0 = a.P0(arrayList);
                List listJ02 = a.J0(linkedHashMap2.entrySet(), new ek6(7));
                ArrayList arrayList2 = new ArrayList(wu0.V(listJ02, 10));
                Iterator it2 = listJ02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                ke8 ke8Var = new ke8(str, z, listP0, a.P0(arrayList2));
                m91.i(rb7VarM1, null);
                return ke8Var;
            }
            m91.i(rb7VarM1, null);
            return null;
        } finally {
        }
    }

    public abstract String d(byte[] bArr, int i, int i2);

    public abstract String f(ByteBuffer byteBuffer, int i, int i2);

    public int hashCode() {
        switch (this.a) {
            case 2:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract int j(byte[] bArr, String str, int i, int i2);

    public boolean p(byte[] bArr, int i, int i2) {
        return v(bArr, 0, i, i2) == 0;
    }

    public abstract Object s(int i, Object obj, ContinuationImpl continuationImpl);

    public String toString() {
        switch (this.a) {
            case 2:
                String strD = g27.a(getClass()).d();
                js3.m(strD);
                return strD;
            default:
                return super.toString();
        }
    }

    public int u(int i, int i2, int i3, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return byteBuffer.isDirect() ? x(i, i2, i3, byteBuffer) : w(i, i2, i3, byteBuffer);
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        return v(byteBuffer.array(), i, i2 + iArrayOffset, iArrayOffset + i3);
    }

    public abstract int v(byte[] bArr, int i, int i2, int i3);

    public abstract int x(int i, int i2, int i3, ByteBuffer byteBuffer);
}
