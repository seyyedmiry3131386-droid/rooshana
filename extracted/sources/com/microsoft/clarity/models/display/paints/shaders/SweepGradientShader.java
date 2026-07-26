package com.microsoft.clarity.models.display.paints.shaders;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
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

/* JADX INFO: loaded from: classes3.dex */
public final class SweepGradientShader extends Shader {
    private final Point center;
    private final List<Color4f> colors;
    private final float endAngle;
    private final long gradFlags;
    private final List<Float> localMatrix;
    private final List<Float> pos;
    private final float startAngle;
    private final long tileMode;
    private final ShaderType type;

    public SweepGradientShader(Point point, float f, float f2, long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(point, "center");
        js3.p(list, "colors");
        this.center = point;
        this.startAngle = f;
        this.endAngle = f2;
        this.tileMode = j;
        this.gradFlags = j2;
        this.colors = list;
        this.pos = list2;
        this.localMatrix = list3;
        this.type = ShaderType.SweepGradientShader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SweepGradientShader copy$default(SweepGradientShader sweepGradientShader, Point point, float f, float f2, long j, long j2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            point = sweepGradientShader.center;
        }
        if ((i & 2) != 0) {
            f = sweepGradientShader.startAngle;
        }
        if ((i & 4) != 0) {
            f2 = sweepGradientShader.endAngle;
        }
        if ((i & 8) != 0) {
            j = sweepGradientShader.tileMode;
        }
        if ((i & 16) != 0) {
            j2 = sweepGradientShader.gradFlags;
        }
        if ((i & 32) != 0) {
            list = sweepGradientShader.colors;
        }
        if ((i & 64) != 0) {
            list2 = sweepGradientShader.pos;
        }
        if ((i & 128) != 0) {
            list3 = sweepGradientShader.localMatrix;
        }
        List list4 = list3;
        List list5 = list;
        long j3 = j2;
        long j4 = j;
        float f3 = f2;
        return sweepGradientShader.copy(point, f, f3, j4, j3, list5, list2, list4);
    }

    public final Point component1() {
        return this.center;
    }

    public final float component2() {
        return this.startAngle;
    }

    public final float component3() {
        return this.endAngle;
    }

    public final long component4() {
        return this.tileMode;
    }

    public final long component5() {
        return this.gradFlags;
    }

    public final List<Color4f> component6() {
        return this.colors;
    }

    public final List<Float> component7() {
        return this.pos;
    }

    public final List<Float> component8() {
        return this.localMatrix;
    }

    public final SweepGradientShader copy(Point point, float f, float f2, long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(point, "center");
        js3.p(list, "colors");
        return new SweepGradientShader(point, f, f2, j, j2, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradientShader)) {
            return false;
        }
        SweepGradientShader sweepGradientShader = (SweepGradientShader) obj;
        return js3.i(this.center, sweepGradientShader.center) && Float.compare(this.startAngle, sweepGradientShader.startAngle) == 0 && Float.compare(this.endAngle, sweepGradientShader.endAngle) == 0 && this.tileMode == sweepGradientShader.tileMode && this.gradFlags == sweepGradientShader.gradFlags && js3.i(this.colors, sweepGradientShader.colors) && js3.i(this.pos, sweepGradientShader.pos) && js3.i(this.localMatrix, sweepGradientShader.localMatrix);
    }

    public final Point getCenter() {
        return this.center;
    }

    public final List<Color4f> getColors() {
        return this.colors;
    }

    public final float getEndAngle() {
        return this.endAngle;
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

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final long getTileMode() {
        return this.tileMode;
    }

    @Override // com.microsoft.clarity.models.display.paints.shaders.Shader
    public ShaderType getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = a.a(this.endAngle, a.a(this.startAngle, this.center.hashCode() * 31, 31), 31);
        long j = this.tileMode;
        long j2 = this.gradFlags;
        int i = rm7.i((((int) ((j2 >>> 32) ^ j2)) + ((((int) (j ^ (j >>> 32))) + iA) * 31)) * 31, 31, this.colors);
        List<Float> list = this.pos;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.localMatrix;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SweepGradientShader(center=");
        sb.append(this.center);
        sb.append(", startAngle=");
        sb.append(this.startAngle);
        sb.append(", endAngle=");
        sb.append(this.endAngle);
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
        e1 e1VarA = MutationPayload$Shader.newBuilder().a(getType().toProtobufType()).a(this.center.toProtobufInstance()).c(this.startAngle).a(this.endAngle).d(this.tileMode).a(this.gradFlags);
        List<Color4f> list = this.colors;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Color4f) it.next()).toProtobufInstance());
        }
        e1 e1VarA2 = e1VarA.a(kotlin.collections.a.P0(arrayList));
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
