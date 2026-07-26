package com.microsoft.clarity.models.display.paints.loopers;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$LayerInfo;
import defpackage.bl4;
import defpackage.js3;
import defpackage.rm7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LayerInfo implements IProtoModel<MutationPayload$LayerInfo> {
    private final int colorMode;
    private final List<Float> offset;
    private final int paintBits;
    private final boolean postTranslate;

    public LayerInfo(int i, int i2, List<Float> list, boolean z) {
        js3.p(list, "offset");
        this.paintBits = i;
        this.colorMode = i2;
        this.offset = list;
        this.postTranslate = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayerInfo copy$default(LayerInfo layerInfo, int i, int i2, List list, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = layerInfo.paintBits;
        }
        if ((i3 & 2) != 0) {
            i2 = layerInfo.colorMode;
        }
        if ((i3 & 4) != 0) {
            list = layerInfo.offset;
        }
        if ((i3 & 8) != 0) {
            z = layerInfo.postTranslate;
        }
        return layerInfo.copy(i, i2, list, z);
    }

    public final int component1() {
        return this.paintBits;
    }

    public final int component2() {
        return this.colorMode;
    }

    public final List<Float> component3() {
        return this.offset;
    }

    public final boolean component4() {
        return this.postTranslate;
    }

    public final LayerInfo copy(int i, int i2, List<Float> list, boolean z) {
        js3.p(list, "offset");
        return new LayerInfo(i, i2, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayerInfo)) {
            return false;
        }
        LayerInfo layerInfo = (LayerInfo) obj;
        return this.paintBits == layerInfo.paintBits && this.colorMode == layerInfo.colorMode && js3.i(this.offset, layerInfo.offset) && this.postTranslate == layerInfo.postTranslate;
    }

    public final int getColorMode() {
        return this.colorMode;
    }

    public final List<Float> getOffset() {
        return this.offset;
    }

    public final int getPaintBits() {
        return this.paintBits;
    }

    public final boolean getPostTranslate() {
        return this.postTranslate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int i = rm7.i((this.colorMode + (this.paintBits * 31)) * 31, 31, this.offset);
        boolean z = this.postTranslate;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LayerInfo(paintBits=");
        sb.append(this.paintBits);
        sb.append(", colorMode=");
        sb.append(this.colorMode);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", postTranslate=");
        return bl4.A(sb, this.postTranslate, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$LayerInfo toProtobufInstance() {
        o oVarBuild = MutationPayload$LayerInfo.newBuilder().b(this.paintBits).a(this.colorMode).a(this.offset).a(this.postTranslate).build();
        js3.o(oVarBuild, "newBuilder()\n           …ate)\n            .build()");
        return (MutationPayload$LayerInfo) oVarBuild;
    }
}
