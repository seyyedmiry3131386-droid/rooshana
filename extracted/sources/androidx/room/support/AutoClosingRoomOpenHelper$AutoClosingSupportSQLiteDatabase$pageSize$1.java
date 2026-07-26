package androidx.room.support;

import defpackage.cc8;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 extends MutablePropertyReference1Impl {
    static {
        new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1();
    }

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1() {
        super(cc8.class, "pageSize", "getPageSize()J", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.mx3
    public final Object get(Object obj) {
        return Long.valueOf(((cc8) obj).X());
    }
}
