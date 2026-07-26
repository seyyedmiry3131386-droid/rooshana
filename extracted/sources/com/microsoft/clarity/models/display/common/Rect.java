package com.microsoft.clarity.models.display.common;

import com.google.protobuf.o;
import com.microsoft.clarity.j.a;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Rect;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public class Rect implements IProtoModel<MutationPayload$Rect> {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final boolean contains(float f, float f2) {
        float f3 = this.left;
        if (f > this.right || f3 > f) {
            return false;
        }
        return f2 <= this.bottom && this.top <= f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type com.microsoft.clarity.models.display.common.Rect");
        Rect rect = (Rect) obj;
        return this.left == rect.left && this.top == rect.top && this.right == rect.right && this.bottom == rect.bottom;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.bottom) + a.a(this.right, a.a(this.top, Float.floatToIntBits(this.left) * 31, 31), 31);
    }

    public final boolean intersects(Rect rect) {
        js3.p(rect, "rect");
        return this.right > rect.left && this.left < rect.right && this.bottom > rect.top && this.top < rect.bottom;
    }

    public final Rect makeSorted() {
        return new Rect(Math.min(this.left, this.right), Math.min(this.top, this.bottom), Math.max(this.left, this.right), Math.max(this.top, this.bottom));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rect(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        js3.p(rect, "rect");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Rect toProtobufInstance() {
        o oVarBuild = MutationPayload$Rect.newBuilder().a(this.bottom).b(this.left).c(this.right).d(this.top).build();
        js3.o(oVarBuild, "newBuilder()\n           …top)\n            .build()");
        return (MutationPayload$Rect) oVarBuild;
    }
}
