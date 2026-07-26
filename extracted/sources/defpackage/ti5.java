package defpackage;

import android.net.Uri;
import android.os.Bundle;
import io.sentry.b6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class ti5 {
    public static final Regex q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex r = new Regex("\\{(.+?)\\}");
    public static final Regex s = new Regex("http[s]?://");
    public static final Regex t = new Regex(b6.DEFAULT_PROPAGATION_TARGETS);
    public static final Regex u = new Regex("([^/]*?|)");
    public static final Regex v = new Regex("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final c24 f;
    public final c24 g;
    public final Object h;
    public boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final c24 m;
    public final String n;
    public final c24 o;
    public final boolean p;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ti5(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti5.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (ij4 ij4VarA = r.a(str); ij4VarA != null; ij4VarA = ij4VarA.c()) {
            fj4 fj4VarC = ij4VarA.c.c(1);
            js3.m(fj4VarC);
            arrayList.add(fj4VarC.a);
            if (ij4VarA.b().a > i) {
                String strSubstring = str.substring(i, ij4VarA.b().a);
                js3.o(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                js3.o(strQuote, "quote(...)");
                sb.append(strQuote);
            }
            String strPattern = u.a.pattern();
            js3.o(strPattern, "pattern(...)");
            sb.append(strPattern);
            i = ij4VarA.b().b + 1;
        }
        if (i < str.length()) {
            String strSubstring2 = str.substring(i);
            js3.o(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            js3.o(strQuote2, "quote(...)");
            sb.append(strQuote2);
        }
    }

    public static void e(Bundle bundle, String str, String str2, di5 di5Var) {
        if (di5Var == null) {
            h27.m(str, str2, bundle);
            return;
        }
        sj5 sj5Var = di5Var.a;
        js3.p(str, "key");
        sj5Var.e(bundle, str, sj5Var.g(str2));
    }

    public static String f(String str) {
        return (f88.c0(str, "\\Q", false) && f88.c0(str, "\\E", false)) ? m88.X(str, b6.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q") : f88.c0(str, "\\.\\*", false) ? m88.X(str, "\\.\\*", b6.DEFAULT_PROPAGATION_TARGETS) : str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c24, java.lang.Object] */
    public final ArrayList b() {
        Collection collectionValues = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            a.b0(((si5) it.next()).b, arrayList);
        }
        return a.z0((List) this.k.getValue(), a.z0(arrayList, this.d));
    }

    public final boolean c(ij4 ij4Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                br9.P();
                throw null;
            }
            String str = (String) obj;
            fj4 fj4VarC = ij4Var.c.c(i2);
            if (fj4VarC != null) {
                strDecode = Uri.decode(fj4VarC.a);
                js3.o(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                e(bundle, str, strDecode, (di5) map.get(str));
                arrayList2.add(tx8.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [c24, java.lang.Object] */
    public final boolean d(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            si5 si5Var = (si5) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = br9.B(query);
            }
            tx8 tx8Var = tx8.a;
            b.I();
            boolean z2 = false;
            Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
            for (String str2 : si5Var.b) {
                di5 di5Var = (di5) map.get(str2);
                sj5 sj5Var = di5Var != null ? di5Var.a : null;
                if ((sj5Var instanceof xd0) && !di5Var.c) {
                    xd0 xd0Var = (xd0) sj5Var;
                    switch (xd0Var.r) {
                        case 0:
                            obj = new boolean[0];
                            break;
                        case 1:
                            obj = EmptyList.a;
                            break;
                        case 2:
                            obj = new float[0];
                            break;
                        case 3:
                            obj = EmptyList.a;
                            break;
                        case 4:
                            obj = new int[0];
                            break;
                        case 5:
                            obj = EmptyList.a;
                            break;
                        case 6:
                            obj = new long[0];
                            break;
                        case 7:
                            obj = EmptyList.a;
                            break;
                        case 8:
                            obj = new String[0];
                            break;
                        default:
                            obj = EmptyList.a;
                            break;
                    }
                    xd0Var.e(bundleG, str2, obj);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = si5Var.a;
                ij4 ij4VarE = str4 != null ? new Regex(str4).e(str3) : null;
                if (ij4VarE == null) {
                    return z2;
                }
                ArrayList arrayList = si5Var.b;
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                ?? r14 = z2;
                for (Object obj2 : arrayList) {
                    int i = r14 + 1;
                    if (r14 < 0) {
                        br9.P();
                        throw null;
                    }
                    String str5 = (String) obj2;
                    fj4 fj4VarC = ij4VarE.c.c(i);
                    String str6 = fj4VarC != null ? fj4VarC.a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    di5 di5Var2 = (di5) map.get(str5);
                    try {
                        js3.p(str5, "key");
                    } catch (IllegalArgumentException unused) {
                    }
                    if (bundleG.containsKey(str5)) {
                        if (bundleG.containsKey(str5)) {
                            if (di5Var2 != null) {
                                sj5 sj5Var2 = di5Var2.a;
                                Object objA = sj5Var2.a(bundleG, str5);
                                if (!bundleG.containsKey(str5)) {
                                    throw new IllegalArgumentException("There is no previous value in this savedState.");
                                }
                                sj5Var2.e(bundleG, str5, sj5Var2.c(objA, str6));
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        objValueOf = Boolean.valueOf(z);
                        arrayList2.add(objValueOf);
                        r14 = i;
                        z2 = false;
                    } else {
                        e(bundleG, str5, str6, di5Var2);
                    }
                    objValueOf = tx8Var;
                    arrayList2.add(objValueOf);
                    r14 = i;
                    z2 = false;
                }
            }
            bundle.putAll(bundleG);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ti5)) {
            ti5 ti5Var = (ti5) obj;
            if (js3.i(this.a, ti5Var.a) && js3.i(this.b, ti5Var.b) && js3.i(this.c, ti5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
