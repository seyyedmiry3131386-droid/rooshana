package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kb1 extends ib1 {
    static {
        eh5.a("DatabaseHelperNullObject");
    }

    @Override // defpackage.ib1
    public final String toString() {
        return "Null Object DatabaseHelper\n";
    }

    @Override // defpackage.ib1
    public final List u() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ib1
    public final void y(es1 es1Var) {
        int i = es1Var.a;
    }

    @Override // defpackage.ib1
    public final void b() {
    }

    @Override // defpackage.ib1
    public final void D(es1 es1Var) {
    }

    @Override // defpackage.ib1
    public final void d(es1 es1Var) {
    }

    @Override // defpackage.ib1, android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.ib1, android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
