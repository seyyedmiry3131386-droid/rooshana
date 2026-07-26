package com.microsoft.clarity.models.display.paints;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.paints.colorfilters.ColorFilter;
import com.microsoft.clarity.models.display.paints.loopers.Looper;
import com.microsoft.clarity.models.display.paints.maskfilters.MaskFilter;
import com.microsoft.clarity.models.display.paints.patheffects.PathEffect;
import com.microsoft.clarity.models.display.paints.shaders.Shader;
import com.microsoft.clarity.protomodels.mutationpayload.C0152y0;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Paint;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class Paint implements IProtoModel<MutationPayload$Paint> {
    private final boolean antiAlias;
    private final long blendMode;
    private final Color4f color;
    private final ColorFilter colorFilter;
    private final boolean dither;
    private final Looper looper;
    private final MaskFilter maskFilter;
    private final PathEffect pathEffect;
    private final Shader shader;
    private final long strokeCap;
    private final long strokeJoin;
    private final float strokeMiter;
    private final float strokeWidth;
    private final long style;

    public Paint(Color4f color4f, long j, long j2, long j3, long j4, float f, float f2, boolean z, boolean z2, ColorFilter colorFilter, MaskFilter maskFilter, Shader shader, Looper looper, PathEffect pathEffect) {
        js3.p(color4f, "color");
        this.color = color4f;
        this.style = j;
        this.blendMode = j2;
        this.strokeCap = j3;
        this.strokeJoin = j4;
        this.strokeWidth = f;
        this.strokeMiter = f2;
        this.antiAlias = z;
        this.dither = z2;
        this.colorFilter = colorFilter;
        this.maskFilter = maskFilter;
        this.shader = shader;
        this.looper = looper;
        this.pathEffect = pathEffect;
    }

    public final Color4f component1() {
        return this.color;
    }

    public final ColorFilter component10() {
        return this.colorFilter;
    }

    public final MaskFilter component11() {
        return this.maskFilter;
    }

    public final Shader component12() {
        return this.shader;
    }

    public final Looper component13() {
        return this.looper;
    }

    public final PathEffect component14() {
        return this.pathEffect;
    }

    public final long component2() {
        return this.style;
    }

    public final long component3() {
        return this.blendMode;
    }

    public final long component4() {
        return this.strokeCap;
    }

    public final long component5() {
        return this.strokeJoin;
    }

    public final float component6() {
        return this.strokeWidth;
    }

    public final float component7() {
        return this.strokeMiter;
    }

    public final boolean component8() {
        return this.antiAlias;
    }

    public final boolean component9() {
        return this.dither;
    }

    public final Paint copy(Color4f color4f, long j, long j2, long j3, long j4, float f, float f2, boolean z, boolean z2, ColorFilter colorFilter, MaskFilter maskFilter, Shader shader, Looper looper, PathEffect pathEffect) {
        js3.p(color4f, "color");
        return new Paint(color4f, j, j2, j3, j4, f, f2, z, z2, colorFilter, maskFilter, shader, looper, pathEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paint)) {
            return false;
        }
        Paint paint = (Paint) obj;
        return js3.i(this.color, paint.color) && this.style == paint.style && this.blendMode == paint.blendMode && this.strokeCap == paint.strokeCap && this.strokeJoin == paint.strokeJoin && Float.compare(this.strokeWidth, paint.strokeWidth) == 0 && Float.compare(this.strokeMiter, paint.strokeMiter) == 0 && this.antiAlias == paint.antiAlias && this.dither == paint.dither && js3.i(this.colorFilter, paint.colorFilter) && js3.i(this.maskFilter, paint.maskFilter) && js3.i(this.shader, paint.shader) && js3.i(this.looper, paint.looper) && js3.i(this.pathEffect, paint.pathEffect);
    }

    public final boolean getAntiAlias() {
        return this.antiAlias;
    }

    public final long getBlendMode() {
        return this.blendMode;
    }

    public final Color4f getColor() {
        return this.color;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final boolean getDither() {
        return this.dither;
    }

    public final Looper getLooper() {
        return this.looper;
    }

    public final MaskFilter getMaskFilter() {
        return this.maskFilter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final Shader getShader() {
        return this.shader;
    }

    public final long getStrokeCap() {
        return this.strokeCap;
    }

    public final long getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeMiter() {
        return this.strokeMiter;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public final long getStyle() {
        return this.style;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        long j = this.style;
        long j2 = this.blendMode;
        int i = (((int) (j2 ^ (j2 >>> 32))) + ((((int) (j ^ (j >>> 32))) + iHashCode) * 31)) * 31;
        long j3 = this.strokeCap;
        long j4 = this.strokeJoin;
        int iA = a.a(this.strokeMiter, a.a(this.strokeWidth, (((int) ((j4 >>> 32) ^ j4)) + ((((int) (j3 ^ (j3 >>> 32))) + i) * 31)) * 31, 31), 31);
        boolean z = this.antiAlias;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i2 = (iA + r2) * 31;
        boolean z2 = this.dither;
        int i3 = (i2 + (z2 ? 1 : z2)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        int iHashCode2 = (i3 + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31;
        MaskFilter maskFilter = this.maskFilter;
        int iHashCode3 = (iHashCode2 + (maskFilter == null ? 0 : maskFilter.hashCode())) * 31;
        Shader shader = this.shader;
        int iHashCode4 = (iHashCode3 + (shader == null ? 0 : shader.hashCode())) * 31;
        Looper looper = this.looper;
        int iHashCode5 = (iHashCode4 + (looper == null ? 0 : looper.hashCode())) * 31;
        PathEffect pathEffect = this.pathEffect;
        return iHashCode5 + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public String toString() {
        return "Paint(color=" + this.color + ", style=" + this.style + ", blendMode=" + this.blendMode + ", strokeCap=" + this.strokeCap + ", strokeJoin=" + this.strokeJoin + ", strokeWidth=" + this.strokeWidth + ", strokeMiter=" + this.strokeMiter + ", antiAlias=" + this.antiAlias + ", dither=" + this.dither + ", colorFilter=" + this.colorFilter + ", maskFilter=" + this.maskFilter + ", shader=" + this.shader + ", looper=" + this.looper + ", pathEffect=" + this.pathEffect + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Paint toProtobufInstance() {
        C0152y0 c0152y0B = MutationPayload$Paint.newBuilder().a(this.color.toProtobufInstance()).d(this.style).a(this.blendMode).b(this.strokeCap).c(this.strokeJoin).b(this.strokeWidth).a(this.strokeMiter).a(this.antiAlias).b(this.dither);
        ColorFilter colorFilter = this.colorFilter;
        if (colorFilter != null) {
            c0152y0B.a(colorFilter.toProtobufInstance());
        }
        MaskFilter maskFilter = this.maskFilter;
        if (maskFilter != null) {
            c0152y0B.a(maskFilter.toProtobufInstance());
        }
        Shader shader = this.shader;
        if (shader != null) {
            c0152y0B.a(shader.toProtobufInstance());
        }
        Looper looper = this.looper;
        if (looper != null) {
            c0152y0B.a(looper.toProtobufInstance());
        }
        PathEffect pathEffect = this.pathEffect;
        if (pathEffect != null) {
            c0152y0B.a(pathEffect.toProtobufInstance());
        }
        o oVarBuild = c0152y0B.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Paint) oVarBuild;
    }
}
