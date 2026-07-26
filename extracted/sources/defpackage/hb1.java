package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase$JournalMode;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hb1 {
    public final Context a;
    public final String b;
    public final gv c;
    public final t15 d;
    public final List e;
    public final boolean f;
    public final RoomDatabase$JournalMode g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set m;
    public final String n;
    public final File o;
    public final Callable p;
    public final List q;
    public final List r;
    public final boolean s;
    public final nb7 t;
    public final w61 u;
    public boolean v;

    public hb1(Context context, String str, gv gvVar, t15 t15Var, List list, boolean z, RoomDatabase$JournalMode roomDatabase$JournalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, nb7 nb7Var, w61 w61Var) {
        js3.p(context, "context");
        js3.p(t15Var, "migrationContainer");
        js3.p(executor, "queryExecutor");
        js3.p(executor2, "transactionExecutor");
        js3.p(list2, "typeConverters");
        js3.p(list3, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = gvVar;
        this.d = t15Var;
        this.e = list;
        this.f = z;
        this.g = roomDatabase$JournalMode;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = list2;
        this.r = list3;
        this.s = z4;
        this.t = nb7Var;
        this.u = w61Var;
        this.v = true;
    }
}
