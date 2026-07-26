package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import androidx.compose.foundation.f;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.a;
import androidx.compose.material3.m;
import androidx.compose.material3.n;
import androidx.compose.runtime.i;
import androidx.compose.ui.node.h;
import androidx.transition.Transition;
import com.google.firebase.components.DependencyCycleException;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.provider.AudioPlayerActivity;
import ir.myket.player.provider.PlayerActivity;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.FunctionImpl;
import kotlin.time.DurationUnit;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wu8 {
    public static final mu3 a;
    public static final mu3 j;
    public static final mu3 k;
    public static final mu3 l;
    public static final mu3 m;
    public static final mu3 n;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final jj3 b = new jj3(false);
    public static final String[] c = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] d = {44100, 48000, 32000};
    public static final int[] e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final String[] o = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    static {
        int i2 = 1;
        a = new mu3("RESUME_TOKEN", i2);
        j = new mu3("STATE_REG", i2);
        k = new mu3("STATE_COMPLETED", i2);
        l = new mu3("STATE_CANCELLED", i2);
        m = new mu3("NO_RESULT", i2);
        n = new mu3("PARAM_CLAUSE_0", i2);
    }

    public static final long A(long j2) {
        if (j2 < 0) {
            int i2 = qx1.d;
            return qx1.c;
        }
        int i3 = qx1.d;
        return qx1.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B(defpackage.w47 r2, defpackage.g77 r3) {
        /*
            java.lang.String r0 = "request"
            defpackage.js3.p(r2, r0)
            int r0 = r3.d
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L33
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L33;
                default: goto L32;
            }
        L32:
            goto L6c
        L33:
            by2 r0 = r3.f
            java.lang.String r1 = "Expires"
            java.lang.String r0 = r0.a(r1)
            if (r0 != 0) goto L3e
            r0 = 0
        L3e:
            if (r0 != 0) goto L5a
            jk0 r0 = r3.b()
            int r0 = r0.c
            r1 = -1
            if (r0 != r1) goto L5a
            jk0 r0 = r3.b()
            boolean r0 = r0.f
            if (r0 != 0) goto L5a
            jk0 r0 = r3.b()
            boolean r0 = r0.e
            if (r0 != 0) goto L5a
            goto L6c
        L5a:
            jk0 r3 = r3.b()
            boolean r3 = r3.b
            if (r3 != 0) goto L6c
            jk0 r2 = r2.a()
            boolean r2 = r2.b
            if (r2 != 0) goto L6c
            r2 = 1
            return r2
        L6c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu8.B(w47, g77):boolean");
    }

    public static boolean C(int i2, Object obj) {
        if (obj instanceof np2) {
            if ((obj instanceof aq2 ? ((aq2) obj).getArity() : obj instanceof bp2 ? 0 : obj instanceof dp2 ? 1 : obj instanceof qp2 ? 2 : obj instanceof rp2 ? 3 : obj instanceof sp2 ? 4 : obj instanceof tp2 ? 5 : obj instanceof up2 ? 6 : obj instanceof vp2 ? 7 : obj instanceof wp2 ? 8 : obj instanceof xp2 ? 9 : obj instanceof cp2 ? 10 : obj instanceof ep2 ? 11 : obj instanceof fp2 ? 12 : obj instanceof gp2 ? 13 : obj instanceof hp2 ? 14 : obj instanceof ip2 ? 15 : obj instanceof jp2 ? 16 : obj instanceof kp2 ? 17 : obj instanceof lp2 ? 18 : obj instanceof mp2 ? 19 : obj instanceof op2 ? 20 : obj instanceof pp2 ? 21 : obj instanceof FunctionImpl ? 22 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(h hVar) {
        if (hVar.j == null) {
            return false;
        }
        h hVarF = hVar.F();
        return (hVarF != null ? hVarF.j : null) == null || hVar.t().b;
    }

    public static by2 E(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        js3.p(strArr2, "inputNamesAndValues");
        if (strArr2.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr3[i3] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr3[i3] = f88.J0(strArr2[i3]).toString();
        }
        int iK = wq2.K(0, strArr3.length - 1, 2);
        if (iK >= 0) {
            while (true) {
                String str = strArr3[i2];
                String str2 = strArr3[i2 + 1];
                ry7.l(str);
                ry7.m(str2, str);
                if (i2 == iK) {
                    break;
                }
                i2 += 2;
            }
        }
        return new by2(strArr3);
    }

    public static BigDecimal F(String str) {
        m(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static final Object G(j56 j56Var, i iVar) {
        js3.n(iVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        i56 i56Var = (i56) j56Var;
        Object objB = i56Var.get(iVar);
        if (objB == null) {
            objB = iVar.b();
        }
        return ((a39) objB).a(i56Var);
    }

    public static final long H(long j2, long j3, DurationUnit durationUnit) {
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (~(j4 ^ j3))) >= 0) {
            return wq2.U(j4, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.d;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return qx1.j(A(j4));
        }
        long jN = xq2.n(1L, durationUnit2, durationUnit);
        long j5 = (j2 / jN) - (j3 / jN);
        long j6 = (j2 % jN) - (j3 % jN);
        int i2 = qx1.d;
        return qx1.g(wq2.U(j5, durationUnit2), wq2.U(j6, durationUnit));
    }

    public static String I(Throwable th) {
        js3.p(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public static void J(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(t61.j(obj == null ? Ssh2PublicKeyAlgorithmName.NULL : obj.getClass().getName(), " cannot be cast to ", str));
        js3.S(classCastException, wu8.class.getName());
        throw classCastException;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.nt0 K(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static String L(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String M(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final i56 N(um[] umVarArr, j56 j56Var, j56 j56Var2) {
        i56 i56Var = i56.d;
        h56 h56Var = new h56(i56Var);
        h56Var.g = i56Var;
        for (um umVar : umVarArr) {
            i iVar = (i) umVar.f;
            if (umVar.e || !((i56) j56Var).containsKey(iVar)) {
                h56Var.put(iVar, iVar.c(umVar, (a39) ((i56) j56Var2).get(iVar)));
            }
        }
        return h56Var.build();
    }

    public static final void a(hx4 hx4Var, String str, bi0 bi0Var, Integer num, bp2 bp2Var, qz0 qz0Var, int i2, int i3) {
        Integer num2;
        int i4;
        hx4 hx4Var2;
        Integer num3;
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        qz0Var.c0(2096433134);
        int i5 = i2 | 6 | (qz0Var.f(str) ? 32 : 16) | (qz0Var.f(bi0Var) ? 256 : 128);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            num2 = num;
        } else {
            num2 = num;
            i4 = i5 | (qz0Var.f(num2) ? 2048 : 1024);
        }
        int i7 = i4 | (qz0Var.h(bp2Var) ? 16384 : 8192);
        if (qz0Var.R(i7 & 1, (i7 & 9363) != 9362)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                num3 = i6 != 0 ? null : num2;
                hx4Var2 = ex4.b;
            } else {
                qz0Var.U();
                hx4Var2 = hx4Var;
                num3 = num2;
            }
            qz0Var.r();
            a.a(bp2Var, b.d(hx4Var2, ml9.q(hq6.action_button_height, qz0Var)), false, la7.a, bi0Var, null, null, yh0.d(ml9.q(hq6.space_12, qz0Var), 0.0f, 2), s7.X(49063422, new x5(str, num3, 0), qz0Var), qz0Var, ((i7 >> 12) & 14) | 805306368 | ((i7 << 6) & 57344), 356);
            num2 = num3;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new y5(hx4Var2, str, bi0Var, num2, bp2Var, i2, i3);
        }
    }

    public static xk b(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new xk(c26.h, Float.valueOf(f2), new zk(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void c(hx4 hx4Var, String str, pj3 pj3Var, androidx.compose.runtime.internal.a aVar, n nVar, bp2 bp2Var, qz0 qz0Var, int i2) {
        int i3;
        n nVar2;
        bp2 bp2Var2;
        js3.p(str, "title");
        js3.p(pj3Var, "items");
        qz0Var.c0(690789412);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? qz0Var.f(pj3Var) : qz0Var.h(pj3Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var.h(aVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            nVar2 = nVar;
            i3 |= qz0Var.f(nVar2) ? 16384 : 8192;
        } else {
            nVar2 = nVar;
        }
        if ((196608 & i2) == 0) {
            bp2Var2 = bp2Var;
            i3 |= qz0Var.h(bp2Var2) ? 131072 : 65536;
        } else {
            bp2Var2 = bp2Var;
        }
        if (qz0Var.R(i3 & 1, (74899 & i3) != 74898)) {
            qz0Var.W();
            if ((i2 & 1) != 0 && !qz0Var.z()) {
                qz0Var.U();
            }
            qz0Var.r();
            xq2.c(hx4Var, bp2Var2, nVar2, false, s7.X(-609144401, new df0(str, 1), qz0Var), s7.X(1101506446, new x5(pj3Var, aVar, 6), qz0Var), null, qz0Var, (i3 & 14) | 221184 | ((i3 >> 12) & 112) | ((i3 >> 6) & 896), 72);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new hy(hx4Var, str, pj3Var, aVar, nVar, bp2Var, i2, 2);
        }
    }

    public static final void d(hx4 hx4Var, qx6 qx6Var, dp2 dp2Var, qz0 qz0Var, int i2) {
        hx4 hx4Var2;
        js3.p(qx6Var, "recommendationMovie");
        qz0Var.c0(-1695600747);
        int i3 = i2 | 6 | (qz0Var.h(qx6Var) ? 32 : 16) | (qz0Var.h(dp2Var) ? 256 : 128);
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = o40.r(qz0Var);
            }
            ab5 ab5Var = (ab5) objM;
            u58 u58Var = uj8.a;
            Object objJ = qz0Var.j(u58Var);
            js3.m(objJ);
            m mVarA = r97.a(0.0f, 3, ((tj8) objJ).z);
            boolean zH = qz0Var.h(qx6Var) | ((i3 & 896) == 256);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == avVar) {
                objM2 = new i05(qx6Var, dp2Var, 1);
                qz0Var.l0(objM2);
            }
            ex4 ex4Var = ex4.b;
            hx4 hx4VarA = f.a(ex4Var, ab5Var, mVarA, false, null, (bp2) objM2, 28);
            Object objJ2 = qz0Var.j(u58Var);
            js3.m(objJ2);
            m91.b(hx4VarA, la7.a(ml9.q(hq6.radius_4, qz0Var)), rf0.k(((tj8) objJ2).l, 0L, qz0Var, 0, 14), null, s7.X(760118279, new j05(qx6Var, 1), qz0Var), qz0Var, 196608);
            hx4Var2 = ex4Var;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new k05(hx4Var2, qx6Var, dp2Var, i2, 1);
        }
    }

    public static void f(Throwable th, Throwable th2) {
        js3.p(th, "<this>");
        js3.p(th2, "exception");
        if (th != th2) {
            Integer num = rt3.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = o96.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static Collection g(Object obj) {
        if ((obj instanceof dx3) && !(obj instanceof ex3)) {
            J(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            js3.S(e2, wu8.class.getName());
            throw e2;
        }
    }

    public static Map h(Object obj) {
        if ((obj instanceof dx3) && !(obj instanceof gx3)) {
            J(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            js3.S(e2, wu8.class.getName());
            throw e2;
        }
    }

    public static void i(int i2, Object obj) {
        if (obj == null || C(i2, obj)) {
            return;
        }
        J(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static void j(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static xk n(xk xkVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) ((s08) xkVar.b).getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((zk) xkVar.c).a;
        }
        return new xk(xkVar.a, Float.valueOf(f2), new zk(f3), xkVar.d, xkVar.e, xkVar.f);
    }

    public static final qh2 o(Context context) {
        return new qh2(new androidx.compose.ui.text.font.a(context), new kg(Build.VERSION.SDK_INT >= 31 ? gj2.a.a(context) : 0));
    }

    public static final Intent p(PlayerMovieData playerMovieData, Context context, boolean z) {
        js3.p(playerMovieData, "<this>");
        Intent intentPutExtra = playerMovieData.a.o ? new Intent(context, (Class<?>) AudioPlayerActivity.class).putExtra("HAS_CUSTOM_ANIMATION", z) : new Intent(context, (Class<?>) PlayerActivity.class);
        js3.m(intentPutExtra);
        Intent intentPutExtra2 = intentPutExtra.putExtra("KEY_PLAYER_MOVIE_DATA", playerMovieData);
        js3.o(intentPutExtra2, "putExtra(...)");
        return intentPutExtra2;
    }

    public static boolean q(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = q(file2) && z;
        }
        return z;
    }

    public static void r(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (n91 n91Var : (Set) it2.next()) {
                        for (vj1 vj1Var : n91Var.a.c) {
                            if (vj1Var.c == 0) {
                                Set<n91> set = (Set) map.get(new o91(vj1Var.a, vj1Var.b == 2));
                                if (set != null) {
                                    for (n91 n91Var2 : set) {
                                        n91Var.b.add(n91Var2);
                                        n91Var2.c.add(n91Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<n91> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (n91 n91Var3 : hashSet) {
                    if (n91Var3.c.isEmpty()) {
                        hashSet2.add(n91Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    n91 n91Var4 = (n91) hashSet2.iterator().next();
                    hashSet2.remove(n91Var4);
                    i2++;
                    for (n91 n91Var5 : n91Var4.b) {
                        n91Var5.c.remove(n91Var4);
                        if (n91Var5.c.isEmpty()) {
                            hashSet2.add(n91Var5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (n91 n91Var6 : hashSet) {
                    if (!n91Var6.c.isEmpty() && !n91Var6.b.isEmpty()) {
                        arrayList2.add(n91Var6.a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            tx0 tx0Var = (tx0) it.next();
            n91 n91Var7 = new n91(tx0Var);
            for (so6 so6Var : tx0Var.b) {
                boolean z = tx0Var.e == 0;
                o91 o91Var = new o91(so6Var, !z);
                if (!map.containsKey(o91Var)) {
                    map.put(o91Var, new HashSet());
                }
                Set set2 = (Set) map.get(o91Var);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + so6Var + ".");
                }
                set2.add(n91Var7);
            }
        }
    }

    public static boolean s(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) == str2.charAt(i2) || ((c2 = (char) ((r3 | ' ') - 97)) < 26 && c2 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static int t(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i3 <= i2) {
            return i2;
        }
        int iHighestOneBit = i2 + (i2 >> 1) + 1;
        if (iHighestOneBit < i3) {
            iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static int u(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = d[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? e[i5 - 1] : f[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? g[i5 - 1] : h[i5 - 1] : i[i5 - 1];
        if (i3 == 3) {
            return o40.p(i9, 144, i7, i8);
        }
        return o40.p(i4 == 1 ? 72 : 144, i9, i7, i8);
    }

    public static String v(String str) {
        if (f88.n0(str)) {
            return null;
        }
        String strH0 = f88.H0('#', str, str);
        String strH02 = f88.H0('?', strH0, strH0);
        String strE0 = f88.E0('.', f88.E0('/', strH02, strH02), "");
        if (f88.n0(strE0)) {
            return null;
        }
        String lowerCase = strE0.toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        String str2 = (String) uv4.a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    public static tj8 x(qz0 qz0Var) {
        Object objJ = qz0Var.j(uj8.a);
        js3.m(objJ);
        return (tj8) objJ;
    }

    public static wf5 y(qz0 qz0Var) {
        return (wf5) qz0Var.j(aw8.a);
    }

    public static int z(wr8 wr8Var, int i2) {
        int[] iArr;
        if (wr8Var == null || (iArr = (int[]) wr8Var.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i2];
    }

    public abstract wu8 e(Object obj);

    public abstract long w(ViewGroup viewGroup, Transition transition, wr8 wr8Var, wr8 wr8Var2);
}
