package androidx.room.support;

import defpackage.cc8;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 extends PropertyReference1Impl {
    static {
        new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1();
    }

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1() {
        super(cc8.class, "maximumSize", "getMaximumSize()J", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.mx3
    public final Object get(Object obj) {
        return Long.valueOf(((cc8) obj).c0());
    }
}
