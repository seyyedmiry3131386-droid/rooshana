package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.firebase.datastorage.a;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ky2 {
    public static final bj6 b = new bj6("fire-global");
    public static final bj6 c = new bj6("fire-count");
    public static final bj6 d = s7.c0("last-used-date");
    public final a a;

    public ky2(Context context, String str) {
        this.a = new a(context, dw1.n("FirebaseHeartBeat", str));
    }

    public final synchronized long a(pb5 pb5Var) {
        long j;
        try {
            long jLongValue = ((Long) vy2.G(pb5Var, c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : pb5Var.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((bj6) entry.getKey()).a;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            pb5Var.f(s7.d0(str), hashSet2);
            j = jLongValue - 1;
            pb5Var.e(c, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final synchronized void b() {
        this.a.a(new m22(6, this));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strD = d(System.currentTimeMillis());
            for (Map.Entry entry : this.a.b().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strD);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new n20(((bj6) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized bj6 e(pb5 pb5Var, String str) {
        for (Map.Entry entry : pb5Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return s7.d0(((bj6) entry.getKey()).a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j2) {
        return d(j).equals(d(j2));
    }

    public final synchronized void g() {
        this.a.a(new m(this, d(System.currentTimeMillis()), 18));
    }

    public final synchronized void h(pb5 pb5Var, String str) {
        try {
            bj6 bj6VarE = e(pb5Var, str);
            if (bj6VarE == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) vy2.G(pb5Var, bj6VarE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                pb5Var.d(bj6VarE);
            } else {
                pb5Var.f(bj6VarE, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j) {
        return j(b, j);
    }

    public final synchronized boolean j(bj6 bj6Var, long j) {
        if (f(((Long) this.a.c(bj6Var)).longValue(), j)) {
            return false;
        }
        this.a.d(bj6Var, Long.valueOf(j));
        return true;
    }

    public final synchronized void k(long j, String str) throws Throwable {
        try {
            try {
                String strD = d(j);
                bj6 bj6VarD0 = s7.d0(str);
                this.a.a(new zi(this, strD, str, bj6VarD0, 4));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void l(long j) {
        this.a.a(new zf(3, j));
    }
}
