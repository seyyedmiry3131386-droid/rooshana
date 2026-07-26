package com.microsoft.clarity.models.display.common;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Point;
import defpackage.js3;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class Point implements IProtoModel<MutationPayload$Point> {
    private final float x;
    private final float y;

    public Point(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static /* synthetic */ Point copy$default(Point point, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = point.x;
        }
        if ((i & 2) != 0) {
            f2 = point.y;
        }
        return point.copy(f, f2);
    }

    public final Point add(float f) {
        return add(f, f);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final Point copy(float f, float f2) {
        return new Point(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return Float.compare(this.x, point.x) == 0 && Float.compare(this.y, point.y) == 0;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Point(x=");
        sb.append(this.x);
        sb.append(", y=");
        return t61.k(sb, this.y, ')');
    }

    public final Point add(float f, float f2) {
        return new Point(this.x + f, this.y + f2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Point toProtobufInstance() {
        o oVarBuild = MutationPayload$Point.newBuilder().a(this.x).b(this.y).build();
        js3.o(oVarBuild, "newBuilder()\n           …Y(y)\n            .build()");
        return (MutationPayload$Point) oVarBuild;
    }
}
