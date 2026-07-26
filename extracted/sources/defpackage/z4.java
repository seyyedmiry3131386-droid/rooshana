package defpackage;

import android.text.TextUtils;
import androidx.compose.ui.node.b;
import androidx.compose.ui.node.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AndroidComposeView;
import ir.mservices.market.version2.webapi.responsedto.ProfileInfoDto;
import ir.myket.core.utils.EncryptionUtils$EncryptionFailedException;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 {
    public final /* synthetic */ int a = 2;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public z4(wc5 wc5Var, wv8 wv8Var, f5 f5Var, ub0 ub0Var, pt2 pt2Var, ub0 ub0Var2, e4 e4Var, f5 f5Var2, e4 e4Var2, f5 f5Var3) {
        js3.p(wc5Var, "myAccountService");
        this.b = wc5Var;
        this.c = wv8Var;
        this.d = f5Var;
        this.e = ub0Var;
        this.f = pt2Var;
        this.g = ub0Var2;
        this.h = e4Var;
        this.i = f5Var2;
        this.j = e4Var2;
        this.k = f5Var3;
    }

    public static final void a(z4 z4Var, gx4 gx4Var, m mVar) {
        for (gx4 gx4Var2 = gx4Var.e; gx4Var2 != null; gx4Var2 = gx4Var2.e) {
            if (gx4Var2 == ((fo5) z4Var.c)) {
                h hVarF = ((h) z4Var.b).F();
                mVar.s = hVarF != null ? (e) hVarF.H.d : null;
                z4Var.e = mVar;
                return;
            } else {
                if ((gx4Var2.c & 2) != 0) {
                    return;
                }
                gx4Var2.B0(mVar);
            }
        }
    }

    public static gx4 c(fx4 fx4Var, gx4 gx4Var) {
        gx4 gx4VarH;
        if (fx4Var instanceof mx4) {
            gx4VarH = ((mx4) fx4Var).h();
            gx4VarH.c = ho5.f(gx4VarH);
        } else {
            b bVar = new b();
            bVar.c = ho5.d(fx4Var);
            bVar.o = fx4Var;
            bVar.p = new HashSet();
            gx4VarH = bVar;
        }
        if (gx4VarH.n) {
            rn3.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        gx4VarH.i = true;
        gx4 gx4Var2 = gx4Var.f;
        if (gx4Var2 != null) {
            gx4Var2.e = gx4VarH;
            gx4VarH.f = gx4Var2;
        }
        gx4Var.f = gx4VarH;
        gx4VarH.e = gx4Var;
        return gx4VarH;
    }

    public static gx4 d(gx4 gx4Var) {
        boolean z = gx4Var.n;
        if (z) {
            ib5 ib5Var = ho5.a;
            if (!z) {
                rn3.b("autoInvalidateRemovedNode called on unattached node");
            }
            ho5.a(gx4Var, -1, 2);
            gx4Var.z0();
            gx4Var.r0();
        }
        gx4 gx4Var2 = gx4Var.f;
        gx4 gx4Var3 = gx4Var.e;
        if (gx4Var2 != null) {
            gx4Var2.e = gx4Var3;
            gx4Var.f = null;
        }
        if (gx4Var3 != null) {
            gx4Var3.f = gx4Var2;
            gx4Var.e = null;
        }
        js3.m(gx4Var3);
        return gx4Var3;
    }

    public static String g(lu7 lu7Var, String str) {
        String strF = lu7Var.f(str, "");
        try {
            return TextUtils.isEmpty(strF) ? "" : new String(dy3.q(strF));
        } catch (EncryptionUtils$EncryptionFailedException unused) {
            return strF;
        }
    }

    public static void n(fx4 fx4Var, fx4 fx4Var2, gx4 gx4Var) {
        if ((fx4Var instanceof mx4) && (fx4Var2 instanceof mx4)) {
            js3.n(gx4Var, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((mx4) fx4Var2).j(gx4Var);
            if (gx4Var.n) {
                ho5.c(gx4Var);
                return;
            } else {
                gx4Var.j = true;
                return;
            }
        }
        if (!(gx4Var instanceof b)) {
            rn3.b("Unknown Modifier.Node type");
            return;
        }
        b bVar = (b) gx4Var;
        boolean z = bVar.n;
        if (z) {
            if (!z) {
                rn3.b("unInitializeModifier called on unattached node");
            }
            if ((bVar.c & 8) != 0) {
                ((AndroidComposeView) y40.I(bVar)).B();
            }
        }
        bVar.o = fx4Var2;
        bVar.c = ho5.d(fx4Var2);
        if (bVar.n) {
            bVar.C0(false);
        }
        if (gx4Var.n) {
            ho5.c(gx4Var);
        } else {
            gx4Var.j = true;
        }
    }

    public void b() {
        this.c = "";
        i("", lu7.i, false);
        this.d = "";
        i("", lu7.l, true);
        this.h = "";
        i("", lu7.p, true);
        j("");
        this.e = "";
        i("", lu7.h, true);
        this.f = "";
        i("", lu7.n, true);
        this.g = "";
        i("", lu7.o, true);
        this.i = "";
        i("", lu7.r, true);
        this.j = "";
        i("", lu7.s, true);
    }

    public String e() {
        String str = (String) this.h;
        return str != null ? str : "";
    }

    public boolean f(int i) {
        return (i & ((gx4) this.g).d) != 0;
    }

    public void h() {
        for (gx4 gx4Var = (gx4) this.g; gx4Var != null; gx4Var = gx4Var.f) {
            gx4Var.y0();
            if (gx4Var.i) {
                ib5 ib5Var = ho5.a;
                if (!gx4Var.n) {
                    rn3.b("autoInvalidateInsertedNode called on unattached node");
                }
                ho5.a(gx4Var, -1, 1);
            }
            if (gx4Var.j) {
                ho5.c(gx4Var);
            }
            gx4Var.i = false;
            gx4Var.j = false;
        }
    }

    public void i(String str, String str2, boolean z) {
        lu7 lu7Var = (lu7) this.k;
        if (!z) {
            lu7Var.i(str2, str);
            return;
        }
        try {
            lu7Var.i(str2, TextUtils.isEmpty(str) ? "" : vi0.a(dy3.s(str), true));
        } catch (EncryptionUtils$EncryptionFailedException unused) {
            lu7Var.i(str2, str);
        }
    }

    public void j(String str) {
        this.b = str;
        i(str, lu7.m, false);
    }

    public void k(ProfileInfoDto profileInfoDto) {
        this.b = profileInfoDto.getAvatarURL();
        this.c = profileInfoDto.getNickname();
        this.e = profileInfoDto.getEmail();
        this.f = profileInfoDto.getPhone();
        String str = (String) this.c;
        this.c = str;
        i(str, lu7.i, false);
        String str2 = (String) this.d;
        this.d = str2;
        i(str2, lu7.l, true);
        String str3 = (String) this.h;
        this.h = str3;
        i(str3, lu7.p, true);
        j((String) this.b);
        String str4 = (String) this.e;
        this.e = str4;
        i(str4, lu7.h, true);
        String str5 = (String) this.f;
        this.f = str5;
        i(str5, lu7.n, true);
        String str6 = (String) this.g;
        this.g = str6;
        i(str6, lu7.o, true);
        String str7 = (String) this.i;
        this.i = str7;
        i(str7, lu7.r, true);
        String str8 = (String) this.j;
        this.j = str8;
        i(str8, lu7.s, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0268, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026e, code lost:
    
        r1 = r1 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r13 > r1) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015f, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        r22 = r10 - ((r5 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        if (r1 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a4, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a6, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:
    
        if (r6.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bd, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c7, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cb, code lost:
    
        if (r11 > r1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d1, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(int r32, defpackage.zb5 r33, defpackage.zb5 r34, defpackage.gx4 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4.l(int, zb5, zb5, gx4, boolean):void");
    }

    public void m() {
        g gVar;
        fy5 fy5Var;
        h hVar = (h) this.b;
        m mVar = (e) this.d;
        for (gx4 gx4Var = ((ue8) this.f).e; gx4Var != null; gx4Var = gx4Var.e) {
            f14 f14VarK = y40.k(gx4Var);
            if (f14VarK != null) {
                m mVar2 = gx4Var.h;
                if (mVar2 != null) {
                    gVar = (g) mVar2;
                    f14 f14Var = gVar.V;
                    gVar.k1(f14VarK);
                    if (f14Var != gx4Var && (fy5Var = gVar.N) != null) {
                        fy5Var.invalidate();
                    }
                } else {
                    gVar = new g(hVar, f14VarK);
                    gx4Var.B0(gVar);
                }
                mVar.s = gVar;
                gVar.r = mVar;
                mVar = gVar;
            } else {
                gx4Var.B0(mVar);
            }
        }
        h hVarF = hVar.F();
        mVar.s = hVarF != null ? (e) hVarF.H.d : null;
        this.e = mVar;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[");
                gx4 gx4Var = (gx4) this.g;
                ue8 ue8Var = (ue8) this.f;
                if (gx4Var == ue8Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (gx4Var != null && gx4Var != ue8Var) {
                            sb.append(String.valueOf(gx4Var));
                            if (gx4Var.f == ue8Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                gx4Var = gx4Var.f;
                            }
                        }
                    }
                }
                String string = sb.toString();
                js3.o(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public z4(h hVar) {
        this.b = hVar;
        fo5 fo5Var = new fo5();
        fo5Var.d = -1;
        this.c = fo5Var;
        e eVar = new e(hVar);
        this.d = eVar;
        this.e = eVar;
        ue8 ue8Var = eVar.V;
        this.f = ue8Var;
        this.g = ue8Var;
        this.j = new zb5(0, new hx4[16]);
    }

    public z4(lu7 lu7Var) {
        this.k = lu7Var;
    }
}
