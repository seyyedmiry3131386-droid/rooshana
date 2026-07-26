package defpackage;

import ir.myket.network.server.AppServersModel$AppServersParseException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ps {
    public static final ls Companion = new ls();
    public static final c24[] c = {null, a.b(LazyThreadSafetyMode.b, new v7(12))};
    public ap7 a;
    public List b;

    public static final String a(ps psVar, String str) {
        psVar.getClass();
        if (str != null && str.length() != 0) {
            String strU0 = f88.u0(str, "/");
            if (!new Regex("^\\p{Alpha}+://.*$").f(strU0)) {
                strU0 = "http://".concat(strU0);
            }
            if (strU0 == null) {
                strU0 = "";
            }
            try {
                new URL(strU0);
                return strU0;
            } catch (MalformedURLException e) {
                lw.g(e, null, null);
            }
        }
        return null;
    }

    public static ArrayList b(dp2 dp2Var, List list) throws AppServersModel$AppServersParseException {
        if (list == null || list.isEmpty()) {
            throw new AppServersModel$AppServersParseException("Given list is empty");
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) dp2Var.invoke((String) it.next());
            if (str != null) {
                if (arrayList.contains(str)) {
                    list.toString();
                } else {
                    arrayList.add(str);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        String str2 = "No item is valid in list, " + list;
        js3.p(str2, "detailMessage");
        throw new AppServersModel$AppServersParseException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps)) {
            return false;
        }
        ps psVar = (ps) obj;
        return js3.i(this.a, psVar.a) && js3.i(this.b, psVar.b);
    }

    public final int hashCode() {
        ap7 ap7Var = this.a;
        int iHashCode = (ap7Var == null ? 0 : ap7Var.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AppServersModel(defaultServerList=" + this.a + ", serviceServerLists=" + this.b + ")";
    }
}
