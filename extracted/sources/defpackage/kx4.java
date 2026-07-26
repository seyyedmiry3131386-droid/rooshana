package defpackage;

import androidx.compose.ui.node.b;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class kx4 {
    public final zb5 a = new zb5(0, new b[16]);
    public final zb5 b = new zb5(0, new mn6[16]);
    public final zb5 c = new zb5(0, new h[16]);
    public final zb5 d = new zb5(0, new mn6[16]);

    public kx4(AndroidComposeView androidComposeView) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static void a(gx4 gx4Var, mn6 mn6Var) {
        if (!gx4Var.a.n) {
            rn3.b("visitSubtreeIf called on an unattached node");
        }
        zb5 zb5Var = new zb5(0, new gx4[16]);
        gx4 gx4Var2 = gx4Var.a;
        gx4 gx4Var3 = gx4Var2.f;
        if (gx4Var3 == null) {
            y40.g(zb5Var, gx4Var2);
        } else {
            zb5Var.b(gx4Var3);
        }
        while (true) {
            int i = zb5Var.c;
            if (i == 0) {
                return;
            }
            gx4 gx4Var4 = (gx4) zb5Var.l(i - 1);
            if ((gx4Var4.d & 32) != 0) {
                for (gx4 gx4Var5 = gx4Var4; gx4Var5 != null && gx4Var5.n; gx4Var5 = gx4Var5.f) {
                    if ((gx4Var5.c & 32) != 0) {
                        ?? J = gx4Var5;
                        ?? zb5Var2 = 0;
                        while (J != 0) {
                            if (J instanceof lx4) {
                                if (((lx4) J).N().d(mn6Var)) {
                                    break;
                                }
                            } else if ((J.c & 32) != 0 && (J instanceof ti1)) {
                                gx4 gx4Var6 = ((ti1) J).p;
                                int i2 = 0;
                                J = J;
                                zb5Var2 = zb5Var2;
                                while (gx4Var6 != null) {
                                    if ((gx4Var6.c & 32) != 0) {
                                        i2++;
                                        zb5Var2 = zb5Var2;
                                        if (i2 == 1) {
                                            J = gx4Var6;
                                        } else {
                                            if (zb5Var2 == 0) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (J != 0) {
                                                zb5Var2.b(J);
                                                J = 0;
                                            }
                                            zb5Var2.b(gx4Var6);
                                        }
                                    }
                                    gx4Var6 = gx4Var6.f;
                                    J = J;
                                    zb5Var2 = zb5Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = y40.j(zb5Var2);
                        }
                    }
                }
            }
            y40.g(zb5Var, gx4Var4);
        }
    }
}
