package com.microsoft.clarity.models.ingest;

import defpackage.br9;
import defpackage.js3;
import defpackage.zp0;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectRequest {
    private final List<String> a;
    private final Envelope e;
    private final List<String> p;

    public CollectRequest(Envelope envelope, List<String> list, List<String> list2) {
        js3.p(envelope, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        js3.p(list, "a");
        js3.p(list2, "p");
        this.e = envelope;
        this.a = list;
        this.p = list2;
    }

    private final void writeList(OutputStreamWriter outputStreamWriter, List<String> list) throws IOException {
        outputStreamWriter.write("[");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            outputStreamWriter.write(list.get(i));
            if (i < br9.y(list)) {
                outputStreamWriter.write(",");
            }
        }
        outputStreamWriter.write("]");
    }

    public final List<String> getA() {
        return this.a;
    }

    public final Envelope getE() {
        return this.e;
    }

    public final List<String> getP() {
        return this.p;
    }

    public final void writeToStream(OutputStream outputStream) throws IOException {
        js3.p(outputStream, "stream");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, zp0.a);
        try {
            outputStreamWriter.write("{\"e\":");
            outputStreamWriter.write(this.e.serialize());
            outputStreamWriter.write(",\"a\":");
            writeList(outputStreamWriter, this.a);
            outputStreamWriter.write(",\"p\":");
            writeList(outputStreamWriter, this.p);
            outputStreamWriter.write("}");
            outputStreamWriter.close();
        } finally {
        }
    }
}
