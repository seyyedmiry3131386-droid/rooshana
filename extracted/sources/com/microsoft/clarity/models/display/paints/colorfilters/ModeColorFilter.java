package com.microsoft.clarity.models.display.paints.colorfilters;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.C0118h;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ColorFilter;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ModeColorFilter extends ColorFilter {
    private final Long color;
    private final Color4f color4f;
    private final long mode;
    private final ColorFilterType type = ColorFilterType.ModeColorFilter;

    public ModeColorFilter(Long l, Color4f color4f, long j) {
        this.color = l;
        this.color4f = color4f;
        this.mode = j;
    }

    public static /* synthetic */ ModeColorFilter copy$default(ModeColorFilter modeColorFilter, Long l, Color4f color4f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            l = modeColorFilter.color;
        }
        if ((i & 2) != 0) {
            color4f = modeColorFilter.color4f;
        }
        if ((i & 4) != 0) {
            j = modeColorFilter.mode;
        }
        return modeColorFilter.copy(l, color4f, j);
    }

    public final Long component1() {
        return this.color;
    }

    public final Color4f component2() {
        return this.color4f;
    }

    public final long component3() {
        return this.mode;
    }

    public final ModeColorFilter copy(Long l, Color4f color4f, long j) {
        return new ModeColorFilter(l, color4f, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeColorFilter)) {
            return false;
        }
        ModeColorFilter modeColorFilter = (ModeColorFilter) obj;
        return js3.i(this.color, modeColorFilter.color) && js3.i(this.color4f, modeColorFilter.color4f) && this.mode == modeColorFilter.mode;
    }

    public final Long getColor() {
        return this.color;
    }

    public final Color4f getColor4f() {
        return this.color4f;
    }

    public final long getMode() {
        return this.mode;
    }

    @Override // com.microsoft.clarity.models.display.paints.colorfilters.ColorFilter
    public ColorFilterType getType() {
        return this.type;
    }

    public int hashCode() {
        Long l = this.color;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Color4f color4f = this.color4f;
        int iHashCode2 = (iHashCode + (color4f != null ? color4f.hashCode() : 0)) * 31;
        long j = this.mode;
        return ((int) (j ^ (j >>> 32))) + iHashCode2;
    }

    public String toString() {
        return "ModeColorFilter(color=" + this.color + ", color4f=" + this.color4f + ", mode=" + this.mode + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$ColorFilter toProtobufInstance() {
        C0118h c0118hB = MutationPayload$ColorFilter.newBuilder().a(getType().toProtobufType()).b(this.mode);
        if (this.color != null) {
            c0118hB.a(r1.longValue());
        }
        Color4f color4f = this.color4f;
        if (color4f != null) {
            c0118hB.a(color4f.toProtobufInstance());
        }
        o oVarBuild = c0118hB.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$ColorFilter) oVarBuild;
    }
}
