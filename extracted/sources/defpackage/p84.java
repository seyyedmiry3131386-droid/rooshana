package defpackage;

import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p84 implements w30 {
    public final ImmutableList a;
    public final int b;

    public p84(int i, ImmutableList immutableList) {
        this.b = i;
        this.a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static p84 b(int i, h26 h26Var) {
        w30 m68Var;
        String str;
        int i2 = 4;
        vy2.m(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = h26Var.c;
        int iA = -2;
        int i4 = 0;
        while (h26Var.a() > 8) {
            int iL = h26Var.l();
            int iL2 = h26Var.b + h26Var.l();
            h26Var.I(iL2);
            if (iL != 1414744396) {
                a40 a40Var = null;
                switch (iL) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iQ = h26Var.q();
                                String str2 = iQ != 1 ? iQ != 85 ? iQ != 255 ? iQ != 8192 ? iQ != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iQ2 = h26Var.q();
                                    int iL3 = h26Var.l();
                                    h26Var.K(6);
                                    int iQ3 = h26Var.q();
                                    String str3 = j29.a;
                                    int iE = j29.E(iQ3, ByteOrder.LITTLE_ENDIAN);
                                    int iQ4 = h26Var.a() > 0 ? h26Var.q() : 0;
                                    rj2 rj2Var = new rj2();
                                    rj2Var.m = tv4.m(str2);
                                    rj2Var.E = iQ2;
                                    rj2Var.F = iL3;
                                    if (str2.equals("audio/raw") && iE != 0) {
                                        rj2Var.G = iE;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iQ4 > 0) {
                                        byte[] bArr = new byte[iQ4];
                                        h26Var.h(bArr, 0, iQ4);
                                        rj2Var.p = ImmutableList.s(bArr);
                                    }
                                    m68Var = new m68(new b(rj2Var));
                                } else {
                                    o40.E(iQ, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                wn5.k0("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + j29.J(iA));
                            }
                            m68Var = a40Var;
                            break;
                        } else {
                            h26Var.K(i2);
                            int iL4 = h26Var.l();
                            int iL5 = h26Var.l();
                            h26Var.K(i2);
                            int iL6 = h26Var.l();
                            switch (iL6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                rj2 rj2Var2 = new rj2();
                                rj2Var2.t = iL4;
                                rj2Var2.u = iL5;
                                rj2Var2.m = tv4.m(str);
                                m68Var = new m68(new b(rj2Var2));
                            } else {
                                o40.E(iL6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                m68Var = a40Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iL7 = h26Var.l();
                        h26Var.K(8);
                        int iL8 = h26Var.l();
                        int iL9 = h26Var.l();
                        h26Var.K(i2);
                        h26Var.l();
                        h26Var.K(12);
                        m68Var = new z30(iL7, iL8, iL9);
                        break;
                    case 1752331379:
                        int iL10 = h26Var.l();
                        h26Var.K(12);
                        h26Var.l();
                        int iL11 = h26Var.l();
                        int iL12 = h26Var.l();
                        h26Var.K(i2);
                        int iL13 = h26Var.l();
                        int iL14 = h26Var.l();
                        h26Var.K(i2);
                        a40Var = new a40(iL10, iL11, iL12, iL13, iL14, h26Var.l());
                        m68Var = a40Var;
                        break;
                    case 1852994675:
                        m68Var = new p68(h26Var.v(h26Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        m68Var = a40Var;
                        break;
                }
            } else {
                m68Var = b(h26Var.l(), h26Var);
            }
            if (m68Var != null) {
                if (m68Var.getType() == 1752331379) {
                    iA = ((a40) m68Var).a();
                }
                int i5 = i4 + 1;
                int iT = wu8.t(objArrCopyOf.length, i5);
                if (iT > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iT);
                }
                objArrCopyOf[i4] = m68Var;
                i4 = i5;
            }
            h26Var.J(iL2);
            h26Var.I(i3);
            i2 = 4;
        }
        return new p84(i, ImmutableList.l(i4, objArrCopyOf));
    }

    public final w30 a(Class cls) {
        p0 p0VarListIterator = this.a.listIterator(0);
        while (p0VarListIterator.hasNext()) {
            w30 w30Var = (w30) p0VarListIterator.next();
            if (w30Var.getClass() == cls) {
                return w30Var;
            }
        }
        return null;
    }

    @Override // defpackage.w30
    public final int getType() {
        return this.b;
    }
}
