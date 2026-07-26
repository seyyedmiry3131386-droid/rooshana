package androidx.compose.ui.focus;

import android.view.View;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.dp2;
import defpackage.eb5;
import defpackage.gx4;
import defpackage.js3;
import defpackage.kg2;
import defpackage.lg2;
import defpackage.mb5;
import defpackage.mg2;
import defpackage.rn3;
import defpackage.ti1;
import defpackage.ue8;
import defpackage.y40;
import defpackage.z4;
import defpackage.zb5;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class c implements lg2 {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final a d;
    public eb5 f;
    public d h;
    public final d c = new d(2, null, 14);
    public final mg2 e = new mg2(this);
    public final mb5 g = new mb5(1);

    public c(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new a(this, androidComposeView2);
    }

    public final boolean a(boolean z) {
        z4 z4Var;
        if (f() != null) {
            d dVarF = f();
            i(null);
            if (dVarF != null) {
                dVarF.D0(FocusStateImpl.a, FocusStateImpl.c);
                if (!dVarF.a.n) {
                    rn3.b("visitAncestors called on an unattached node");
                }
                gx4 gx4Var = dVarF.a.e;
                h hVarH = y40.H(dVarF);
                while (hVarH != null) {
                    if ((((gx4) hVarH.H.g).d & 1024) != 0) {
                        while (gx4Var != null) {
                            if ((gx4Var.c & 1024) != 0) {
                                zb5 zb5Var = null;
                                gx4 gx4VarJ = gx4Var;
                                while (gx4VarJ != null) {
                                    if (gx4VarJ instanceof d) {
                                        ((d) gx4VarJ).D0(FocusStateImpl.b, FocusStateImpl.c);
                                    } else if ((gx4VarJ.c & 1024) != 0 && (gx4VarJ instanceof ti1)) {
                                        int i = 0;
                                        for (gx4 gx4Var2 = ((ti1) gx4VarJ).p; gx4Var2 != null; gx4Var2 = gx4Var2.f) {
                                            if ((gx4Var2.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    gx4VarJ = gx4Var2;
                                                } else {
                                                    if (zb5Var == null) {
                                                        zb5Var = new zb5(0, new gx4[16]);
                                                    }
                                                    if (gx4VarJ != null) {
                                                        zb5Var.b(gx4VarJ);
                                                        gx4VarJ = null;
                                                    }
                                                    zb5Var.b(gx4Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    gx4VarJ = y40.j(zb5Var);
                                }
                            }
                            gx4Var = gx4Var.e;
                        }
                    }
                    hVarH = hVarH.F();
                    gx4Var = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = e.n(this.c, i).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        AndroidComposeView androidComposeView = this.a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x0172, B:130:0x0178, B:131:0x017b, B:133:0x0186, B:136:0x0194, B:140:0x019e, B:143:0x01a4, B:144:0x01a9, B:164:0x01e3, B:145:0x01ad, B:147:0x01b3, B:149:0x01b7, B:151:0x01bf, B:153:0x01c5, B:157:0x01cd, B:159:0x01d6, B:160:0x01da, B:161:0x01dd, B:165:0x01e8, B:166:0x01eb, B:168:0x01f1, B:170:0x01f5, B:173:0x01fe, B:175:0x0206, B:182:0x021d, B:184:0x0222, B:186:0x0226, B:209:0x0268, B:190:0x0232, B:192:0x0238, B:194:0x023c, B:196:0x0244, B:198:0x024a, B:202:0x0252, B:204:0x025b, B:205:0x025f, B:206:0x0262, B:210:0x026d, B:214:0x027d, B:216:0x0282, B:218:0x0286, B:241:0x02c8, B:222:0x0292, B:224:0x0298, B:226:0x029c, B:228:0x02a4, B:230:0x02aa, B:234:0x02b2, B:236:0x02bb, B:237:0x02bf, B:238:0x02c2, B:243:0x02cf, B:245:0x02d6, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007d, B:46:0x0087, B:77:0x00dc, B:79:0x00e0, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e6, B:82:0x00ec, B:83:0x00ef, B:85:0x00f9, B:88:0x0107, B:92:0x0111, B:123:0x0166, B:125:0x016a, B:95:0x0116, B:97:0x011c, B:99:0x0120, B:101:0x0128, B:103:0x012e, B:107:0x0136, B:109:0x013f, B:110:0x0143, B:111:0x0146, B:114:0x014c, B:115:0x0151, B:116:0x0154, B:118:0x015a, B:120:0x015e), top: B:254:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [gx4] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [zb5] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [zb5] */
    /* JADX WARN: Type inference failed for: r0v24, types: [gx4] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [gx4] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [gx4] */
    /* JADX WARN: Type inference failed for: r15v5, types: [gx4] */
    /* JADX WARN: Type inference failed for: r15v9, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v36, types: [zb5] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [zb5] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.KeyEvent r14, defpackage.bp2 r15) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.c.d(android.view.KeyEvent, bp2):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x011d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean e(int r19, defpackage.sy6 r20, defpackage.dp2 r21) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.c.e(int, sy6, dp2):java.lang.Boolean");
    }

    public final d f() {
        d dVar = this.h;
        if (dVar == null || !dVar.n) {
            return null;
        }
        return dVar;
    }

    public final boolean g(final int i, boolean z) {
        d dVarF = f();
        AndroidComposeView androidComposeView = this.a;
        if (dVarF == null || !dVarF.o || !androidComposeView.v(i)) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.a = Boolean.FALSE;
            d dVarF2 = f();
            Boolean boolE = e(i, androidComposeView.getEmbeddedViewFocusRect(), new dp2() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    Boolean boolValueOf = Boolean.valueOf(((d) obj).J0(i));
                    ref$ObjectRef.a = boolValueOf;
                    return boolValueOf;
                }
            });
            if (!js3.i(boolE, Boolean.TRUE) || dVarF2 == f()) {
                if (boolE != null && ref$ObjectRef.a != null) {
                    if (!boolE.booleanValue() || !((Boolean) ref$ObjectRef.a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && b(i, false, false)) {
                            Boolean boolE2 = e(i, null, new dp2() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.dp2
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(((d) obj).J0(i));
                                }
                            });
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(final int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new dp2() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((d) obj).J0(i));
            }
        });
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(d dVar) {
        d dVar2 = this.h;
        this.h = dVar;
        mb5 mb5Var = this.g;
        Object[] objArr = mb5Var.a;
        int i = mb5Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((kg2) objArr[i2]).a(dVar2, dVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        r3 = r4.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (((r4.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r41 = 1;
        r37 = r12;
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        r3 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        if (r3 <= r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        if (java.lang.Long.compare((((long) r4.d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r3 = r4.a;
        r5 = r4.c;
        r6 = r4.b;
        r14 = (r5 + 7) >> 3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f5, code lost:
    
        if (r15 >= r14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f7, code lost:
    
        r9 = r3[r15] & (-9187201950435737472L);
        r3[r15] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r15 = r15 + 1;
        r11 = r11;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0112, code lost:
    
        r37 = r12;
        r25 = 128;
        r13 = r11;
        r9 = defpackage.ew.L0(r3);
        r10 = r9 - 1;
        r14 = 72057594037927935L;
        r3[r10] = (r3[r10] & 72057594037927935L) | (-72057594037927936L);
        r3[r9] = r3[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
    
        if (r9 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0133, code lost:
    
        r10 = r9 >> 3;
        r23 = (r9 & 7) << 3;
        r11 = (r3[r10] >> r23) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0141, code lost:
    
        if (r11 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0143, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        if (r11 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014b, code lost:
    
        r11 = r6[r9];
        r11 = ((int) (r11 ^ (r11 >>> r31))) * r32;
        r11 = r11 ^ (r11 << 16);
        r12 = r11 >>> 7;
        r24 = r4.b(r12);
        r12 = r12 & r5;
        r30 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016b, code lost:
    
        if ((((r24 - r12) & r5) / 8) != (((r9 - r12) & r5) / 8)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016d, code lost:
    
        r39 = r14;
        r3[r10] = (((long) (r11 & 127)) << r23) | (r3[r10] & (~(255 << r23)));
        r3[r3.length - r7] = (r3[0] & r39) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r13 = r30;
        r14 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018f, code lost:
    
        r39 = r14;
        r12 = r24 >> 3;
        r13 = r3[r12];
        r15 = (r24 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019f, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a1, code lost:
    
        r41 = r7;
        r42 = r8;
        r27 = r5;
        r44 = r6;
        r3[r12] = ((~(255 << r15)) & r13) | (((long) (r11 & 127)) << r15);
        r3[r10] = (r3[r10] & (~(255 << r23))) | (128 << r23);
        r44[r24] = r44[r9];
        r44[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c6, code lost:
    
        r27 = r5;
        r44 = r6;
        r41 = r7;
        r42 = r8;
        r3[r12] = (((long) (r11 & 127)) << r15) | ((~(255 << r15)) & r13);
        r5 = r44[r24];
        r44[r24] = r44[r9];
        r44[r9] = r5;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e3, code lost:
    
        r3[r3.length - 1] = (r3[0] & r39) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r6 = r44;
        r5 = r27;
        r13 = r30;
        r14 = r39;
        r7 = r41;
        r8 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fe, code lost:
    
        r41 = r7;
        r42 = r8;
        r4.e = defpackage.ce7.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0211, code lost:
    
        r41 = 1;
        r42 = r8;
        r37 = r12;
        r25 = 128;
        r3 = defpackage.ce7.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r3);
        r3 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0230, code lost:
    
        if (r10 >= r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023f, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0241, code lost:
    
        r11 = r6[r10];
        r13 = ((int) ((r11 >>> r31) ^ r11)) * r32;
        r13 = r13 ^ (r13 << 16);
        r14 = r4.b(r13 >>> 7);
        r15 = r5;
        r16 = r6;
        r5 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r5 = (r3[r13] & (~(255 << r17))) | (r5 << r17);
        r3[r13] = r5;
        r3[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r14] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x027b, code lost:
    
        r15 = r5;
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027e, code lost:
    
        r10 = r10 + 1;
        r5 = r15;
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0284, code lost:
    
        r3 = r4.b(r42);
        r41 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0288, code lost:
    
        r30 = r3;
        r4.d++;
        r3 = r4.e;
        r5 = r4.a;
        r6 = r30 >> 3;
        r7 = r5[r6];
        r9 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02a2, code lost:
    
        if (((r7 >> r9) & 255) != r25) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a4, code lost:
    
        r22 = r41 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a6, code lost:
    
        r4.e = r3 - r22;
        r3 = r4.c;
        r7 = (r7 & (~(255 << r9))) | (r37 << r9);
        r5[r6] = r7;
        r5[(((r30 - 7) & r3) + (r3 & 7)) >> 3] = r7;
        r41 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0350, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0352, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(android.view.KeyEvent r44) {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.c.j(android.view.KeyEvent):boolean");
    }
}
