package io.sentry.android.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z {
    public final AnrV2Integration$ParseResult$Type a;
    public final byte[] b;
    public final List c;
    public final ArrayList d;
    public final io.sentry.protocol.c e;

    public z(AnrV2Integration$ParseResult$Type anrV2Integration$ParseResult$Type) {
        this.a = anrV2Integration$ParseResult$Type;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public z(AnrV2Integration$ParseResult$Type anrV2Integration$ParseResult$Type, byte[] bArr) {
        this.a = anrV2Integration$ParseResult$Type;
        this.b = bArr;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public z(AnrV2Integration$ParseResult$Type anrV2Integration$ParseResult$Type, byte[] bArr, ArrayList arrayList, ArrayList arrayList2, io.sentry.protocol.c cVar) {
        this.a = anrV2Integration$ParseResult$Type;
        this.b = bArr;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = cVar;
    }
}
