package defpackage;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzmr;
import io.sentry.android.core.t0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes.dex */
public abstract class c77 {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    public static c50 a(e39 e39Var) {
        long jI = 0;
        String strF = "";
        String strF2 = "";
        while (true) {
            int iG = e39Var.g();
            if (iG == 0) {
                return new c50(jI, strF, strF2);
            }
            int i2 = iG >>> 3;
            int i3 = iG & 7;
            switch (i2) {
                case 1:
                    e39.b(i2, 0, i3);
                    e39Var.i();
                    break;
                case 2:
                    e39.b(i2, 0, i3);
                    jI = e39Var.i();
                    break;
                case 3:
                    e39.b(i2, 0, i3);
                    e39Var.i();
                    break;
                case 4:
                    e39.b(i2, 2, i3);
                    strF = e39Var.f();
                    break;
                case 5:
                    e39.b(i2, 0, i3);
                    e39Var.i();
                    break;
                case 6:
                    e39.b(i2, 2, i3);
                    strF2 = e39Var.f();
                    break;
                case 7:
                    e39.b(i2, 0, i3);
                    e39Var.i();
                    break;
                case 8:
                    e39.b(i2, 2, i3);
                    e39Var.f();
                    break;
                default:
                    e39Var.j(i3);
                    break;
            }
        }
    }

    public static ol3 b(e39 e39Var) {
        while (true) {
            int iG = e39Var.g();
            if (iG == 0) {
                return new ol3(5);
            }
            int i2 = iG >>> 3;
            int i3 = iG & 7;
            if (i2 == 1) {
                e39.b(i2, 2, i3);
                e39Var.f();
            } else if (i2 == 2) {
                e39.b(i2, 2, i3);
                e39Var.f();
            } else if (i2 == 3) {
                e39.b(i2, 0, i3);
                e39Var.i();
            } else if (i2 == 4) {
                e39.b(i2, 2, i3);
                e39Var.d();
            } else if (i2 != 6) {
                e39Var.j(i3);
            } else {
                e39.b(i2, 2, i3);
                e39 e39VarE = e39Var.e();
                while (true) {
                    int iG2 = e39VarE.g();
                    if (iG2 != 0) {
                        int i4 = iG2 >>> 3;
                        int i5 = iG2 & 7;
                        if (i4 != 1) {
                            e39VarE.j(i5);
                        } else {
                            e39.b(i4, 2, i5);
                            e39VarE.d();
                        }
                    }
                }
            }
        }
    }

    public static void c(e39 e39Var, HashMap map) {
        int i2;
        int i3;
        e39 e39Var2;
        int i4 = 0;
        mn8 mn8Var = null;
        int i5 = 0;
        while (true) {
            int iG = e39Var.g();
            if (iG == 0) {
                if (mn8Var != null) {
                    map.put(Integer.valueOf(i5), mn8Var);
                    return;
                }
                return;
            }
            int i6 = iG >>> 3;
            int i7 = iG & 7;
            int i8 = 1;
            if (i6 == 1) {
                i2 = i4;
                e39.b(i6, i2, i7);
                i5 = (int) e39Var.i();
            } else if (i6 != 2) {
                e39Var.j(i7);
                i2 = i4;
            } else {
                e39.b(i6, 2, i7);
                e39 e39VarE = e39Var.e();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i9 = i4;
                String strF = "";
                while (true) {
                    int iG2 = e39VarE.g();
                    if (iG2 != 0) {
                        int i10 = iG2 >>> 3;
                        int i11 = iG2 & 7;
                        switch (i10) {
                            case 1:
                                i3 = i4;
                                e39Var2 = e39VarE;
                                e39.b(i10, i3, i11);
                                i9 = (int) e39Var2.i();
                                break;
                            case 2:
                                e39Var2 = e39VarE;
                                e39.b(i10, 2, i11);
                                strF = e39Var2.f();
                                i3 = 0;
                                break;
                            case 3:
                                e39.b(i10, 2, i11);
                                e39 e39VarE2 = e39VarE.e();
                                String strF2 = "";
                                long jI = 0;
                                while (true) {
                                    int iG3 = e39VarE2.g();
                                    if (iG3 == 0) {
                                        e39Var2 = e39VarE;
                                        arrayList.add(new x27(jI, strF2));
                                        i3 = 0;
                                    } else {
                                        int i12 = iG3 >>> 3;
                                        e39 e39Var3 = e39VarE;
                                        int i13 = iG3 & 7;
                                        if (i12 == i8) {
                                            e39.b(i12, 2, i13);
                                            strF2 = e39VarE2.f();
                                        } else if (i12 != 2) {
                                            e39VarE2.j(i13);
                                        } else {
                                            e39.b(i12, 0, i13);
                                            jI = e39VarE2.i();
                                        }
                                        e39VarE = e39Var3;
                                        i8 = 1;
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                e39.b(i10, 2, i11);
                                arrayList4.add(a(e39VarE.e()));
                                e39Var2 = e39VarE;
                                i3 = 0;
                                break;
                            case 5:
                                e39.b(i10, 2, i11);
                                arrayList5.add(b(e39VarE.e()));
                                e39Var2 = e39VarE;
                                i3 = 0;
                                break;
                            case 6:
                                e39.b(i10, i4, i11);
                                e39VarE.i();
                                i3 = i4;
                                e39Var2 = e39VarE;
                                break;
                            case 7:
                                e39.b(i10, 2, i11);
                                arrayList2.add(e39VarE.f());
                                e39Var2 = e39VarE;
                                i3 = 0;
                                break;
                            case 8:
                                e39.b(i10, i4, i11);
                                e39VarE.i();
                                i3 = i4;
                                e39Var2 = e39VarE;
                                break;
                            case 9:
                                e39.b(i10, 2, i11);
                                arrayList3.add(e39VarE.f());
                                e39Var2 = e39VarE;
                                i3 = 0;
                                break;
                            default:
                                e39VarE.j(i11);
                                e39Var2 = e39VarE;
                                i3 = 0;
                                break;
                        }
                        i4 = i3;
                        e39VarE = e39Var2;
                        i8 = 1;
                    } else {
                        i2 = i4;
                        mn8Var = new mn8(i9, strF, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                    }
                }
            }
            i4 = i2;
        }
    }

    public static final boolean d(long j2, long j3) {
        return j2 == j3;
    }

    public static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                t0.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class cls = c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                t0.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f = true;
        }
        Field field = e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            t0.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static int h(byte[] bArr, int i2, wr9 wr9Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return i(b2, bArr, i3, wr9Var);
        }
        wr9Var.a = b2;
        return i3;
    }

    public static int i(int i2, byte[] bArr, int i3, wr9 wr9Var) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            wr9Var.a = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            wr9Var.a = i6 | (b3 << Dot11LinkAdaptationControl.ASELI);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            wr9Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            wr9Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                wr9Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int j(byte[] bArr, int i2, wr9 wr9Var) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            wr9Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        wr9Var.b = j3;
        return i4;
    }

