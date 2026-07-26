package com.microsoft.clarity.a;

import android.app.Application;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.ingest.IngestConfigs;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0051j extends Lambda implements bp2 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ ClarityConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0051j(Application application, ClarityConfig clarityConfig) {
        super(0);
        this.a = application;
        this.b = clarityConfig;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Application application = this.a;
        String projectId = this.b.getProjectId();
        js3.p(application, "context");
        js3.p(projectId, "projectId");
        com.microsoft.clarity.o.f fVar = (com.microsoft.clarity.o.f) com.microsoft.clarity.b.a.a(application, com.microsoft.clarity.b.a.b(application, projectId), (com.microsoft.clarity.g.L) null);
        fVar.getClass();
        com.microsoft.clarity.q.s sVarA = com.microsoft.clarity.q.v.a(new com.microsoft.clarity.o.b(fVar, projectId));
        IngestConfigs ingestConfigs = sVarA instanceof com.microsoft.clarity.q.t ? ((com.microsoft.clarity.q.t) sVarA).a : null;
        if (ingestConfigs != null) {
            DynamicConfig.Companion.updateSharedPreferences(application, projectId, ingestConfigs);
        }
        return tx8.a;
    }
}
