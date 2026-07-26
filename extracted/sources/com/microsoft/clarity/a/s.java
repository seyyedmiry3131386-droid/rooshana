package com.microsoft.clarity.a;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends Lambda implements bp2 {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Ref$BooleanRef ref$BooleanRef, String str) {
        super(0);
        this.a = ref$BooleanRef;
        this.b = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        boolean z;
        Object obj = I.p;
        Ref$BooleanRef ref$BooleanRef = this.a;
        String str = this.b;
        synchronized (obj) {
            try {
                com.microsoft.clarity.i.t tVar = I.a;
                if (tVar == null) {
                    ArrayList arrayList = I.i;
                    if (arrayList.size() < 200) {
                        arrayList.add(str);
                        z = true;
                    } else {
                        com.microsoft.clarity.q.l.c("Too many pending custom events. Please wait until Clarity is initialized before sending events. Initialization is complete once the onSessionStarted callback (set via Clarity.setOnSessionStartedCallback) is triggered.");
                        z = false;
                    }
                    ref$BooleanRef.a = z;
                } else {
                    js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    tVar.b.a(str);
                }
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
