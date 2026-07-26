package com.microsoft.clarity.a;

import com.microsoft.clarity.models.ConsentSource;
import com.microsoft.clarity.models.ConsentStatus;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0046e extends Lambda implements bp2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046e(boolean z, boolean z2) {
        super(0);
        com.microsoft.clarity.i.t tVar = I.a;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        ConsentStatus consentStatus = new ConsentStatus(ConsentSource.API, this.a, this.b);
        synchronized (I.p) {
            try {
                com.microsoft.clarity.i.t tVar = I.a;
                if (tVar != null) {
                    tVar.b.a(consentStatus, new com.microsoft.clarity.i.s(tVar));
                } else {
                    I.o = consentStatus;
                }
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
