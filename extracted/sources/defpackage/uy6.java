package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class uy6 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static void A(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        I(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void B(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        I(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void C(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                I(parcel, i, 0);
            }
        } else {
            int iJ = J(i, parcel);
            parcelable.writeToParcel(parcel, i2);
            K(iJ, parcel);
        }
    }

    public static void D(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                I(parcel, i, 0);
            }
        } else {
            int iJ = J(i, parcel);
            parcel.writeString(str);
            K(iJ, parcel);
        }
    }

    public static void E(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iJ = J(i, parcel);
        parcel.writeStringArray(strArr);
        K(iJ, parcel);
    }

    public static void F(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iJ = J(i, parcel);
        parcel.writeStringList(list);
        K(iJ, parcel);
    }

    public static void G(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iJ = J(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        K(iJ, parcel);
    }

    public static void H(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                I(parcel, i, 0);
                return;
            }
            return;
        }
        int iJ = J(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        K(iJ, parcel);
    }

    public static void I(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int J(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void K(int i, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            sn3.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = zi8.c;
        return j;
    }

    public static final LinkedHashMap c(ArrayList arrayList) {
        String str = s26.b;
        s26 s26VarX = rl3.x("/");
        LinkedHashMap linkedHashMapO = b.O(new Pair(s26VarX, new yg9(s26VarX, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (yg9 yg9Var : a.J0(arrayList, new ek6(13))) {
            if (((yg9) linkedHashMapO.put(yg9Var.a, yg9Var)) == null) {
                while (true) {
                    s26 s26Var = yg9Var.a;
                    s26 s26VarC = s26Var.c();
                    if (s26VarC != null) {
                        yg9 yg9Var2 = (yg9) linkedHashMapO.get(s26VarC);
                        if (yg9Var2 != null) {
                            yg9Var2.q.add(s26Var);
                            break;
                        }
                        yg9 yg9Var3 = new yg9(s26VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMapO.put(s26VarC, yg9Var3);
                        yg9Var3.q.add(s26Var);
                        yg9Var = yg9Var3;
                    }
                }
            }
        }
        return linkedHashMapO;
    }

    public static final long d(int i, long j) {
        int i2 = zi8.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : b(i4, i);
    }

    public static final long e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final String f(int i) {
        js3.q(16);
        String string = Integer.toString(i, 16);
        js3.o(string, "toString(...)");
        return "0x".concat(string);
    }

    public static final String g(int i, qz0 qz0Var) {
        qz0Var.j(e.a);
        return ((Context) qz0Var.j(e.b)).getResources().getString(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:65|69|125|70|(4:73|(3:75|(2:77|145)(1:144)|80)(3:143|81|82)|(4:93|123|94|95)(1:96)|71)|134|83|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bd, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r13 != (r10.y() & 65535)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r0 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r9 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r10.skip(4);
        r6 = ((long) r10.k()) & 4294967295L;
        r15 = r10.y() & 65535;
        r12 = new defpackage.fg0(r13, r15, r6);
        r10.D(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r10.close();
        r4 = r4 - ((long) 20);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r4 <= r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r4 = defpackage.rf0.j(r3.b(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r4.k() != 117853008) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r4.k();
        r8 = r4.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r4.k() != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r5 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        r5 = defpackage.rf0.j(r3.b(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r6 = r5.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r6 != 101075792) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r5.skip(12);
        r6 = r5.k();
        r8 = r5.k();
        r21 = r5.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r21 != r5.u()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r6 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r8 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r5.skip(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        throw new java.io.IOException("bad zip: expected " + f(101075792) + " but was " + f(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        defpackage.wu8.f(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0146, code lost:
    
        defpackage.wu8.f(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019a, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r0 = r10.y() & 65535;
        r9 = r10.y() & 65535;
        r13 = r10.y() & 65535;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124), top: B:121:0x0092, outer: #10, inners: #2, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d A[Catch: all -> 0x014e, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7 A[Catch: all -> 0x014e, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[Catch: all -> 0x014e, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.zg9 h(defpackage.s26 r26, defpackage.tb2 r27, defpackage.dp2 r28) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy6.h(s26, tb2, dp2):zg9");
    }

    public static final yg9 i(final tv6 tv6Var) throws IOException {
        int iK = tv6Var.k();
        if (iK != 33639248) {
            throw new IOException("bad zip: expected " + f(33639248) + " but was " + f(iK));
        }
        tv6Var.skip(4L);
        short sY = tv6Var.y();
        int i = sY & 65535;
        if ((sY & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + f(i));
        }
        int iY = tv6Var.y() & 65535;
        int iY2 = tv6Var.y() & 65535;
        int iY3 = tv6Var.y() & 65535;
        long jK = ((long) tv6Var.k()) & 4294967295L;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.a = ((long) tv6Var.k()) & 4294967295L;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.a = ((long) tv6Var.k()) & 4294967295L;
        int iY4 = tv6Var.y() & 65535;
        int iY5 = tv6Var.y() & 65535;
        int iY6 = 65535 & tv6Var.y();
        tv6Var.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.a = ((long) tv6Var.k()) & 4294967295L;
        String strD = tv6Var.D(iY4);
        if (f88.d0(strD, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = ref$LongRef2.a == 4294967295L ? 8 : 0L;
        if (ref$LongRef.a == 4294967295L) {
            j += (long) 8;
        }
        if (ref$LongRef3.a == 4294967295L) {
            j += (long) 8;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        j(tv6Var, iY5, new qp2() { // from class: bh9
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                tv6 tv6Var2 = tv6Var;
                if (iIntValue == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                    if (ref$BooleanRef2.a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    ref$BooleanRef2.a = true;
                    if (jLongValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref$LongRef ref$LongRef4 = ref$LongRef2;
                    long jU = ref$LongRef4.a;
                    if (jU == 4294967295L) {
                        jU = tv6Var2.u();
                    }
                    ref$LongRef4.a = jU;
                    Ref$LongRef ref$LongRef5 = ref$LongRef;
                    ref$LongRef5.a = ref$LongRef5.a == 4294967295L ? tv6Var2.u() : 0L;
                    Ref$LongRef ref$LongRef6 = ref$LongRef3;
                    ref$LongRef6.a = ref$LongRef6.a == 4294967295L ? tv6Var2.u() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    tv6Var2.skip(4L);
                    uy6.j(tv6Var2, (int) (jLongValue - 4), new ah9(ref$ObjectRef, tv6Var2, ref$ObjectRef2, ref$ObjectRef3));
                }
                return tx8.a;
            }
        });
        if (j > 0 && !ref$BooleanRef.a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strD2 = tv6Var.D(iY6);
        String str = s26.b;
        return new yg9(rl3.x("/").e(strD), m88.S(strD, "/", false), strD2, jK, ref$LongRef.a, ref$LongRef2.a, iY, ref$LongRef3.a, iY3, iY2, (Long) ref$ObjectRef.a, (Long) ref$ObjectRef2.a, (Long) ref$ObjectRef3.a, 57344);
    }

    public static final void j(tv6 tv6Var, int i, qp2 qp2Var) throws IOException {
        gh0 gh0Var = tv6Var.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iY = tv6Var.y() & 65535;
            long jY = ((long) tv6Var.y()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < jY) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            tv6Var.g1(jY);
            long j3 = gh0Var.b;
            qp2Var.invoke(Integer.valueOf(iY), Long.valueOf(jY));
            long j4 = (gh0Var.b + jY) - j3;
            if (j4 < 0) {
                throw new IOException(rm7.n(iY, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                gh0Var.skip(j4);
            }
            j = j2 - jY;
        }
    }

    public static final yg9 k(tv6 tv6Var, yg9 yg9Var) throws IOException {
        int iK = tv6Var.k();
        if (iK != 67324752) {
            throw new IOException("bad zip: expected " + f(67324752) + " but was " + f(iK));
        }
        tv6Var.skip(2L);
        short sY = tv6Var.y();
        int i = sY & 65535;
        if ((sY & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + f(i));
        }
        tv6Var.skip(18L);
        long jY = ((long) tv6Var.y()) & 65535;
        int iY = tv6Var.y() & 65535;
        tv6Var.skip(jY);
        if (yg9Var == null) {
            tv6Var.skip(iY);
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        j(tv6Var, iY, new ah9(tv6Var, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        return new yg9(yg9Var.a, yg9Var.b, yg9Var.c, yg9Var.d, yg9Var.e, yg9Var.f, yg9Var.g, yg9Var.h, yg9Var.i, yg9Var.j, yg9Var.k, yg9Var.l, yg9Var.m, (Integer) ref$ObjectRef.a, (Integer) ref$ObjectRef2.a, (Integer) ref$ObjectRef3.a);
    }

    public static final Object l(pu3 pu3Var, String str, cw3 cw3Var, px3 px3Var) {
        js3.p(pu3Var, "<this>");
        js3.p(str, "discriminator");
        return new nw3(pu3Var, cw3Var, str, px3Var.getDescriptor()).e(px3Var);
    }

    public static final void m(int i, View view) {
        js3.p(view, "<this>");
        view.setBackground(y97.B(0.0f, i, 1));
    }

    public static final void n(int i, View view) {
        js3.p(view, "<this>");
        view.setBackground(y97.w(i));
    }

    public static final void o(int i, View view) {
        js3.p(view, "<this>");
        view.setForeground(y97.w(i));
    }

    public static final void p(View view, int i, Float f) {
        js3.p(view, "<this>");
        view.setForeground(y97.z(i, f != null ? f.floatValue() : 0.0f));
    }

    public static void q(View view, int i, Float f, int i2) {
        if ((i2 & 1) != 0) {
            i = sj8.b().O.c;
        }
        if ((i2 & 2) != 0) {
            f = Float.valueOf(0.0f);
        }
        p(view, i, f);
    }

    public static final Rect r(vq3 vq3Var) {
        return new Rect(vq3Var.a, vq3Var.b, vq3Var.c, vq3Var.d);
    }

    public static final RectF s(sy6 sy6Var) {
        return new RectF(sy6Var.a, sy6Var.b, sy6Var.c, sy6Var.d);
    }

    public static final sy6 t(Rect rect) {
        return new sy6(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final sy6 u(RectF rectF) {
        return new sy6(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static void v(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iJ = J(i, parcel);
        parcel.writeBundle(bundle);
        K(iJ, parcel);
    }

    public static void w(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                I(parcel, i, 0);
            }
        } else {
            int iJ = J(i, parcel);
            parcel.writeByteArray(bArr);
            K(iJ, parcel);
        }
    }

    public static void x(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        I(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void y(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iJ = J(i, parcel);
        parcel.writeStrongBinder(iBinder);
        K(iJ, parcel);
    }

    public static void z(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iJ = J(i, parcel);
        parcel.writeIntArray(iArr);
        K(iJ, parcel);
    }
}
