package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import androidx.compose.ui.platform.p;
import androidx.media3.exoplayer.ExoPlayer;
import java.text.BreakIterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ib7 {
    public static final void a(hx4 hx4Var, a aVar, qz0 qz0Var, int i) {
        qz0Var.c0(-1854833411);
        int i2 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = lh.f;
                qz0Var.l0(objM);
            }
            cl4 cl4Var = (cl4) objM;
            long j = qz0Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var.l();
            hx4 hx4VarC = b.c(qz0Var, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, d.f, cl4Var);
            ia7.o(qz0Var, d.e, j56VarL);
            ia7.g(qz0Var, Integer.valueOf(i3), d.g);
            ia7.n(qz0Var, d.h);
            ia7.o(qz0Var, d.d, hx4VarC);
            aVar.invoke(qz0Var, 6);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new iz(hx4Var, aVar, i, 19);
        }
    }

    public static final void b(pg0 pg0Var, hx4 hx4Var, ExoPlayer exoPlayer, qz0 qz0Var, int i) {
        int i2;
        boolean z;
        gj8 gj8Var;
        float fQ;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(239166292);
        if ((i & 6) == 0) {
            i2 = (qz0Var2.f(pg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var2.f(hx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var2.h(exoPlayer) ? 256 : 128;
        }
        if (qz0Var2.R(i2 & 1, (i2 & 147) != 146)) {
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.h("");
                qz0Var2.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            float fB = pg0Var.b();
            qj1 qj1Var = pg0Var.a;
            long j = pg0Var.b;
            wb5 wb5VarK = g.k(Boolean.valueOf(au1.a(fB, h31.c(j) ? qj1Var.J(h31.g(j)) : Float.POSITIVE_INFINITY) > 0), qz0Var2);
            View view = (View) qz0Var2.j(e.f);
            boolean zH = qz0Var2.h(view) | qz0Var2.h(exoPlayer);
            Object objM2 = qz0Var2.M();
            if (zH || objM2 == avVar) {
                objM2 = new vt(exoPlayer, view, wb5Var, 25);
                qz0Var2.l0(objM2);
            }
            int i3 = (i2 >> 6) & 14;
            zk8.d(exoPlayer, (dp2) objM2, qz0Var2);
            cl4 cl4VarD = bg0.d(eq.c, false);
            long j2 = qz0Var2.T;
            int i4 = (int) ((j2 >>> 32) ^ j2);
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = b.c(qz0Var2, hx4Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cl4VarD);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i4), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            androidx.media3.ui.compose.a.a(exoPlayer, null, 0, qz0Var2, i3, 6);
            if (f88.n0((CharSequence) wb5Var.getValue())) {
                z = false;
                qz0Var2.a0(-1963466136);
            } else {
                qz0Var2.a0(-1960293751);
                String str = (String) wb5Var.getValue();
                if (((Boolean) wb5VarK.getValue()).booleanValue()) {
                    qz0Var2.a0(-755968859);
                    gj8Var = ((wf5) qz0Var2.j(aw8.a)).f;
                } else {
                    qz0Var2.a0(-755967612);
                    gj8Var = ((wf5) qz0Var2.j(aw8.a)).i;
                }
                qz0Var2.q(false);
                gj8 gj8Var2 = gj8Var;
                u58 u58Var = uj8.a;
                Object objJ = qz0Var2.j(u58Var);
                js3.m(objJ);
                long j3 = ((tj8) objJ).I.a;
                hx4 hx4VarA = ng0.a.a(ex4.b, eq.j);
                if (((Boolean) wb5VarK.getValue()).booleanValue()) {
                    qz0Var2.a0(-1959992524);
                    fQ = ml9.q(hq6.space_24, qz0Var2);
                    qz0Var2.q(false);
                } else {
                    qz0Var2.a0(-1959935949);
                    qz0Var2.q(false);
                    fQ = 0;
                }
                hx4 hx4VarD = yh0.D(hx4VarA, ml9.q(hq6.space_24, qz0Var2), 0.0f, ml9.q(hq6.space_24, qz0Var2), fQ, 2);
                Object objJ2 = qz0Var2.j(u58Var);
                js3.m(objJ2);
                z = false;
                mi8.b(str, yh0.A(rq4.f(hx4VarD, ((tj8) objJ2).J.f, la7.a(ml9.q(hq6.radius_8, qz0Var2))), ml9.q(hq6.space_12, qz0Var2), ml9.q(hq6.space_6, qz0Var2)), j3, 0L, 0L, new of8(3), 0L, 0, false, 0, 0, gj8Var2, qz0Var, 0, 0, 130040);
                qz0Var2 = qz0Var;
            }
            qz0Var2.q(z);
            qz0Var2.q(true);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new p59(pg0Var, hx4Var, exoPlayer, i, 1);
        }
    }

    public static final void c(pg0 pg0Var, hx4 hx4Var, ExoPlayer exoPlayer, qz0 qz0Var, int i) {
        int i2;
        hx4 hx4Var2 = hx4Var;
        qz0 qz0Var2 = qz0Var;
        js3.p(pg0Var, "<this>");
        js3.p(exoPlayer, "player");
        qz0Var2.c0(-1876724813);
        if ((i & 6) == 0) {
            i2 = (qz0Var2.f(pg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var2.f(hx4Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var2.h(exoPlayer) ? 256 : 128;
        }
        if (!qz0Var2.R(i2 & 1, (i2 & 147) != 146)) {
            qz0Var2.U();
        } else if (((Boolean) qz0Var2.j(p.a)).booleanValue()) {
            qz0Var2.a0(-1919472859);
            Object objJ = qz0Var2.j(uj8.a);
            js3.m(objJ);
            mi8.b("Player view content", hx4Var, ((tj8) objJ).I.a, 0L, 0L, null, 0L, 0, false, 0, 0, null, qz0Var2, (i2 & 112) | 6, 0, 262136);
            hx4Var2 = hx4Var;
            qz0Var2 = qz0Var2;
            qz0Var2.q(false);
        } else {
            qz0Var2.a0(-1919359678);
            b(pg0Var, hx4Var2, exoPlayer, qz0Var2, i2 & 1022);
            qz0Var2.q(false);
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new p59(pg0Var, hx4Var2, exoPlayer, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float d(defpackage.a96 r6, boolean r7, defpackage.sc3[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.b(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib7.d(a96, boolean, sc3[], float):float");
    }

    public static final float e(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long f(vg6 vg6Var, boolean z) {
        List list = vg6Var.a;
        int size = list.size();
        long jG = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ah6 ah6Var = (ah6) list.get(i2);
            if (ah6Var.d && ah6Var.h) {
                jG = nr5.g(jG, z ? ah6Var.c : ah6Var.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return nr5.b(i, jG);
    }

    public static final float g(vg6 vg6Var, boolean z) {
        long jF = f(vg6Var, z);
        float fD = 0.0f;
        if (nr5.c(jF, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = vg6Var.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ah6 ah6Var = (ah6) list.get(i2);
            if (ah6Var.d && ah6Var.h) {
                i++;
                fD = nr5.d(nr5.f(z ? ah6Var.c : ah6Var.g, jF)) + fD;
            }
        }
        return fD / i;
    }

    public static final float h(vg6 vg6Var) {
        List list = vg6Var.a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            ah6 ah6Var = (ah6) list.get(i);
            if (!ah6Var.h || !ah6Var.d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jF = f(vg6Var, true);
            long jF2 = f(vg6Var, false);
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                ah6 ah6Var2 = (ah6) list.get(i4);
                if (ah6Var2.d && ah6Var2.h) {
                    long j = ah6Var2.c;
                    long jF3 = nr5.f(ah6Var2.g, jF2);
                    long jF4 = nr5.f(j, jF);
                    float fE = e(jF4) - e(jF3);
                    float fD = nr5.d(nr5.g(jF4, jF3)) / 2.0f;
                    if (fE > 180.0f) {
                        fE -= 360.0f;
                    } else if (fE < -180.0f) {
                        fE += 360.0f;
                    }
                    f2 += fE * fD;
                    f += fD;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, wv8] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int i(int r11, java.lang.String r12) {
        /*
            zz1 r0 = l()
            r1 = 0
            if (r0 == 0) goto L7b
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L73
            java.lang.String r2 = "charSequence cannot be null"
            defpackage.wu8.l(r12, r2)
            uz1 r0 = r0.e
            wv8 r4 = r0.b
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L28
            int r2 = r12.length()
            if (r11 < r2) goto L2a
        L28:
            r5 = r12
            goto L69
        L2a:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L46
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<mv8> r6 = defpackage.mv8.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            mv8[] r5 = (defpackage.mv8[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L46
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6a
        L46:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            k02 r10 = new k02
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.I(r5, r6, r7, r8, r9, r10)
            k02 r12 = (defpackage.k02) r12
            int r2 = r12.c
            goto L6a
        L69:
            r2 = r0
        L6a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L71
            goto L7c
        L71:
            r1 = r12
            goto L7c
        L73:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not initialized yet"
            r11.<init>(r12)
            throw r11
        L7b:
            r5 = r12
        L7c:
            if (r1 == 0) goto L83
            int r11 = r1.intValue()
            return r11
        L83:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib7.i(int, java.lang.String):int");
    }

    public static final int j(int i, String str) {
        zz1 zz1VarL = l();
        Integer num = null;
        if (zz1VarL != null) {
            Integer numValueOf = Integer.valueOf(zz1VarL.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static Rect k(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return p3.i(windowManager);
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        rect.right = point.x;
        rect.bottom = point.y;
        return rect;
    }

    public static final zz1 l() {
        if (!zz1.d()) {
            return null;
        }
        zz1 zz1VarA = zz1.a();
        if (zz1VarA.c() == 1) {
            return zz1VarA;
        }
        return null;
    }

    public static final wl7 m(Object obj) {
        if (obj != at2.l) {
            return (wl7) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static int[] n(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static final boolean o(Object obj) {
        return obj == at2.l;
    }

    public static String p(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrN = n(str2);
        if (iArrN[0] != -1) {
            sb.append(str2);
            p(sb, iArrN[1], iArrN[2]);
            return sb.toString();
        }
        int[] iArrN2 = n(str);
        if (iArrN[3] == 0) {
            sb.append((CharSequence) str, 0, iArrN2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrN[2] == 0) {
            sb.append((CharSequence) str, 0, iArrN2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrN[1];
        if (i != 0) {
            int i2 = iArrN2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return p(sb, iArrN[1] + i2, i2 + iArrN[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrN2[1]);
            sb.append(str2);
            int i3 = iArrN2[1];
            return p(sb, i3, iArrN[2] + i3);
        }
        int i4 = iArrN2[0] + 2;
        int i5 = iArrN2[1];
        if (i4 >= i5 || i5 != iArrN2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrN2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrN2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return p(sb, iArrN2[1], i6 + iArrN[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrN2[1];
        return p(sb, i7, iArrN[2] + i7 + 1);
    }

    public static Uri r(String str, String str2) {
        return Uri.parse(q(str, str2));
    }

    public static void s(int i, int i2) {
        String strM;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM = lb7.m("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(rm7.o(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                }
                strM = lb7.m("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static void t(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? u("start index", i, i3) : (i2 < 0 || i2 > i3) ? u("end index", i2, i3) : lb7.m("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String u(String str, int i, int i2) {
        if (i < 0) {
            return lb7.m("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return lb7.m("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(rm7.o(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
    }
}
