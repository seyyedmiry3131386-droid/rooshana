package com.microsoft.clarity.models.display.paints.shaders;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$IntList;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Shader;
import com.microsoft.clarity.protomodels.mutationpayload.e1;
import defpackage.dw1;
import defpackage.js3;
import defpackage.yd1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Color4Shader extends Shader {
    private final Color4f color4f;
    private final List<Integer> colorSpaceData;
    private final ShaderType type;

    public /* synthetic */ Color4Shader(Color4f color4f, List list, int i, yd1 yd1Var) {
        this(color4f, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Color4Shader copy$default(Color4Shader color4Shader, Color4f color4f, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            color4f = color4Shader.color4f;
        }
        if ((i & 2) != 0) {
            list = color4Shader.colorSpaceData;
        }
        return color4Shader.copy(color4f, list);
    }

    public final Color4f component1() {
        return this.color4f;
    }

    public final List<Integer> component2() {
        return this.colorSpaceData;
    }

    public final Color4Shader copy(Color4f color4f, List<Integer> list) {
        js3.p(color4f, "color4f");
        return new Color4Shader(color4f, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Color4Shader)) {
            return false;
        }
        Color4Shader color4Shader = (Color4Shader) obj;
        return js3.i(this.color4f, color4Shader.color4f) && js3.i(this.colorSpaceData, color4Shader.colorSpaceData);
    }

    public final Color4f getColor4f() {
        return this.color4f;
    }

    public final List<Integer> getColorSpaceData() {
        return this.colorSpaceData;
    }

    @Override // com.microsoft.clarity.models.display.paints.shaders.Shader
    public ShaderType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.color4f.hashCode() * 31;
        List<Integer> list = this.colorSpaceData;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Color4Shader(color4f=");
        sb.append(this.color4f);
        sb.append(", colorSpaceData=");
        return dw1.t(sb, this.colorSpaceData, ')');
    }

    public Color4Shader(Color4f color4f, List<Integer> list) {
        js3.p(color4f, "color4f");
        this.color4f = color4f;
        this.colorSpaceData = list;
        this.type = ShaderType.Color4Shader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Shader toProtobufInstance() {
        e1 e1VarA = MutationPayload$Shader.newBuilder().a(getType().toProtobufType()).a(this.color4f.toProtobufInstance());
        if (this.colorSpaceData != null) {
            e1VarA.a((MutationPayload$IntList) MutationPayload$IntList.newBuilder().a(this.colorSpaceData).build());
        }
        o oVarBuild = e1VarA.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Shader) oVarBuild;
    }
}
