package com.microsoft.clarity.models.display.paints.patheffects;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
import com.microsoft.clarity.models.display.paths.Path;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathEffect;
import defpackage.js3;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class Path1DPathEffect extends PathEffect {
    private final float advance;
    private final Path path;
    private final float phase;
    private final int style;
    private final PathEffectType type;

    public /* synthetic */ Path1DPathEffect(float f, Path path, float f2, int i, yd1 yd1Var) {
        this(f, path, f2, i);
    }

    /* JADX INFO: renamed from: copy-hJeF8fQ$default, reason: not valid java name */
    public static /* synthetic */ Path1DPathEffect m21copyhJeF8fQ$default(Path1DPathEffect path1DPathEffect, float f, Path path, float f2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = path1DPathEffect.advance;
        }
        if ((i2 & 2) != 0) {
            path = path1DPathEffect.path;
        }
        if ((i2 & 4) != 0) {
            f2 = path1DPathEffect.phase;
        }
        if ((i2 & 8) != 0) {
            i = path1DPathEffect.style;
        }
        return path1DPathEffect.m23copyhJeF8fQ(f, path, f2, i);
    }

    public final float component1() {
        return this.advance;
    }

    public final Path component2() {
        return this.path;
    }

    public final float component3() {
        return this.phase;
    }

    /* JADX INFO: renamed from: component4-pVg5ArA, reason: not valid java name */
    public final int m22component4pVg5ArA() {
        return this.style;
    }

    /* JADX INFO: renamed from: copy-hJeF8fQ, reason: not valid java name */
    public final Path1DPathEffect m23copyhJeF8fQ(float f, Path path, float f2, int i) {
        js3.p(path, "path");
        return new Path1DPathEffect(f, path, f2, i, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Path1DPathEffect)) {
            return false;
        }
        Path1DPathEffect path1DPathEffect = (Path1DPathEffect) obj;
        return Float.compare(this.advance, path1DPathEffect.advance) == 0 && js3.i(this.path, path1DPathEffect.path) && Float.compare(this.phase, path1DPathEffect.phase) == 0 && this.style == path1DPathEffect.style;
    }

    public final float getAdvance() {
        return this.advance;
    }

    public final Path getPath() {
        return this.path;
    }

    public final float getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: getStyle-pVg5ArA, reason: not valid java name */
    public final int m24getStylepVg5ArA() {
        return this.style;
    }

    @Override // com.microsoft.clarity.models.display.paints.patheffects.PathEffect
    public PathEffectType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.style + a.a(this.phase, (this.path.hashCode() + (Float.floatToIntBits(this.advance) * 31)) * 31, 31);
    }

    public String toString() {
        return "Path1DPathEffect(advance=" + this.advance + ", path=" + this.path + ", phase=" + this.phase + ", style=" + ((Object) String.valueOf(((long) this.style) & 4294967295L)) + ')';
    }

    private Path1DPathEffect(float f, Path path, float f2, int i) {
        this.advance = f;
        this.path = path;
        this.phase = f2;
        this.style = i;
        this.type = PathEffectType.Path1DPathEffect;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$PathEffect toProtobufInstance() {
        o oVarBuild = MutationPayload$PathEffect.newBuilder().a(getType().toProtobufType()).a(this.advance).a(this.path.toProtobufInstance()).b(this.phase).a(((long) this.style) & 4294967295L).build();
        js3.o(oVarBuild, "newBuilder()\n           …g())\n            .build()");
        return (MutationPayload$PathEffect) oVarBuild;
    }
}
