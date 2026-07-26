package com.microsoft.clarity.models.display.paints.shaders;

import com.google.protobuf.o;
import com.microsoft.clarity.models.display.images.Image;
import com.microsoft.clarity.models.display.images.Sampling;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Shader;
import com.microsoft.clarity.protomodels.mutationpayload.e1;
import defpackage.js3;
import defpackage.yd1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageShader extends Shader {
    private final transient Image image;
    private Integer imageIndex;
    private Color4f maskedColor;
    private Integer maskedHeight;
    private Integer maskedWidth;
    private final List<Float> matrix;
    private final boolean raw;
    private final Sampling sampling;
    private final long tX;
    private final long tY;
    private final ShaderType type;

    public /* synthetic */ ImageShader(long j, long j2, List list, boolean z, Image image, Sampling sampling, int i, yd1 yd1Var) {
        this(j, j2, list, z, (i & 16) != 0 ? new Image(null, new byte[0], null, null) : image, sampling);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageShader copy$default(ImageShader imageShader, long j, long j2, List list, boolean z, Image image, Sampling sampling, int i, Object obj) {
        if ((i & 1) != 0) {
            j = imageShader.tX;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = imageShader.tY;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = imageShader.matrix;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = imageShader.raw;
        }
        return imageShader.copy(j3, j4, list2, z, (i & 16) != 0 ? imageShader.image : image, (i & 32) != 0 ? imageShader.sampling : sampling);
    }

    public final long component1() {
        return this.tX;
    }

    public final long component2() {
        return this.tY;
    }

    public final List<Float> component3() {
        return this.matrix;
    }

    public final boolean component4() {
        return this.raw;
    }

    public final Image component5() {
        return this.image;
    }

    public final Sampling component6() {
        return this.sampling;
    }

    public final ImageShader copy(long j, long j2, List<Float> list, boolean z, Image image, Sampling sampling) {
        js3.p(image, "image");
        return new ImageShader(j, j2, list, z, image, sampling);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageShader)) {
            return false;
        }
        ImageShader imageShader = (ImageShader) obj;
        return this.tX == imageShader.tX && this.tY == imageShader.tY && js3.i(this.matrix, imageShader.matrix) && this.raw == imageShader.raw && js3.i(this.image, imageShader.image) && js3.i(this.sampling, imageShader.sampling);
    }

    public final Image getImage() {
        return this.image;
    }

    public final Integer getImageIndex() {
        return this.imageIndex;
    }

    public final Color4f getMaskedColor() {
        return this.maskedColor;
    }

    public final Integer getMaskedHeight() {
        return this.maskedHeight;
    }

    public final Integer getMaskedWidth() {
        return this.maskedWidth;
    }

    public final List<Float> getMatrix() {
        return this.matrix;
    }

    public final boolean getRaw() {
        return this.raw;
    }

    public final Sampling getSampling() {
        return this.sampling;
    }

    public final long getTX() {
        return this.tX;
    }

    public final long getTY() {
        return this.tY;
    }

    @Override // com.microsoft.clarity.models.display.paints.shaders.Shader
    public ShaderType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public int hashCode() {
        long j = this.tX;
        long j2 = this.tY;
        int i = (((int) ((j2 >>> 32) ^ j2)) + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        List<Float> list = this.matrix;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.raw;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode2 = (this.image.hashCode() + ((iHashCode + r0) * 31)) * 31;
        Sampling sampling = this.sampling;
        return iHashCode2 + (sampling != null ? sampling.hashCode() : 0);
    }

    public final void setImageIndex(Integer num) {
        this.imageIndex = num;
    }

    public final void setMaskedColor(Color4f color4f) {
        this.maskedColor = color4f;
    }

    public final void setMaskedHeight(Integer num) {
        this.maskedHeight = num;
    }

    public final void setMaskedWidth(Integer num) {
        this.maskedWidth = num;
    }

    public String toString() {
        return "ImageShader(tX=" + this.tX + ", tY=" + this.tY + ", matrix=" + this.matrix + ", raw=" + this.raw + ", image=" + this.image + ", sampling=" + this.sampling + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$Shader toProtobufInstance() {
        e1 e1VarA = MutationPayload$Shader.newBuilder().a(getType().toProtobufType()).b(this.tX).c(this.tY).a(this.raw);
        List<Float> list = this.matrix;
        if (list != null) {
            e1VarA.b(list);
        }
        Sampling sampling = this.sampling;
        if (sampling != null) {
            e1VarA.a(sampling.toProtobufInstance());
        }
        Integer num = this.imageIndex;
        if (num != null) {
            e1VarA.a(num.intValue());
        }
        Integer num2 = this.maskedWidth;
        if (num2 != null) {
            e1VarA.c(num2.intValue());
        }
        if (this.maskedHeight != null) {
            Integer num3 = this.maskedWidth;
            e1VarA.b(num3 != null ? num3.intValue() : 0);
        }
        Color4f color4f = this.maskedColor;
        if (color4f != null) {
            e1VarA.b(color4f.toProtobufInstance());
        }
        o oVarBuild = e1VarA.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$Shader) oVarBuild;
    }

    public ImageShader(long j, long j2, List<Float> list, boolean z, Image image, Sampling sampling) {
        js3.p(image, "image");
        this.tX = j;
        this.tY = j2;
        this.matrix = list;
        this.raw = z;
        this.image = image;
        this.sampling = sampling;
        this.type = ShaderType.ImageShader;
    }
}
