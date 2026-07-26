package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class lg0 {
    public static final byte[] a;

    static {
        String str = j29.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(h26 h26Var) {
        int i = h26Var.b;
        h26Var.K(4);
        if (h26Var.j() != 1751411826) {
            i += 4;
        }
        h26Var.J(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x09e4 A[LOOP:18: B:495:0x09e4->B:633:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:627:? A[LOOP:15: B:483:0x09ab->B:627:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:? A[LOOP:16: B:487:0x09c5->B:629:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:? A[LOOP:17: B:490:0x09cd->B:631:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.h26 r50, int r51, int r52, int r53, int r54, java.lang.String r55, boolean r56, androidx.media3.common.DrmInitData r57, defpackage.aj0 r58, int r59) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 3252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg0.b(h26, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, aj0, int):void");
    }

    public static hg0 c(int i, h26 h26Var) {
        h26Var.J(i + 12);
        h26Var.K(1);
        d(h26Var);
        h26Var.K(2);
        int iX = h26Var.x();
        if ((iX & 128) != 0) {
            h26Var.K(2);
        }
        if ((iX & 64) != 0) {
            h26Var.K(h26Var.x());
        }
        if ((iX & 32) != 0) {
            h26Var.K(2);
        }
        h26Var.K(1);
        d(h26Var);
        String strE = tv4.e(h26Var.x());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new hg0(strE, null, -1L, -1L);
        }
        h26Var.K(4);
        long jZ = h26Var.z();
        long jZ2 = h26Var.z();
        h26Var.K(1);
        int iD = d(h26Var);
        long j = jZ2;
        byte[] bArr = new byte[iD];
        h26Var.h(bArr, 0, iD);
        if (j <= 0) {
            j = -1;
        }
        return new hg0(strE, bArr, j, jZ > 0 ? jZ : -1L);
    }

    public static int d(h26 h26Var) {
        int iX = h26Var.x();
        int i = iX & 127;
        while ((iX & 128) == 128) {
            iX = h26Var.x();
            i = (i << 7) | (iX & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static jv4 f(r85 r85Var) {
        wk4 wk4Var;
        s85 s85VarG = r85Var.g(1751411826);
        s85 s85VarG2 = r85Var.g(1801812339);
        s85 s85VarG3 = r85Var.g(1768715124);
        if (s85VarG != null && s85VarG2 != null && s85VarG3 != null) {
            h26 h26Var = s85VarG.c;
            h26Var.J(16);
            if (h26Var.j() == 1835299937) {
                h26 h26Var2 = s85VarG2.c;
                h26Var2.J(12);
                int iJ = h26Var2.j();
                String[] strArr = new String[iJ];
                for (int i = 0; i < iJ; i++) {
                    int iJ2 = h26Var2.j();
                    h26Var2.K(4);
                    strArr[i] = h26Var2.v(iJ2 - 8, StandardCharsets.UTF_8);
                }
                h26 h26Var3 = s85VarG3.c;
                h26Var3.J(8);
                ArrayList arrayList = new ArrayList();
                while (h26Var3.a() > 8) {
                    int i2 = h26Var3.b;
                    int iJ3 = h26Var3.j();
                    int iJ4 = h26Var3.j() - 1;
                    if (iJ4 < 0 || iJ4 >= iJ) {
                        o40.E(iJ4, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[iJ4];
                        int i3 = i2 + iJ3;
                        while (true) {
                            int i4 = h26Var3.b;
                            if (i4 >= i3) {
                                wk4Var = null;
                                break;
                            }
                            int iJ5 = h26Var3.j();
                            if (h26Var3.j() == 1684108385) {
                                int iJ6 = h26Var3.j();
                                int iJ7 = h26Var3.j();
                                int i5 = iJ5 - 16;
                                byte[] bArr = new byte[i5];
                                h26Var3.h(bArr, 0, i5);
                                wk4Var = new wk4(bArr, str, iJ7, iJ6);
                                break;
                            }
                            h26Var3.J(i4 + iJ5);
                        }
                        if (wk4Var != null) {
                            arrayList.add(wk4Var);
                        }
                    }
                    h26Var3.J(i2 + iJ3);
                }
                if (!arrayList.isEmpty()) {
                    return new jv4(arrayList);
                }
            }
        }
        return null;
    }

    public static w85 g(h26 h26Var) {
        long jR;
        long jR2;
        h26Var.J(8);
        if (e(h26Var.j()) == 0) {
            jR = h26Var.z();
            jR2 = h26Var.z();
        } else {
            jR = h26Var.r();
            jR2 = h26Var.r();
        }
        return new w85(jR, jR2, h26Var.z());
    }

    public static Pair h(h26 h26Var, int i, int i2) throws ParserException {
        Integer num;
        wo8 wo8Var;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = h26Var.b;
        while (i5 - i < i2) {
            h26Var.J(i5);
            int iJ = h26Var.j();
            hs9.w("childAtomSize must be positive", iJ > 0);
            if (h26Var.j() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strV = null;
                while (i6 - i5 < iJ) {
                    h26Var.J(i6);
                    int iJ2 = h26Var.j();
                    int iJ3 = h26Var.j();
                    if (iJ3 == 1718775137) {
                        numValueOf = Integer.valueOf(h26Var.j());
                    } else if (iJ3 == 1935894637) {
                        h26Var.K(4);
                        strV = h26Var.v(4, StandardCharsets.UTF_8);
                    } else if (iJ3 == 1935894633) {
                        i8 = i6;
                        i7 = iJ2;
                    }
                    i6 += iJ2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strV) || "cbc1".equals(strV) || "cens".equals(strV) || "cbcs".equals(strV)) {
                    hs9.w("frma atom is mandatory", numValueOf != null);
                    hs9.w("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            wo8Var = null;
                            break;
                        }
                        h26Var.J(i9);
                        int iJ4 = h26Var.j();
                        if (h26Var.j() == 1952804451) {
                            int iE = e(h26Var.j());
                            h26Var.K(1);
                            if (iE == 0) {
                                h26Var.K(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iX = h26Var.x();
                                i3 = iX & 15;
                                i4 = (iX & 240) >> 4;
                            }
                            if (h26Var.x() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iX2 = h26Var.x();
                            byte[] bArr2 = new byte[16];
                            h26Var.h(bArr2, 0, 16);
                            if (z && iX2 == 0) {
                                int iX3 = h26Var.x();
                                byte[] bArr3 = new byte[iX3];
                                h26Var.h(bArr3, 0, iX3);
                                bArr = bArr3;
                            }
                            num = num2;
                            wo8Var = new wo8(z, strV, iX2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iJ4;
                        }
                    }
                    hs9.w("tenc atom is mandatory", wo8Var != null);
                    String str = j29.a;
                    pairCreate = Pair.create(num, wo8Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iJ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x095d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.aj0 i(defpackage.h26 r65, defpackage.kg0 r66, java.lang.String r67, androidx.media3.common.DrmInitData r68, boolean r69) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 3471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg0.i(h26, kg0, java.lang.String, androidx.media3.common.DrmInitData, boolean):aj0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r23 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0829 A[PHI: r15
      0x0829: PHI (r15v20 int) = (r15v19 int), (r15v33 int) binds: [B:331:0x07e8, B:339:0x0828] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList j(defpackage.r85 r54, defpackage.kq2 r55, long r56, androidx.media3.common.DrmInitData r58, boolean r59, boolean r60, defpackage.yp2 r61) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 2523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg0.j(r85, kq2, long, androidx.media3.common.DrmInitData, boolean, boolean, yp2):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bb, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        r1.J(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c1, code lost:
    
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c6, code lost:
    
        r9 = 16777215 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cd, code lost:
    
        if (r9 != 6516084) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cf, code lost:
    
        r9 = defpackage.y97.O(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d7, code lost:
    
        if (r9 == 7233901) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01dc, code lost:
    
        if (r9 != 7631467) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e3, code lost:
    
        if (r9 == 6516589) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e8, code lost:
    
        if (r9 != 7828084) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ef, code lost:
    
        if (r9 != 6578553) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f1, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01fb, code lost:
    
        if (r9 != 4280916) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fd, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0207, code lost:
    
        if (r9 != 7630703) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0209, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0213, code lost:
    
        if (r9 != 6384738) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0215, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x021f, code lost:
    
        if (r9 != 7108978) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        r1.J(r7);
        r7 = r7 + r13;
        r1.K(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0221, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x022b, code lost:
    
        if (r9 != 6776174) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x022d, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0235, code lost:
    
        if (r9 != 6779504) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0237, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x023f, code lost:
    
        defpackage.wn5.w("Skipped unknown metadata entry: " + defpackage.hh0.c(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0252, code lost:
    
        r1.J(r13);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0257, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025f, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0267, code lost:
    
        if (r9 == null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0269, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026c, code lost:
    
        r3 = r17;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0273, code lost:
    
        r1.J(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0276, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0277, code lost:
    
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027d, code lost:
    
        if (r6.isEmpty() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x027f, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r13 >= r7) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0281, code lost:
    
        r12 = new defpackage.jv4(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r13 = r1.j() + r13;
        r0 = r1.j();
        r10 = (r0 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r10 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r10 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r0 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        r0 = defpackage.th3.a(defpackage.y97.R(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r9 = new defpackage.ei8("TCON", r12, com.google.common.collect.ImmutableList.s(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        defpackage.wn5.k0("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r1.J(r13);
        r17 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r0 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        r9 = defpackage.y97.Q(r0, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r0 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r9 = defpackage.y97.Q(r0, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        if (r0 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        r9 = defpackage.y97.S(r0, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        if (r0 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        r9 = defpackage.y97.S(r0, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (r0 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        r9 = defpackage.y97.P(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
    
        if (r0 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e9, code lost:
    
        if (r0 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        if (r0 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (r0 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        if (r0 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (r0 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        if (r0 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
    
        r9 = defpackage.y97.S(r0, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0134, code lost:
    
        if (r0 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0136, code lost:
    
        r9 = defpackage.y97.S(r0, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
    
        if (r0 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0143, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014e, code lost:
    
        if (r0 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0150, code lost:
    
        r9 = defpackage.y97.T(r0, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        if (r0 != 757935405) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0161, code lost:
    
        r14 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
    
        if (r14 >= r13) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        r15 = r1.j();
        r12 = r1.j();
        r17 = r3;
        r1.K(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0176, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0178, code lost:
    
        r0 = r1.t(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0182, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0184, code lost:
    
        r8 = r1.t(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018e, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0190, code lost:
    
        r9 = r14;
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0192, code lost:
    
        r1.K(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
    
        r3 = r17 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019b, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019d, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019f, code lost:
    
        if (r8 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a2, code lost:
    
        if (r9 != (-1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a5, code lost:
    
        r1.J(r9);
        r1.K(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b8, code lost:
    
        r9 = new defpackage.wr3(r0, r8, r1.t(r10 - 16));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.jv4 k(defpackage.s85 r18) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg0.k(s85):jv4");
    }
}
