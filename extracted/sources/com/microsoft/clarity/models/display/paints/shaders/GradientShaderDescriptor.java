package com.microsoft.clarity.models.display.paints.shaders;

import com.microsoft.clarity.models.display.paints.Color4f;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GradientShaderDescriptor {
    private final List<Color4f> colors;
    private final long gradFlags;
    private final List<Float> localMatrix;
    private final List<Float> pos;
    private final long tileMode;

    public GradientShaderDescriptor(long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(list, "colors");
        this.tileMode = j;
        this.gradFlags = j2;
        this.colors = list;
        this.pos = list2;
        this.localMatrix = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GradientShaderDescriptor copy$default(GradientShaderDescriptor gradientShaderDescriptor, long j, long j2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gradientShaderDescriptor.tileMode;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = gradientShaderDescriptor.gradFlags;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = gradientShaderDescriptor.colors;
        }
        List list4 = list;
        if ((i & 8) != 0) {
            list2 = gradientShaderDescriptor.pos;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            list3 = gradientShaderDescriptor.localMatrix;
        }
        return gradientShaderDescriptor.copy(j3, j4, list4, list5, list3);
    }

    public final long component1() {
        return this.tileMode;
    }

    public final long component2() {
        return this.gradFlags;
    }

    public final List<Color4f> component3() {
        return this.colors;
    }

    public final List<Float> component4() {
        return this.pos;
    }

    public final List<Float> component5() {
        return this.localMatrix;
    }

    public final GradientShaderDescriptor copy(long j, long j2, List<Color4f> list, List<Float> list2, List<Float> list3) {
        js3.p(list, "colors");
        return new GradientShaderDescriptor(j, j2, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientShaderDescriptor)) {
            return false;
        }
        GradientShaderDescriptor gradientShaderDescriptor = (GradientShaderDescriptor) obj;
        return this.tileMode == gradientShaderDescriptor.tileMode && this.gradFlags == gradientShaderDescriptor.gradFlags && js3.i(this.colors, gradientShaderDescriptor.colors) && js3.i(this.pos, gradientShaderDescriptor.pos) && js3.i(this.localMatrix, gradientShaderDescriptor.localMatrix);
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

    public final long getTileMode() {
        return this.tileMode;
    }

    public int hashCode() {
        long j = this.tileMode;
        long j2 = this.gradFlags;
        int i = rm7.i((((int) (j2 ^ (j2 >>> 32))) + (((int) (j ^ (j >>> 32))) * 31)) * 31, 31, this.colors);
        List<Float> list = this.pos;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.localMatrix;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GradientShaderDescriptor(tileMode=");
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
}
