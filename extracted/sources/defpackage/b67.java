package defpackage;

import android.text.Spanned;
import android.view.View;
import androidx.recyclerview.widget.k;
import coil3.request.NullRequestDataException;
import com.google.android.gms.internal.auth.zzef;
import java.lang.reflect.Type;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b67 {
    public static final /* synthetic */ int a = 0;
    public static rm8 b;

    public static final p32 a(pi3 pi3Var, Throwable th) {
        wh3 wh3Var;
        if (th instanceof NullRequestDataException) {
            dp2 dp2Var = pi3Var.o;
            ni3 ni3Var = pi3Var.u;
            wh3Var = (wh3) dp2Var.invoke(pi3Var);
            if (wh3Var == null) {
                wh3Var = (wh3) ni3Var.j.invoke(pi3Var);
            }
            if (wh3Var == null && (wh3Var = (wh3) pi3Var.n.invoke(pi3Var)) == null) {
                wh3Var = (wh3) ni3Var.i.invoke(pi3Var);
            }
        } else {
            wh3Var = (wh3) pi3Var.n.invoke(pi3Var);
            if (wh3Var == null) {
                wh3Var = (wh3) pi3Var.u.i.invoke(pi3Var);
            }
        }
        return new p32(wh3Var, pi3Var, th);
    }

    public static int b(b07 b07Var, vz1 vz1Var, View view, View view2, k kVar, boolean z) {
        if (kVar.w() == 0 || b07Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(k.H(view) - k.H(view2)) + 1;
        }
        return Math.min(vz1Var.n(), vz1Var.d(view2) - vz1Var.g(view));
    }

    public static int c(b07 b07Var, vz1 vz1Var, View view, View view2, k kVar, boolean z, boolean z2) {
        if (kVar.w() == 0 || b07Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (b07Var.b() - Math.max(k.H(view), k.H(view2))) - 1) : Math.max(0, Math.min(k.H(view), k.H(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(vz1Var.d(view2) - vz1Var.g(view)) / (Math.abs(k.H(view) - k.H(view2)) + 1))) + (vz1Var.m() - vz1Var.g(view)));
        }
        return iMax;
    }

    public static int d(b07 b07Var, vz1 vz1Var, View view, View view2, k kVar, boolean z) {
        if (kVar.w() == 0 || b07Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b07Var.b();
        }
        return (int) (((vz1Var.d(view2) - vz1Var.g(view)) / (Math.abs(k.H(view) - k.H(view2)) + 1)) * b07Var.b());
    }

    public static final boolean e(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final px3 f(rb4 rb4Var, Type type) {
        js3.p(rb4Var, "<this>");
        js3.p(type, "type");
        px3 px3VarL = c67.l(rb4Var, type, true);
        if (px3VarL != null) {
            return px3VarL;
        }
        Class clsH = c67.h(type);
        js3.p(clsH, "<this>");
        throw new SerializationException(yq2.s0(g27.a(clsH)));
    }

    public static String g(zzef zzefVar) {
        StringBuilder sb = new StringBuilder(zzefVar.e());
        for (int i = 0; i < zzefVar.e(); i++) {
            byte bA = zzefVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
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
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
