package com.microsoft.clarity.a;

import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends Lambda implements bp2 {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Ref$BooleanRef ref$BooleanRef, String str, Set set) {
        super(0);
        this.a = ref$BooleanRef;
        this.b = str;
        this.c = set;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        boolean z;
        Object obj = I.p;
        Ref$BooleanRef ref$BooleanRef = this.a;
        String str = this.b;
        Set set = this.c;
        synchronized (obj) {
            try {
                com.microsoft.clarity.i.t tVar = I.a;
                if (tVar == null) {
                    LinkedHashMap linkedHashMap = I.h;
                    if (linkedHashMap.size() < 200) {
                        linkedHashMap.put(str, set);
                        z = true;
                    } else {
                        com.microsoft.clarity.q.l.c("Too many pending custom tags. Please wait until Clarity is initialized before sending events. Initialization is complete once the onSessionStarted callback (set via Clarity.setOnSessionStartedCallback) is triggered.");
                        z = false;
                    }
                    ref$BooleanRef.a = z;
                } else {
                    js3.p(str, "key");
                    js3.p(set, "values");
                    tVar.b.a(str, set);
                }
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
