package com.microsoft.clarity.models.display.paints.shaders;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Shader;
import com.microsoft.clarity.protomodels.mutationpayload.e1;
import defpackage.js3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalMatrixShader extends Shader {
    private final List<Float> matrix;
    private final Shader shader;
    private final ShaderType type;

    public LocalMatrixShader(List<Float> list, Shader shader) {
        js3.p(list, "matrix");
        this.matrix = list;
        this.shader = shader;
        this.type = ShaderType.LocalMatrixShader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalMatrixShader copy$default(LocalMatrixShader localMatrixShader, List list, Shader shader, int i, Object obj) {
        if ((i & 1) != 0) {
            list = localMatrixShader.matrix;
        }
        if ((i & 2) != 0) {
            shader = localMatrixShader.shader;
        }
        return localMatrixShader.copy(list, shader);
    }

    public final List<Float> component1() {
        return this.matrix;
    }

    public final Shader component2() {
        return this.shader;
    }

    public final LocalMatrixShader copy(List<Float> list, Shader shader) {
        js3.p(list, "matrix");
        return new LocalMatrixShader(list, shader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMatrixShader)) {
            return false;
        }
        LocalMatrixShader localMatrixShader = (LocalMatrixShader) obj;
        return js3.i(this.matrix, localMatrixShader.matrix) && js3.i(this.shader, localMatrixShader.shader);
    }

    public final List<Float> getMatrix() {
        return this.matrix;
    }

    public final Shader getShader() {
        return this.shader;
    }

    @Override // com.microsoft.clarity.models.display.paints.shaders.Shader
    public ShaderType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.matrix.hashCode() * 31;
        Shader shader = this.shader;
        return iHashCode + (shader == null ? 0 : shader.hashCode());
    }

    public String toString() {
        return "LocalMatrixShader(matrix=" + this.matrix + ", shader=" + this.shader + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Shader toProtobufInstance() {
        e1 e1VarB = MutationPayload$Shader.newBuilder().a(getType().toProtobufType()).b(this.matrix);
        Shader shader = this.shader;
        if (shader != null) {
            e1VarB.a(shader.toProtobufInstance());
        }
        o oVarBuild = e1VarB.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Shader) oVarBuild;
    }
}
