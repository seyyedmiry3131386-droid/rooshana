package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.b;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ew extends zk8 {
    public static void A0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        js3.p(jArr, "<this>");
        js3.p(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void B0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        x0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void C0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        y0(0, i, i2, objArr, objArr2);
    }

    public static byte[] D0(byte[] bArr, int i, int i2) {
        js3.p(bArr, "<this>");
        zk8.w(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        js3.o(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] E0(Object[] objArr, int i, int i2) {
        js3.p(objArr, "<this>");
        zk8.w(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        js3.o(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void F0(int i, int i2, Object obj, Object[] objArr) {
        js3.p(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void G0(int[] iArr, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void H0(long[] jArr, long j) {
        int length = jArr.length;
        js3.p(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList J0(Object[] objArr) {
        js3.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object K0(Object[] objArr) {
        js3.p(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int L0(long[] jArr) {
        js3.p(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Object M0(int i, Object[] objArr) {
        js3.p(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int N0(Object[] objArr, Object obj) {
        js3.p(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String O0(int i, String str, Object[] objArr) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        js3.p(objArr, "<this>");
        js3.p(str, "separator");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            cc7.b(sb, obj, null);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static int P0(Object[] objArr, Object obj) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Integer Q0(int[] iArr) {
        js3.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static int[] R0(int[] iArr, int[] iArr2) {
        js3.p(iArr, "<this>");
        js3.p(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        js3.m(iArrCopyOf);
        return iArrCopyOf;
    }

    public static char S0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void T0(Object[] objArr, Comparator comparator, int i, int i2) {
        js3.p(objArr, "<this>");
        js3.p(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }

    public static int U0(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static List V0(float[] fArr) {
        js3.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.a;
        }
        if (length == 1) {
            return br9.B(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List W0(long[] jArr) {
        js3.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.a;
        }
        if (length == 1) {
            return br9.B(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List X0(Object[] objArr) {
        js3.p(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? a1(objArr) : br9.B(objArr[0]) : EmptyList.a;
    }

    public static List Y0(boolean[] zArr) {
        js3.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.a;
        }
        if (length == 1) {
            return br9.B(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList Z0(int[] iArr) {
        js3.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static ArrayList a1(Object[] objArr) {
        js3.p(objArr, "<this>");
        return new ArrayList(new kv(objArr, false));
    }

    public static Set b1(Object[] objArr) {
        js3.p(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.a;
        }
        if (length == 1) {
            return a77.p(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(b.L(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static List r0(Object[] objArr) {
        js3.p(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        js3.o(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean s0(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    public static boolean t0(Object[] objArr, Object obj) {
        js3.p(objArr, "<this>");
        return N0(objArr, obj) >= 0;
    }

    public static boolean u0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!u0((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof hw8) && (obj2 instanceof hw8)) {
                    byte[] bArr = ((hw8) obj).a;
                    byte[] bArr2 = ((hw8) obj2).a;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof zw8) && (obj2 instanceof zw8)) {
                    short[] sArr = ((zw8) obj).a;
                    short[] sArr2 = ((zw8) obj2).a;
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof pw8) && (obj2 instanceof pw8)) {
                    int[] iArr = ((pw8) obj).a;
                    int[] iArr2 = ((pw8) obj2).a;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof uw8) && (obj2 instanceof uw8)) {
                    long[] jArr = ((uw8) obj).a;
                    long[] jArr2 = ((uw8) obj2).a;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void v0(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            String str = Ssh2PublicKeyAlgorithmName.NULL;
            if (obj == null) {
                sb.append(Ssh2PublicKeyAlgorithmName.NULL);
            } else if (obj instanceof Object[]) {
                v0((Object[]) obj, sb, arrayList);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                js3.o(string, "toString(...)");
                sb.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                js3.o(string2, "toString(...)");
                sb.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                js3.o(string3, "toString(...)");
                sb.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                js3.o(string4, "toString(...)");
                sb.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                js3.o(string5, "toString(...)");
                sb.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                js3.o(string6, "toString(...)");
                sb.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                js3.o(string7, "toString(...)");
                sb.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                js3.o(string8, "toString(...)");
                sb.append(string8);
            } else if (obj instanceof hw8) {
                String strT0 = a.t0(new hw8(((hw8) obj).a), ", ", "[", "]", null, 56);
                if (strT0 != null) {
                    str = strT0;
                }
                sb.append(str);
            } else if (obj instanceof zw8) {
                String strT02 = a.t0(new zw8(((zw8) obj).a), ", ", "[", "]", null, 56);
                if (strT02 != null) {
                    str = strT02;
                }
                sb.append(str);
            } else if (obj instanceof pw8) {
                String strT03 = a.t0(new pw8(((pw8) obj).a), ", ", "[", "]", null, 56);
                if (strT03 != null) {
                    str = strT03;
                }
                sb.append(str);
            } else if (obj instanceof uw8) {
                String strT04 = a.t0(new uw8(((uw8) obj).a), ", ", "[", "]", null, 56);
                if (strT04 != null) {
                    str = strT04;
                }
                sb.append(str);
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(br9.y(arrayList));
    }

    public static void w0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        js3.p(bArr, "<this>");
        js3.p(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void x0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        js3.p(iArr, "<this>");
        js3.p(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void y0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        js3.p(objArr, "<this>");
        js3.p(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void z0(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        js3.p(cArr, "<this>");
        js3.p(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }
}
