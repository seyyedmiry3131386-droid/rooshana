package com.microsoft.clarity.models.display.images;

import com.google.protobuf.ByteString;
import com.google.protobuf.o;
import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Asset;
import com.microsoft.clarity.models.display.common.IRect;
import com.microsoft.clarity.protomodels.mutationpayload.C0119h0;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Image;
import defpackage.js3;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Image extends Asset implements IProtoModel<MutationPayload$Image> {
    private final byte[] mipmap;
    private final IRect subset;

    public Image(IRect iRect, byte[] bArr, String str, byte[] bArr2) {
        super(AssetType.Image, bArr, str);
        this.subset = iRect;
        this.mipmap = bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Image.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type com.microsoft.clarity.models.display.images.Image");
        Image image = (Image) obj;
        if (!js3.i(this.subset, image.subset)) {
            return false;
        }
        byte[] bArr = this.mipmap;
        if (bArr != null) {
            byte[] bArr2 = image.mipmap;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (image.mipmap != null) {
            return false;
        }
        return js3.i(getDataHash(), image.getDataHash());
    }

    public int hashCode() {
        return Objects.hash(getDataHash(), this.subset, Integer.valueOf(Arrays.hashCode(this.mipmap)));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Image toProtobufInstance() {
        C0119h0 c0119h0NewBuilder = MutationPayload$Image.newBuilder();
        if (getDataHash() != null) {
            c0119h0NewBuilder.a(getDataHash());
        }
        IRect iRect = this.subset;
        if (iRect != null) {
            c0119h0NewBuilder.a(iRect.toProtobufInstance());
        }
        byte[] bArr = this.mipmap;
        if (bArr != null) {
            c0119h0NewBuilder.a(ByteString.h(bArr, 0, bArr.length));
        }
        o oVarBuild = c0119h0NewBuilder.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Image) oVarBuild;
    }
}
