package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.compose.foundation.f;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.k;
import androidx.compose.material3.n;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.transition.Visibility;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.sentry.h4;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a;
import kotlin.coroutines.EmptyCoroutineContext;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class sb7 {
    public static final void a(hx4 hx4Var, nm7 nm7Var, bp2 bp2Var, qz0 qz0Var, int i) {
        hx4 hx4Var2;
        qz0 qz0Var2 = qz0Var;
        js3.p(nm7Var, "item");
        qz0Var2.c0(2080985918);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? qz0Var2.f(nm7Var) : qz0Var2.h(nm7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var2.h(bp2Var) ? 256 : 128;
        }
        if (qz0Var2.R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) qz0Var2.j(e.b);
            ex4 ex4Var = ex4.b;
            hx4 hx4VarC = b.c(ex4Var, 1.0f);
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = o40.r(qz0Var2);
            }
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarZ = yh0.z(f.a(hx4VarC, (ab5) objM, r97.a(0.0f, 3, ((tj8) objJ).z), false, new v97(3), bp2Var, 12), ml9.q(hq6.space_16, qz0Var2));
            bb0 bb0Var = eq.m;
            fv fvVar = jv.a;
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var2)), bb0Var, qz0Var2, 48);
            long j = qz0Var2.T;
            int i3 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarZ);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cb7VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i3), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC2);
            g16 g16VarG = rf0.G(br6.player_ic_tick, qz0Var2);
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            long j2 = ((tj8) objJ2).j;
            hx4 hx4VarI = b.i(ex4Var, ml9.q(hq6.size_24, qz0Var2));
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && qz0Var2.h(nm7Var));
            Object objM2 = qz0Var2.M();
            if (z || objM2 == avVar) {
                objM2 = new a67(7, nm7Var);
                qz0Var2.l0(objM2);
            }
            hx4Var2 = ex4Var;
            kh3.a(g16VarG, androidx.compose.ui.graphics.d.a(hx4VarI, (dp2) objM2), j2, qz0Var2, 56, 0);
            String strF = xa7.f(context, nm7Var.b);
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).g;
            Object objJ3 = qz0Var2.j(u58Var);
            js3.m(objJ3);
            mi8.b(strF, null, ((tj8) objJ3).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131066);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i, 16, hx4Var2, nm7Var, bp2Var);
        }
    }

    public static final void b(hx4 hx4Var, bf6 bf6Var, final n nVar, final bp2 bp2Var, qz0 qz0Var, int i) {
        hx4 hx4Var2;
        n nVar2;
        int i2;
        js3.p(bf6Var, "singleSelectionBottomSheetNavKey");
        qz0Var.c0(-946288225);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? qz0Var.f(bf6Var) : qz0Var.h(bf6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 2048 : 1024;
        }
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                nVar = k.f(6, 2, qz0Var);
                i2 = i3 & (-897);
                hx4Var = ex4.b;
            } else {
                qz0Var.U();
                i2 = i3 & (-897);
            }
            int i4 = i2;
            hx4 hx4Var3 = hx4Var;
            qz0Var.r();
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = zk8.x(EmptyCoroutineContext.a, qz0Var);
                qz0Var.l0(objM);
            }
            final e71 e71Var = (e71) objM;
            n nVar3 = nVar;
            wu8.c(hx4Var3, bf6Var.a, bf6Var.b, s7.X(-2139471739, new rp2() { // from class: qx7
                @Override // defpackage.rp2
                public final Object a(Object obj, Object obj2, Object obj3) {
                    nm7 nm7Var = (nm7) obj;
                    qz0 qz0Var2 = (qz0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    js3.p(nm7Var, "item");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? qz0Var2.f(nm7Var) : qz0Var2.h(nm7Var) ? 4 : 2;
                    }
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        n nVar4 = nVar;
                        boolean zF = qz0Var2.f(nVar4);
                        boolean z = false;
                        e71 e71Var2 = e71Var;
                        boolean zH = zF | qz0Var2.h(e71Var2);
                        bp2 bp2Var2 = bp2Var;
                        boolean zF2 = zH | qz0Var2.f(bp2Var2);
                        if ((iIntValue & 14) == 4 || ((iIntValue & 8) != 0 && qz0Var2.h(nm7Var))) {
                            z = true;
                        }
                        boolean z2 = zF2 | z;
                        Object objM2 = qz0Var2.M();
                        if (z2 || objM2 == jz0.a) {
                            objM2 = new pp(nVar4, e71Var2, bp2Var2, nm7Var, 10);
                            qz0Var2.l0(objM2);
                        }
                        sb7.a(null, nm7Var, (bp2) objM2, qz0Var2, (iIntValue << 3) & 112);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), nVar3, bp2Var, qz0Var, (i4 & 14) | 3072 | ((i4 << 6) & 458752));
            hx4Var2 = hx4Var3;
            nVar2 = nVar3;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            nVar2 = nVar;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(hx4Var2, bf6Var, nVar2, bp2Var, i, 10);
        }
    }

    public static final int e(rb7 rb7Var, String str) {
        js3.p(rb7Var, "<this>");
        int iF = f(rb7Var, str);
        if (iF >= 0) {
            return iF;
        }
        int iF2 = f(rb7Var, "`" + str + '`');
        if (iF2 >= 0) {
            return iF2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = rb7Var.getColumnCount();
        String strConcat = ".".concat(str);
        String strM = rm7.m('`', ".", str);
        for (int i = 0; i < columnCount; i++) {
            String columnName = rb7Var.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (m88.S(columnName, strConcat, false) || (columnName.charAt(0) == '`' && m88.S(columnName, strM, false)))) {
                return i;
            }
        }
        return -1;
    }

    public static final int f(rb7 rb7Var, String str) {
        js3.p(rb7Var, "<this>");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int columnCount = rb7Var.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (str.equals(rb7Var.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static ObjectAnimator g(View view, wr8 wr8Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Visibility visibility) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) wr8Var.b.getTag(nr6.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        xr8 xr8Var = new xr8(view, wr8Var.b, translationX, translationY);
        visibility.a(xr8Var);
        objectAnimatorOfPropertyValuesHolder.addListener(xr8Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static String h(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte bC = byteString.c(i);
            if (bC == 34) {
                sb.append("\\\"");
            } else if (bC == 39) {
                sb.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb.append('\\');
                            sb.append((char) (((bC >>> 6) & 3) + 48));
                            sb.append((char) (((bC >>> 3) & 7) + 48));
                            sb.append((char) ((bC & 7) + 48));
                        } else {
                            sb.append((char) bC);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String i(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final int j(rb7 rb7Var, String str) {
        js3.p(rb7Var, "stmt");
        int iE = e(rb7Var, str);
        if (iE >= 0) {
            return iE;
        }
        int columnCount = rb7Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(rb7Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + a.t0(arrayList, null, null, null, null, 63) + ']');
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static String o(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = Ssh2PublicKeyAlgorithmName.NULL;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder sbN = t61.n(SimpleComparison.LESS_THAN_OPERATION, str2, " threw ");
                    sbN.append(e.getClass().getName());
                    sbN.append(SimpleComparison.GREATER_THAN_OPERATION);
                    string = sbN.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
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

    public static void p(String str, String str2, String str3) {
        StringBuilder sbC = bl4.C(str2);
        sbC.append(str3 == null ? "" : o40.y(" (", str3, ")"));
        h4.b().w(t61.j(str, ":", sbC.toString()));
    }

    public abstract int c(int i, View view);

    public abstract int d(int i, View view);

    public int k(View view) {
        return 0;
    }

    public int l() {
        return 0;
    }

    public abstract void t(int i);

    public abstract void u(View view, int i, int i2);

    public abstract void v(View view, float f, float f2);

    public abstract boolean w(int i, View view);

    public void r(int i) {
    }

    public void q(int i, int i2) {
    }

    public void s(int i, View view) {
    }
}
