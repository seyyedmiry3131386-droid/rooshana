package defpackage;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask$MaskMode;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import com.airbnb.lottie.parser.moshi.b;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class r04 {
    public static final nc2 a = nc2.w("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final nc2 b = nc2.w(ByteArrayResult.AppInfo.NAME_SERIALISED_NAME, "a");
    public static final nc2 c = nc2.w("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static q04 a(b bVar, gf4 gf4Var) {
        ArrayList arrayList;
        String str;
        boolean z;
        long j;
        Float f;
        Float f2;
        String str2;
        boolean z2;
        Float f3;
        String str3;
        byte b2;
        byte b3;
        Float f4;
        String str4;
        Float f5;
        String str5;
        boolean z3;
        long j2;
        boolean z4;
        cj cjVar;
        cj cjVar2;
        cj cjVar3;
        cj cjVar4;
        Float f6;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        bVar.P0();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        Layer$MatteType layer$MatteType = Layer$MatteType.a;
        LBlendMode lBlendMode = LBlendMode.a;
        hj hjVar = null;
        Layer$LayerType layer$LayerType = null;
        String strT = null;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zB = false;
        ca7 ca7Var = null;
        rb4 rb4Var = null;
        bj bjVar = null;
        qq4 qq4Var = null;
        cj cjVarW = null;
        float fNextDouble5 = 1.0f;
        float fNextDouble6 = 0.0f;
        String strT2 = null;
        String strT3 = "UNSET";
        boolean z5 = false;
        long jNextInt = 0;
        long jNextInt2 = -1;
        while (bVar.hasNext()) {
            int i = 1;
            switch (bVar.k(a)) {
                case 0:
                    j = jNextInt2;
                    strT3 = bVar.t();
                    jNextInt2 = j;
                    break;
                case 1:
                    f = fValueOf;
                    j = jNextInt2;
                    jNextInt = bVar.nextInt();
                    fValueOf = f;
                    jNextInt2 = j;
                    break;
                case 2:
                    j = jNextInt2;
                    strT = bVar.t();
                    jNextInt2 = j;
                    break;
                case 3:
                    f2 = fValueOf;
                    str2 = strT2;
                    z2 = z5;
                    j = jNextInt2;
                    int iNextInt = bVar.nextInt();
                    layer$LayerType = iNextInt < 6 ? Layer$LayerType.values()[iNextInt] : Layer$LayerType.c;
                    fValueOf = f2;
                    strT2 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 4:
                    f4 = fValueOf;
                    str4 = strT2;
                    jNextInt2 = bVar.nextInt();
                    fValueOf = f4;
                    strT2 = str4;
                    break;
                case 5:
                    f3 = fValueOf;
                    str3 = strT2;
                    j = jNextInt2;
                    iC = (int) (n29.c() * bVar.nextInt());
                    fValueOf = f3;
                    strT2 = str3;
                    jNextInt2 = j;
                    break;
                case 6:
                    f3 = fValueOf;
                    str3 = strT2;
                    j = jNextInt2;
                    iC2 = (int) (n29.c() * bVar.nextInt());
                    fValueOf = f3;
                    strT2 = str3;
                    jNextInt2 = j;
                    break;
                case 7:
                    f = fValueOf;
                    j = jNextInt2;
                    color = Color.parseColor(bVar.t());
                    fValueOf = f;
                    jNextInt2 = j;
                    break;
                case 8:
                    j = jNextInt2;
                    hjVar = ij.c(bVar, gf4Var);
                    jNextInt2 = j;
                    break;
                case 9:
                    f2 = fValueOf;
                    str2 = strT2;
                    z2 = z5;
                    j = jNextInt2;
                    int iNextInt2 = bVar.nextInt();
                    if (iNextInt2 >= Layer$MatteType.values().length) {
                        gf4Var.a("Unsupported matte type: " + iNextInt2);
                    } else {
                        layer$MatteType = Layer$MatteType.values()[iNextInt2];
                        int iOrdinal = layer$MatteType.ordinal();
                        if (iOrdinal == 3) {
                            gf4Var.a("Unsupported matte type: Luma");
                        } else if (iOrdinal == 4) {
                            gf4Var.a("Unsupported matte type: Luma Inverted");
                        }
                        gf4Var.p++;
                    }
                    fValueOf = f2;
                    strT2 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 10:
                    f2 = fValueOf;
                    str2 = strT2;
                    z2 = z5;
                    j = jNextInt2;
                    char c2 = 2;
                    bVar.c1();
                    while (bVar.hasNext()) {
                        bVar.P0();
                        boolean zB2 = false;
                        Mask$MaskMode mask$MaskMode = null;
                        bj bjVar2 = null;
                        bj bjVarY = null;
                        while (bVar.hasNext()) {
                            String strM0 = bVar.m0();
                            strM0.getClass();
                            switch (strM0.hashCode()) {
                                case 111:
                                    b2 = !strM0.equals("o") ? (byte) -1 : (byte) 0;
                                    break;
                                case 3588:
                                    b2 = !strM0.equals("pt") ? (byte) -1 : (byte) 1;
                                    break;
                                case 104433:
                                    b2 = !strM0.equals("inv") ? (byte) -1 : c2;
                                    break;
                                case 3357091:
                                    b2 = !strM0.equals("mode") ? (byte) -1 : (byte) 3;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    bjVarY = wn5.Y(bVar, gf4Var);
                                    break;
                                case 1:
                                    bjVar2 = new bj(xy3.a(bVar, gf4Var, n29.c(), es7.a, false), 5);
                                    break;
                                case 2:
                                    zB2 = bVar.b();
                                    break;
                                case 3:
                                    String strT4 = bVar.t();
                                    strT4.getClass();
                                    switch (strT4.hashCode()) {
                                        case 97:
                                            b3 = !strT4.equals("a") ? (byte) -1 : (byte) 0;
                                            break;
                                        case 105:
                                            b3 = !strT4.equals("i") ? (byte) -1 : (byte) 1;
                                            break;
                                        case 110:
                                            b3 = !strT4.equals("n") ? (byte) -1 : c2;
                                            break;
                                        case 115:
                                            b3 = !strT4.equals("s") ? (byte) -1 : (byte) 3;
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    Mask$MaskMode mask$MaskMode2 = Mask$MaskMode.a;
                                    switch (b3) {
                                        case 0:
                                            mask$MaskMode = mask$MaskMode2;
                                            break;
                                        case 1:
                                            gf4Var.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            mask$MaskMode = Mask$MaskMode.c;
                                            break;
                                        case 2:
                                            mask$MaskMode = Mask$MaskMode.d;
                                            break;
                                        case 3:
                                            mask$MaskMode = Mask$MaskMode.b;
                                            break;
                                        default:
                                            qd4.b("Unknown mask mode " + strM0 + ". Defaulting to Add.");
                                            mask$MaskMode = mask$MaskMode2;
                                            break;
                                    }
                                    break;
                                default:
                                    bVar.z();
                                    break;
                            }
                            c2 = 2;
                        }
                        bVar.t0();
                        arrayList2.add(new zi4(mask$MaskMode, bjVar2, bjVarY, zB2));
                        c2 = 2;
                    }
                    gf4Var.p += arrayList2.size();
                    bVar.W0();
                    fValueOf = f2;
                    strT2 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 11:
                    f2 = fValueOf;
                    str2 = strT2;
                    z2 = z5;
                    j = jNextInt2;
                    bVar.c1();
                    while (bVar.hasNext()) {
                        l41 l41VarA = m41.a(bVar, gf4Var);
                        if (l41VarA != null) {
                            arrayList3.add(l41VarA);
                        }
                    }
                    bVar.W0();
                    fValueOf = f2;
                    strT2 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
                case 12:
                    f5 = fValueOf;
                    str5 = strT2;
                    z3 = z5;
                    bVar.P0();
                    while (bVar.hasNext()) {
                        int iK = bVar.k(b);
                        if (iK == 0) {
                            j2 = jNextInt2;
                            bjVar = new bj(xy3.a(bVar, gf4Var, n29.c(), wq1.a, false), 6);
                        } else if (iK != 1) {
                            bVar.u();
                            bVar.z();
                        } else {
                            bVar.c1();
                            if (bVar.hasNext()) {
                                nc2 nc2Var = gj.a;
                                bVar.P0();
                                rb4 rb4Var2 = null;
                                vp7 vp7Var = null;
                                while (bVar.hasNext()) {
                                    int iK2 = bVar.k(gj.a);
                                    if (iK2 != 0) {
                                        boolean z6 = true;
                                        if (iK2 != 1) {
                                            bVar.u();
                                            bVar.z();
                                        } else {
                                            bVar.P0();
                                            bj bjVarV = null;
                                            bj bjVarV2 = null;
                                            cj cjVarW2 = null;
                                            cj cjVarW3 = null;
                                            bj bjVarY2 = null;
                                            while (bVar.hasNext()) {
                                                int iK3 = bVar.k(gj.c);
                                                if (iK3 == 0) {
                                                    bjVarV = wn5.V(bVar, gf4Var);
                                                } else if (iK3 == z6) {
                                                    bjVarV2 = wn5.V(bVar, gf4Var);
                                                } else if (iK3 == 2) {
                                                    cjVarW2 = wn5.W(bVar, gf4Var, z6);
                                                } else if (iK3 == 3) {
                                                    cjVarW3 = wn5.W(bVar, gf4Var, z6);
                                                } else if (iK3 != 4) {
                                                    bVar.u();
                                                    bVar.z();
                                                } else {
                                                    bjVarY2 = wn5.Y(bVar, gf4Var);
                                                }
                                                z6 = true;
                                            }
                                            bVar.t0();
                                            rb4Var2 = new rb4(bjVarV, bjVarV2, cjVarW2, cjVarW3, bjVarY2, 1);
                                        }
                                    } else {
                                        bVar.P0();
                                        bj bjVarY3 = null;
                                        bj bjVarY4 = null;
                                        bj bjVarY5 = null;
                                        TextRangeUnits textRangeUnits = null;
                                        while (bVar.hasNext()) {
                                            bj bjVar3 = bjVarY3;
                                            int iK4 = bVar.k(gj.b);
                                            if (iK4 != 0) {
                                                long j3 = jNextInt2;
                                                if (iK4 == 1) {
                                                    bjVarY4 = wn5.Y(bVar, gf4Var);
                                                } else if (iK4 == 2) {
                                                    bjVarY5 = wn5.Y(bVar, gf4Var);
                                                } else if (iK4 != 3) {
                                                    bVar.u();
                                                    bVar.z();
                                                } else {
                                                    int iNextInt3 = bVar.nextInt();
                                                    textRangeUnits = TextRangeUnits.b;
                                                    if (iNextInt3 != 1 && iNextInt3 != 2) {
                                                        gf4Var.a("Unsupported text range units: " + iNextInt3);
                                                    } else if (iNextInt3 == 1) {
                                                        textRangeUnits = TextRangeUnits.a;
                                                    }
                                                }
                                                bjVarY3 = bjVar3;
                                                jNextInt2 = j3;
                                            } else {
                                                bjVarY3 = wn5.Y(bVar, gf4Var);
                                            }
                                        }
                                        bj bjVar4 = bjVarY3;
                                        long j4 = jNextInt2;
                                        bVar.t0();
                                        vp7Var = new vp7((bjVar4 != null || bjVarY4 == null) ? bjVar4 : new bj(Collections.singletonList(new uy3(0)), 2), bjVarY4, bjVarY5, textRangeUnits);
                                        jNextInt2 = j4;
                                    }
                                }
                                j2 = jNextInt2;
                                bVar.t0();
                                qq4Var = new qq4(rb4Var2, vp7Var);
                            } else {
                                j2 = jNextInt2;
                            }
                            while (bVar.hasNext()) {
                                bVar.z();
                            }
                            bVar.W0();
                        }
                        jNextInt2 = j2;
                    }
                    bVar.t0();
                    fValueOf = f5;
                    strT2 = str5;
                    z5 = z3;
                    break;
                case 13:
                    f5 = fValueOf;
                    str5 = strT2;
                    bVar.c1();
                    ArrayList arrayList4 = new ArrayList();
                    while (bVar.hasNext()) {
                        bVar.P0();
                        while (bVar.hasNext()) {
                            int iK5 = bVar.k(c);
                            if (iK5 == 0) {
                                int iNextInt4 = bVar.nextInt();
                                if (iNextInt4 == 29) {
                                    nc2 nc2Var2 = jd0.a;
                                    ca7Var = null;
                                    while (bVar.hasNext()) {
                                        if (bVar.k(jd0.a) != 0) {
                                            bVar.u();
                                            bVar.z();
                                        } else {
                                            bVar.c1();
                                            while (bVar.hasNext()) {
                                                bVar.P0();
                                                boolean z7 = false;
                                                ca7 ca7Var2 = null;
                                                while (bVar.hasNext()) {
                                                    int iK6 = bVar.k(jd0.b);
                                                    if (iK6 != 0) {
                                                        boolean z8 = z7;
                                                        if (iK6 != 1) {
                                                            bVar.u();
                                                            bVar.z();
                                                        } else if (z8) {
                                                            ca7Var2 = new ca7(11, wn5.W(bVar, gf4Var, true));
                                                        } else {
                                                            bVar.z();
                                                        }
                                                        z7 = z8;
                                                    } else {
                                                        z7 = bVar.nextInt() == 0;
                                                    }
                                                }
                                                bVar.t0();
                                                if (ca7Var2 != null) {
                                                    ca7Var = ca7Var2;
                                                }
                                            }
                                            bVar.W0();
                                            i = 1;
                                        }
                                    }
                                } else {
                                    if (iNextInt4 == 25) {
                                        fx1 fx1Var = new fx1();
                                        while (bVar.hasNext()) {
                                            if (bVar.k(fx1.f) != 0) {
                                                bVar.u();
                                                bVar.z();
                                            } else {
                                                bVar.c1();
                                                while (bVar.hasNext()) {
                                                    bVar.P0();
                                                    String strT5 = "";
                                                    while (bVar.hasNext()) {
                                                        int iK7 = bVar.k(fx1.g);
                                                        if (iK7 != 0) {
                                                            boolean z9 = z5;
                                                            if (iK7 == 1) {
                                                                strT5.getClass();
                                                                switch (strT5) {
                                                                    case "Distance":
                                                                        fx1Var.d = wn5.W(bVar, gf4Var, true);
                                                                        break;
                                                                    case "Opacity":
                                                                        fx1Var.b = wn5.W(bVar, gf4Var, false);
                                                                        break;
                                                                    case "Direction":
                                                                        fx1Var.c = wn5.W(bVar, gf4Var, false);
                                                                        break;
                                                                    case "Shadow Color":
                                                                        fx1Var.a = wn5.V(bVar, gf4Var);
                                                                        break;
                                                                    case "Softness":
                                                                        fx1Var.e = wn5.W(bVar, gf4Var, true);
                                                                        break;
                                                                    default:
                                                                        bVar.z();
                                                                        break;
                                                                }
                                                            } else {
                                                                bVar.u();
                                                                bVar.z();
                                                            }
                                                            z5 = z9;
                                                        } else {
                                                            strT5 = bVar.t();
                                                        }
                                                    }
                                                    bVar.t0();
                                                }
                                                bVar.W0();
                                            }
                                        }
                                        z4 = z5;
                                        bj bjVar5 = fx1Var.a;
                                        rb4Var = (bjVar5 == null || (cjVar = fx1Var.b) == null || (cjVar2 = fx1Var.c) == null || (cjVar3 = fx1Var.d) == null || (cjVar4 = fx1Var.e) == null) ? null : new rb4(bjVar5, cjVar, cjVar2, cjVar3, cjVar4, 5);
                                    }
                                    z5 = z4;
                                    i = 1;
                                }
                            } else if (iK5 != i) {
                                bVar.u();
                                bVar.z();
                            } else {
                                arrayList4.add(bVar.t());
                            }
                            z4 = z5;
                            z5 = z4;
                            i = 1;
                        }
                        bVar.t0();
                        i = 1;
                    }
                    z3 = z5;
                    bVar.W0();
                    gf4Var.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    fValueOf = f5;
                    strT2 = str5;
                    z5 = z3;
                    break;
                case 14:
                    f4 = fValueOf;
                    str4 = strT2;
                    fNextDouble5 = (float) bVar.nextDouble();
                    fValueOf = f4;
                    strT2 = str4;
                    break;
                case 15:
                    f4 = fValueOf;
                    str4 = strT2;
                    fNextDouble6 = (float) bVar.nextDouble();
                    fValueOf = f4;
                    strT2 = str4;
                    break;
                case 16:
                    f4 = fValueOf;
                    str4 = strT2;
                    fNextDouble3 = (float) (bVar.nextDouble() * ((double) n29.c()));
                    fValueOf = f4;
                    strT2 = str4;
                    break;
                case 17:
                    f4 = fValueOf;
                    str4 = strT2;
                    fNextDouble4 = (float) (bVar.nextDouble() * ((double) n29.c()));
                    fValueOf = f4;
                    strT2 = str4;
                    break;
                case 18:
                    f6 = fValueOf;
                    fNextDouble = (float) bVar.nextDouble();
                    fValueOf = f6;
                    break;
                case 19:
                    f6 = fValueOf;
                    fNextDouble2 = (float) bVar.nextDouble();
                    fValueOf = f6;
                    break;
                case 20:
                    f6 = fValueOf;
                    cjVarW = wn5.W(bVar, gf4Var, false);
                    fValueOf = f6;
                    break;
                case 21:
                    strT2 = bVar.t();
                    break;
                case 22:
                    zB = bVar.b();
                    break;
                case 23:
                    f6 = fValueOf;
                    z5 = bVar.nextInt() == 1;
                    fValueOf = f6;
                    break;
                case 24:
                    int iNextInt5 = bVar.nextInt();
                    if (iNextInt5 >= LBlendMode.values().length) {
                        f6 = fValueOf;
                        gf4Var.a("Unsupported Blend Mode: " + iNextInt5);
                        lBlendMode = lBlendMode;
                    } else {
                        f6 = fValueOf;
                        lBlendMode = LBlendMode.values()[iNextInt5];
                    }
                    fValueOf = f6;
                    break;
                default:
                    bVar.u();
                    bVar.z();
                    f2 = fValueOf;
                    str2 = strT2;
                    z2 = z5;
                    j = jNextInt2;
                    fValueOf = f2;
                    strT2 = str2;
                    z5 = z2;
                    jNextInt2 = j;
                    break;
            }
        }
        Float f7 = fValueOf;
        String str6 = strT2;
        boolean z10 = z5;
        long j5 = jNextInt2;
        bVar.t0();
        ArrayList arrayList5 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList = arrayList3;
            str = str6;
            z = z10;
            arrayList5.add(new uy3(gf4Var, f7, f7, (Interpolator) null, 0.0f, Float.valueOf(fNextDouble)));
        } else {
            arrayList = arrayList3;
            str = str6;
            z = z10;
        }
        if (fNextDouble2 <= 0.0f) {
            fNextDouble2 = gf4Var.m;
        }
        arrayList5.add(new uy3(gf4Var, fValueOf2, fValueOf2, (Interpolator) null, fNextDouble, Float.valueOf(fNextDouble2)));
        arrayList5.add(new uy3(gf4Var, f7, f7, (Interpolator) null, fNextDouble2, Float.valueOf(Float.MAX_VALUE)));
        if (strT3.endsWith(".ai") || "ai".equals(str)) {
            gf4Var.a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (hjVar == null) {
                hjVar = new hj();
            }
            hj hjVar2 = hjVar;
            hjVar2.m = z;
            hjVar = hjVar2;
        }
        return new q04(arrayList, gf4Var, strT3, jNextInt, layer$LayerType, j5, strT, arrayList2, hjVar, iC, iC2, color, fNextDouble5, fNextDouble6, fNextDouble3, fNextDouble4, bjVar, qq4Var, arrayList5, layer$MatteType, cjVarW, zB, ca7Var, rb4Var, lBlendMode);
    }
}