    public static int k(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public static long l(int i2, byte[] bArr) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public static int m(byte[] bArr, int i2, wr9 wr9Var) throws zzmr {
        int iH = h(bArr, i2, wr9Var);
        int i3 = wr9Var.a;
        if (i3 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            wr9Var.c = "";
            return iH;
        }
        int i4 = v0.a;
        int length = bArr.length;
        if ((((length - iH) - i3) | iH | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iH), Integer.valueOf(i3)));
        }
        int i5 = iH + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (iH < i5) {
            byte b2 = bArr[iH];
            if (b2 < 0) {
                break;
            }
            iH++;
            cArr[i6] = (char) b2;
            i6++;
        }
        while (iH < i5) {
            int i7 = iH + 1;
            byte b3 = bArr[iH];
            if (b3 >= 0) {
                cArr[i6] = (char) b3;
                i6++;
                iH = i7;
                while (iH < i5) {
                    byte b4 = bArr[iH];
                    if (b4 >= 0) {
                        iH++;
                        cArr[i6] = (char) b4;
                        i6++;
                    }
                }
            } else if (b3 < -32) {
                if (i7 >= i5) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                int i8 = i6 + 1;
                iH += 2;
                byte b5 = bArr[i7];
                if (b3 < -62 || ia7.p(b5)) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                cArr[i6] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                i6 = i8;
            } else {
                if (b3 < -16) {
                    if (i7 >= i5 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    int i9 = i6 + 1;
                    int i10 = iH + 2;
                    byte b6 = bArr[i7];
                    iH += 3;
                    byte b7 = bArr[i10];
                    if (!ia7.p(b6)) {
                        if (b3 == -32) {
                            if (b6 >= -96) {
                                b3 = -32;
                            }
                        }
                        if (b3 == -19) {
                            if (b6 < -96) {
                                b3 = -19;
                            }
                        }
                        if (!ia7.p(b7)) {
                            cArr[i6] = (char) (((b6 & 63) << 6) | ((b3 & 15) << 12) | (b7 & 63));
                            i6 = i9;
                        }
                    }
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                if (i7 >= i5 - 2) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                byte b8 = bArr[i7];
                int i11 = iH + 3;
                byte b9 = bArr[iH + 2];
                iH += 4;
                byte b10 = bArr[i11];
                if (ia7.p(b8) || (((b8 + 112) + (b3 << 28)) >> 30) != 0 || ia7.p(b9) || ia7.p(b10)) {
                    throw new zzmr("Protocol message had invalid UTF-8.");
                }
                int i12 = ((b8 & 63) << 12) | ((b3 & 7) << 18) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i6] = (char) ((i12 >>> 10) + 55232);
                cArr[i6 + 1] = (char) ((i12 & 1023) + 56320);
                i6 += 2;
            }
        }
        wr9Var.c = new String(cArr, 0, i6);
        return i5;
    }

