package com.microsoft.clarity.i;

import com.microsoft.clarity.models.ingest.PayloadUploadResponse;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tx8;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends Lambda implements qp2 {
    public final /* synthetic */ P a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(P p) {
        super(2);
        this.a = p;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PayloadUploadResponse.PayloadUploadResponseData data;
        List<PayloadUploadResponse.PayloadUploadResponseSignal> signals;
        String str = (String) obj;
        PayloadUploadResponse payloadUploadResponse = (PayloadUploadResponse) obj2;
        js3.p(str, "sessionId");
        js3.p(payloadUploadResponse, "payloadUploadResponse");
        P p = this.a;
        p.getClass();
        if (js3.i(u.a(p), str) && (data = payloadUploadResponse.getData()) != null && (signals = data.getSignals()) != null) {
            P p2 = this.a;
            for (PayloadUploadResponse.PayloadUploadResponseSignal payloadUploadResponseSignal : signals) {
                qp2 customSignalsCallback = p2.b.getCustomSignalsCallback();
                if (customSignalsCallback != null) {
                    customSignalsCallback.invoke(payloadUploadResponseSignal.getType(), payloadUploadResponseSignal.getValue());
                }
            }
        }
        return tx8.a;
    }
}
