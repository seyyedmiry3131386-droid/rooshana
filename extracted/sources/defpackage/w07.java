package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.j256.ormlite.stmt.query.SimpleComparison;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.reels.ui.recycler.ReelData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w07 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static void a(View view) {
        WeakHashMap weakHashMap = q69.a;
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2);
        view.setPivotX(view.getMeasuredWidth() / 2);
        q69.b(view).d(null);
    }

    public static void b(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain ".concat(str));
        }
    }

    public static final ReelData c(v07 v07Var, int i) {
        if (v07Var == null) {
            return null;
        }
        RecyclerItem recyclerItem = (RecyclerItem) a.q0(i, (ArrayList) v07Var.D().d);
        MyketRecyclerData myketRecyclerData = recyclerItem != null ? recyclerItem.c : null;
        return (ReelData) (myketRecyclerData instanceof ReelData ? myketRecyclerData : null);
    }

    public static final long d(double d) {
        return h((float) d, 4294967296L);
    }

    public static final long e(int i) {
        return h(i, 4294967296L);
    }

    public static final ResolvedTextDirection f(ri8 ri8Var, int i) {
        qi8 qi8Var = ri8Var.a;
        q95 q95Var = ri8Var.b;
        if (qi8Var.a.b.length() != 0) {
            int iD = q95Var.d(i);
            if ((i != 0 && iD == q95Var.d(i - 1)) || (i != qi8Var.a.b.length() && iD == q95Var.d(i + 1))) {
                return ri8Var.a(i);
            }
        }
        return ri8Var.g(i);
    }

    public static List g(fz7 fz7Var, int i, fz7 fz7Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iU = fz7Var.u(i);
        int i4 = i + iU;
        int iF = fz7Var.f(i);
        int iF2 = fz7Var.f(i4);
        int i5 = iF2 - iF;
        boolean z5 = i >= 0 && (fz7Var.b[(fz7Var.r(i) * 5) + 1] & 201326592) != 0;
        fz7Var2.w(iU);
        fz7Var2.x(i5, fz7Var2.t);
        if (fz7Var.g < i4) {
            fz7Var.B(i4);
        }
        if (fz7Var.k < iF2) {
            fz7Var.C(iF2, i4);
        }
        int[] iArr = fz7Var2.b;
        int i6 = fz7Var2.t;
        int i7 = i6 * 5;
        ew.x0(i7, i * 5, i4 * 5, fz7Var.b, iArr);
        Object[] objArr = fz7Var2.c;
        int i8 = fz7Var2.i;
        System.arraycopy(fz7Var.c, iF, objArr, i8, i5);
        int i9 = fz7Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iU;
        int iG = i8 - fz7Var2.g(iArr, i6);
        int i12 = fz7Var2.m;
        int i13 = fz7Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iG2 = fz7Var2.g(iArr, i15) + iG;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = fz7Var2.k;
            }
            iArr2[(i15 * 5) + 4] = fz7.i(iG2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        fz7Var2.m = i14;
        int iB = ez7.b(fz7Var.d, i, fz7Var.p());
        int iB2 = ez7.b(fz7Var.d, i4, fz7Var.p());
        if (iB < iB2) {
            ArrayList arrayList = fz7Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i17 = iB; i17 < iB2; i17++) {
                ge geVar = (ge) arrayList.get(i17);
                geVar.a += i10;
                arrayList2.add(geVar);
            }
            fz7Var2.d.addAll(ez7.b(fz7Var2.d, fz7Var2.t, fz7Var2.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = EmptyList.a;
        }
        if (!list.isEmpty()) {
            HashMap map = fz7Var.e;
            HashMap map2 = fz7Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = fz7Var2.v;
        fz7Var2.Q(i9);
        int iG3 = fz7Var.G(fz7Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iG3 >= 0;
            if (z7) {
                fz7Var.R();
                fz7Var.a(iG3 - fz7Var.t);
                fz7Var.R();
            }
            fz7Var.a(i - fz7Var.t);
            boolean zJ = fz7Var.J();
            if (z7) {
                fz7Var.O();
                fz7Var.j();
                fz7Var.O();
                fz7Var.j();
            }
            z4 = zJ;
        } else {
            boolean zK = fz7Var.K(i, iU);
            fz7Var.L(iF, i5, i - 1);
            z4 = zK;
        }
        if (z4) {
            sz0.a("Unexpectedly removed anchors");
        }
        int i20 = fz7Var2.o;
        int i21 = iArr3[i7 + 1];
        fz7Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            fz7Var2.t = i11;
            fz7Var2.i = i8 + i5;
        }
        if (z6) {
            fz7Var2.W(i9);
        }
        return list;
    }

    public static final long h(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        kj8[] kj8VarArr = jj8.b;
        return jFloatToRawIntBits;
    }

    public static final cd7 i(qz0 qz0Var) {
        qz0Var.a0(1967007413);
        Object[] objArr = new Object[0];
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = new js5(13);
            qz0Var.l0(objM);
        }
        cd7 cd7Var = (cd7) o37.B(objArr, cd7.e, (bp2) objM, qz0Var, 384);
        cd7Var.c = (fd7) qz0Var.j(hd7.a);
        qz0Var.q(false);
        return cd7Var;
    }

    public static String j(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = Ssh2PublicKeyAlgorithmName.NULL;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strZ = bl4.z(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strZ), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb = new StringBuilder(name2.length() + strZ.length() + 8 + 1);
                    sb.append(SimpleComparison.LESS_THAN_OPERATION);
                    sb.append(strZ);
                    sb.append(" threw ");
                    sb.append(name2);
                    sb.append(SimpleComparison.GREATER_THAN_OPERATION);
                    string = sb.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, iIndexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
