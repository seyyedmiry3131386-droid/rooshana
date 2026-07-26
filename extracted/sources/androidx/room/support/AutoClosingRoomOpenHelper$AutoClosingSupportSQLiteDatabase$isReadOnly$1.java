package androidx.room.support;

import defpackage.cc8;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 extends PropertyReference1Impl {
    static {
        new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1();
    }

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1() {
        super(cc8.class, "isReadOnly", "isReadOnly()Z", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.mx3
    public final Object get(Object obj) {
        return Boolean.valueOf(((cc8) obj).isReadOnly());
    }
}
