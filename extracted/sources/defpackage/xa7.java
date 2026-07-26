package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa7 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final int d = 9;
    public static final int e = 6;
    public static final int f = 10;
    public static final int g = 5;

    public static final void a(boolean z, ResolvedTextDirection resolvedTextDirection, f fVar, qz0 qz0Var, int i) {
        int i2;
        si8 si8VarD;
        qz0Var.c0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (qz0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.d(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(fVar) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | qz0Var.f(fVar);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (zF || objM == avVar) {
                objM = new sh8(fVar, z);
                qz0Var.l0(objM);
            }
            wg8 wg8Var = (wg8) objM;
            boolean zH = (i3 == 4) | qz0Var.h(fVar);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == avVar) {
                objM2 = new uh8(fVar, z);
                qz0Var.l0(objM2);
            }
            tr5 tr5Var = (tr5) objM2;
            boolean zH2 = zi8.h(fVar.q().b);
            int i4 = (int) (z ? fVar.q().b >> 32 : fVar.q().b & 4294967295L);
            x44 x44Var = fVar.d;
            float fE = 0.0f;
            if (x44Var != null && (si8VarD = x44Var.d()) != null) {
                ri8 ri8Var = si8VarD.a;
                if (i4 >= 0) {
                    qi8 qi8Var = ri8Var.a;
                    q95 q95Var = ri8Var.b;
                    if (qi8Var.a.b.length() != 0) {
                        int iMin = Math.min(q95Var.d(i4), Math.min(q95Var.b - 1, q95Var.f - 1));
                        if (i4 <= q95Var.c(iMin, false)) {
                            q95Var.m(iMin);
                            ArrayList arrayList = q95Var.h;
                            l16 l16Var = (l16) arrayList.get(dt2.k(iMin, arrayList));
                            yg ygVar = l16Var.a;
                            int i5 = iMin - l16Var.d;
                            pi8 pi8Var = ygVar.d;
                            fE = pi8Var.e(i5) - pi8Var.g(i5);
                        }
                    }
                }
            }
            float f2 = fE;
            boolean zH3 = qz0Var.h(wg8Var);
            Object objM3 = qz0Var.M();
            if (zH3 || objM3 == avVar) {
                objM3 = new c61(2, wg8Var);
                qz0Var.l0(objM3);
            }
            tt3.g(tr5Var, z, resolvedTextDirection, zH2, 0L, f2, new zc8(wg8Var, null, (PointerInputEventHandler) objM3, 6), qz0Var, (i2 << 3) & 1008);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new yh(z, resolvedTextDirection, fVar, i);
        }
    }

    public static final Object b(vh6 vh6Var, String str, ContinuationImpl continuationImpl) {
        Object objD = vh6Var.d(str, new lc8(11), continuationImpl);
        return objD == CoroutineSingletons.a ? objD : tx8.a;
    }

    public static final String c(String str, String str2) {
        String strJ;
        return (str2 == null || (strJ = t61.j(str, "_", str2)) == null) ? str : strJ;
    }

    public static final ab7 d(yk4 yk4Var) {
        Object objV = yk4Var.v();
        if (objV instanceof ab7) {
            return (ab7) objV;
        }
        return null;
    }

    public static final float e(ab7 ab7Var) {
        if (ab7Var != null) {
            return ab7Var.a;
        }
        return 0.0f;
    }

    public static final String f(Context context, String str) {
        js3.p(str, "<this>");
        js3.p(context, "context");
        return !jr9.t(context) ? str : m88.X(m88.X(m88.X(m88.X(m88.X(m88.X(m88.X(m88.X(m88.X(m88.X(str, "0", "۰"), "1", "۱"), "2", "۲"), "3", "۳"), "4", "۴"), "5", "۵"), "6", "۶"), "7", "۷"), "8", "۸"), "9", "۹");
    }

    public static final ra7 g(ra7 ra7Var, Matrix matrix) {
        js3.p(ra7Var, "<this>");
        rn6 rn6Var = new rn6(new float[2], matrix, 5);
        long jX0 = yq2.x0(ge2.a(ra7Var.b, ra7Var.c), rn6Var);
        ListBuilder listBuilderS = br9.s();
        List list = ra7Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            listBuilderS.add(((e92) list.get(i)).a(rn6Var));
        }
        return new ra7(br9.q(listBuilderS), yq2.i0(jX0), yq2.j0(jX0));
    }

    public static final void h(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static String i(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strW;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strW = Ssh2PublicKeyAlgorithmName.NULL;
            } else {
                try {
                    strW = obj.toString();
                } catch (Exception e2) {
                    String strJ = t61.j(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e2);
                    strW = bl4.w(SimpleComparison.LESS_THAN_OPERATION, strJ, " threw ", e2.getClass().getName(), SimpleComparison.GREATER_THAN_OPERATION);
                }
            }
            objArr[i2] = strW;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
