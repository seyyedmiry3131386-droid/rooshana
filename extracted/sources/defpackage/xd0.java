package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class xd0 extends sj5 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd0(int i, boolean z) {
        super(z);
        this.r = i;
    }

    public static float[] g(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new float[]{((Number) sj5.i.d(str)).floatValue()};
    }

    public static int[] h(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new int[]{((Number) sj5.b.d(str)).intValue()};
    }

    public static long[] i(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new long[]{((Number) sj5.f.d(str)).longValue()};
    }

    public static boolean[] j(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new boolean[]{((Boolean) sj5.l.d(str)).booleanValue()};
    }

    @Override // defpackage.sj5
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                z17.f(str);
                throw null;
            case 1:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return ew.Y0(booleanArray2);
                }
                z17.f(str);
                throw null;
            case 2:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                z17.f(str);
                throw null;
            case 3:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return ew.V0(floatArray2);
                }
                z17.f(str);
                throw null;
            case 4:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                z17.f(str);
                throw null;
            case 5:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    int length = intArray2.length;
                    return length != 0 ? length != 1 ? ew.Z0(intArray2) : br9.B(Integer.valueOf(intArray2[0])) : EmptyList.a;
                }
                z17.f(str);
                throw null;
            case 6:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                z17.f(str);
                throw null;
            case 7:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return ew.W0(longArray2);
                }
                z17.f(str);
                throw null;
            case 8:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                z17.f(str);
                throw null;
            default:
                js3.p(bundle, "bundle");
                if (!bundle.containsKey(str) || t17.g(bundle, str)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(str);
                if (stringArray2 != null) {
                    return ew.X0(stringArray2);
                }
                z17.f(str);
                throw null;
        }
    }

    @Override // defpackage.sj5
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // defpackage.sj5
    public final Object c(Object obj, String str) {
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return j(str);
                }
                boolean[] zArrJ = j(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrJ, 0, zArrCopyOf, length, 1);
                js3.m(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                yd0 yd0Var = sj5.l;
                return list != null ? a.z0(br9.B(yd0Var.d(str)), list) : br9.B(yd0Var.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return g(str);
                }
                float[] fArrG = g(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrG, 0, fArrCopyOf, length2, 1);
                js3.m(fArrCopyOf);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                yd0 yd0Var2 = sj5.i;
                return list2 != null ? a.z0(br9.B(yd0Var2.d(str)), list2) : br9.B(yd0Var2.d(str));
            case 4:
                int[] iArr = (int[]) obj;
                return iArr != null ? ew.R0(iArr, h(str)) : h(str);
            case 5:
                List list3 = (List) obj;
                yd0 yd0Var3 = sj5.b;
                return list3 != null ? a.z0(br9.B(yd0Var3.d(str)), list3) : br9.B(yd0Var3.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return i(str);
                }
                long[] jArrI = i(str);
                int length3 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length3 + 1);
                System.arraycopy(jArrI, 0, jArrCopyOf, length3, 1);
                js3.m(jArrCopyOf);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                yd0 yd0Var4 = sj5.f;
                return list4 != null ? a.z0(br9.B(yd0Var4.d(str)), list4) : br9.B(yd0Var4.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length4 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length4 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length4, 1);
                js3.m(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? a.z0(br9.B(str), list5) : br9.B(str);
        }
    }

    @Override // defpackage.sj5
    public final Object d(String str) {
        switch (this.r) {
            case 0:
                return j(str);
            case 1:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return br9.B(sj5.l.d(str));
            case 2:
                return g(str);
            case 3:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return br9.B(sj5.i.d(str));
            case 4:
                return h(str);
            case 5:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return br9.B(sj5.b.d(str));
            case 6:
                return i(str);
            case 7:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return br9.B(sj5.f.d(str));
            case 8:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return new String[]{str};
            default:
                js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return br9.B(str);
        }
    }

    @Override // defpackage.sj5
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                js3.p(str, "key");
                if (zArr == null) {
                    h27.k(bundle, str);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                List list = (List) obj;
                js3.p(str, "key");
                if (list == null) {
                    h27.k(bundle, str);
                } else {
                    bundle.putBooleanArray(str, a.L0(list));
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                js3.p(str, "key");
                if (fArr == null) {
                    h27.k(bundle, str);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 3:
                List list2 = (List) obj;
                js3.p(str, "key");
                if (list2 == null) {
                    h27.k(bundle, str);
                } else {
                    bundle.putFloatArray(str, a.N0(list2));
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                js3.p(str, "key");
                if (iArr == null) {
                    h27.k(bundle, str);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 5:
                List list3 = (List) obj;
                js3.p(str, "key");
                if (list3 != null) {
                    bundle.putIntArray(str, a.O0(list3));
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                js3.p(str, "key");
                if (jArr == null) {
                    h27.k(bundle, str);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            case 7:
                List list4 = (List) obj;
                js3.p(str, "key");
                if (list4 == null) {
                    h27.k(bundle, str);
                } else {
                    long[] jArr2 = new long[list4.size()];
                    Iterator it = list4.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        jArr2[i] = ((Number) it.next()).longValue();
                        i++;
                    }
                    bundle.putLongArray(str, jArr2);
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                js3.p(str, "key");
                if (strArr == null) {
                    h27.k(bundle, str);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
            default:
                List list5 = (List) obj;
                js3.p(str, "key");
                if (list5 == null) {
                    h27.k(bundle, str);
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    js3.p(strArr2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    bundle.putStringArray(str, strArr2);
                }
                break;
        }
    }
}
