package defpackage;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.parser.moshi.JsonEncodingException;
import com.airbnb.lottie.parser.moshi.b;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mf4 {
    public static final nc2 a = nc2.w("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final nc2 b = nc2.w("id", "layers", "w", "h", "p", "u");
    public static final nc2 c = nc2.w(CommonDataKt.HOME_MOVIE_TYPE_LIST);
    public static final nc2 d = nc2.w("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static gf4 a(b bVar) throws JsonEncodingException, EOFException {
        gf4 gf4Var;
        float f;
        gf4 gf4Var2;
        gf4 gf4Var3;
        int i;
        float f2;
        gf4 gf4Var4;
        float f3;
        float f4;
        int i2;
        float fC = n29.c();
        ue4 ue4Var = new ue4((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        m28 m28Var = new m28(0);
        gf4 gf4Var5 = new gf4();
        bVar.P0();
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        while (bVar.hasNext()) {
            switch (bVar.k(a)) {
                case 0:
                    gf4Var = gf4Var5;
                    iNextDouble = (int) bVar.nextDouble();
                    gf4Var5 = gf4Var;
                    break;
                case 1:
                    gf4Var = gf4Var5;
                    iNextDouble2 = (int) bVar.nextDouble();
                    gf4Var5 = gf4Var;
                    break;
                case 2:
                    gf4Var = gf4Var5;
                    fNextDouble2 = (float) bVar.nextDouble();
                    gf4Var5 = gf4Var;
                    break;
                case 3:
                    f = fC;
                    gf4Var2 = gf4Var5;
                    fNextDouble = ((float) bVar.nextDouble()) - 0.01f;
                    gf4Var5 = gf4Var2;
                    fC = f;
                    break;
                case 4:
                    f = fC;
                    gf4Var2 = gf4Var5;
                    fNextDouble3 = (float) bVar.nextDouble();
                    gf4Var5 = gf4Var2;
                    fC = f;
                    break;
                case 5:
                    f = fC;
                    gf4Var3 = gf4Var5;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    String[] strArrSplit = bVar.t().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        gf4Var3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    gf4Var5 = gf4Var3;
                    iNextDouble2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 6:
                    f = fC;
                    gf4 gf4Var6 = gf4Var5;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    bVar.c1();
                    int i6 = 0;
                    while (bVar.hasNext()) {
                        gf4 gf4Var7 = gf4Var6;
                        q04 q04VarA = r04.a(bVar, gf4Var7);
                        if (q04VarA.e == Layer$LayerType.b) {
                            i6++;
                        }
                        arrayList.add(q04VarA);
                        ue4Var.i(q04VarA.d, q04VarA);
                        if (i6 > 4) {
                            qd4.b("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        gf4Var6 = gf4Var7;
                    }
                    gf4Var3 = gf4Var6;
                    bVar.W0();
                    gf4Var5 = gf4Var3;
                    iNextDouble2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 7:
                    f = fC;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    bVar.c1();
                    while (bVar.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        ue4 ue4Var2 = new ue4((Object) null);
                        bVar.P0();
                        String strT = null;
                        String strT2 = null;
                        String strT3 = null;
                        int iNextInt = 0;
                        int iNextInt2 = 0;
                        while (bVar.hasNext()) {
                            int iK = bVar.k(b);
                            if (iK != 0) {
                                if (iK == 1) {
                                    bVar.c1();
                                    while (bVar.hasNext()) {
                                        q04 q04VarA2 = r04.a(bVar, gf4Var5);
                                        ue4Var2.i(q04VarA2.d, q04VarA2);
                                        arrayList3.add(q04VarA2);
                                        gf4Var5 = gf4Var5;
                                    }
                                    gf4Var4 = gf4Var5;
                                    bVar.W0();
                                } else if (iK == 2) {
                                    iNextInt = bVar.nextInt();
                                } else if (iK == 3) {
                                    iNextInt2 = bVar.nextInt();
                                } else if (iK == 4) {
                                    strT2 = bVar.t();
                                } else if (iK != 5) {
                                    bVar.u();
                                    bVar.z();
                                    gf4Var4 = gf4Var5;
                                } else {
                                    strT3 = bVar.t();
                                }
                                gf4Var5 = gf4Var4;
                            } else {
                                strT = bVar.t();
                            }
                        }
                        gf4 gf4Var8 = gf4Var5;
                        bVar.t0();
                        if (strT2 != null) {
                            map2.put(strT, new yf4(iNextInt, iNextInt2, strT, strT2, strT3));
                        } else {
                            map.put(strT, arrayList3);
                        }
                        gf4Var5 = gf4Var8;
                    }
                    bVar.W0();
                    gf4Var3 = gf4Var5;
                    gf4Var5 = gf4Var3;
                    iNextDouble2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 8:
                    f = fC;
                    i = iNextDouble2;
                    float f5 = fNextDouble2;
                    bVar.P0();
                    while (bVar.hasNext()) {
                        if (bVar.k(c) != 0) {
                            bVar.u();
                            bVar.z();
                        } else {
                            bVar.c1();
                            while (bVar.hasNext()) {
                                nc2 nc2Var = vh2.a;
                                bVar.P0();
                                String strT4 = null;
                                String strT5 = null;
                                String strT6 = null;
                                while (bVar.hasNext()) {
                                    int iK2 = bVar.k(vh2.a);
                                    if (iK2 != 0) {
                                        float f6 = f5;
                                        if (iK2 == 1) {
                                            strT5 = bVar.t();
                                        } else if (iK2 == 2) {
                                            strT6 = bVar.t();
                                        } else if (iK2 != 3) {
                                            bVar.u();
                                            bVar.z();
                                        } else {
                                            bVar.nextDouble();
                                        }
                                        f5 = f6;
                                    } else {
                                        strT4 = bVar.t();
                                    }
                                }
                                bVar.t0();
                                map3.put(strT5, new jh2(strT4, strT5, strT6));
                                f5 = f5;
                            }
                            bVar.W0();
                        }
                    }
                    f2 = f5;
                    bVar.t0();
                    gf4Var3 = gf4Var5;
                    gf4Var5 = gf4Var3;
                    iNextDouble2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 9:
                    f = fC;
                    i = iNextDouble2;
                    f3 = fNextDouble2;
                    bVar.c1();
                    while (bVar.hasNext()) {
                        nc2 nc2Var2 = nh2.a;
                        ArrayList arrayList4 = new ArrayList();
                        bVar.P0();
                        double dNextDouble = 0.0d;
                        char cCharAt = 0;
                        String strT7 = null;
                        String strT8 = null;
                        while (bVar.hasNext()) {
                            int iK3 = bVar.k(nh2.a);
                            if (iK3 == 0) {
                                cCharAt = bVar.t().charAt(0);
                            } else if (iK3 == 1) {
                                bVar.nextDouble();
                            } else if (iK3 == 2) {
                                dNextDouble = bVar.nextDouble();
                            } else if (iK3 == 3) {
                                strT7 = bVar.t();
                            } else if (iK3 == 4) {
                                strT8 = bVar.t();
                            } else if (iK3 != 5) {
                                bVar.u();
                                bVar.z();
                            } else {
                                bVar.P0();
                                while (bVar.hasNext()) {
                                    if (bVar.k(nh2.b) != 0) {
                                        bVar.u();
                                        bVar.z();
                                    } else {
                                        bVar.c1();
                                        while (bVar.hasNext()) {
                                            arrayList4.add((js7) m41.a(bVar, gf4Var5));
                                        }
                                        bVar.W0();
                                    }
                                }
                                bVar.t0();
                            }
                        }
                        bVar.t0();
                        mh2 mh2Var = new mh2(arrayList4, cCharAt, dNextDouble, strT7, strT8);
                        m28Var.e(mh2Var.hashCode(), mh2Var);
                    }
                    bVar.W0();
                    f2 = f3;
                    gf4Var3 = gf4Var5;
                    gf4Var5 = gf4Var3;
                    iNextDouble2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                case 10:
                    bVar.c1();
                    while (bVar.hasNext()) {
                        bVar.P0();
                        String strT9 = null;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (bVar.hasNext()) {
                            int iK4 = bVar.k(d);
                            if (iK4 != 0) {
                                f4 = fC;
                                if (iK4 == 1) {
                                    i2 = iNextDouble2;
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble4 = (float) bVar.nextDouble();
                                } else if (iK4 != 2) {
                                    bVar.u();
                                    bVar.z();
                                } else {
                                    i2 = iNextDouble2;
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble5 = (float) bVar.nextDouble();
                                }
                                iNextDouble2 = i2;
                            } else {
                                f4 = fC;
                                strT9 = bVar.t();
                            }
                            fC = f4;
                        }
                        bVar.t0();
                        arrayList2.add(new ni4(strT9, fNextDouble4, fNextDouble5));
                        fNextDouble2 = fNextDouble2;
                        iNextDouble2 = iNextDouble2;
                        fC = fC;
                    }
                    f = fC;
                    i = iNextDouble2;
                    f3 = fNextDouble2;
                    bVar.W0();
                    f2 = f3;
                    gf4Var3 = gf4Var5;
                    gf4Var5 = gf4Var3;
                    iNextDouble2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
                default:
                    bVar.u();
                    bVar.z();
                    f = fC;
                    gf4Var3 = gf4Var5;
                    i = iNextDouble2;
                    f2 = fNextDouble2;
                    gf4Var5 = gf4Var3;
                    iNextDouble2 = i;
                    fNextDouble2 = f2;
                    fC = f;
                    break;
            }
        }
        float f7 = fC;
        gf4 gf4Var9 = gf4Var5;
        Rect rect = new Rect(0, 0, (int) (iNextDouble * f7), (int) (iNextDouble2 * f7));
        float fC2 = n29.c();
        gf4Var9.k = rect;
        gf4Var9.l = fNextDouble2;
        gf4Var9.m = fNextDouble;
        gf4Var9.n = fNextDouble3;
        gf4Var9.j = arrayList;
        gf4Var9.i = ue4Var;
        gf4Var9.c = map;
        gf4Var9.d = map2;
        gf4Var9.e = fC2;
        gf4Var9.h = m28Var;
        gf4Var9.f = map3;
        gf4Var9.g = arrayList2;
        return gf4Var9;
    }
}
