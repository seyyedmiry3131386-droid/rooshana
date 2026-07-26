package com.microsoft.clarity.models.display.common;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Rect;
import defpackage.dw1;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class IRect implements IProtoModel<MutationPayload$Rect> {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public IRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ IRect copy$default(IRect iRect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = iRect.left;
        }
        if ((i5 & 2) != 0) {
            i2 = iRect.top;
        }
        if ((i5 & 4) != 0) {
            i3 = iRect.right;
        }
        if ((i5 & 8) != 0) {
            i4 = iRect.bottom;
        }
        return iRect.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    public final IRect copy(int i, int i2, int i3, int i4) {
        return new IRect(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IRect)) {
            return false;
        }
        IRect iRect = (IRect) obj;
        return this.left == iRect.left && this.top == iRect.top && this.right == iRect.right && this.bottom == iRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.bottom + ((this.right + ((this.top + (this.left * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IRect(left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        return dw1.q(sb, this.bottom, ')');
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Rect toProtobufInstance() {
        o oVarBuild = MutationPayload$Rect.newBuilder().a(this.bottom).b(this.left).c(this.right).d(this.top).build();
        js3.o(oVarBuild, "newBuilder()\n           …t())\n            .build()");
        return (MutationPayload$Rect) oVarBuild;
    }
}
