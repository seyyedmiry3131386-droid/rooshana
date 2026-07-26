package com.microsoft.clarity.models.display.blobs;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$TextBlob;
import com.microsoft.clarity.protomodels.mutationpayload.j1;
import defpackage.bl4;
import defpackage.js3;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TextBlob implements IProtoModel<MutationPayload$TextBlob> {
    private final Rect bounds;
    private transient boolean masked;
    private final List<TextBlobRun> runs;
    private transient boolean sanitized;

    public TextBlob(Rect rect, List<TextBlobRun> list, boolean z) {
        this.bounds = rect;
        this.runs = list;
        this.masked = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextBlob copy$default(TextBlob textBlob, Rect rect, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = textBlob.bounds;
        }
        if ((i & 2) != 0) {
            list = textBlob.runs;
        }
        if ((i & 4) != 0) {
            z = textBlob.masked;
        }
        return textBlob.copy(rect, list, z);
    }

    public final Rect component1() {
        return this.bounds;
    }

    public final List<TextBlobRun> component2() {
        return this.runs;
    }

    public final boolean component3() {
        return this.masked;
    }

    public final TextBlob copy(Rect rect, List<TextBlobRun> list, boolean z) {
        return new TextBlob(rect, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextBlob)) {
            return false;
        }
        TextBlob textBlob = (TextBlob) obj;
        return js3.i(this.bounds, textBlob.bounds) && js3.i(this.runs, textBlob.runs) && this.masked == textBlob.masked;
    }

    public final Rect getBounds() {
        return this.bounds;
    }

    public final boolean getMasked() {
        return this.masked;
    }

    public final List<TextBlobRun> getRuns() {
        return this.runs;
    }

    public final boolean getSanitized() {
        return this.sanitized;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        Rect rect = this.bounds;
        int iHashCode = (rect == null ? 0 : rect.hashCode()) * 31;
        List<TextBlobRun> list = this.runs;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.masked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final void setMasked(boolean z) {
        this.masked = z;
    }

    public final void setSanitized(boolean z) {
        this.sanitized = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextBlob(bounds=");
        sb.append(this.bounds);
        sb.append(", runs=");
        sb.append(this.runs);
        sb.append(", masked=");
        return bl4.A(sb, this.masked, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$TextBlob toProtobufInstance() {
        j1 j1VarNewBuilder = MutationPayload$TextBlob.newBuilder();
        List<TextBlobRun> list = this.runs;
        if (list != null) {
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TextBlobRun) it.next()).toProtobufInstance());
            }
            j1VarNewBuilder.a(arrayList);
        }
        Rect rect = this.bounds;
        if (rect != null) {
            j1VarNewBuilder.a(rect.toProtobufInstance());
        }
        o oVarBuild = j1VarNewBuilder.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$TextBlob) oVarBuild;
    }

    public TextBlob(Rect rect, List<TextBlobRun> list) {
        this(rect, list, false);
    }
}
