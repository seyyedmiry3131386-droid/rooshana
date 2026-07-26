package defpackage;

import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.Rect;
import androidx.compose.ui.platform.e;
import com.google.protobuf.ByteString;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes.dex */
public final class ln2 implements u69 {
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ ln2(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    public static final ee7 a(fv fvVar, ut4 ut4Var, List list) {
        Map map;
        fvVar.getClass();
        dj5 dj5Var = (dj5) a.v0(list);
        Object obj = (dj5Var == null || (map = dj5Var.c) == null) ? null : map.get("dialog");
        zn1 zn1Var = obj instanceof zn1 ? (zn1) obj : null;
        bo1 bo1Var = zn1Var != null ? new bo1(dj5Var.b, dj5Var, a.k0(list), a.k0(list), zn1Var, (bp2) ut4Var.b) : null;
        return bo1Var == null ? new dx7(((dj5) a.u0(list)).b, (dj5) a.u0(list), a.k0(list)) : bo1Var;
    }

    public static final no7 b(no7 no7Var, rb4 rb4Var) {
        js3.p(no7Var, "<this>");
        js3.p(rb4Var, "module");
        if (!js3.i(no7Var.getKind(), qo7.b)) {
            return no7Var.isInline() ? b(no7Var.h(0), rb4Var) : no7Var;
        }
        zw3 zw3VarD = hs9.D(no7Var);
        if (zw3VarD == null) {
            return no7Var;
        }
        js3.p(EmptyList.a, "typeArgumentsSerializers");
        if (((Map) rb4Var.b).get(zw3VarD) == null) {
            return no7Var;
        }
        throw new ClassCastException();
    }

    public static String c(ByteString byteString) {
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

    public static final void d(mb7 mb7Var, String str) throws Exception {
        js3.p(mb7Var, "<this>");
        js3.p(str, "sql");
        rb7 rb7VarM1 = mb7Var.m1(str);
        try {
            rb7VarM1.f1();
            m91.i(rb7VarM1, null);
        } finally {
        }
    }

    public static final String f(int i, qz0 qz0Var) {
        return ((Resources) qz0Var.j(e.c)).getString(i);
    }

    public static final String g(int i, Object[] objArr, qz0 qz0Var) {
        return ((Resources) qz0Var.j(e.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final WriteMode h(pu3 pu3Var, no7 no7Var) {
        js3.p(no7Var, "desc");
        o37 kind = no7Var.getKind();
        if (kind instanceof ph6) {
            return WriteMode.f;
        }
        if (js3.i(kind, g98.c)) {
            return WriteMode.d;
        }
        if (!js3.i(kind, g98.d)) {
            return WriteMode.c;
        }
        no7 no7VarB = b(no7Var.h(0), pu3Var.b);
        o37 kind2 = no7VarB.getKind();
        if ((kind2 instanceof yj6) || js3.i(kind2, ro7.b)) {
            return WriteMode.e;
        }
        throw br9.h(no7VarB);
    }

    public static final void i(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static int j(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
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

    public final Rect e() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                Rect rect = this.b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
