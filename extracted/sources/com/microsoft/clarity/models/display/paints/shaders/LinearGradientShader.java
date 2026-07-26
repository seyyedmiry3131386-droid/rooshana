package com.microsoft.clarity.models.display.paints.shaders;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Shader;
import com.microsoft.clarity.protomodels.mutationpayload.e1;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class LinearGradientShader extends Shader {
    private final List<Color4f> colors;
    private final Point end;
    private final long gradFlags;
    private final List<Float> localMatrix;
    private final List<Float> pos;
    private final Point start;
    private final long tileMode;
    private final ShaderType type;

    public LinearGradientShader(Point point, Point point2, long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(point, "start");
        js3.p(point2, "end");
        js3.p(list, "colors");
        this.start = point;
        this.end = point2;
        this.tileMode = j;
        this.gradFlags = j2;
        this.colors = list;
        this.pos = list2;
        this.localMatrix = list3;
        this.type = ShaderType.LinearGradientShader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinearGradientShader copy$default(LinearGradientShader linearGradientShader, Point point, Point point2, long j, long j2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            point = linearGradientShader.start;
        }
        if ((i & 2) != 0) {
            point2 = linearGradientShader.end;
        }
        if ((i & 4) != 0) {
            j = linearGradientShader.tileMode;
        }
        if ((i & 8) != 0) {
            j2 = linearGradientShader.gradFlags;
        }
        if ((i & 16) != 0) {
            list = linearGradientShader.colors;
        }
        if ((i & 32) != 0) {
            list2 = linearGradientShader.pos;
        }
        if ((i & 64) != 0) {
            list3 = linearGradientShader.localMatrix;
        }
        List list4 = list3;
        List list5 = list;
        long j3 = j2;
        long j4 = j;
        return linearGradientShader.copy(point, point2, j4, j3, list5, list2, list4);
    }

    public final Point component1() {
        return this.start;
    }

    public final Point component2() {
        return this.end;
    }

    public final long component3() {
        return this.tileMode;
    }

    public final long component4() {
        return this.gradFlags;
    }

    public final List<Color4f> component5() {
        return this.colors;
    }

    public final List<Float> component6() {
        return this.pos;
    }

    public final List<Float> component7() {
        return this.localMatrix;
    }

    public final LinearGradientShader copy(Point point, Point point2, long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(point, "start");
        js3.p(point2, "end");
        js3.p(list, "colors");
        return new LinearGradientShader(point, point2, j, j2, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradientShader)) {
            return false;
        }
        LinearGradientShader linearGradientShader = (LinearGradientShader) obj;
        return js3.i(this.start, linearGradientShader.start) && js3.i(this.end, linearGradientShader.end) && this.tileMode == linearGradientShader.tileMode && this.gradFlags == linearGradientShader.gradFlags && js3.i(this.colors, linearGradientShader.colors) && js3.i(this.pos, linearGradientShader.pos) && js3.i(this.localMatrix, linearGradientShader.localMatrix);
    }

    public final List<Color4f> getColors() {
        return this.colors;
    }

    public final Point getEnd() {
        return this.end;
    }

    public final long getGradFlags() {
        return this.gradFlags;
    }

    public final List<Float> getLocalMatrix() {
        return this.localMatrix;
    }

    public final List<Float> getPos() {
        return this.pos;
    }

    public final Point getStart() {
        return this.start;
    }

    public final long getTileMode() {
        return this.tileMode;
    }

    @Override // com.microsoft.clarity.models.display.paints.shaders.Shader
    public ShaderType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.end.hashCode() + (this.start.hashCode() * 31)) * 31;
        long j = this.tileMode;
        long j2 = this.gradFlags;
        int i = rm7.i((((int) (j2 ^ (j2 >>> 32))) + ((((int) (j ^ (j >>> 32))) + iHashCode) * 31)) * 31, 31, this.colors);
        List<Float> list = this.pos;
        int iHashCode2 = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.localMatrix;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LinearGradientShader(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", tileMode=");
        sb.append(this.tileMode);
        sb.append(", gradFlags=");
        sb.append(this.gradFlags);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", pos=");
        sb.append(this.pos);
        sb.append(", localMatrix=");
        return dw1.t(sb, this.localMatrix, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Shader toProtobufInstance() {
        e1 e1VarA = MutationPayload$Shader.newBuilder().a(getType().toProtobufType()).c(this.start.toProtobufInstance()).b(this.end.toProtobufInstance()).d(this.tileMode).a(this.gradFlags);
        List<Color4f> list = this.colors;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Color4f) it.next()).toProtobufInstance());
        }
        e1 e1VarA2 = e1VarA.a(a.P0(arrayList));
        List<Float> list2 = this.pos;
        if (list2 != null) {
            e1VarA2.c(list2);
        }
        List<Float> list3 = this.localMatrix;
        if (list3 != null) {
            e1VarA2.a((Iterable) list3);
        }
        o oVarBuild = e1VarA2.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Shader) oVarBuild;
    }
}
