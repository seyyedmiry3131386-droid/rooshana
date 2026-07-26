package com.microsoft.clarity.k;

import android.webkit.WebMessage;
import com.microsoft.clarity.i.C0080b;
import com.microsoft.clarity.models.observers.SerializedWebViewEvent;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends Lambda implements bp2 {
    public final /* synthetic */ G a;
    public final /* synthetic */ WebMessage b;
    public final /* synthetic */ u c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(G g, WebMessage webMessage, u uVar, int i) {
        super(0);
        this.a = g;
        this.b = webMessage;
        this.c = uVar;
        this.d = i;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        if (!this.a.o) {
            WebMessage webMessage = this.b;
            String data = webMessage != null ? webMessage.getData() : null;
            if (data != null) {
                SerializedWebViewEvent serializedWebViewEventCreate = SerializedWebViewEvent.Companion.create(data, this.c.b, this.d);
                for (C0080b c0080b : this.a.b) {
                    c0080b.getClass();
                    js3.p(serializedWebViewEventCreate, "events");
                    c0080b.a.i.add(serializedWebViewEventCreate);
                }
            }
        }
        return tx8.a;
    }
}
