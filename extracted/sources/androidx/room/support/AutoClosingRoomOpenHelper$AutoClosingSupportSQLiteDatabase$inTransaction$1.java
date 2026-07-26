package androidx.room.support;

import defpackage.cc8;
import defpackage.dp2;
import defpackage.js3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 extends FunctionReferenceImpl implements dp2 {
    static {
        new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1();
    }

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1() {
        super(1, cc8.class, "inTransaction", "inTransaction()Z", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        cc8 cc8Var = (cc8) obj;
        js3.p(cc8Var, "p0");
        return Boolean.valueOf(cc8Var.n());
    }
}
