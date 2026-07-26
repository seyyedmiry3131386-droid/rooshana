package com.microsoft.clarity.models.display.commands;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DrawPointsCommandPayload;
import com.microsoft.clarity.protomodels.mutationpayload.N;
import defpackage.js3;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawPoints extends PaintableCommand {
    private final int pointMode;
    private final List<Point> points;
    private final DisplayCommandType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawPoints(int i, List<Point> list, Integer num) {
        super(num);
        js3.p(list, "points");
        this.pointMode = i;
        this.points = list;
        this.type = DisplayCommandType.DrawPoints;
    }

    public final int getPointMode() {
        return this.pointMode;
    }

    public final List<Point> getPoints() {
        return this.points;
    }

    @Override // com.microsoft.clarity.models.display.commands.DisplayCommand
    public DisplayCommandType getType() {
        return this.type;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$DisplayCommandV2 toProtobufInstance() {
        N nB = MutationPayload$DrawPointsCommandPayload.newBuilder().b(this.pointMode);
        List<Point> list = this.points;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Point) it.next()).toProtobufInstance());
        }
        N nA = nB.a(a.P0(arrayList));
        Integer paintIndex = getPaintIndex();
        if (paintIndex != null) {
            nA.a(paintIndex.intValue());
        }
        o oVarBuild = MutationPayload$DisplayCommandV2.newBuilder().a(getType().toProtobufType()).a((MutationPayload$DrawPointsCommandPayload) nA.build()).build();
        js3.o(oVarBuild, "newBuilder()\n           …d())\n            .build()");
        return (MutationPayload$DisplayCommandV2) oVarBuild;
    }
}
