package com.microsoft.clarity.models.display.paints.maskfilters;

import com.google.protobuf.o;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$MaskFilter;
import defpackage.bl4;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class BlurMaskFilter extends MaskFilter {
    private final boolean respectCTM;
    private final float sigma;
    private final int style;
    private final MaskFilterType type = MaskFilterType.BlurMaskFilter;

    public BlurMaskFilter(float f, int i, boolean z) {
        this.sigma = f;
        this.style = i;
        this.respectCTM = z;
    }

    public static /* synthetic */ BlurMaskFilter copy$default(BlurMaskFilter blurMaskFilter, float f, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = blurMaskFilter.sigma;
        }
        if ((i2 & 2) != 0) {
            i = blurMaskFilter.style;
        }
        if ((i2 & 4) != 0) {
            z = blurMaskFilter.respectCTM;
        }
        return blurMaskFilter.copy(f, i, z);
    }

    public final float component1() {
        return this.sigma;
    }

    public final int component2() {
        return this.style;
    }

    public final boolean component3() {
        return this.respectCTM;
    }

    public final BlurMaskFilter copy(float f, int i, boolean z) {
        return new BlurMaskFilter(f, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurMaskFilter)) {
            return false;
        }
        BlurMaskFilter blurMaskFilter = (BlurMaskFilter) obj;
        return Float.compare(this.sigma, blurMaskFilter.sigma) == 0 && this.style == blurMaskFilter.style && this.respectCTM == blurMaskFilter.respectCTM;
    }

    public final boolean getRespectCTM() {
        return this.respectCTM;
    }

    public final float getSigma() {
        return this.sigma;
    }

    public final int getStyle() {
        return this.style;
    }

    @Override // com.microsoft.clarity.models.display.paints.maskfilters.MaskFilter
    public MaskFilterType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        int iFloatToIntBits = (this.style + (Float.floatToIntBits(this.sigma) * 31)) * 31;
        boolean z = this.respectCTM;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iFloatToIntBits + r0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlurMaskFilter(sigma=");
        sb.append(this.sigma);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", respectCTM=");
        return bl4.A(sb, this.respectCTM, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$MaskFilter toProtobufInstance() {
        o oVarBuild = MutationPayload$MaskFilter.newBuilder().a(getType().toProtobufType()).a(this.sigma).a(this.style).a(this.respectCTM).build();
        js3.o(oVarBuild, "newBuilder()\n           …CTM)\n            .build()");
        return (MutationPayload$MaskFilter) oVarBuild;
    }
}
