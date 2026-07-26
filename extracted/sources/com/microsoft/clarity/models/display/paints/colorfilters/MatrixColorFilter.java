package com.microsoft.clarity.models.display.paints.colorfilters;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.C0118h;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ColorFilter;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FloatList;
import defpackage.js3;
import defpackage.yd1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MatrixColorFilter extends ColorFilter {
    private final Boolean isRGBA;
    private final List<Float> matrix;
    private final Boolean rowMajor;
    private final ColorFilterType type;

    public /* synthetic */ MatrixColorFilter(List list, Boolean bool, Boolean bool2, int i, yd1 yd1Var) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatrixColorFilter copy$default(MatrixColorFilter matrixColorFilter, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = matrixColorFilter.matrix;
        }
        if ((i & 2) != 0) {
            bool = matrixColorFilter.isRGBA;
        }
        if ((i & 4) != 0) {
            bool2 = matrixColorFilter.rowMajor;
        }
        return matrixColorFilter.copy(list, bool, bool2);
    }

    public final List<Float> component1() {
        return this.matrix;
    }

    public final Boolean component2() {
        return this.isRGBA;
    }

    public final Boolean component3() {
        return this.rowMajor;
    }

    public final MatrixColorFilter copy(List<Float> list, Boolean bool, Boolean bool2) {
        js3.p(list, "matrix");
        return new MatrixColorFilter(list, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatrixColorFilter)) {
            return false;
        }
        MatrixColorFilter matrixColorFilter = (MatrixColorFilter) obj;
        return js3.i(this.matrix, matrixColorFilter.matrix) && js3.i(this.isRGBA, matrixColorFilter.isRGBA) && js3.i(this.rowMajor, matrixColorFilter.rowMajor);
    }

    public final List<Float> getMatrix() {
        return this.matrix;
    }

    public final Boolean getRowMajor() {
        return this.rowMajor;
    }

    @Override // com.microsoft.clarity.models.display.paints.colorfilters.ColorFilter
    public ColorFilterType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.matrix.hashCode() * 31;
        Boolean bool = this.isRGBA;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.rowMajor;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isRGBA() {
        return this.isRGBA;
    }

    public String toString() {
        return "MatrixColorFilter(matrix=" + this.matrix + ", isRGBA=" + this.isRGBA + ", rowMajor=" + this.rowMajor + ')';
    }

    public MatrixColorFilter(List<Float> list, Boolean bool, Boolean bool2) {
        js3.p(list, "matrix");
        this.matrix = list;
        this.isRGBA = bool;
        this.rowMajor = bool2;
        this.type = ColorFilterType.MatrixColorFilter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$ColorFilter toProtobufInstance() {
        C0118h c0118hA = MutationPayload$ColorFilter.newBuilder().a(getType().toProtobufType()).a((MutationPayload$FloatList) MutationPayload$FloatList.newBuilder().a(this.matrix).build());
        Boolean bool = this.isRGBA;
        if (bool != null) {
            c0118hA.a(bool.booleanValue());
        }
        Boolean bool2 = this.rowMajor;
        if (bool2 != null) {
            c0118hA.b(bool2.booleanValue());
        }
        o oVarBuild = c0118hA.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$ColorFilter) oVarBuild;
    }
}
