package com.microsoft.clarity.a;

import android.app.Activity;
import android.content.Context;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.models.LogLevel;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0049h extends Lambda implements bp2 {
    public final /* synthetic */ ClarityConfig a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049h(Activity activity2, Context context, ClarityConfig clarityConfig) {
        super(0);
        this.a = clarityConfig;
        this.b = context;
        this.c = activity2;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.a.freeze$sdk_prodRelease();
        com.microsoft.clarity.i.t tVar = I.a;
        ClarityConfig clarityConfig = this.a;
        int iOrdinal = LogLevel.valueOf(ApplicationStateDto.STATE_NONE).ordinal();
        int iOrdinal2 = clarityConfig.getLogLevel().ordinal();
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        LogLevel logLevel2 = LogLevel.values()[Math.min(iOrdinal2, iOrdinal)];
        js3.p(logLevel2, "<set-?>");
        com.microsoft.clarity.q.l.a = logLevel2;
        com.microsoft.clarity.q.l.d("Initialize Clarity.");
        com.microsoft.clarity.q.l.b("Initialization configs: " + this.a);
        Object obj = com.microsoft.clarity.b.a.a;
        com.microsoft.clarity.q.x.a("Clarity_Initialize", com.microsoft.clarity.b.a.b(this.b, this.a.getProjectId()), new C0048g(this.c, this.b, this.a));
        return tx8.a;
    }
}
