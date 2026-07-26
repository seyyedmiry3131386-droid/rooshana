package com.microsoft.clarity.models.display.paints.loopers;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.paints.Paint;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Layer;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class Layer implements IProtoModel<MutationPayload$Layer> {
    private final LayerInfo layerInfo;
    private final Paint paint;

    public Layer(LayerInfo layerInfo, Paint paint) {
        js3.p(layerInfo, "layerInfo");
        js3.p(paint, "paint");
        this.layerInfo = layerInfo;
        this.paint = paint;
    }

    public static /* synthetic */ Layer copy$default(Layer layer, LayerInfo layerInfo, Paint paint, int i, Object obj) {
        if ((i & 1) != 0) {
            layerInfo = layer.layerInfo;
        }
        if ((i & 2) != 0) {
            paint = layer.paint;
        }
        return layer.copy(layerInfo, paint);
    }

    public final LayerInfo component1() {
        return this.layerInfo;
    }

    public final Paint component2() {
        return this.paint;
    }

    public final Layer copy(LayerInfo layerInfo, Paint paint) {
        js3.p(layerInfo, "layerInfo");
        js3.p(paint, "paint");
        return new Layer(layerInfo, paint);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layer)) {
            return false;
        }
        Layer layer = (Layer) obj;
        return js3.i(this.layerInfo, layer.layerInfo) && js3.i(this.paint, layer.paint);
    }

    public final LayerInfo getLayerInfo() {
        return this.layerInfo;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public int hashCode() {
        return this.paint.hashCode() + (this.layerInfo.hashCode() * 31);
    }

    public String toString() {
        return "Layer(layerInfo=" + this.layerInfo + ", paint=" + this.paint + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Layer toProtobufInstance() {
        o oVarBuild = MutationPayload$Layer.newBuilder().a(this.layerInfo.toProtobufInstance()).a(this.paint.toProtobufInstance()).build();
        js3.o(oVarBuild, "newBuilder()\n           …e())\n            .build()");
        return (MutationPayload$Layer) oVarBuild;
    }
}
