package com.google.common.cache;

import defpackage.c27;
import defpackage.ec4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class LocalCache$NullEntry implements c27 {
    public static final LocalCache$NullEntry a;
    public static final /* synthetic */ LocalCache$NullEntry[] b;

    static {
        LocalCache$NullEntry localCache$NullEntry = new LocalCache$NullEntry("INSTANCE", 0);
        a = localCache$NullEntry;
        b = new LocalCache$NullEntry[]{localCache$NullEntry};
    }

    public static LocalCache$NullEntry valueOf(String str) {
        return (LocalCache$NullEntry) Enum.valueOf(LocalCache$NullEntry.class, str);
    }

    public static LocalCache$NullEntry[] values() {
        return (LocalCache$NullEntry[]) b.clone();
    }

    @Override // defpackage.c27
    public final c27 a() {
        return null;
    }

    @Override // defpackage.c27
    public final ec4 b() {
        return null;
    }

    @Override // defpackage.c27
    public final int c() {
        return 0;
    }

    @Override // defpackage.c27
    public final long g() {
        return 0L;
    }

    @Override // defpackage.c27
    public final Object getKey() {
        return null;
    }

    @Override // defpackage.c27
    public final void j(long j) {
    }

    @Override // defpackage.c27
    public final long m() {
        return 0L;
    }

    @Override // defpackage.c27
    public final void n(long j) {
    }

    @Override // defpackage.c27
    public final c27 e() {
        return this;
    }

    @Override // defpackage.c27
    public final c27 l() {
        return this;
    }

    @Override // defpackage.c27
    public final c27 o() {
        return this;
    }

    @Override // defpackage.c27
    public final c27 q() {
        return this;
    }

    @Override // defpackage.c27
    public final void f(ec4 ec4Var) {
    }

    @Override // defpackage.c27
    public final void h(c27 c27Var) {
    }

    @Override // defpackage.c27
    public final void i(c27 c27Var) {
    }

    @Override // defpackage.c27
    public final void k(c27 c27Var) {
    }

    @Override // defpackage.c27
    public final void p(c27 c27Var) {
    }
}
