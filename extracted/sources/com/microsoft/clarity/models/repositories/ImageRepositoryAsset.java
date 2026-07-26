package com.microsoft.clarity.models.repositories;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.display.common.ImageSize;
import defpackage.bp2;
import defpackage.c24;
import defpackage.js3;
import defpackage.ok4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageRepositoryAsset extends RepositoryAsset {
    private Bitmap.CompressFormat compressionFormat;
    private Integer compressionQuality;
    private final c24 content$delegate;
    private final c24 size$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRepositoryAsset(String str, final String str2) {
        super(AssetType.Image, str, str2);
        js3.p(str, "id");
        js3.p(str2, "repositoryPath");
        this.content$delegate = a.a(new bp2() { // from class: com.microsoft.clarity.models.repositories.ImageRepositoryAsset$content$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final byte[] invoke() throws IOException {
                String str3 = str2;
                js3.p(str3, "path");
                FileInputStream fileInputStream = new FileInputStream(new File(str3));
                try {
                    byte[] bArrR = ok4.R(fileInputStream);
                    fileInputStream.close();
                    return bArrR;
                } finally {
                }
            }
        });
        this.size$delegate = a.a(new bp2() { // from class: com.microsoft.clarity.models.repositories.ImageRepositoryAsset$size$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final ImageSize invoke() {
                byte[] content = this.this$0.getContent();
                js3.p(content, "imageBytes");
                return new ImageSize(com.microsoft.clarity.q.a.a(content, 16), com.microsoft.clarity.q.a.a(content, 20), null);
            }
        });
    }

    public final byte[] getContent() {
        return (byte[]) this.content$delegate.getValue();
    }

    public final ImageSize getSize() {
        return (ImageSize) this.size$delegate.getValue();
    }

    public final void setCompressionParameters(DynamicConfig dynamicConfig) {
        Bitmap.CompressFormat imageCompressionFormat;
        if (dynamicConfig == null || (imageCompressionFormat = dynamicConfig.getImageCompressionFormat()) == null) {
            imageCompressionFormat = Bitmap.CompressFormat.PNG;
        }
        this.compressionFormat = imageCompressionFormat;
        this.compressionQuality = Integer.valueOf(dynamicConfig != null ? dynamicConfig.getImageCompressionQuality() : 100);
    }

    public final void writeCompressedContentToStream(OutputStream outputStream) {
        js3.p(outputStream, "output");
        if (this.compressionFormat == null || this.compressionQuality == null) {
            throw new IllegalStateException("You should provide the compression parameters before calling this function.");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(getContent(), 0, getContent().length, options);
        Bitmap.CompressFormat compressFormat = this.compressionFormat;
        js3.m(compressFormat);
        Integer num = this.compressionQuality;
        js3.m(num);
        bitmapDecodeByteArray.compress(compressFormat, num.intValue(), outputStream);
        bitmapDecodeByteArray.recycle();
    }

    @Override // com.microsoft.clarity.models.repositories.RepositoryAsset
    public void writeContentToStream(OutputStream outputStream) {
        js3.p(outputStream, "output");
        if (this.compressionFormat == null || this.compressionQuality == null) {
            super.writeContentToStream(outputStream);
        } else {
            writeCompressedContentToStream(outputStream);
        }
    }
}
