package androidx.room.support;

import defpackage.cc8;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 extends MutablePropertyReference1Impl {
    static {
        new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1();
    }

    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1() {
        super(cc8.class, "version", "getVersion()I", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.mx3
    public final Object get(Object obj) {
        return Integer.valueOf(((cc8) obj).getVersion());
    }
}
