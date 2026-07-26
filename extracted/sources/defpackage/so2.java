package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class so2 extends ro2 implements ic8 {
    public final SQLiteStatement b;

    public so2(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    @Override // defpackage.ic8
    public final int E() {
        return this.b.executeUpdateDelete();
    }

    @Override // defpackage.ic8
    public final void execute() {
        this.b.execute();
    }

    @Override // defpackage.ic8
    public final long k1() {
        return this.b.executeInsert();
    }

    @Override // defpackage.ic8
    public final String o0() {
        return this.b.simpleQueryForString();
    }

    @Override // defpackage.ic8
    public final long r() {
        return this.b.simpleQueryForLong();
    }
}