    public static int n(byte[] bArr, int i2, wr9 wr9Var) throws zzmr {
        int iH = h(bArr, i2, wr9Var);
        int i3 = wr9Var.a;
        if (i3 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iH) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            wr9Var.c = zzlh.b;
            return iH;
        }
        wr9Var.c = zzlh.j(bArr, iH, i3);
        return iH + i3;
    }

    public static int o(it9 it9Var, byte[] bArr, int i2, int i3, wr9 wr9Var) throws zzmr {
        q0 q0VarZza = it9Var.zza();
        int iP = p(q0VarZza, it9Var, bArr, i2, i3, wr9Var);
        it9Var.e(q0VarZza);
        wr9Var.c = q0VarZza;
        return iP;
    }

    public static int p(Object obj, it9 it9Var, byte[] bArr, int i2, int i3, wr9 wr9Var) throws zzmr {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = i(i5, bArr, i4, wr9Var);
            i5 = wr9Var.a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = wr9Var.d + 1;
        wr9Var.d = i7;
        if (i7 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = i6 + i5;
        it9Var.h(obj, bArr, i6, i8, wr9Var);
        wr9Var.d--;
        wr9Var.c = obj;
        return i8;
    }

    public static int q(Object obj, it9 it9Var, byte[] bArr, int i2, int i3, int i4, wr9 wr9Var) throws zzmr {
        s0 s0Var = (s0) it9Var;
        int i5 = wr9Var.d + 1;
        wr9Var.d = i5;
        if (i5 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = s0Var.s(obj, bArr, i2, i3, i4, wr9Var);
        wr9Var.d--;
        wr9Var.c = obj;
        return iS;
    }

    public static int r(int i2, byte[] bArr, int i3, int i4, ps9 ps9Var, wr9 wr9Var) {
        ks9 ks9Var = (ks9) ps9Var;
        int iH = h(bArr, i3, wr9Var);
        ks9Var.e(wr9Var.a);
        while (iH < i4) {
            int iH2 = h(bArr, iH, wr9Var);
            if (i2 != wr9Var.a) {
                break;
            }
            iH = h(bArr, iH2, wr9Var);
            ks9Var.e(wr9Var.a);
        }
        return iH;
    }

    public static int s(byte[] bArr, int i2, ps9 ps9Var, wr9 wr9Var) throws zzmr {
        ks9 ks9Var = (ks9) ps9Var;
        int iH = h(bArr, i2, wr9Var);
        int i3 = wr9Var.a + iH;
        while (iH < i3) {
            iH = h(bArr, iH, wr9Var);
            ks9Var.e(wr9Var.a);
        }
        if (iH == i3) {
            return iH;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int t(it9 it9Var, int i2, byte[] bArr, int i3, int i4, ps9 ps9Var, wr9 wr9Var) throws zzmr {
        int iO = o(it9Var, bArr, i3, i4, wr9Var);
        ps9Var.add(wr9Var.c);
        while (iO < i4) {
            int iH = h(bArr, iO, wr9Var);
            if (i2 != wr9Var.a) {
                break;
            }
            iO = o(it9Var, bArr, iH, i4, wr9Var);
            ps9Var.add(wr9Var.c);
        }
        return iO;
    }

    public static int u(int i2, byte[] bArr, int i3, int i4, pt9 pt9Var, wr9 wr9Var) throws zzmr {
        if ((i2 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iJ = j(bArr, i3, wr9Var);
            pt9Var.d(i2, Long.valueOf(wr9Var.b));
            return iJ;
        }
        if (i5 == 1) {
            pt9Var.d(i2, Long.valueOf(l(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iH = h(bArr, i3, wr9Var);
            int i6 = wr9Var.a;
            if (i6 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - iH) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                pt9Var.d(i2, zzlh.b);
            } else {
                pt9Var.d(i2, zzlh.j(bArr, iH, i6));
            }
            return iH + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            pt9Var.d(i2, Integer.valueOf(k(i3, bArr)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        pt9 pt9VarA = pt9.a();
        int i8 = wr9Var.d + 1;
        wr9Var.d = i8;
        if (i8 >= 100) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iH2 = h(bArr, i3, wr9Var);
            int i10 = wr9Var.a;
            if (i10 == i7) {
                i9 = i10;
                i3 = iH2;
                break;
            }
            i3 = u(i10, bArr, iH2, i4, pt9VarA, wr9Var);
            i9 = i10;
        }
        wr9Var.d--;
        if (i3 > i4 || i9 != i7) {
            throw new zzmr("Failed to parse the message.");
        }
        pt9Var.d(i2, pt9VarA);
        return i3;
    }

    public static int v(int i2, byte[] bArr, int i3, int i4, wr9 wr9Var) throws zzmr {
        if ((i2 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return j(bArr, i3, wr9Var);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return h(bArr, i3, wr9Var) + wr9Var.a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = h(bArr, i3, wr9Var);
            i7 = wr9Var.a;
            if (i7 == i6) {
                break;
            }
            i3 = v(i7, bArr, i3, i4, wr9Var);
        }
        if (i3 > i4 || i7 != i6) {
            throw new zzmr("Failed to parse the message.");
        }
        return i3;
    }

    public abstract void f(int i2);

    public abstract void g(Typeface typeface, boolean z);
}
