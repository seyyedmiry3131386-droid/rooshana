package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawVerticesCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FloatList;
import com.microsoft.clarity.protomodels.mutationpayload.U;
import defpackage.js3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawVertices extends PaintableCommand {
    private final List<List<Float>> bones;
    private final long mode;
    private final DisplayCommandType type;
    private int verticesIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawVertices(int i, long j, Integer num, List<? extends List<Float>> list) {
        super(num);
        this.verticesIndex = i;
        this.mode = j;
        this.bones = list;
        this.type = DisplayCommandType.DrawVertices;
    }

    public final List<List<Float>> getBones() {
        return this.bones;
    }

    public final long getMode() {
        return this.mode;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    public final int getVerticesIndex() {
        return this.verticesIndex;
    }

    public final void setVerticesIndex(int i) {
        this.verticesIndex = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        U uA = MutationPayload$DrawVerticesCommandPayload.newBuilder().b(this.verticesIndex).a(this.mode);
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            uA.a(paintIndex.intValue());
        }
        List arrayList = this.bones;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uA.a((MutationPayload$FloatList) MutationPayload$FloatList.newBuilder().a((List) it.next()).build());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawVerticesCommandPayload) uA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …oad)\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
