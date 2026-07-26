package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.analyzer.d;
import androidx.constraintlayout.core.widgets.analyzer.e;
import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.room.RoomDatabase$JournalMode;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class xj1 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ xj1() {
        this.a = 0;
    }

    public static final void a(xj1 xj1Var, mb7 mb7Var) throws Exception {
        Object objA;
        vz1 vz1Var = (vz1) xj1Var.e;
        f(mb7Var);
        hb1 hb1Var = (hb1) xj1Var.d;
        RoomDatabase$JournalMode roomDatabase$JournalMode = hb1Var.g;
        RoomDatabase$JournalMode roomDatabase$JournalMode2 = RoomDatabase$JournalMode.c;
        if (roomDatabase$JournalMode == roomDatabase$JournalMode2) {
            ln2.d(mb7Var, "PRAGMA journal_mode = WAL");
        } else {
            ln2.d(mb7Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (hb1Var.g == roomDatabase$JournalMode2) {
            ln2.d(mb7Var, "PRAGMA synchronous = NORMAL");
        } else {
            ln2.d(mb7Var, "PRAGMA synchronous = FULL");
        }
        rb7 rb7VarM1 = mb7Var.m1("PRAGMA user_version");
        try {
            rb7VarM1.f1();
            int i = (int) rb7VarM1.getLong(0);
            m91.i(rb7VarM1, null);
            int i2 = vz1Var.a;
            if (i != i2) {
                ln2.d(mb7Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        xj1Var.j(mb7Var);
                    } else {
                        xj1Var.k(mb7Var, i, i2);
                    }
                    ln2.d(mb7Var, "PRAGMA user_version = " + i2);
                    objA = tx8.a;
                } catch (Throwable th) {
                    objA = b.a(th);
                }
                if (!(objA instanceof Result.Failure)) {
                    ln2.d(mb7Var, "END TRANSACTION");
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    ln2.d(mb7Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            xj1Var.l(mb7Var);
        } finally {
        }
    }

    public static void f(mb7 mb7Var) throws Exception {
        rb7 rb7VarM1 = mb7Var.m1("PRAGMA busy_timeout");
        try {
            rb7VarM1.f1();
            long j = rb7VarM1.getLong(0);
            m91.i(rb7VarM1, null);
            if (j < 3000) {
                ln2.d(mb7Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m91.i(rb7VarM1, th);
                throw th2;
            }
        }
    }

    public void b(a aVar, int i, ArrayList arrayList, kb7 kb7Var) {
        f fVar = aVar.d;
        kb7 kb7Var2 = fVar.c;
        a aVar2 = fVar.i;
        a aVar3 = fVar.h;
        if (kb7Var2 == null) {
            g31 g31Var = (g31) this.d;
            if (fVar == g31Var.d || fVar == g31Var.e) {
                return;
            }
            if (kb7Var == null) {
                kb7Var = new kb7();
                kb7Var.a = null;
                kb7Var.b = new ArrayList();
                kb7Var.a = fVar;
                arrayList.add(kb7Var);
            }
            fVar.c = kb7Var;
            kb7Var.b.add(fVar);
            for (wj1 wj1Var : aVar3.k) {
                if (wj1Var instanceof a) {
                    b((a) wj1Var, i, arrayList, kb7Var);
                }
            }
            for (wj1 wj1Var2 : aVar2.k) {
                if (wj1Var2 instanceof a) {
                    b((a) wj1Var2, i, arrayList, kb7Var);
                }
            }
            if (i == 1 && (fVar instanceof e)) {
                for (wj1 wj1Var3 : ((e) fVar).k.k) {
                    if (wj1Var3 instanceof a) {
                        b((a) wj1Var3, i, arrayList, kb7Var);
                    }
                }
            }
            Iterator it = aVar3.l.iterator();
            while (it.hasNext()) {
                b((a) it.next(), i, arrayList, kb7Var);
            }
            Iterator it2 = aVar2.l.iterator();
            while (it2.hasNext()) {
                b((a) it2.next(), i, arrayList, kb7Var);
            }
            if (i == 1 && (fVar instanceof e)) {
                Iterator it3 = ((e) fVar).k.l.iterator();
                while (it3.hasNext()) {
                    b((a) it3.next(), i, arrayList, kb7Var);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(defpackage.g31 r25) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj1.c(g31):void");
    }

    public void d() {
        g31 g31Var = (g31) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList<f> arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        g31 g31Var2 = (g31) this.e;
        g31Var2.d.f();
        g31Var2.e.f();
        arrayList2.add(g31Var2.d);
        arrayList2.add(g31Var2.e);
        HashSet hashSet = null;
        for (f31 f31Var : g31Var2.u0) {
            if (f31Var instanceof aw2) {
                bw2 bw2Var = new bw2(f31Var);
                f31Var.d.f();
                f31Var.e.f();
                bw2Var.f = ((aw2) f31Var).y0;
                arrayList2.add(bw2Var);
            } else {
                if (f31Var.y()) {
                    if (f31Var.b == null) {
                        f31Var.b = new ko0(f31Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(f31Var.b);
                } else {
                    arrayList2.add(f31Var.d);
                }
                if (f31Var.z()) {
                    if (f31Var.c == null) {
                        f31Var.c = new ko0(f31Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(f31Var.c);
                } else {
                    arrayList2.add(f31Var.e);
                }
                if (f31Var instanceof oy2) {
                    arrayList2.add(new c(f31Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((f) it.next()).f();
        }
        for (f fVar : arrayList2) {
            if (fVar.b != g31Var2) {
                fVar.d();
            }
        }
        arrayList.clear();
        g(g31Var.d, 0, arrayList);
        g(g31Var.e, 1, arrayList);
        this.b = false;
    }

    public int e(g31 g31Var, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        g31 g31Var2 = g31Var;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            f fVar = ((kb7) arrayList2.get(i3)).a;
            if (!(fVar instanceof ko0) ? !(i != 0 ? (fVar instanceof e) : (fVar instanceof d)) : ((ko0) fVar).f != i) {
                a aVar = (i == 0 ? g31Var2.d : g31Var2.e).h;
                a aVar2 = (i == 0 ? g31Var2.d : g31Var2.e).i;
                a aVar3 = fVar.h;
                a aVar4 = fVar.i;
                boolean zContains = aVar3.l.contains(aVar);
                boolean zContains2 = aVar4.l.contains(aVar2);
                long j2 = fVar.j();
                if (zContains && zContains2) {
                    long jB = kb7.b(aVar3, j);
                    long jA = kb7.a(aVar4, j);
                    long j3 = jB - j2;
                    int i4 = aVar4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = aVar3.f;
                    long j5 = ((-jA) - j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    f31 f31Var = fVar.b;
                    if (i == 0) {
                        f = f31Var.f0;
                    } else if (i == 1) {
                        f = f31Var.g0;
                    } else {
                        f31Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (((long) aVar3.f) + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) dw1.f(1.0f, f, f2, 0.5f)))) - ((long) aVar4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(kb7.b(aVar3, aVar3.f), ((long) aVar3.f) + j2) : zContains2 ? Math.max(-kb7.a(aVar4, aVar4.f), ((long) (-aVar4.f)) + j2) : (fVar.j() + ((long) aVar3.f)) - ((long) aVar4.f);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            g31Var2 = g31Var;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) jMax2;
    }

    public void g(f fVar, int i, ArrayList arrayList) {
        a aVar = fVar.h;
        a aVar2 = fVar.i;
        for (wj1 wj1Var : aVar.k) {
            if (wj1Var instanceof a) {
                b((a) wj1Var, i, arrayList, null);
            } else if (wj1Var instanceof f) {
                b(((f) wj1Var).h, i, arrayList, null);
            }
        }
        for (wj1 wj1Var2 : aVar2.k) {
            if (wj1Var2 instanceof a) {
                b((a) wj1Var2, i, arrayList, null);
            } else if (wj1Var2 instanceof f) {
                b(((f) wj1Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (wj1 wj1Var3 : ((e) fVar).k.k) {
                if (wj1Var3 instanceof a) {
                    b((a) wj1Var3, i, arrayList, null);
                }
            }
        }
    }

    public void h(f31 f31Var, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, int i, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, int i2) {
        ea0 ea0Var = (ea0) this.i;
        ea0Var.a = constraintWidget$DimensionBehaviour;
        ea0Var.b = constraintWidget$DimensionBehaviour2;
        ea0Var.c = i;
        ea0Var.d = i2;
        ((androidx.constraintlayout.widget.b) ((fa0) this.h)).b(f31Var, ea0Var);
        f31Var.P(ea0Var.e);
        f31Var.M(ea0Var.f);
        f31Var.E = ea0Var.h;
        f31Var.J(ea0Var.g);
    }

    public void i() {
        aa0 aa0Var;
        for (f31 f31Var : ((g31) this.d).u0) {
            if (!f31Var.a) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = f31Var.U;
                boolean z = false;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                int i = f31Var.r;
                int i2 = f31Var.s;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.b;
                boolean z2 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4 || (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3 && i == 1);
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour4 || (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 && i2 == 1)) {
                    z = true;
                }
                androidx.constraintlayout.core.widgets.analyzer.b bVar = f31Var.d.e;
                boolean z3 = bVar.j;
                androidx.constraintlayout.core.widgets.analyzer.b bVar2 = f31Var.e.e;
                boolean z4 = bVar2.j;
                boolean z5 = z2;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.a;
                if (z3 && z4) {
                    h(f31Var, constraintWidget$DimensionBehaviour5, bVar.g, constraintWidget$DimensionBehaviour5, bVar2.g);
                    f31Var.a = true;
                } else if (z3 && z) {
                    h(f31Var, constraintWidget$DimensionBehaviour5, bVar.g, constraintWidget$DimensionBehaviour4, bVar2.g);
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3) {
                        f31Var.e.e.m = f31Var.l();
                    } else {
                        f31Var.e.e.d(f31Var.l());
                        f31Var.a = true;
                    }
                } else if (z4 && z5) {
                    h(f31Var, constraintWidget$DimensionBehaviour4, bVar.g, constraintWidget$DimensionBehaviour5, bVar2.g);
                    if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3) {
                        f31Var.d.e.m = f31Var.r();
                    } else {
                        f31Var.d.e.d(f31Var.r());
                        f31Var.a = true;
                    }
                }
                if (f31Var.a && (aa0Var = f31Var.e.l) != null) {
                    aa0Var.d(f31Var.c0);
                }
            }
        }
    }

    public void j(mb7 mb7Var) throws Exception {
        vz1 vz1Var = (vz1) this.e;
        js3.p(mb7Var, "connection");
        rb7 rb7VarM1 = mb7Var.m1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (rb7VarM1.f1()) {
                if (rb7VarM1.getLong(0) == 0) {
                    z = true;
                }
            }
            m91.i(rb7VarM1, null);
            vz1Var.a(mb7Var);
            if (!z) {
                xe1 xe1VarV = vz1Var.v(mb7Var);
                if (!xe1VarV.a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) xe1VarV.b)).toString());
                }
            }
            m(mb7Var);
            vz1Var.r(mb7Var);
            Iterator it = ((List) this.f).iterator();
            while (it.hasNext()) {
                ((x97) it.next()).getClass();
                if (mb7Var instanceof androidx.sqlite.driver.a) {
                    js3.p(((androidx.sqlite.driver.a) mb7Var).a, "db");
                }
            }
        } finally {
        }
    }

    public void k(mb7 mb7Var, int i, int i2) {
        vz1 vz1Var = (vz1) this.e;
        js3.p(mb7Var, "connection");
        hb1 hb1Var = (hb1) this.d;
        List listB = zk8.B(hb1Var.d, i, i2);
        if (listB != null) {
            vz1Var.u(mb7Var);
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                throw bl4.o(it);
            }
            xe1 xe1VarV = vz1Var.v(mb7Var);
            if (xe1VarV.a) {
                vz1Var.t(mb7Var);
                m(mb7Var);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + ((String) xe1VarV.b)).toString());
            }
        }
        js3.p(hb1Var, "<this>");
        boolean z = false;
        if (i <= i2 || !hb1Var.l) {
            Set set = hb1Var.m;
            if (hb1Var.k && (set == null || !set.contains(Integer.valueOf(i)))) {
                z = true;
            }
        }
        if (z) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (hb1Var.s) {
            rb7 rb7VarM1 = mb7Var.m1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ListBuilder listBuilderS = br9.s();
                while (rb7VarM1.f1()) {
                    String strB0 = rb7VarM1.B0(0);
                    if (!m88.Z(strB0, "sqlite_", false) && !strB0.equals("android_metadata")) {
                        listBuilderS.add(new Pair(strB0, Boolean.valueOf(js3.i(rb7VarM1.B0(1), "view"))));
                    }
                }
                ListBuilder listBuilderQ = br9.q(listBuilderS);
                m91.i(rb7VarM1, null);
                ListIterator listIterator = listBuilderQ.listIterator(0);
                while (true) {
                    rz2 rz2Var = (rz2) listIterator;
                    if (!rz2Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) rz2Var.next();
                    String str = (String) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        ln2.d(mb7Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        ln2.d(mb7Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            vz1Var.c(mb7Var);
        }
        Iterator it2 = ((List) this.f).iterator();
        while (it2.hasNext()) {
            ((x97) it2.next()).getClass();
            if (mb7Var instanceof androidx.sqlite.driver.a) {
                js3.p(((androidx.sqlite.driver.a) mb7Var).a, "db");
            }
        }
        vz1Var.a(mb7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(defpackage.mb7 r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj1.l(mb7):void");
    }

    public void m(mb7 mb7Var) throws Exception {
        ln2.d(mb7Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) ((vz1) this.e).b;
        js3.p(str, "hash");
        ln2.d(mb7Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return kotlin.collections.a.t0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public xj1(hb1 hb1Var, vz1 vz1Var, qp2 qp2Var) {
        int i;
        Object aVar;
        this.a = 2;
        RoomDatabase$JournalMode roomDatabase$JournalMode = hb1Var.g;
        gv gvVar = hb1Var.c;
        nb7 nb7Var = hb1Var.t;
        String str = hb1Var.b;
        this.d = hb1Var;
        this.e = vz1Var;
        Object obj = hb1Var.e;
        this.f = obj == null ? EmptyList.a : obj;
        if (nb7Var != null) {
            this.h = null;
            if (nb7Var.h()) {
                aVar = new androidx.room.coroutines.c(new do3(this, nb7Var), str == null ? ":memory:" : str, qp2Var);
            } else if (str == null) {
                aVar = new androidx.room.coroutines.a(new do3(this, nb7Var));
            } else {
                do3 do3Var = new do3(this, nb7Var);
                int iOrdinal = roomDatabase$JournalMode.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + roomDatabase$JournalMode + '\'').toString());
                    }
                    i = 4;
                }
                int iOrdinal2 = roomDatabase$JournalMode.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + roomDatabase$JournalMode + '\'').toString());
                }
                aVar = new androidx.room.coroutines.a(do3Var, str, i);
            }
            this.g = aVar;
        } else {
            if (gvVar == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            Context context = hb1Var.a;
            js3.p(context, "context");
            io.sentry.android.sqlite.d dVar = new io.sentry.android.sqlite.d(new qo2(context, str, new dc0(this, vz1Var.a)));
            this.h = dVar;
            this.g = new androidx.room.coroutines.c(new xg5(dVar), str == null ? ":memory:" : str, qp2Var);
        }
        boolean z = roomDatabase$JournalMode == RoomDatabase$JournalMode.c;
        dc8 dc8Var = (dc8) this.h;
        if (dc8Var != null) {
            dc8Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public xj1(hb1 hb1Var, v27 v27Var, qp2 qp2Var) {
        this.a = 2;
        this.d = hb1Var;
        this.e = new w97(-1, "", "");
        Collection collection = hb1Var.e;
        this.f = collection == null ? EmptyList.a : collection;
        ArrayList arrayListA0 = kotlin.collections.a.A0(new x97(new a67(1, this)), collection == null ? EmptyList.a : collection);
        Context context = hb1Var.a;
        String str = hb1Var.b;
        gv gvVar = hb1Var.c;
        t15 t15Var = hb1Var.d;
        boolean z = hb1Var.f;
        RoomDatabase$JournalMode roomDatabase$JournalMode = hb1Var.g;
        Executor executor = hb1Var.h;
        Executor executor2 = hb1Var.i;
        Intent intent = hb1Var.j;
        boolean z2 = hb1Var.k;
        boolean z3 = hb1Var.l;
        Set set = hb1Var.m;
        String str2 = hb1Var.n;
        File file = hb1Var.o;
        Callable callable = hb1Var.p;
        List list = hb1Var.q;
        List list2 = hb1Var.r;
        boolean z4 = hb1Var.s;
        nb7 nb7Var = hb1Var.t;
        w61 w61Var = hb1Var.u;
        js3.p(context, "context");
        js3.p(t15Var, "migrationContainer");
        js3.p(executor, "queryExecutor");
        js3.p(executor2, "transactionExecutor");
        js3.p(list, "typeConverters");
        js3.p(list2, "autoMigrationSpecs");
        hb1 hb1Var2 = new hb1(context, str, gvVar, t15Var, arrayListA0, z, roomDatabase$JournalMode, executor, executor2, intent, z2, z3, set, str2, file, callable, list, list2, z4, nb7Var, w61Var);
        hb1Var2.v = hb1Var.v;
        v27Var.invoke(hb1Var2);
        throw null;
    }

    public xj1(boolean z, boolean z2, s26 s26Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = 1;
        js3.p(map, "extras");
        this.b = z;
        this.c = z2;
        this.d = s26Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = kotlin.collections.b.T(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(boolean z, boolean z2, s26 s26Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, s26Var, l, l2, l3, l4, kotlin.collections.b.I());
        this.a = 1;
    }
}
