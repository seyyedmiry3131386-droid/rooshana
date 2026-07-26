package defpackage;

import android.text.style.UnderlineSpan;
import io.noties.markwon.core.CoreProps$ListItemType;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class gd0 extends re8 {
    public final /* synthetic */ int a;

    public /* synthetic */ gd0(int i) {
        this.a = i;
    }

    @Override // defpackage.re8
    public final void a(vp7 vp7Var, rf0 rf0Var, u2 u2Var) {
        switch (this.a) {
            case 0:
                if (u2Var.l()) {
                    re8.c(vp7Var, rf0Var, u2Var.j());
                }
                rb4 rb4Var = (rb4) vp7Var.b;
                bd0 bd0VarJ = ((r79) rb4Var.f).j(xc0.class);
                if (bd0VarJ != null) {
                    h28.c((h28) vp7Var.d, bd0VarJ.a(rb4Var, (xg5) vp7Var.c), u2Var.a, u2Var.b);
                }
                break;
            case 1:
                ym6 ym6Var = ct2.b;
                if (u2Var.l()) {
                    kd3 kd3VarJ = u2Var.j();
                    boolean zEquals = "ol".equals((String) kd3VarJ.c);
                    boolean zEquals2 = "ul".equals((String) kd3VarJ.c);
                    if (zEquals || zEquals2) {
                        rb4 rb4Var2 = (rb4) vp7Var.b;
                        xg5 xg5Var = (xg5) vp7Var.c;
                        bd0 bd0VarJ2 = ((r79) rb4Var2.f).j(x84.class);
                        int i = 0;
                        kd3 kd3Var = kd3VarJ;
                        while (true) {
                            kd3Var = kd3Var.e;
                            if (kd3Var == null) {
                                ArrayList arrayList = kd3VarJ.f;
                                int i2 = 1;
                                for (kd3 kd3Var2 : arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList)) {
                                    re8.c(vp7Var, rf0Var, kd3Var2);
                                    if (bd0VarJ2 != null && "li".equals((String) kd3Var2.c)) {
                                        if (zEquals) {
                                            ym6Var.b(xg5Var, CoreProps$ListItemType.b);
                                            ct2.d.b(xg5Var, Integer.valueOf(i2));
                                            i2++;
                                        } else {
                                            ym6Var.b(xg5Var, CoreProps$ListItemType.a);
                                            ct2.c.b(xg5Var, Integer.valueOf(i));
                                        }
                                        h28.c((h28) vp7Var.d, bd0VarJ2.a(rb4Var2, xg5Var), kd3Var2.a, kd3Var2.b);
                                    }
                                }
                                break;
                            } else {
                                String str = (String) kd3Var.c;
                                if ("ul".equals(str) || "ol".equals(str)) {
                                    i++;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (u2Var.l()) {
                    re8.c(vp7Var, rf0Var, u2Var.j());
                }
                h28 h28Var = (h28) vp7Var.d;
                rb4 rb4Var3 = (rb4) vp7Var.b;
                bd0 bd0VarJ3 = ((r79) rb4Var3.f).j(t78.class);
                h28.c(h28Var, bd0VarJ3 == null ? null : bd0VarJ3.a(rb4Var3, (xg5) vp7Var.c), u2Var.a, u2Var.b);
                break;
            default:
                if (u2Var.l()) {
                    re8.c(vp7Var, rf0Var, u2Var.j());
                }
                h28.c((h28) vp7Var.d, new UnderlineSpan(), u2Var.a, u2Var.b);
                break;
        }
    }

    @Override // defpackage.re8
    public final Collection b() {
        switch (this.a) {
            case 0:
                return Collections.singleton("blockquote");
            case 1:
                return Arrays.asList("ol", "ul");
            case 2:
                return Arrays.asList("s", "del");
            default:
                return Arrays.asList("u", "ins");
        }
    }
}
