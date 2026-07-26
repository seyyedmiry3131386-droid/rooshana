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
public final class RadialGradientShader extends Shader {
    private final Point center;
    private final List<Color4f> colors;
    private final long gradFlags;
    private final List<Float> localMatrix;
    private final List<Float> pos;
    private final float radius;
    private final long tileMode;
    private final ShaderType type;

    public RadialGradientShader(Point point, float f, long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(point, "center");
        js3.p(list, "colors");
        this.center = point;
        this.radius = f;
        this.tileMode = j;
        this.gradFlags = j2;
        this.colors = list;
        this.pos = list2;
        this.localMatrix = list3;
        this.type = ShaderType.RadialGradientShader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadialGradientShader copy$default(RadialGradientShader radialGradientShader, Point point, float f, long j, long j2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            point = radialGradientShader.center;
        }
        if ((i & 2) != 0) {
            f = radialGradientShader.radius;
        }
        if ((i & 4) != 0) {
            j = radialGradientShader.tileMode;
        }
        if ((i & 8) != 0) {
            j2 = radialGradientShader.gradFlags;
        }
        if ((i & 16) != 0) {
            list = radialGradientShader.colors;
        }
        if ((i & 32) != 0) {
            list2 = radialGradientShader.pos;
        }
        if ((i & 64) != 0) {
            list3 = radialGradientShader.localMatrix;
        }
        List list4 = list3;
        List list5 = list;
        long j3 = j2;
        long j4 = j;
        return radialGradientShader.copy(point, f, j4, j3, list5, list2, list4);
    }

    public final Point component1() {
        return this.center;
    }

    public final float component2() {
        return this.radius;
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

    public final RadialGradientShader copy(Point point, float f, long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(point, "center");
        js3.p(list, "colors");
        return new RadialGradientShader(point, f, j, j2, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradientShader)) {
            return false;
        }
        RadialGradientShader radialGradientShader = (RadialGradientShader) obj;
        return js3.i(this.center, radialGradientShader.center) && Float.compare(this.radius, radialGradientShader.radius) == 0 && this.tileMode == radialGradientShader.tileMode && this.gradFlags == radialGradientShader.gradFlags && js3.i(this.colors, radialGradientShader.colors) && js3.i(this.pos, radialGradientShader.pos) && js3.i(this.localMatrix, radialGradientShader.localMatrix);
    }

    public final Point getCenter() {
        return this.center;
    }

    public final List<Color4f> getColors() {
        return this.colors;
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

    public final float getRadius() {
        return this.radius;
    }

    public final long getTileMode() {
        return this.tileMode;
    }

    @Override // com.microsoft.clarity.models.display.paints.shaders.Shader
    public ShaderType getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = a.a(this.radius, this.center.hashCode() * 31, 31);
        long j = this.tileMode;
        long j2 = this.gradFlags;
        int i = rm7.i((((int) ((j2 >>> 32) ^ j2)) + ((((int) (j ^ (j >>> 32))) + iA) * 31)) * 31, 31, this.colors);
        List<Float> list = this.pos;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.localMatrix;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadialGradientShader(center=");
        sb.append(this.center);
        sb.append(", radius=");
        sb.append(this.radius);
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
        e1 e1VarA = MutationPayload$Shader.newBuilder().a(getType().toProtobufType()).a(this.center.toProtobufInstance()).b(this.radius).d(this.tileMode).a(this.gradFlags);
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
